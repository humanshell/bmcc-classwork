TITLE Addition Table  (dominicq4.asm)
INCLUDE Irvine32.inc

.data
plus BYTE " + ",0
equals BYTE " = ",0
first DWORD 1
second DWORD 1
counter DWORD ?

.code
main PROC
mov ecx, 9

L1:
  mov counter, ecx
  mov ecx, 9
  L2:
    mov eax, first
    call WriteDec
    mov edx, OFFSET plus
    call WriteString
    mov eax, second
    call WriteDec
    mov edx, OFFSET equals
    call WriteString
    mov eax, first
    add eax, second
    call WriteDec
    call crlf
    inc second
    loop L2
  mov ecx, counter
  inc first
  mov second, 1
  loop L1

exit
main ENDP
END main