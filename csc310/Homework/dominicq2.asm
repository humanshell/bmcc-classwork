TITLE Grades  (dominicq2.asm)

INCLUDE Irvine32.inc

.data
grademsg BYTE "Enter your numeric grade: ",0
amsg BYTE "You got an A!",0
bmsg BYTE "You got a B.",0
cmsg BYTE "You got a C.",0
dmsg BYTE "You got a D.",0
fmsg BYTE "You got an F!",0
grade DWORD ?

.code
main PROC
mov edx, OFFSET grademsg
call writestring
call readint
mov grade, eax
.if(grade>=90)
  mov edx, OFFSET amsg
  call writestring
  call crlf
.elseif(grade>=80 && grade<=89)
  mov edx, OFFSET bmsg
  call writestring
  call crlf
.elseif(grade>=70 && grade<=79)
  mov edx, OFFSET cmsg
  call writestring
  call crlf
.elseif(grade>=60 && grade<=69)
  mov edx, OFFSET dmsg
  call writestring
  call crlf
.else
  mov edx, OFFSET fmsg
  call writestring
  call crlf
.endif
exit
main ENDP

END main