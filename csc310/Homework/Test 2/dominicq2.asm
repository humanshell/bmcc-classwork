TITLE Random Numbers  (dominicq2.asm)
INCLUDE Irvine32.inc

.data
delta DWORD ?
first DWORD ?
second DWORD ?
plus BYTE " + ",0
equals BYTE " = ",0

.code
main PROC
  call Randomize
  call Rand1
  call Rand2
  call Rand3
  call Rand4
  exit
main ENDP

Rand1 PROC
  call crlf
  mov ecx, 10
  L1:
    mov eax, 9
    call RandomRange
    call WriteInt
    mov al, " "
    call WriteChar
    loop L1
  call crlf
  ret
Rand1 ENDP

Rand2 PROC
  call crlf
  mov ecx, 10
  mov eax, 92
  sub eax, 25
  inc eax
  mov delta, eax
  L1:
    mov eax, delta
    call RandomRange
    add eax, 25
    call WriteInt
    mov al, " "
    call WriteChar
    loop L1
  call crlf
  ret
Rand2 ENDP

Rand3 PROC
  call crlf
  mov ecx, 10
  mov eax, 6
  sub eax, -5
  inc eax
  mov delta, eax
  L1:
    mov eax, delta
    call RandomRange
    add eax, -5
    call WriteInt
    mov al, " "
    call WriteChar
    loop L1
  call crlf
  ret
Rand3 ENDP

Rand4 PROC
  call crlf
  mov ecx, 10
  mov eax, 6
  sub eax, 1
  inc eax
  mov delta, eax
  L1:
    mov eax, delta
    call RandomRange
    add eax, 1
    call WriteDec
    mov first, eax
    mov edx, OFFSET plus
    call WriteString
    mov eax, delta
    call RandomRange
    add eax, 1
    call WriteDec
    mov second, eax
    mov edx, OFFSET equals
    call WriteString
    mov eax, first
    add eax, second
    call WriteDec
    call crlf
    loop L1
  call crlf
  ret
Rand4 ENDP

END main