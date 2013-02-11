TITLE Proj 3  (giglio_proj3.asm)

;Description: Query the user for a string, display length of string using a MACRO
;Date: 10/18/12
;Class: CSC410-721
;Author: Dominic Giglio

INCLUDE Irvine32.inc

.data
buffer         BYTE   50 DUP(0)
promptIn       BYTE   "Please enter a string: ",0
promptOut      BYTE   "Total Characters: ",0

.code

strlen         MACRO    string

               push     string
               call     strlength

               ENDM

strlength      PROC
               push     ebp
               mov      ebp, esp
               push     ebx
               mov      eax, 0
               mov      ebx, [ebp+8]

COUNT:         cmp      BYTE PTR [ebx+eax], 0
               je       DONE
               inc      eax
               jmp      COUNT

DONE:          pop      ebx
               mov      esp, ebp
               pop      ebp
               ret      TYPE ebp*1
strlength      ENDP

main           PROC

               mov      edx, OFFSET promptIn
               call     writestring
               mov      edx, OFFSET buffer
               mov      ecx, 51
               call     readstring
               strlen   edx
               mov      edx, OFFSET promptOut
               call     crlf
               call     writestring
               call     writedec
               call     crlf
               exit

main           ENDP
END            main