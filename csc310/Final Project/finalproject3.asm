TITLE Final Project 3 (finalproject3.asm)

;Date: 5/17/2012
;Class: CSC310-721
;Author: Dominic Giglio, Joseph Gomez

INCLUDE Irvine32.inc

.data
stringPrompt BYTE "Enter a String: ",0

inputArray BYTE 100 dup(?)
flippedArray BYTE SIZEOF inputArray dup(?)
countArray BYTE 25 dup(0)
dash BYTE " - ",0
stringLength DWORD ?
letter BYTE 0

.code
main PROC
  call clrscr
  mov edx, OFFSET stringPrompt
  call writestring
  mov edx, OFFSET inputArray
  mov ecx, SIZEOF inputArray
  call readstring
  mov stringLength, eax
  call crlf
  call writestring
  call crlf
  call flipString
  call crlf
  call countString
  exit
main ENDP

countString PROC
  mov ecx, stringLength
  mov ebx, 0

  L1:
    and BYTE PTR inputArray[ebx], 11011111b
    mov al, inputArray[ebx]
    sub eax, 65
    mov dl, countArray[eax]
    inc dl
    mov countArray[eax], dl
    inc ebx
    loop L1

  ; loop over countArray and print the numbers
  mov ecx, 26
  mov eax, 0
  mov ebx, 0
  mov esi, OFFSET countArray

  L2:
  mov ebx, [esi]
	.if(ebx>0)
		mov al, letter
		add al, 65
		call writechar
		mov edx, OFFSET dash
		call writestring
		mov al, [esi]
		call writedec
		call crlf	
	.endif
	inc esi
	inc letter
    loop L2

  ret
countString ENDP

flipString PROC
  mov ecx, stringLength
  mov esi, 0
  mov edi, stringLength
  dec edi

  L1:
    mov al, inputArray[esi]
    mov flippedArray[edi], al
    inc esi
    dec edi
    loop L1

  mov edx, OFFSET flippedArray
  call writestring
  call crlf
  ret
flipString ENDP

writedump PROC
  call dumpregs
  call writeint
  call crlf
  call writedec
  call crlf
  call writebin
  call crlf
  ret
writedump ENDP

END main