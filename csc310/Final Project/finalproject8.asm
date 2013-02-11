TITLE Final Project 8 (finalproject8.asm)

;Date: 5/17/2012
;Class: CSC310-721
;Author: Dominic Giglio, Joseph Gomez

INCLUDE Irvine32.inc

.data
xPrompt BYTE "Enter First Value: ",0
yPrompt BYTE "Enter Second Value: ",0

Direction1 BYTE "(1): x AND y. ",0
Direction2 BYTE "(2): x OR y. ",0
Direction3 BYTE "(3): NOT X. ",0
Direction4 BYTE "(4): x XOR y. ",0
Direction5 BYTE "(5): Exit Program. ",0

AndPrompt BYTE "You've selected the AND Operand.",0
OrPrompt BYTE "You've selected the OR Operand.",0
NotPrompt BYTE "You've selected the NOT Operand.",0
EPrompt BYTE "You've selected the Exclusive-OR Operand.",0
ExPrompt BYTE "You've selected to exit the program.",0

x DWORD 0h
y DWORD 0h

.code
main PROC
  call select
  exit
main ENDP

AND_op PROC
  mov eax, 0
  call ReadValueX
  call ReadValueY
  mov edx, OFFSET AndPrompt
  call writestring
  call crlf
  mov eax, X
  and eax, Y
  call writehex
  ret
AND_op ENDP

OR_op PROC
  mov eax, 0
  call ReadValueX
  call ReadValueY
  mov edx, OFFSET orPrompt
  call writestring
  call crlf
  mov eax, X
  or eax, Y
  call writehex
  ret
OR_op ENDP

NOT_op PROC
  call ReadValueX
  mov edx, OFFSET NotPrompt
  call writestring
  call crlf
  call writedec
  call crlf
  not eax
  call writehex
  ret
NOT_op ENDP

XOR_op PROC
  mov eax, 0
  call ReadValueX
  call ReadValueY
  mov edx, OFFSET EPrompt
  call writestring
  call crlf
  mov eax, X
  XOR eax, Y
  call writehex
  ret
XOR_op ENDP

ReadValueX PROC
  mov edx, OFFSET xPrompt
  call writestring
  call readhex
  mov X, eax
  call crlf
  ret
ReadValueX ENDP

ReadValueY PROC
  mov edx, OFFSET yPrompt
  call writestring
  call readhex
  mov Y, eax
  call crlf 
  ret
ReadValueY ENDP

Select PROC
  mov edx, OFFSET Direction1
  call writestring
  call crlf
  mov edx, OFFSET Direction2
  call writestring
  call crlf
  mov edx, OFFSET Direction3
  call writestring
  call crlf
  mov edx, OFFSET Direction4
  call writestring
  call crlf
  mov edx, OFFSET Direction5
  call writestring
  call crlf
  call readint

  .if(eax==1)
    call AND_op
  .elseif(eax==2)
    call OR_op
  .elseif(eax==3)
    call NOT_op
  .elseif(eax==4)
    call XOR_op
  .else
    exit
  .endif

  ret
Select ENDP

END main