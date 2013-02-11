TITLE Final Project 2 (finalproject2.asm)

;Date: 5/17/2012
;Class: CSC310-721
;Author: Dominic Giglio, Joseph Gomez

INCLUDE Irvine32.inc

.data
array DWORD 52 dup(0)

.code
main PROC
  mov esi, OFFSET array
  mov ecx, 52
  mov ebx, 1

  demoloop:
    mov [esi], ebx
    inc ebx
    add esi, 4
    loop demoloop

  mov ecx, 52
  mov esi, OFFSET array
  
  printloop:
    mov eax, [esi]
    call writedec
    call crlf
    add esi, 4
    loop printloop

  exit
main ENDP

END main