package Controle;

import java.io.IOException;
import java.io.PrintWriter;
import Entidade.*;

public class GeradorDeCodigo {
    
    private final int Int = 1, Real = 2, String = 3, Bool = 4;
    
    private TabelaDeSimbolos tbSimb;
    private PrintWriter pw;
    private int countLabels;
    private String diretorioSourceFile;
    private PilhaLabels labelsFor;
    private PilhaLabels labelsifelse;
    private PilhaLabels labelsif;
    
    public GeradorDeCodigo(TabelaDeSimbolos tbSimb, String diretorioSourceFile){
        this.tbSimb = tbSimb;
        this.countLabels = 0;
        this.diretorioSourceFile = diretorioSourceFile;
        this.labelsFor = new PilhaLabels();
        this.labelsifelse = new PilhaLabels();
        this.labelsif = new PilhaLabels();
    }
    
    public void genFile(){
        try {
            //System.out.println((tbSimb == null) ? "sim" : "nao");
            this.pw = new PrintWriter(diretorioSourceFile+tbSimb.identificadorPrograma+".j");
        } catch (IOException ex) {
            System.out.println("Erro ao criar arquivo jasmin.");
        }
    }
    
    public void closeFile(){
        this.pw.close();
    }
    
    public void genHeader(){
        this.pw.println(".class public "+this.tbSimb.identificadorPrograma);
        this.pw.println(".super java/lang/Object");
        this.pw.println("");
    }
    
    public void genMainHeader(){
        this.pw.println(".method public static main([Ljava/lang/String;)V");
        this.pw.println(".limit stack 10");
        this.pw.println(".limit locals "+(this.tbSimb.numeroGlobais+2)); //mais um para garantir alocaçao de pelo menos uma.
        this.pw.println("");
    }
    
    public void genIncremento(){
        this.pw.println("ldc 1");
        this.pw.println("iadd");
    }
    
    public void genDecremento(){
        this.pw.println("ldc 1");
        this.pw.println("isub");
    }
    
    public void genIncrementoFloat(){
        this.pw.println("ldc 1.0");
        this.pw.println("fadd");
    }
    
    public void genDecrementoFloat(){
        this.pw.println("ldc 1.0");
        this.pw.println("fsub");
    }
    
    public void genNegacao(){
        this.pw.println("\nifeq L"+this.countLabels+"\t; invertendo booleano");
        this.pw.println("ldc 0");
        this.pw.println("goto L"+(this.countLabels+1));
        this.pw.println("L"+this.countLabels+":");
        this.pw.println("ldc 1");
        this.pw.println("L"+(this.countLabels+1)+":");
        this.countLabels += 2;
    }
    
    public void genMinusInteiro(){
        this.pw.println("ineg");
    }
    
    public void genMinusReal(){
        this.pw.println("fneg");
    }
    
    public void genMultInteiro(){
        this.pw.println("imul");
    }
    
    public void genMultReal(){
        this.pw.println("fmul");
    }
    
    public void genDivInteiro(){
        this.pw.println("idiv");
    }
    
    public void genDivReal(){
        this.pw.println("fdiv");
    }
    
    public void genInttoReal(){
        this.pw.println("i2f");
    }
    
    public void genRealtoInt(){
        this.pw.println("f2i");
    }
    
    public void genInttoRealPrimeiroOperando(String nomeFunc){
        if(nomeFunc.equals("")){
            //quando o operando abaixo do topo tem que ser convertido para Real
            this.pw.println("fstore 0\t; salvando em temporario"); //salva o topo no temporario (0 por padrao)
            this.pw.println("i2f"); //converte o novo topo
            this.pw.println("fload 0\t\t; carregando temporario"); //carrega o temporario no topo novamente
        }
    }
    
    public void genDesempilha(){
        this.pw.println("pop");
    }
    
    public void genSomaInt(){
        this.pw.println("iadd");
    }
    
    public void genSomaReal(){
        this.pw.println("fadd");
    }
    
    public void genSubInt(){
        this.pw.println("isub");
    }
    
    public void genSubReal(){
        this.pw.println("fsub");
    }
    
    public void genMaiorQueReal(){
        this.pw.println("fcmpg\t\t; maior que para float\n" +
                        "ifgt L"+this.countLabels+"\n" +
                        "ldc 0\n" +
                        "goto L"+(this.countLabels+1)+"\n" +
                        "L"+this.countLabels+":\n" +
                        "ldc 1\n" +
                        "L"+(this.countLabels+1)+":");
        this.countLabels += 2;
    }
    
    public void genMenorQueReal(){
        this.pw.println("fcmpg\t\t; menor que para float\n" +
                        "iflt L"+this.countLabels+"\n" +
                        "ldc 0\n" +
                        "goto L"+(this.countLabels+1)+"\n" +
                        "L"+this.countLabels+":\n" +
                        "ldc 1\n" +
                        "L"+(this.countLabels+1)+":");
        this.countLabels += 2;
    }
    
    public void genMaiorIgualQueReal(){
        this.pw.println("fcmpg\t\t; maior igual que para float\n" +
                        "ldc -1\n" +
                        "if_icmpne L"+this.countLabels+"\n" +
                        "ldc 0\n" +
                        "goto L"+(this.countLabels+1)+"\n" +
                        "L"+this.countLabels+":\n" +
                        "ldc 1\n" +
                        "L"+(this.countLabels+1)+":");
        this.countLabels += 2;
    }
    
    public void genMenorIgualQueReal(){
        this.pw.println("fcmpg\t\t; menor igual que para float\n" +
                        "ldc 1\n" +
                        "if_icmplt L"+this.countLabels+"\n" +
                        "ldc 0\n" +
                        "goto L"+(this.countLabels+1)+"\n" +
                        "L"+this.countLabels+":\n" +
                        "ldc 1\n" +
                        "L"+(this.countLabels+1)+":");
        this.countLabels += 2;
    }
    
    public void genMaiorQueInt(){
        this.pw.println("if_icmpgt L"+this.countLabels+"\t\t; maior que para int\n" +
                        "ldc 0\n" +
                        "goto L"+(this.countLabels+1)+"\n" +
                        "L"+this.countLabels+":\n" +
                        "ldc 1\n" +
                        "L"+(this.countLabels+1)+":");
        this.countLabels += 2;
    }
    
    public void genMenorQueInt(){
        this.pw.println("if_icmplt L"+this.countLabels+"\t\t; menor que para int\n" +
                        "ldc 0\n" +
                        "goto L"+(this.countLabels+1)+"\n" +
                        "L"+this.countLabels+":\n" +
                        "ldc 1\n" +
                        "L"+(this.countLabels+1)+":");
        this.countLabels += 2;
    }
    
    public void genMaiorIgualQueInt(){
        this.pw.println("if_icmpge L"+this.countLabels+"\t\t; maior igual que para int\n" +
                        "ldc 0\n" +
                        "goto L"+(this.countLabels+1)+"\n" +
                        "L"+this.countLabels+":\n" +
                        "ldc 1\n" +
                        "L"+(this.countLabels+1)+":");
        this.countLabels += 2;
    }
    
    public void genMenorIgualQueInt(){
        this.pw.println("if_icmple L"+this.countLabels+"\t\t; menor igual que para int\n" +
                        "ldc 0\n" +
                        "goto L"+(this.countLabels+1)+"\n" +
                        "L"+this.countLabels+":\n" +
                        "ldc 1\n" +
                        "L"+(this.countLabels+1)+":");
        this.countLabels += 2;
    }
    
    public void genIgualdadeInt(){
        this.pw.println("if_icmpeq L"+this.countLabels+"\t\t; igualdade para int\n" +
                        "ldc 0\n" +
                        "goto L"+(this.countLabels+1)+"\n" +
                        "L"+this.countLabels+":\n" +
                        "ldc 1\n" +
                        "L"+(this.countLabels+1)+":");
        this.countLabels += 2;
    }
    
    public void genIgualdadeReal(){
        this.pw.println("fcmpg\t\t; igualdade para float\n" +
                        "ifeq L"+this.countLabels+"\n" +
                        "ldc 0\n" +
                        "goto L"+(this.countLabels+1)+"\n" +
                        "L"+this.countLabels+":\n" +
                        "ldc 1\n" +
                        "L"+(this.countLabels+1)+":");
        this.countLabels += 2;
    }
        
    public void genDiferenteInt(){
        this.pw.println("if_icmpne L"+this.countLabels+"\t\t; diferente para int\n" +
                        "ldc 0\n" +
                        "goto L"+(this.countLabels+1)+"\n" +
                        "L"+this.countLabels+":\n" +
                        "ldc 1\n" +
                        "L"+(this.countLabels+1)+":");
        this.countLabels += 2;
    }
    
    public void genDiferenteReal(){
        this.pw.println("fcmpg\t\t; diferente para float\n" +
                        "ifne L"+this.countLabels+"\n" +
                        "ldc 0\n" +
                        "goto L"+(this.countLabels+1)+"\n" +
                        "L"+this.countLabels+":\n" +
                        "ldc 1\n" +
                        "L"+(this.countLabels+1)+":");
        this.countLabels += 2;
    }
    
    public void genIgualdadeString(){
        //implementar ...
    }
    
    public void loadInteiro(int end){
        this.pw.println("iload "+end);
    }
    
    public void loadReal(int end){
        this.pw.println("fload "+end);
    }
    
    public void loadString(int end){
        this.pw.println("aload "+end);
    }
    
    public void loadBool(int end){
        this.pw.println("iload "+end);
    }
    
    public void loadLiteralInterio(String l){
        this.pw.println("ldc "+l);
    }
    
    public void loadLiteralReal(String l){
        this.pw.println("ldc "+l);
    }
    
    public void loadLiteralString(String l){
        this.pw.println("ldc "+l);
    }
    
    public void loadLiteralBool(String l){
        if(l.equals("true")){
            this.pw.println("ldc 1");
        }else if(l.equals("false")){
            this.pw.println("ldc 0");
        }
    }
    
    public void genStoreInteiro(int end){
        this.pw.println("istore "+end);
    }
    
    public void genStoreReal(int end){
        this.pw.println("fstore "+end);
    }
    
    public void genStoreBool(int end){
        this.pw.println("istore "+end);
    }
    
    public void genStoreString(int end){
        this.pw.println("astore "+end);
    }
    
    public void finalizarMain(){
        this.pw.println("\ngetstatic java/lang/System/in Ljava/io/InputStream;\t; pausa para o ENTER\n" +
                        "invokevirtual java/io/InputStream/read()I");
        this.pw.println("\nreturn\n" + ".end method\n");
    }
    
    public void genChamadaReadInt(int end){
        this.pw.println("invokestatic "+this.tbSimb.identificadorPrograma+".readInt()I");
        this.pw.println("istore "+end);
    }
    
    public void genChamadaReadFloat(int end){
        this.pw.println("getstatic java/lang/System/out Ljava/io/PrintStream;\n" +
                        "ldc \"(com virgula): \"\n" +
                        "invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
        this.pw.println("invokestatic "+this.tbSimb.identificadorPrograma+"/readReal()F");
        this.pw.println("fstore "+end);
    }
    
    public void genChamadaReadString(int end){
        this.pw.println("invokestatic "+this.tbSimb.identificadorPrograma+"/readString()Ljava/lang/String;");
        this.pw.println("astore "+end);
    }
    
    public void genReadInt(){
        this.pw.println("\n.method public static readInt()I\n" +
                        "\n" +
                        "   .limit stack 5   ; up to five items can be pushed\n" +
                        "   .limit locals 100\n" +
                        "\n" +
                        "   ; the input function starts at this point\n" +
                        "    ldc 0\n" +
                        "    istore 50     ; storage for a dummy integer for reading it by input()\n" +
                        "    ldc 0\n" +
                        "    istore 49     ; preparacao para negativo\n" +
                        " Label1:\n" +
                        "    getstatic java/lang/System/in Ljava/io/InputStream;\n" +
                        "    invokevirtual java/io/InputStream/read()I\n" +
                        "    istore 51\n" +
                        "    iload 51\n" +
                        "    ldc 10 ; uso no mac e linux (valor ASCII da tecla ENTER)\n" +
                        ";   ldc 13 ; uso no windows (valor ASCII da tecla ENTER)\n" +
                        "    isub\n" +
                        "    ifeq Label2\n" +
                        "    iload 51\n" +
                        "    ldc 32 ; space \n" +
                        "    isub\n" +
                        "    ifeq Label2\n" +
                        "    iload 51\n" +
                        "    ldc 43 ; plus sign\n" +
                        "    isub\n" +
                        "    ifeq Label1\n" +
                        "    iload 51\n" +
                        "    ldc 45 ; minus sign\n" +
                        "    isub\n" +
                        "    ifeq Label3\n" +
                        "    iload 51\n" +
                        "    ldc 48\n" +
                        "    isub\n" +
                        "    ldc 10\n" +
                        "    iload 50\n" +
                        "    imul\n" +
                        "    iadd\n" +
                        "    istore 50\n" +
                        "    goto Label1\n" +
                        "\n" +
                        "\n" +
                        "  Label3:\n" +
                        "    ldc 1\n" +
                        "    istore 49\n" +
                        "    goto Label1\n" +
                        "    \n" +
                        "  Label2:     ; our dummy integer contains the integer read from the keyboard\n" +
                        "    ldc 1\n" +
                        "    iload 49\n" +
                        "    isub\n" +
                        "    ifeq Label4\n" +
                        "    iload 50       ; input function ends here\n" +
                        "    ireturn\n" +
                        "  Label4:\n" +
                        "    ldc 0\n" +
                        "    iload 50\n" +
                        "    isub\n" +
                        "    ireturn\n" +
                        ".end method");
    }
    
    public void genConstrutor(){
        this.pw.println("\n.method public <init>()V\t; construtor para as leituras\n" +
                        ".limit stack 1\n" +
                        ".limit locals 1\n" +
                        ".var 0 is this LP1; from Label0 to Label1\n" +
                        "\n" +
                        "Label0:\n" +
                        "	aload_0\n" +
                        "	invokespecial java/lang/Object/<init>()V\n" +
                        "Label1:\n" +
                        "	return\n" +
                        "\n" +
                        ".end method");
    }
    
    public void genReadFloat(){
        this.pw.println("\n.method public static readReal()F\n" +
                        ".limit stack 3\n" +
                        ".limit locals 1\n" +
                        "\n" +
                        "	new java/util/Scanner\n" +
                        "	dup\n" +
                        "	getstatic java/lang/System/in Ljava/io/InputStream;\n" +
                        "	invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V\n" +
                        "	astore_0\n" +
                        "	aload_0\n" +
                        "	invokevirtual java/util/Scanner/nextFloat()F\n" +
                        "	freturn\n" +
                        "\n" +
                        ".end method");
    }
    
    public void genReadString(){
        this.pw.println("\n.method public static readString()Ljava/lang/String;\n" +
                        ".limit stack 5\n" +
                        ".limit locals 1\n" +
                        "\n" +
                        "	new java/io/BufferedReader\n" +
                        "	dup\n" +
                        "	new java/io/InputStreamReader\n" +
                        "	dup\n" +
                        "	getstatic java/lang/System/in Ljava/io/InputStream;\n" +
                        "	invokespecial java/io/InputStreamReader/<init>(Ljava/io/InputStream;)V\n" +
                        "	invokespecial java/io/BufferedReader/<init>(Ljava/io/Reader;)V\n" +
                        "	astore_0\n" +
                        "	aload_0\n" +
                        "	invokevirtual java/io/BufferedReader/readLine()Ljava/lang/String;\n" +
                        "	areturn\n" +
                        "\n" +
                        ".throws java/lang/Exception\n" +
                        ".end method");
    }
    
    public void decConstanteIntRealString(String valor){
        this.pw.println("ldc "+valor+"\t\t; carregando constante");
    }
    
    public void genPrintInit(){
        this.pw.println("\ngetstatic java/lang/System/out Ljava/io/PrintStream;");
    }
    
    public void genPrintNewLine(){
        this.pw.println("getstatic java/lang/System/out Ljava/io/PrintStream;");
        this.pw.println("ldc \"\"");
        this.pw.println("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\t; imprimi nova linha\n");
    }
    
    public void genPrintString(){
        this.pw.println("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n");
    }
    
    public void genPrintInteiro(){
        this.pw.println("invokevirtual java/io/PrintStream/print(I)V\n");
    }
    
    public void genPrintReal(){
        this.pw.println("invokevirtual java/io/PrintStream/print(F)V\n");
    }
    
    public void genPrintBool(){
        this.pw.println("\nldc 0");
        this.pw.println("if_icmpeq L"+this.countLabels+"\t; mapeamento int -> Bool");
        this.pw.println("ldc \"true\"");
        this.pw.println("goto L"+(this.countLabels+1));
        this.pw.println("L"+this.countLabels+":");
        this.pw.println("ldc \"false\"");
        this.pw.println("L"+(this.countLabels+1)+":");
        this.countLabels += 2;
        this.pw.println("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n");
    }
    
    public void genInitFunc(String nomeFunc){
        Funcao f = this.tbSimb.obterFuncao(nomeFunc);
        if(f != null){
            this.pw.print("\n.method public static "+f.identificador+"(");
            for(Variavel v : f.argumentos){
                this.pw.print(this.mapTipo(v.tipo));
            }
            this.pw.println(")"+this.mapTipo(f.tipo));
            this.pw.println(".limit stack 10\n" +
                            ".limit locals 15\n");
        }
    }
    
    public void genFinalFunc(String nomeFunc){
        Funcao f = this.tbSimb.obterFuncao(nomeFunc);
        this.pw.println("");
        switch (f.tipo) {
            case Int:
                this.pw.println("ireturn");
                break;
            case Real:
                this.pw.println("freturn");
                break;
            case Bool:
                this.pw.println("ireturn");
                break;
            case String:
                this.pw.println("areturn");
                break;
            default:
                this.pw.println("return");
                break;
        }
        this.pw.println(".end method\n");
    }
    
    public void genChamadaFunc(String nomeFunc){
        Funcao f = this.tbSimb.obterFuncao(nomeFunc);
        if(f != null){
            this.pw.print("\ninvokestatic "+this.tbSimb.identificadorPrograma+"/"+f.identificador+"(");
            for(Variavel v : f.argumentos){
                this.pw.print(this.mapTipo(v.tipo));
            }
            this.pw.println(")"+this.mapTipo(f.tipo));
        }
    }
    
    public void genIfInit(){
        this.pw.println("ifeq LIf"+this.labelsif.push()+"\t\t; inicio if");
    }
    
    public void genIfFinal(){
        this.pw.println("\nLIf"+this.labelsif.pop()+":\t\t\t; final if");
    }
    
    public void genIfElseInit(){
        this.pw.println("\nifeq LIfElse"+this.labelsifelse.push()+"\t\t; inicio if else");
    }
    
    public void genIfElseMeio(){
        int fimIf = this.labelsifelse.pop();
        int initElse = this.labelsifelse.push();
        this.pw.println("goto LIfElse"+initElse+"\t\t; goto final if else");
        this.pw.println("\nLIfElse"+fimIf+":\t\t; inicio else");
    }
    
    public void genIfElseFinal(){
        this.pw.println("LIfElse"+this.labelsifelse.pop()+":\t\t; fim if else");
    }
    
    private String mapTipo(int tipo){
        switch (tipo) {
            case Int:
                return "I";
            case Real:
                return "F";
            case Bool:
                return "I";
            case String:
                return "Ljava/lang/String;";
            default:
                break;
        }
        return "";
    }
    
}
