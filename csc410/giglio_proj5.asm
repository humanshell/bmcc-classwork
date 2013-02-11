TITLE Proj 5  (giglio_proj5.asm)

;Description: Query the user for a string, display reversed string using dynamic memory
;Date: 12/18/12
;Class: CSC410-721
;Author: Dominic Giglio

INCLUDE Irvine32.inc

GetProcessHeap   PROTO
HeapAlloc        PROTO, hHeap:DWORD, dwFlags:DWORD, dwBytes:DWORD
HeapFree         Proto, hHeap:DWORD, dwFlags:DWORD, lpMem:DWORD

.data
pMsg1            BYTE        "Enter length of string: ",0
pMsg2            BYTE        "Enter string: ",0
pBuff            BYTE        50 DUP(0)

.code

swap             MACRO       h, l
                 XOR         h, l
                 XOR         l, h
                 XOR         h, l
                 ENDM

strlen           MACRO       str
                 PUSH        str
                 CALL        strLength
                 ENDM

strrev           MACRO       str
                 PUSH        str
                 CALL        strReverse
                 ENDM

putString        MACRO
                 CALL        crlf
                 CALL        WriteString
                 CALL        crlf
                 ENDM

strLength        PROC
                 PUSH        ebp
                 MOV         ebp, esp
                 PUSH        ebx
                 MOV         eax, 0
                 MOV         ebx, [ebp+8]

COUNT:           CMP         BYTE PTR [ebx+eax], 0
                 JE          DONE
                 INC         eax
                 JMP         COUNT

DONE:            POP         ebx
                 MOV         esp, ebp
                 POP         ebp
                 RET         TYPE ebp
strLength        ENDP

strReverse       PROC
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

REV:             CMP         al, 0
                 JZ          DONE
                 MOV         ah, BYTE PTR [ebx]
                 swap        ah, BYTE PTR [ecx-1]
                 MOV         BYTE PTR [ebx], ah
                 INC         ebx
                 DEC         ecx
                 DEC         al
                 JMP         REV

DONE:            POP         ecx
                 POP         ebx
                 POP         eax
                 MOV         esp, ebp
                 POP         ebp
                 RET         (TYPE ebp)*4
strReverse       ENDP

getHeap          PROC
                 PUSH        ebp
                 MOV         ebp, esp
                 CALL        GetProcessHeap
                 MOV         esp, ebp
                 POP         ebp
                 RET
getHeap          ENDP

allocate         PROC
                 PUSH        ebp
                 MOV         ebp, esp
                 INVOKE      HeapAlloc, eax, 0, ecx
                 MOV         esp, ebp
                 POP         ebp
                 RET
allocate         ENDP

deallocate       PROC
                 PUSH        ebp
                 MOV         ebp, esp
                 INVOKE      HeapFree, esi, 0, edi
                 MOV         esp, ebp
                 POP         ebp
                 RET
deallocate       ENDP

main             PROC
                 MOV         edx, OFFSET pMsg1
                 CALL        WriteString
                 MOV         edx, OFFSET pBuff
                 MOV         ecx, 11
                 CALL        ReadInt
                 MOV         ebx, eax
                 INC         ebx
                 CALL        GetHeap
                 MOV         esi, eax
                 CALL        allocate
                 MOV         edi, eax
                 MOV         edx, OFFSET pMsg2
                 CALL        WriteString
                 MOV         edx, eax
                 MOV         ecx, ebx
                 CALL        ReadString
                 strrev      edx
                 putString
                 CALL        deallocate
                 exit
main             ENDP
END              main