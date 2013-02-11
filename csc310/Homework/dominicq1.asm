TITLE example of an or xor loop and jumps with wait msg and delay (dominicq1a.asm)

INCLUDE Irvine32.inc

.data
  x byte ?
  y byte ?
  z byte ?
  tdigit byte ?
  uppercase  byte "A"
  promptia byte "  is > than ",0
  promptib byte " is < than ",0
  promptjla byte " is = to ",0
  msgodd byte " is odd",0
  msgeven byte " is even ",0
  readintmsg BYTE "Please enter an integer: ",0

.code
main PROC
  call readX
  call readY
  call readZ
  mov eax,0
  mov al, uppercase
  or  al, 00100000b   ; this is 32 in decimal   upper = lower + 32 in ascii
  call writechar
  call crlf
  and al, 11011111b  ; convert lower to upper
  call writechar
  call crlf
  mov al, z
  or  al, 30h ;00110000b   ; this is 48
  call writechar
  call crlf
  call writeint
  call crlf
  mov al,x
  .if al>y
    mov al,x
    mov edx, offset promptia
    call writedec
    call writestring
    mov al,y
    call writedec
    call crlf
  .elseif y>al
    mov al,y
    mov edx, offset promptia
    call writedec
    call writestring
    mov al,x
    call writedec
    call crlf
	.else
	  mov al,y
    mov edx, offset promptjla
    call writedec
    call writestring
    mov al,x
    call writedec
    call crlf
  .endif

  call evenodd

	exit
         
main ENDP

  readX PROC uses eax edx
    mov edx, OFFSET readintmsg
    call WriteString
    call ReadInt
    mov x, al
    ret
  readX ENDP

  readY PROC uses eax edx
    mov edx, OFFSET readintmsg
    call WriteString
    call ReadInt
    mov y, al
    ret
  readY ENDP

  readZ PROC uses eax edx
    mov edx, OFFSET readintmsg
    call WriteString
    call ReadInt
    mov z, al
    ret
  readZ ENDP

  evenodd PROC
    mov eax,0
    mov al,x
    and al,00000001
    .if(al==0)
      mov al,x
      call writeint
      mov edx,offset msgeven
      call writestring
    .else
      mov al,x
      call writeint
      mov edx,offset msgodd
      call writestring
    .endif
    ret
  evenodd ENDP
     
END main