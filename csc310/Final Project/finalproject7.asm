TITLE Final Project 7 (finalproject7.asm)

;Date: 5/17/2012
;Class: CSC310-721
;Author: Dominic Giglio, Joseph Gomez

INCLUDE Irvine32.inc

.data
direction1 BYTE "(1): x AND y",0
direction2 BYTE "(2): x OR y",0
direction3 BYTE "(3): NOT X",0
direction4 BYTE "(4): x XOR y",0
direction5 BYTE "(5): Exit Program",0

AndPrompt BYTE "The AND operation will be performed.",0
OrPrompt BYTE "The OR operation will be performed.",0
NotPrompt BYTE "The NOT operation will be performed.",0
EPrompt BYTE "The Exclusive-OR operation will be performed.",0

.code
main PROC
  mov edx, OFFSET direction1
  call writestring
  call crlf
  mov edx, OFFSET direction2
  call writestring
  call crlf
  mov edx, OFFSET direction3
  call writestring
  call crlf
  mov edx, OFFSET direction4
  call writestring
  call crlf
  mov edx, OFFSET direction5
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

  exit
main ENDP

AND_op PROC
  mov edx, OFFSET AndPrompt
  call writestring
  call crlf
  ret
AND_op ENDP

OR_op PROC
  mov edx, OFFSET OrPrompt
  call writestring
  call crlf
  ret
OR_op ENDP

NOT_op PROC
  mov edx, OFFSET NotPrompt
  call writestring
  call crlf
  ret
NOT_op ENDP

XOR_op PROC
  mov edx, OFFSET EPrompt
  call writestring
  call crlf
  ret
XOR_op ENDP

END main