NULL EQU 0 
STD_OUTPUT_HANDLE EQU -11

extern _GetStdHandle@4
extern _WriteFile@20
extern _ExitProcess@4
extern _printf

global Start

section .data
    num1 dd 3
    num2 dd 5
    result dd 0
    output_msg db "The sum is: %d", 0  

section .text

Start:
    mov eax, [num1]
    add eax, [num2]
    mov [result], eax
    push dword [result]
    push output_msg
    call _printf  
    add esp, 8  ; Adjust the stack pointer after the call
    call _ExitProcess@4
