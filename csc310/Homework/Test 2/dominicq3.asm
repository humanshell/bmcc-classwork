TITLE Read Name  (dominicq3.asm)
INCLUDE Irvine32.inc

.data
byteCount DWORD ?
buffer BYTE 14 DUP(?)
CopyOfName BYTE 14 DUP(?),0
requestName BYTE "Enter Name: ",0

.code
main PROC
  ; Ask for name
  mov edx, OFFSET requestName
  call WriteString

  ; Store it in buffer
  mov edx, OFFSET buffer
  mov ecx, SIZEOF buffer
  call ReadString
  mov byteCount, eax

  call CopyName
  call CopyNameBackwards
  call CopyNameBackwardsWithStack
  call PrintNameWithStars
  exit
main ENDP

CopyName PROC USES eax ecx edx esi
  mov ecx, byteCount
  mov esi, 0
  L1:
    mov al, buffer[esi]
    mov CopyOfName[esi], al
    inc esi
    loop L1
  mov edx, OFFSET CopyOfName
  call WriteString
  call crlf
  ret
CopyName ENDP

CopyNameBackwards PROC USES eax ecx edx esi edi
  mov ecx, byteCount
  mov esi, 0
  mov edi, 13
  L1:
    mov al, buffer[esi]
    mov CopyOfName[edi], al
    inc esi
    dec edi
    loop L1
  mov edx, OFFSET CopyOfName
  call WriteString
  call crlf
  ret
CopyNameBackwards ENDP

CopyNameBackwardsWithStack PROC USES eax ecx edx esi
  mov ecx, byteCount
  mov esi, 0
  L1:
    mov al, buffer[esi]
    push eax
    inc esi
    loop L1
  mov ecx, byteCount
  mov esi, 0
  L2:
    pop eax
    mov CopyOfName[esi], al
    inc esi
    loop L2
  mov edx, OFFSET CopyOfName
  call WriteString
  call crlf
  ret
CopyNameBackwardsWithStack ENDP

PrintNameWithStars PROC USES eax ecx edx esi
  mov esi, 0
  mov ecx, byteCount
  L1:
    mov al, CopyOfName[esi]
    call WriteChar
    mov eax, "*"
    call WriteChar
    inc esi
    loop L1
  call crlf
PrintNameWithStars ENDP

END main