TITLE Final Project 9 (finalproject9.asm)

;Date: 5/17/2012
;Class: CSC310-721
;Author: Dominic Giglio, Joseph Gomez

INCLUDE Irvine32.inc

.data
textmsg BYTE "I am a really long line of text... ",0

.code
  main PROC
  call randomize
  mov ecx, 20

  colorloop:
    call Color
    loop colorloop

  exit
main ENDP

Color PROC
  mov eax, 9
  call randomrange

  .if(eax>=0 && eax<=2)
    mov edx, OFFSET textmsg
    push eax
    mov eax, white + (black*16)
    call settextcolor
    call writestring
    call crlf 
    pop eax
  .elseif(eax==3)
    mov edx, OFFSET textmsg
    push eax
    mov eax, blue+ (black*16)
    call settextcolor
    call writestring 
    call crlf
    pop eax
  .else
    mov edx, OFFSET textmsg
    push eax
    mov eax, green+ (black*16)
    call settextcolor
    call writestring 
    call crlf
    pop eax
  .endif

  push eax
  mov eax, white+(black*16)
  call settextcolor
  pop eax
  ret
Color ENDP

END main