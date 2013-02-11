TITLE Final Project 5 (finalproject5.asm)

;Date: 5/17/2012
;Class: CSC310-721
;Author: Dominic Giglio, Joseph Gomez

INCLUDE Irvine32.inc

.data
InvalidPrompt BYTE "Invalid input, please input a D,P,or S. Press x to exit: ",0
InputPrompt BYTE "Enter a D,P,or S to proceed. Press x to Exit: ",0

outputA BYTE "A.",0
outputB BYTE "B.",0
outputC BYTE "C.",0

s0 BYTE "State0",0
s1 BYTE "State1",0
s2 BYTE "State2",0
s3 BYTE "State3",0
s4 BYTE "State4",0
s5 BYTE "State5",0

Input BYTE ?

.code
main PROC
	call State0
	exit
main ENDP

State0 PROC
	mov edx, OFFSET s0
	call writestring
	call crlf
	call ReadInput
	
	.if(al==68||al==100)
		call State1
	.elseif(al==80||al==112)
		call State2
	.else
		call State0
	.endif
	
	mov edx, OFFSET outputA
	call writestring
	call crlf
	ret
State0 ENDP

State1 PROC
  mov eax, 0
	mov edx, OFFSET outputb
	call writestring
	call crlf
	mov edx, OFFSET s1
	call writestring
	call crlf
	call ReadInput
	
	.if(al==68||al==100)
		call State3
	.elseif(al==80||al==112)
		call State4
	.else
		call State5
	.endif
	
	ret
State1 ENDP

State2 PROC
  mov eax, 0
	mov edx, OFFSET outputC
	call writestring
	call crlf
	mov edx, OFFSET s2
	call writestring
	call crlf
	call ReadInput
	
	.if(al==68||al==100)
		call State5
	.elseif(al==80||al==112)
		call State2
	.else
		call State1
	.endif
	
	ret
State2 ENDP

State3 PROC
	mov eax, 0
	mov edx, OFFSET outputB
	call writestring
	call crlf
	mov edx, OFFSET s3
	call writestring
	call crlf
	call readInput
	
	.if(al==68||al==100)
		call State4
	.elseif(al==80||al==112)
		call State3
	.else
		call State4
	.endif

	ret
State3 ENDP

State4 PROC
	mov eax, 0
	mov edx, OFFSET outputC
	call writestring
	call crlf
	mov edx, OFFSET s4
	call writestring
	call crlf
	call ReadInput

	.if(al==68||al==100)
		call State0
	.elseif(al==80||al==112)
		call State4
	.else
		call State5
	.endif

	ret
State4 ENDP

State5 PROC
	mov eax, 0
	mov edx, OFFSET outputA
	call writestring
	call crlf
	mov edx, OFFSET s5
	call writestring
	call crlf
	call ReadInput
	
	.if(al==68||al==100)
		call State3
	.elseif(al==80||al==112)
		call State5
	.else
		call State2
	.endif
	
	ret
State5 ENDP

ReadInput PROC
	mov eax, 0
  mov edx, OFFSET inputPrompt
	call writestring
	call crlf
	
	charCheck:
	call readchar
	
	.if(al==68||al==100||al==80||al==112||al==83||al==115); Numbers are the ascii for DPS in both Upper and Lower Case
		mov input, al
	.elseif(al==88||al==120)
		exit
	.else
		mov edx, OFFSET invalidPrompt
		call writestring
		call crlf
		jmp charcheck
	.endif

	ret
ReadInput ENDP

END main