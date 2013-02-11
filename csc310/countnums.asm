TITLE Count Numbers  (countnums.asm)

; Authors: Dominic Giglio & Joseph Gomez

INCLUDE Irvine32.inc

.data
sumPrompt BYTE "The total sum is: ",0
array BYTE 25 DUP(?)
count BYTE 10 DUP(0)
sum DWORD 0

.code
main PROC
mov eax, 0
mov edx, 0
call randomize
mov esi, offset array
mov edi, offset count
mov ecx, 25

countloop:
  mov eax, 10
  call randomrange
  inc eax
  add sum, eax
  mov [esi], eax
  inc esi
  mov edi, eax

  .if(count[edi]==1)
    call writedec
    call crlf
  .endif
  
  add count[edi], 1
  loop countloop

mov edx, OFFSET sumPrompt
call crlf
call writestring
mov eax, sum
call writedec

exit
main ENDP

END main