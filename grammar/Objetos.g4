/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Objetos;
@header {
package lfa.obj;         
}


init returns [String result]: desenho {$result = $desenho.result;}; 

desenho returns [String result]: INICIO bloco FIM {$result = $bloco.result;};

bloco returns [String result]: {$result = "bloco;";} atributos {$result = $result + $atributos.result+";\n";} (forma {$result = $result+$forma.result+"\n";})* ;

forma returns [String result]: tipo {$result = $tipo.result+";";};

tipo returns [String result]: 
(QUADRADO {$result = $QUADRADO.text+";";} 
| CIRCULO {$result = $CIRCULO.text+";";} 
| TRIANGULO {$result = $TRIANGULO.text+";";} 
| TRAPEZIO {$result = $TRAPEZIO.text+";";} 
| PARALELO {$result = $PARALELO.text+";";}
| RETANGULO {$result = $RETANGULO.text+";";}
| OVAL {$result = $OVAL.text+";";} 
| ESTRELA {$result = $ESTRELA.text+";";} 
| PENTAGONO {$result = $PENTAGONO.text+";";} 
| HEXAGONO {$result = $HEXAGONO.text+";";} 
| OCATGONO {$result = $OCATGONO.text+";";} 
| INFINITO {$result = $INFINITO.text+";";} 
| DIAMANTE {$result = $DIAMANTE.text+";";} 
| YINYANG {$result = $YINYANG.text+";";} 
| CORACAO {$result = $CORACAO.text+";";})  atributos {$result = $result + $atributos.result;};

atributos returns [String result]: altura largura cor {$result = $altura.result + $largura.result + $cor.result;};

cor returns [String result]: (VERMELHO  {$result = "background-color:#FF0000";}
    | AZUL {$result = "background-color:#0000FF";}
    | PRETO  {$result = "background-color:#000000";}
    | ROXO {$result = "background-color:#A020F0";}
    | AMARELO{$result = "background-color:#FFFF00";} 
    | ROSA{$result = "background-color:#EE49EE";} 
    | VERDE{$result = "background-color:#228B22";} 
    | BRANCO {$result = "background-color:#ffffff";}) ;

altura returns [String result]: number {$result = "height:"+$number.result+";";};
largura returns [String result]: number {$result = "width:"+$number.result+";";};
lado returns [String result]: number {$result = "lado:"+$number.result+";";};

number returns [String result]: INT {$result = $INT.text;};

INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
WS      : [ \t\r\n]+ -> skip ;
INICIO: 'inicio';
VERMELHO: 'vermelho';
AZUL: 'azul';
PRETO: 'preto';
ROXO: 'roxo';
BRANCO: 'branco';
VERDE: 'verde';
ROSA : 'rosa';
AMARELO: 'amarelo';



QUADRADO: 'quadrado';
RETANGULO: 'retangulo';
OVAL: 'oval';
ESTRELA: 'estrela';
PENTAGONO: 'pentagono';
HEXAGONO: 'hexagono';
OCATGONO: 'octagno';
CORACAO: 'coracao';
INFINITO: 'infinito';
DIAMANTE: 'diamente';
YINYANG: 'yinyang';
CIRCULO: 'circulo';
TRIANGULO: 'triangulo';
TRAPEZIO: 'trapezio';
PARALELO: 'paralelograma';
FIM: 'fim';


