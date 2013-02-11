TITLE Swap Procedure Example

INCLUDE   Irvine32.inc
Swap      PROTO pValX: PTR DWORD, pValY: PTR DWORD

.data
Array     DWORD 10000h, 20000h

.code

Swap      PROC     USES eax esi edi,
                   pValX: PTR DWORD,
                   pValY: PTR DWORD

          mov      esi, pValX
          mov      edi, PvalY
          mov      eax, [esi]
          xchg     eax, [edi]
          mov      [esi], eax
          ret
Swap      ENDP

main      PROC
          mov      esi, OFFSET Array
          mov      ecx, 2
          mov      ebx, TYPE Array
          call     DumpMem

          INVOKE   Swap, ADDR Array, ADDR [Array+4]
          call     DumpMem
          exit
main      ENDP
end       main