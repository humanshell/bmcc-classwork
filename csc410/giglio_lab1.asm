TITLE Lab 1  (giglio_lab1.asm)

;Description: Query the user for a string, display length of string
;Date: 10/9/12
;Class: CSC410-721
;Author: Dominic Giglio

INCLUDE Irvine32.inc

.data
buffer      BYTE   50 DUP(0)
promptIn    BYTE   "Please enter a string: ",0
promptOut   BYTE   "Total Characters: ",0

.code
main        PROC

            call   clrscr
            mov    edx, OFFSET promptIn
            call   writestring
            mov    edx, OFFSET buffer
            mov    ecx, 51
            call   readstring
            mov    eax, 0

COUNT:      cmp    BYTE PTR [edx+eax], 0
            je     DONE
            inc    eax
            jmp    COUNT
     
DONE:       mov edx, OFFSET promptOut
            call crlf
            call writestring
            call writedec
            call crlf
            exit

main        ENDP
END         main