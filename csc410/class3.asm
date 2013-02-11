TITLE 16 bit test

INCLUDE  Irvine32.inc
INCLUDE  Irvine16.inc

;.MODEL small,stdcall
;.STACK 200h
;.386

.data

.code
main     PROC
         .STARTUP
         ;MOV    ax, @data
         ;MOV    ds, ax
         ;MOV    ah, 10h
         ;call   DumpRegs
         ;INT    16h
         MOV    ah, 2h
         MOV    dl, 'D'
         INT    21h
         ;MOV    ah, 4ch
         ;int    21h
         .EXIT
main     ENDP
end      main