TITLE Euclid  (euclid.asm)

;Description: Calculate GCD of two numbers using Euclidean Algorithm
;Date: 9/4/12
;Class: CSC230-521
;Author: Dominic Giglio

INCLUDE Irvine32.inc

.data
donemsg   BYTE "The GCD is: ",0
intromsg  BYTE "This program calculates the GCD of two numbers.",0
errormsg  BYTE "You entered an unacceptable number!",0
inputmsg1 BYTE "Enter a positive integer between 1 and 10,000: ",0
inputmsg2 BYTE "Enter another positive integer between 1 and 10,000: ",0

.code
main PROC

  ; clear out all registers just to be safe
  mov eax, 0
  mov ebx, 0
  mov ecx, 0
  mov edx, 0

  ; tell the user how the program works
  mov edx, OFFSET intromsg
  call clrscr
  call writestring
  call crlf

  ; ask for the first number
  mov edx, OFFSET inputmsg1
  call crlf
  call writestring
  
  ; read the number entered by the user into cx
  ; if the user can't follow directions, jump to error label
  call readint
  cmp ax, 10000
  jg ERROR
  cmp ax, 1
  jl ERROR
  mov cx, ax
  call crlf

  ; ask for the second number
  mov edx, OFFSET inputmsg2
  call crlf
  call writestring
 
  ; read the number entered by the user into ax
  ; if the user can't follow directions, jump to error label
  call readint
  cmp eax, 10000
  jg ERROR
  cmp eax, 1
  jl ERROR
  call crlf

  ; if the user entered a larger number first it's in cx now
  ; but cx is the divisor so it has to be the smaller number
  ; jmp to swap label if this is the case
  cmp cx, ax
  jg SWAP
  jmp DIVIDE

  ; calculate GCD using Euclid's Algorithm
  DIVIDE:
    mov edx, 0
    div cx
    ; if the remainder (dx) = 0, we're done
    cmp dx, 0
    je DONE
    ; otherwise, the remainder (dx) becomes the divisor (cx)
    ; and the divisor (cx) becomes the dividend (ax)
    mov ax, cx
    mov cx, dx
    jmp DIVIDE

  ; this label swaps eax and ecx because size matters
  ; dividend = larger  = eax
  ; divisor  = smaller = ecx
  SWAP:
    mov bx, ax
    mov ax, cx
    mov cx, bx
    jmp DIVIDE

  ; this label prints an error when the user hasn't followed directions
  ERROR:
    mov edx, OFFSET errormsg
    call writestring
    call crlf
    exit

  ; we're done
  DONE:
    mov edx, OFFSET donemsg
    call writestring
    mov ax, cx
    call writedec
    call crlf
    exit
main ENDP
END main