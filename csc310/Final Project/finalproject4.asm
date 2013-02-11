TITLE Final Project 4 (finalproject4.asm)

;Date: 5/17/2012
;Class: CSC310-721
;Author: Dominic Giglio, Joseph Gomez

include irvine32.inc

.data
msgStart BYTE "Random Array:",0
msgEnd BYTE "Sorted Array:",0
array DWORD 50 dup(0)

.code
main PROC
  call crlf
  call randomize
  call genArray
  mov edx, OFFSET msgStart
  call crlf
  call writestring
  call crlf
  call printArray
  call crlf
  call crlf
  call sortArray
  mov edx, OFFSET msgEnd
  call writestring
  call crlf
  call printArray
  call crlf
  exit
main ENDP

genArray PROC uses eax ecx esi
  mov ecx, LENGTHOF array
  mov esi, OFFSET array

  genloop:
    mov eax, 20
    call randomrange
    inc eax
    mov [esi], eax
    add esi, 4
    loop genloop

  ret
genArray ENDP

sortArray PROC
  mov ecx, LENGTHOF array

  L1:
    mov esi, OFFSET array
    push ecx
    mov ecx, LENGTHOF array
    dec ecx

    L2:
      mov eax, [esi]
      mov ebx, [esi+4]
      .if (eax >= ebx)
        mov [esi], ebx
        mov [esi+4], eax
        add esi, 4
      .else
        add esi, 4
      .endif
      loop L2
    
    pop ecx
    loop L1
  
  ret
sortArray ENDP

printArray PROC
  mov ecx, LENGTHOF array
  mov esi, OFFSET array

  printl:
    mov eax, [esi]
    call writedec
    mov eax, 32
    call writechar
    add esi, 4
    loop printl

  ret
printArray ENDP

end Main