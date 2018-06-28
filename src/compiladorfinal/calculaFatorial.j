.class public calculaFatorial
.super java/lang/Object


.method public static fatorial(I)I
.limit stack 10
.limit locals 15

iload 0
ldc 1
if_icmpgt L0		; maior que para int
ldc 0
goto L1
L0:
ldc 1
L1:

ifeq LIfElse0		; inicio if else
iload 0
iload 0
ldc 1
isub

invokestatic calculaFatorial/fatorial(I)I
imul
goto LIfElse1		; goto final if else

LIfElse0:		; inicio else
ldc 1
LIfElse1:		; fim if else

ireturn
.end method

.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 4


getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Digite um numero: "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V	; imprimi nova linha

invokestatic calculaFatorial.readInt()I
istore 1

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "fatorial: "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V


getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1

invokestatic calculaFatorial/fatorial(I)I
invokevirtual java/io/PrintStream/print(I)V

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V	; imprimi nova linha


getstatic java/lang/System/in Ljava/io/InputStream;	; pausa para o ENTER
invokevirtual java/io/InputStream/read()I

return
.end method


.method public <init>()V	; construtor para as leituras
.limit stack 1
.limit locals 1
.var 0 is this LP1; from Label0 to Label1

Label0:
	aload_0
	invokespecial java/lang/Object/<init>()V
Label1:
	return

.end method

.method public static readInt()I

   .limit stack 5   ; up to five items can be pushed
   .limit locals 100

   ; the input function starts at this point
    ldc 0
    istore 50     ; storage for a dummy integer for reading it by input()
    ldc 0
    istore 49     ; preparacao para negativo
 Label1:
    getstatic java/lang/System/in Ljava/io/InputStream;
    invokevirtual java/io/InputStream/read()I
    istore 51
    iload 51
    ldc 10 ; uso no mac e linux (valor ASCII da tecla ENTER)
;   ldc 13 ; uso no windows (valor ASCII da tecla ENTER)
    isub
    ifeq Label2
    iload 51
    ldc 32 ; space 
    isub
    ifeq Label2
    iload 51
    ldc 43 ; plus sign
    isub
    ifeq Label1
    iload 51
    ldc 45 ; minus sign
    isub
    ifeq Label3
    iload 51
    ldc 48
    isub
    ldc 10
    iload 50
    imul
    iadd
    istore 50
    goto Label1


  Label3:
    ldc 1
    istore 49
    goto Label1
    
  Label2:     ; our dummy integer contains the integer read from the keyboard
    ldc 1
    iload 49
    isub
    ifeq Label4
    iload 50       ; input function ends here
    ireturn
  Label4:
    ldc 0
    iload 50
    isub
    ireturn
.end method
