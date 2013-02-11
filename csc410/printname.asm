TITLE Print Name  (printname.asm)

;Description: Prints "Your Name" to the screen
;Date: 8/30/12
;Class: CSC410-721
;Author: Dominic Giglio

INCLUDE Irvine32.inc

.data
msg1 BYTE "Your Name",0

.code
main PROC

  mov edx, OFFSET msg1
  call writestring

exit
main ENDP

END main