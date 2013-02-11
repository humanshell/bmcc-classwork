TITLE Proj 4  (giglio_proj4.asm)

;Description: Query the user for a string, display reversed string using a combination of MACROs and PROCs
;Date: 11/1/12
;Class: CSC410-721
;Author: Dominic Giglio

INCLUDE Irvine32.inc

.code

strlen         MACRO       str
               PUSH        str
               CALL        strLength
               ENDM

strrev         MACRO       str
               PUSH        str
               CALL        strReverse
               ENDM

swap           MACRO       h, l
               XOR         h, l
               XOR         l, h
               XOR         h, l
               ENDM

getString      MACRO       str
               LOCAL       prompt
.data
prompt         BYTE        str,0
buffer         BYTE        50 DUP(0)
.code
               MOV         edx, OFFSET prompt
               CALL        WriteString
               MOV         edx, OFFSET buffer
               MOV         ecx, 51
               CALL        ReadString
               MOV         eax, edx
               ENDM

putString      MACRO
               CALL        crlf
               CALL        WriteString
               CALL        crlf
               ENDM

strLength      PROC
               PUSH        ebp
               MOV         ebp, esp
               PUSH        ebx
               MOV         eax, 0
               MOV         ebx, [ebp+8]

COUNT:         CMP         BYTE PTR [ebx+eax], 0
               JE          DONE
               INC         eax
               JMP         COUNT

DONE:          POP         ebx
               MOV         esp, ebp
               POP         ebp
               RET         TYPE ebp
strLength      ENDP

strReverse     PROC
               PUSH        ebp
               MOV         ebp, esp
               PUSH        eax
               PUSH        ebx
               PUSH        ecx
               MOV         ebx, [ebp+8]
               MOV         ecx, [ebp+8]
               strlen      ebx
               ADD         ecx, eax
               SHR         al, 1

REV:           CMP         al, 0
               JZ          DONE
               MOV         ah, BYTE PTR [ebx]
               swap        ah, BYTE PTR [ecx-1]
               MOV         BYTE PTR [ebx], ah
               INC         ebx
               DEC         ecx
               DEC         al
               JMP         REV

DONE:          POP         ecx
               POP         ebx
               POP         eax
               MOV         esp, ebp
               POP         ebp
               RET         (TYPE ebp)*4
strReverse     ENDP

main           PROC
               getString   "Please enter a string: " 
               strrev      eax
               putString
main           ENDP

END            main