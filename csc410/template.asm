TITLE Program Name  (name.asm)

;Description: 
;Date: 
;Class: CSC410-721
;Author: Dominic Giglio

INCLUDE Irvine32.inc

.data

.code
main PROC

  ; main program code here

exit
main ENDP

; procedure that dumps everything to the console
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

; additional procedures here

END main