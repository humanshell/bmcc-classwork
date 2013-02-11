TITLE Calculate Elapsed Time

INCLUDE  Irvine32.inc
INCLUDE  macros.inc

.data
startTime         DWORD ?
;msgBoxText       BYTE <" milliseconds have elapsed", 0dh, 0ah>
message           BYTE "milliseconds have elapsed",0
caption           BYTE "GetTickCount",0

.code
main     PROC
         INVOKE   GetTickCount
         mov      startTime, eax

         INVOKE   Sleep, 1000

         INVOKE   GetTickCount
         cmp      eax, startTime
         jb       error

         sub      eax, startTime
         INVOKE   MessageBox, 0, ADDR message, ADDR caption, MB_YESNO + MB_ICONEXCLIMATION
         jmp      quit
         
         ;call     WriteDec
         ;INVOKE   ExitProcess, NULL
         ;mWrite   

error:   
         mWrite   <"Error: GetTickCount invalid - system has">
         mWrite   <" Been active for more than 49.7 days", 0dh, 0ah>

quit:    exit

main     ENDP
end      main