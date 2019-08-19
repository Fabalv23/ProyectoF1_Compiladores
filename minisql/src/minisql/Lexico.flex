package minisql;
import static minisql.Tokens.*;
%%
%class Lexico
%line
%column
%type Tokens
L=[a-zA-Z_]
D=[0-9]
espacio=[ ,\t,\r,\n]
C=[-]
%{
    public String palabra;
    public int linea;
    public int col;
%}
%%
SELECT|	
FROM {palabra=yytext(); return Reservadas;}


{espacio} {/*Ignore*/}
{C}{C}({L}|{D})+ {palabra=yytext() ; linea = yyline ; col = yycolumn ; return Comentario_LineaUnica;}
{L}({L}|{D})* {palabra=yytext() ; linea = yyline ; col = yycolumn ; return Identificador;}
 . {palabra=yytext() ; linea = yyline ; col = yycolumn ;return ERROR;}
