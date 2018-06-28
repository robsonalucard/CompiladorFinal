/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorfinal;

import Controle.Semantica;
import Controle.gramaticaLexer;
import Controle.gramaticaParser;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author pedro
 */
public class CompiladorFinal {
    
    File codigoFonte;
    PrintStream out;
    
    public CompiladorFinal(File codigoFonte) {
        this.codigoFonte = codigoFonte;
    }

  
    public File compilar() {        
        
        try{
            
            out = new PrintStream(this.codigoFonte.getParent()+"/LOG");
            System.setOut(out); // aponta saida padrao para o arquivo
            System.setErr(out); // aponta saida de erros padrao para o arquivo
       
            InputStream input = new FileInputStream(codigoFonte);
            ANTLRInputStream stream = new ANTLRInputStream(input);

            //Lexico
            gramaticaLexer lexer = new gramaticaLexer(stream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            //Sintatico
            gramaticaParser parser = new gramaticaParser(tokens);
            ParseTree tree = parser.prog();

            //acoes semanticas, atraves de listener
            Semantica listener = new Semantica(this.codigoFonte.getParent()+"/");
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, tree);  
            
            return new File(codigoFonte.getParent()+"/"+listener.tabelaDeSimbolos.identificadorPrograma+".j");
        
        }catch(Exception e){
            System.out.println("Erro na compilação.\n");
            e.printStackTrace();
        }
        
        return null;
    }
    
}
