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
Char = [^\r\n]
S=[']
C = [","]


%{
    public String palabra;
    public int linea;
    public int col;

%}
%%


{espacio} {/*Ignore*/}

"--" {Char}*(\r|\n|\r\n) {/*Ignore*/}

"/*" [^*] ~("*/") | "/*" ("*"+ "/") {/*Ignore*/}




ADD|EXTERNAL|PROCEDURE {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
ALL|FETCH|PUBLIC    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
ALTER|FILE|RAISERROR    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
AND|FILLFACTOR|READ {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
ANY|FOR|READTEXT    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
AS|FOREIGN|RECONFIGURE  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
ASC|FREETEXT|REFERENCES {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
AUTHORIZATION|FREETEXTTABLE|REPLICATION {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
BACKUP|FROM|RESTORE {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
BEGIN|FULL|RESTRICT {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
BETWEEN|FUNCTION|RETURN {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
BREAK|GOTO|REVERT   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
BROWSE|GRANT|REVOKE {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
BULK|GROUP|RIGHT    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
BY|HAVING|ROLLBACK  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CASCADE|HOLDLOCK|ROWCOUNT   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CASE|IDENTITY|ROWGUIDCOL    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CHECK|IDENTITY_INSERT|RULE  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CHECKPOINT|IDENTITYCOL|SAVE {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CLOSE|IF|SCHEMA {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CLUSTERED|IN|SECURITYAUDIT  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
COALESCE|INDEX|SELECT   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
COLLATE|INNER|SEMANTICKEYPHRASETABLE    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
COLUMN|INSERT|SEMANTICSIMILARITYDETAILSTABLE    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
COMMIT|INTERSECT|SEMANTICSIMILARITYTABLE    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
COMPUTE|INTO|SESSION_USER   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CONSTRAINT|IS|SET   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CONTAINS|JOIN|SETUSER   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CONTAINSTABLE|KEY|SHUTDOWN  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CONTINUE|KILL|SOME  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CONVERT|LEFT|STATISTICS {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CREATE|LIKE|SYSTEM_USER {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CROSS|LINENO|TABLE  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CURRENT|LOAD|TABLESAMPLE    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CURRENT_DATE|MERGE|TEXTSIZE {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CURRENT_TIME|NATIONAL|THEN  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CURRENT_TIMESTAMP|NOCHECK|TO    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CURRENT_USER|NONCLUSTERED|TOP   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CURSOR|NOT|TRAN {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DATABASE|NULL|TRANSACTION   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DBCC|NULLIF|TRIGGER {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DEALLOCATE|OF|TRUNCATE  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DECLARE|OFF|TRY_CONVERT {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DEFAULT|OFFSETS|TSEQUAL {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DELETE|ON|UNION {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DENY|OPEN|UNIQUE    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DESC|OPENDATASOURCE|UNPIVOT {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DISK|OPENQUERY|UPDATE   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DISTINCT|OPENROWSET|UPDATETEXT  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DISTRIBUTED|OPENXML|USE {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DOUBLE|OPTION|USER  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DROP|OR|VALUES  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DUMP|ORDER|VARYING  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
ELSE|OUTER|VIEW {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
END|OVER|WAITFOR    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
ERRLVL|PERCENT|WHEN {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
ESCAPE|PIVOT|WHERE  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
EXCEPT|PLAN|WHILE   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
EXEC|PRECISION|WITH {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
EXECUTE|PRIMARY|"WITHIN GROUP"    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
EXISTS|PRINT|WRITETEXT  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
EXIT|PROC   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
ABSOLUTE|EXEC|OVERLAPS  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
ACTION|EXECUTE|PAD  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
ADA|EXISTS|PARTIAL  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
ADD|EXTERNAL|PASCAL {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
ALL|EXTRACT|POSITION    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
ALLOCATE|FALSE|PRECISION    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
ALTER|FETCH|PREPARE {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
AND|FIRST|PRESERVE  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
ANY|FLOAT|PRIMARY   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
ARE|FOR|PRIOR   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
AS|FOREIGN|PRIVILEGES   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
ASC|FORTRAN|PROCEDURE   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
ASSERTION|FOUND|PUBLIC  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
AT|FROM|READ    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
AUTHORIZATION|FULL|REAL {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
AVG|GET|REFERENCES  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
BEGIN|GLOBAL|RELATIVE   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
BETWEEN|GO|RESTRICT {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
BIT|GOTO|REVOKE {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
BIT_LENGTH|GRANT|RIGHT  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
BOTH|GROUP|ROLLBACK {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
BY|HAVING|ROWS  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CASCADE|HOUR|SCHEMA {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CASCADED|IDENTITY|SCROLL    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CASE|IMMEDIATE|SECOND   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CAST|IN|SECTION {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CATALOG|INCLUDE|SELECT  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CHAR|INDEX|SESSION  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CHAR_LENGTH|INDICATOR|SESSION_USER  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CHARACTER|INITIALLY|SET {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CHARACTER_LENGTH|INNER|SIZE {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CHECK|INPUT|SMALLINT    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CLOSE|INSENSITIVE|SOME  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
COALESCE|INSERT|SPACE   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
COLLATE|INT|SQL     {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
COLLATION|INTEGER|SQLCA {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
COLUMN|INTERSECT|SQLCODE    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
COMMIT|INTERVAL|SQLERROR    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CONNECT|INTO|SQLSTATE   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CONNECTION|IS|SQLWARNING    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CONSTRAINT|ISOLATION|SUBSTRING  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CONSTRAINTS|JOIN|SUM    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CONTINUE|KEY|SYSTEM_USER    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CONVERT|LANGUAGE|TABLE  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CORRESPONDING|LAST|TEMPORARY    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
COUNT|LEADING|THEN  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CREATE|LEFT|TIME    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CROSS|LEVEL|TIMESTAMP   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CURRENT|LIKE|TIMEZONE_HOUR  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CURRENT_DATE|LOCAL|TIMEZONE_MINUTE  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CURRENT_TIME|LOWER|TO   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CURRENT_TIMESTAMP|MATCH|TRAILING    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CURRENT_USER|MAX|TRANSACTION    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
CURSOR|MIN|TRANSLATE    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DATE|MINUTE|TRANSLATION {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DAY|MODULE|TRIM {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DEALLOCATE|MONTH|TRUE   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DEC|NAMES|UNION {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DECIMAL|NATIONAL|UNIQUE {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DECLARE|NATURAL|UNKNOWN {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DEFAULT|NCHAR|UPDATE    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DEFERRABLE|NEXT|UPPER   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DEFERRED|NO|USAGE   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DELETE|NONE|USER    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DESC|NOT|USING  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DESCRIBE|NULL|VALUE {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DESCRIPTOR|NULLIF|VALUES    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DIAGNOSTICS|NUMERIC|VARCHAR {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DISCONNECT|OCTET_LENGTH|VARYING {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DISTINCT|OF|VIEW    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DOMAIN|ON|WHEN  {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DOUBLE|ONLY|WHENEVER    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
DROP|OPEN|WHERE {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
ELSE|OPTION|WITH    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
END|OR|WORK {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
END-EXEC|ORDER|WRITE    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
ESCAPE|OUTER|YEAR   {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}
EXCEPT|OUTPUT|ZONE|EXCEPTION    {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESERVADAS;}


0|1|"NULL" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return BIT;}


"+" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return SUMA;}
"-" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return RESTA;}
"*" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return MULTIPLICACION;}
"/" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return DIVISION;}
"<" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return MENOR_QUE;}
"<=" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return MENOR_IGUAL;}
">" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return MAYOR_QUE;}
">=" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return MAYOR_IGUAL;}
"=" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return ASIGNAR;}
"==" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return IGUAL_IGUAL;}
"!=" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return DIFERENTE_DE;}
"&&" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return AND;}
"||" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return OR;}
"!" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return ADMIRACION_CERRADO;}
";" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return PUNTO_COMA;}
{C} {palabra=yytext() ; linea = yyline ; col = yycolumn ; return COMA;}
"." {palabra=yytext() ; linea = yyline ; col = yycolumn ; return PUNTO;}
"[" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return CORCHETE_ABIERTO;}
"]" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return CORCHETE_CERRADO;}
"(" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return PARENTESIS_ABIERTO;}
")" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return PARENTESIS_CERRADO;}
"{" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return LLAVE_ABIERTA;}
"}" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return LLAVE_CERRADA;}
"[]" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return CORCHETES;}
"()" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return PARENTESIS;}
"{}" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return LLAVES;}
"@" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return ARROBA;}
"#" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return NUMERAL;}
"##" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return NUMERALES;}


{L}({L}|{D})* {palabra=yytext() ; linea = yyline ; col = yycolumn ; return IDENTIFICADOR;}


({D})+ {palabra=yytext() ; linea = yyline ; col = yycolumn ; return INT;}


({D})+(".")(({D})*("E+"|"e+"|"E"|"e"|"E-"|"e-")?({D})+)? {palabra=yytext() ; linea = yyline ; col = yycolumn ; return FLOAT;}


"\'".[^\n']*("\'")|("\'")("\'") {palabra=yytext() ; linea = yyline ; col = yycolumn ; return STRING;}

"\'"[^\n']* {palabra=yytext() ; linea = yyline ; col = yycolumn ; return ERROR_STRING;}

"/*"[^\n*\/]* {palabra=yytext() ; linea = yyline ; col = yycolumn ; return ERROR_COMENTARIO;}

(".")(({D})*("E+"|"e+"|"E"|"e"|"E-"|"e-")?({D})+)? {palabra=yytext() ; linea = yyline ; col = yycolumn ; return ERROR_FLOAT;}

 . {palabra=yytext() ; linea = yyline ; col = yycolumn ;return ERROR;}
