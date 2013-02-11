TITLE DisplayIntLine  (dominicq1.asm)

INCLUDE Irvine32.inc

.data
A DWORD ?
B DWORD ?
Y DWORD ?
XDELTA DWORD ?
msg BYTE "Enter an integer: ",0

.code
main PROC
  call ReadA
  call ReadB
  call ReadY
  call CalcXDELTA
  mov ecx, XDELTA
  call DisplayLine
  exit
main ENDP

ReadA PROC USES eax edx
  mov edx, OFFSET msg
  call WriteString
  call ReadInt
  mov A, eax
  ret
ReadA ENDP

ReadB PROC USES eax edx
  mov edx, OFFSET msg
  call WriteString
  call ReadInt
  mov B, eax
  ret
ReadB ENDP

ReadY PROC USES eax edx
  mov edx, OFFSET msg
  call WriteString
  call ReadInt
  mov Y, eax
  ret
ReadY ENDP

CalcXDELTA PROC USES eax
  mov eax, B
  sub eax, A
  inc eax
  mov XDELTA, eax
  ret
CalcXDELTA ENDP

DisplayLine PROC USES eax
call crlf
  mov eax, red + (black*16)
  call SetTextColor
  LineAcross:
    mov eax, 1000
    call Delay
    mov eax, '*'
    call WriteChar
    loop LineAcross
  call crlf
  mov ecx, Y
  LineDown:
    mov eax, 1000
    call Delay
    mov eax, '*'
    call WriteChar
    call crlf
    loop LineDown
  mov eax, lightGray + (black*16)
  call SetTextColor
  ret
DisplayLine ENDP

END main