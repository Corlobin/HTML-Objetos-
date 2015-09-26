/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lfa.obj;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import lfa.obj.ObjetosLexer;
import lfa.obj.ObjetosParser.DesenhoContext;
import lfa.obj.ObjetosParser.InitContext;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author jefferson
 */
public class HTMLObjetos {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // Caso nao seja possivel passar os arquivos de testes como parametros
        
        String s = "inicio\n" +
                "1000 1000 branco\n" +
                "quadrado 100 100 vermelho\n" +
                "circulo 100 100 azul\n" +
                "triangulo 100 100 preto\n" +
                "trapezio 100 100 roxo\n" +
                "paralelograma 100 100 verde\n" +
                "retangulo 100 100 rosa\n" +
                "oval 100 100 amarelo\n" +
                "estrela 100 100 azul\n" +
                "fim";
        
        ANTLRInputStream input = new ANTLRInputStream(args[1]);
        ObjetosLexer lexer = new ObjetosLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ObjetosParser parser = new ObjetosParser(tokens);        
        String ctx = parser.init().result;
        if (ctx != null) {
            System.out.printf(">>> %s criado com sucesso.\n", ctx);
            Forma forma = new Forma(ctx);
            forma.eval();
        }
        else {
            System.out.println("!!! Error");
        }
        
        
    }
    
}
