/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lfa.obj;

import com.sun.javafx.binding.StringFormatter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author 20122BSI0387
 */
public class Forma {
    String vet[];
    StringBuilder st;
    public Forma(String ctx) {
        st = new StringBuilder();
        st.append("<html>\n");
        st.append("<head>\n");
        st.append("    <title> Desenho gerado </title>\n");
        st.append("<body>\n");
        vet = ctx.split(";");
    }

    public void eval() {
        
        int bIniciado=0;
        for(int i = 0; i < vet.length; i++) {
            if(vet[i].equals("bloco")) {
                
                st.append("<div id = \"bloco\" style = \"").append(vet[i+1]);
                st.append("px;").append(vet[i+2]);
                st.append("px;").append(vet[i+3]).append(";").append("float:left;overflow: hidden;").append("\">");            
            }
            if(vet[i].equals("\nnullquadrado") || vet[i].equals("\nquadrado")) {
                System.out.println("oi");
                st.append("<div id = \"quadrado\" style = \"float:left;").append(vet[i+1]);
                st.append("px;").append(vet[i+2]);
                st.append("px;").append(vet[i+3]).append(";").append("\">");
                st.append("</div>\n");
            }
            if(vet[i].equals("\nnullcirculo") || vet[i].equals("\ncirculo")) {
                st.append("<div id = \"circulo\" style = \"float:left;").append(vet[i+1]);
                st.append("px;").append(vet[i+2]);
                st.append("px;").append(vet[i+3]).append(";").append("border-radius: 50px;").append("\">");
                st.append("</div>\n");
            }
            if(vet[i].equals("\nnulltriangulo") || vet[i].equals("\ntriangulo")) {
                String[] v = vet[i+3].split(":");
                System.out.println(""+v[1]);
                st.append("<div id = \"triangulo\" style = \"float:left;width:0px;heigth:0px;").append("border-left: 50px solid transparent; border-right: 50px solid transparent; border-bottom: 100px solid ").append(v[1]).append(";").append("\">");
                st.append("</div>\n");
            }
            if(vet[i].equals("\nnulltrapezio") || vet[i].equals("\ntrapezio")) {
                String[] v = vet[i+3].split(":");
                st.append("<div id = \"trapezio\" style = \"float:left;").append(vet[i+2]).append(";").append("border-bottom: 100px solid ").append(v[1]).append(";border-left: 50px solid transparent;border-right: 50px solid transparent;").append("\">");
                st.append("</div>\n");
            }
            if(vet[i].equals("\nnullparalelograma") || vet[i].equals("\nparalelograma")) {
                st.append("<div id = \"paralelograma\" style = \"float:left;").append(vet[i+1]).append(";").append(vet[i+2]).append(";").append(vet[i+3]);
                st.append(";-webkit-transform: skew(20deg); -moz-transform: skew(20deg); -o-transform: skew(20deg);").append("\">");
                st.append("</div>\n");
            }
            
            if(vet[i].equals("\nnullretangulo") || vet[i].equals("\nretangulo")) {
                st.append("<div id = \"retangulo\" style = \"float:left;").append(vet[i+1]);
                st.append("px;").append(vet[i+2]);
                st.append("px;").append(vet[i+3]).append(";").append("\">");
                st.append("</div>\n");
            }
            
            if(vet[i].equals("\nnulloval") || vet[i].equals("\noval")) {
                System.out.println("oi");
                st.append("<div id = \"oval\" style = \"float:left;").append(vet[i+1]);
                st.append("px;").append(vet[i+2]);
                st.append("px;").append(vet[i+3]).append(";").append("border-radius: 100px / 50px;").append("\">");
                st.append("</div>\n");
            }
            
            if(vet[i].equals("\nnullestrela") || vet[i].equals("\nestrela")) {
                st.append("<div id = \"estrela\">");
                st.append("<style>");
                st.append("#estrela {");
                st.append("float:left; width: 0;");
                st.append("height: 0;");
                st.append("border-left: 50px solid transparent;");
                st.append("border-right: 50px solid transparent;");
                st.append("border-bottom: 100px solid red;");
                st.append("position: relative;");
                st.append("}");
                st.append("#estrela:after {");
                st.append("width: 0;");
                st.append("height: 0;");
                st.append("border-left: 50px solid transparent;");
                st.append("border-right: 50px solid transparent;");
                st.append("border-top: 100px solid red;");
                st.append("position: absolute;");
                st.append("content: \"\";");
                st.append("top: 30px;");
                st.append("left: -50px;");
                st.append("}");
                st.append("</style>");
                st.append("</div>\n");
            }
   
        }
        st.append(" </div>\n");
        st.append("\n</body>");
        st.append("\n</html>");
        try (FileWriter fw = new FileWriter(new File("output.html"))) {
            fw.write(st.toString());
        } catch(IOException e) {
            throw new RuntimeException("Erro ao escrever o arquivo de saida output.html");
        }
        
        
        //System.out.println(""+st.toString());
    }   
    
    
}
