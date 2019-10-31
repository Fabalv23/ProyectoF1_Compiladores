package minisql;
import static minisql.Tokens.*;
%%
%class Lexico
%line
%column
%type Tokens
%cup
%cupsys Tokens
%unicode
L=[a-zA-Z_]
D=[0-9]
espacio=[ ,\t,\r,\n]
Char = [^\r\n]
S = [\[]
A = [\]]

%{
    public String palabra;
    public int linea;
    public int col;

%}
%%

"," {palabra=yytext() ; linea = yyline ; col = yycolumn ; return COMA;}
ADD {palabra=yytext(); linea = yyline ; col = yycolumn ; return ADD;} 
EXTERNAL {palabra=yytext(); linea = yyline ; col = yycolumn ; return EXTERNAL;} 
PROCEDURE {palabra=yytext(); linea = yyline ; col = yycolumn ; return PROCEDURE;} 
ALL {palabra=yytext(); linea = yyline ; col = yycolumn ; return ALL;} 
FETCH {palabra=yytext(); linea = yyline ; col = yycolumn ; return FETCH;} 
PUBLIC {palabra=yytext(); linea = yyline ; col = yycolumn ; return PUBLIC;} 
ALTER {palabra=yytext(); linea = yyline ; col = yycolumn ; return ALTER;} 
FILE {palabra=yytext(); linea = yyline ; col = yycolumn ; return FILE;} 
RAISERROR {palabra=yytext(); linea = yyline ; col = yycolumn ; return RAISERROR;} 
AND {palabra=yytext(); linea = yyline ; col = yycolumn ; return AND;} 
FILLFACTOR {palabra=yytext(); linea = yyline ; col = yycolumn ; return FILLFACTOR;} 
READ {palabra=yytext(); linea = yyline ; col = yycolumn ; return READ;} 
ANY {palabra=yytext(); linea = yyline ; col = yycolumn ; return ANY;} 
FOR {palabra=yytext(); linea = yyline ; col = yycolumn ; return FOR;} 
READTEXT {palabra=yytext(); linea = yyline ; col = yycolumn ; return READTEXT;} 
AS {palabra=yytext(); linea = yyline ; col = yycolumn ; return AS;} 
FOREIGN {palabra=yytext(); linea = yyline ; col = yycolumn ; return FOREIGN;} 
RECONFIGURE {palabra=yytext(); linea = yyline ; col = yycolumn ; return RECONFIGURE;} 
ASC {palabra=yytext(); linea = yyline ; col = yycolumn ; return ASC;} 
FREETEXT {palabra=yytext(); linea = yyline ; col = yycolumn ; return FREETEXT;} 
REFERENCES {palabra=yytext(); linea = yyline ; col = yycolumn ; return REFERENCES;} 
AUTHORIZATION {palabra=yytext(); linea = yyline ; col = yycolumn ; return AUTHORIZATION;} 
FREETEXTTABLE {palabra=yytext(); linea = yyline ; col = yycolumn ; return FREETEXTTABLE;} 
REPLICATION {palabra=yytext(); linea = yyline ; col = yycolumn ; return REPLICATION;} 
BACKUP {palabra=yytext(); linea = yyline ; col = yycolumn ; return BACKUP;} 
FROM {palabra=yytext(); linea = yyline ; col = yycolumn ; return FROM;} 
RESTORE {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESTORE;} 
BEGIN {palabra=yytext(); linea = yyline ; col = yycolumn ; return BEGIN;} 
FULL {palabra=yytext(); linea = yyline ; col = yycolumn ; return FULL;} 
RESTRICT {palabra=yytext(); linea = yyline ; col = yycolumn ; return RESTRICT;} 
BETWEEN {palabra=yytext(); linea = yyline ; col = yycolumn ; return BETWEEN;} 
FUNCTION {palabra=yytext(); linea = yyline ; col = yycolumn ; return FUNCTION;} 
RETURN {palabra=yytext(); linea = yyline ; col = yycolumn ; return RETURN;} 
BREAK {palabra=yytext(); linea = yyline ; col = yycolumn ; return BREAK;} 
GOTO {palabra=yytext(); linea = yyline ; col = yycolumn ; return GOTO;} 
REVERT {palabra=yytext(); linea = yyline ; col = yycolumn ; return REVERT;} 
BROWSE {palabra=yytext(); linea = yyline ; col = yycolumn ; return BROWSE;} 
GRANT {palabra=yytext(); linea = yyline ; col = yycolumn ; return GRANT;} 
REVOKE {palabra=yytext(); linea = yyline ; col = yycolumn ; return REVOKE;} 
BULK {palabra=yytext(); linea = yyline ; col = yycolumn ; return BULK;} 
GROUP {palabra=yytext(); linea = yyline ; col = yycolumn ; return GROUP;} 
RIGHT {palabra=yytext(); linea = yyline ; col = yycolumn ; return RIGHT;} 
BY {palabra=yytext(); linea = yyline ; col = yycolumn ; return BY;} 
HAVING {palabra=yytext(); linea = yyline ; col = yycolumn ; return HAVING;} 
ROLLBACK {palabra=yytext(); linea = yyline ; col = yycolumn ; return ROLLBACK;} 
CASCADE {palabra=yytext(); linea = yyline ; col = yycolumn ; return CASCADE;} 
HOLDLOCK {palabra=yytext(); linea = yyline ; col = yycolumn ; return HOLDLOCK;} 
ROWCOUNT {palabra=yytext(); linea = yyline ; col = yycolumn ; return ROWCOUNT;} 
CASE {palabra=yytext(); linea = yyline ; col = yycolumn ; return CASE;} 
IDENTITY {palabra=yytext(); linea = yyline ; col = yycolumn ; return IDENTITY;} 
ROWGUIDCOL {palabra=yytext(); linea = yyline ; col = yycolumn ; return ROWGUIDCOL;} 
CHECK {palabra=yytext(); linea = yyline ; col = yycolumn ; return CHECK;} 
IDENTITY_INSERT {palabra=yytext(); linea = yyline ; col = yycolumn ; return IDENTITY_INSERT;} 
RULE {palabra=yytext(); linea = yyline ; col = yycolumn ; return RULE;} 
CHECKPOINT {palabra=yytext(); linea = yyline ; col = yycolumn ; return CHECKPOINT;} 
IDENTITYCOL {palabra=yytext(); linea = yyline ; col = yycolumn ; return IDENTITYCOL;} 
SAVE {palabra=yytext(); linea = yyline ; col = yycolumn ; return SAVE;} 
CLOSE {palabra=yytext(); linea = yyline ; col = yycolumn ; return CLOSE;} 
IF {palabra=yytext(); linea = yyline ; col = yycolumn ; return IF;} 
SCHEMA {palabra=yytext(); linea = yyline ; col = yycolumn ; return SCHEMA;} 
CLUSTERED {palabra=yytext(); linea = yyline ; col = yycolumn ; return CLUSTERED;} 
IN {palabra=yytext(); linea = yyline ; col = yycolumn ; return IN;} 
SECURITYAUDIT {palabra=yytext(); linea = yyline ; col = yycolumn ; return SECURITYAUDIT;} 
COALESCE {palabra=yytext(); linea = yyline ; col = yycolumn ; return COALESCE;} 
INDEX {palabra=yytext(); linea = yyline ; col = yycolumn ; return INDEX;} 
SELECT {palabra=yytext(); linea = yyline ; col = yycolumn ; return SELECT;} 
COLLATE {palabra=yytext(); linea = yyline ; col = yycolumn ; return COLLATE;} 
INNER {palabra=yytext(); linea = yyline ; col = yycolumn ; return INNER;} 
SEMANTICKEYPHRASETABLE {palabra=yytext(); linea = yyline ; col = yycolumn ; return SEMANTICKEYPHRASETABLE;} 
COLUMN {palabra=yytext(); linea = yyline ; col = yycolumn ; return COLUMN;} 
INSERT {palabra=yytext(); linea = yyline ; col = yycolumn ; return INSERT;} 
SEMANTICSIMILARITYDETAILSTABLE {palabra=yytext(); linea = yyline ; col = yycolumn ; return SEMANTICSIMILARITYDETAILSTABLE;} 
COMMIT {palabra=yytext(); linea = yyline ; col = yycolumn ; return COMMIT;} 
INTERSECT {palabra=yytext(); linea = yyline ; col = yycolumn ; return INTERSECT;} 
SEMANTICSIMILARITYTABLE {palabra=yytext(); linea = yyline ; col = yycolumn ; return SEMANTICSIMILARITYTABLE;} 
COMPUTE {palabra=yytext(); linea = yyline ; col = yycolumn ; return COMPUTE;} 
INTO {palabra=yytext(); linea = yyline ; col = yycolumn ; return INTO;} 
SESSION_USER {palabra=yytext(); linea = yyline ; col = yycolumn ; return SESSION_USER;} 
CONSTRAINT {palabra=yytext(); linea = yyline ; col = yycolumn ; return CONSTRAINT;} 
IS {palabra=yytext(); linea = yyline ; col = yycolumn ; return IS;} 
SET {palabra=yytext(); linea = yyline ; col = yycolumn ; return SET;} 
CONTAINS {palabra=yytext(); linea = yyline ; col = yycolumn ; return CONTAINS;} 
JOIN {palabra=yytext(); linea = yyline ; col = yycolumn ; return JOIN;} 
SETUSER {palabra=yytext(); linea = yyline ; col = yycolumn ; return SETUSER;} 
CONTAINSTABLE {palabra=yytext(); linea = yyline ; col = yycolumn ; return CONTAINSTABLE;} 
KEY {palabra=yytext(); linea = yyline ; col = yycolumn ; return KEY;} 
SHUTDOWN {palabra=yytext(); linea = yyline ; col = yycolumn ; return SHUTDOWN;} 
CONTINUE {palabra=yytext(); linea = yyline ; col = yycolumn ; return CONTINUE;} 
KILL {palabra=yytext(); linea = yyline ; col = yycolumn ; return KILL;} 
SOME {palabra=yytext(); linea = yyline ; col = yycolumn ; return SOME;} 
CONVERT {palabra=yytext(); linea = yyline ; col = yycolumn ; return CONVERT;} 
LEFT {palabra=yytext(); linea = yyline ; col = yycolumn ; return LEFT;} 
STATISTICS {palabra=yytext(); linea = yyline ; col = yycolumn ; return STATISTICS;} 
CREATE {palabra=yytext(); linea = yyline ; col = yycolumn ; return CREATE;} 
LIKE {palabra=yytext(); linea = yyline ; col = yycolumn ; return LIKE;} 
SYSTEM_USER {palabra=yytext(); linea = yyline ; col = yycolumn ; return SYSTEM_USER;} 
CROSS {palabra=yytext(); linea = yyline ; col = yycolumn ; return CROSS;} 
LINENO {palabra=yytext(); linea = yyline ; col = yycolumn ; return LINENO;} 
TABLE {palabra=yytext(); linea = yyline ; col = yycolumn ; return TABLE;} 
CURRENT {palabra=yytext(); linea = yyline ; col = yycolumn ; return CURRENT;} 
LOAD {palabra=yytext(); linea = yyline ; col = yycolumn ; return LOAD;} 
TABLESAMPLE {palabra=yytext(); linea = yyline ; col = yycolumn ; return TABLESAMPLE;} 
CURRENT_DATE {palabra=yytext(); linea = yyline ; col = yycolumn ; return CURRENT_DATE;} 
MERGE {palabra=yytext(); linea = yyline ; col = yycolumn ; return MERGE;} 
TEXTSIZE {palabra=yytext(); linea = yyline ; col = yycolumn ; return TEXTSIZE;} 
CURRENT_TIME {palabra=yytext(); linea = yyline ; col = yycolumn ; return CURRENT_TIME;} 
NATIONAL {palabra=yytext(); linea = yyline ; col = yycolumn ; return NATIONAL;} 
THEN {palabra=yytext(); linea = yyline ; col = yycolumn ; return THEN;} 
CURRENT_TIMESTAMP {palabra=yytext(); linea = yyline ; col = yycolumn ; return CURRENT_TIMESTAMP;} 
NOCHECK {palabra=yytext(); linea = yyline ; col = yycolumn ; return NOCHECK;} 
TO {palabra=yytext(); linea = yyline ; col = yycolumn ; return TO;} 
CURRENT_USER {palabra=yytext(); linea = yyline ; col = yycolumn ; return CURRENT_USER;} 
NONCLUSTERED {palabra=yytext(); linea = yyline ; col = yycolumn ; return NONCLUSTERED;} 
TOP {palabra=yytext(); linea = yyline ; col = yycolumn ; return TOP;} 
CURSOR {palabra=yytext(); linea = yyline ; col = yycolumn ; return CURSOR;} 
NOT {palabra=yytext(); linea = yyline ; col = yycolumn ; return NOT;} 
TRAN {palabra=yytext(); linea = yyline ; col = yycolumn ; return TRAN;} 
DATABASE {palabra=yytext(); linea = yyline ; col = yycolumn ; return DATABASE;} 
NULL {palabra=yytext(); linea = yyline ; col = yycolumn ; return NULL;} 
TRANSACTION {palabra=yytext(); linea = yyline ; col = yycolumn ; return TRANSACTION;} 
DBCC {palabra=yytext(); linea = yyline ; col = yycolumn ; return DBCC;} 
NULLIF {palabra=yytext(); linea = yyline ; col = yycolumn ; return NULLIF;} 
TRIGGER {palabra=yytext(); linea = yyline ; col = yycolumn ; return TRIGGER;} 
DEALLOCATE {palabra=yytext(); linea = yyline ; col = yycolumn ; return DEALLOCATE;} 
OF {palabra=yytext(); linea = yyline ; col = yycolumn ; return OF;} 
TRUNCATE {palabra=yytext(); linea = yyline ; col = yycolumn ; return TRUNCATE;} 
DECLARE {palabra=yytext(); linea = yyline ; col = yycolumn ; return DECLARE;} 
OFF {palabra=yytext(); linea = yyline ; col = yycolumn ; return OFF;} 
TRY_CONVERT {palabra=yytext(); linea = yyline ; col = yycolumn ; return TRY_CONVERT;} 
DEFAULT {palabra=yytext(); linea = yyline ; col = yycolumn ; return DEFAULT;} 
OFFSETS {palabra=yytext(); linea = yyline ; col = yycolumn ; return OFFSETS;} 
TSEQUAL {palabra=yytext(); linea = yyline ; col = yycolumn ; return TSEQUAL;} 
DELETE {palabra=yytext(); linea = yyline ; col = yycolumn ; return DELETE;} 
ON {palabra=yytext(); linea = yyline ; col = yycolumn ; return ON;} 
UNION {palabra=yytext(); linea = yyline ; col = yycolumn ; return UNION;} 
DENY {palabra=yytext(); linea = yyline ; col = yycolumn ; return DENY;} 
OPEN {palabra=yytext(); linea = yyline ; col = yycolumn ; return OPEN;} 
UNIQUE {palabra=yytext(); linea = yyline ; col = yycolumn ; return UNIQUE;} 
DESC {palabra=yytext(); linea = yyline ; col = yycolumn ; return DESC;} 
OPENDATASOURCE {palabra=yytext(); linea = yyline ; col = yycolumn ; return OPENDATASOURCE;} 
UNPIVOT {palabra=yytext(); linea = yyline ; col = yycolumn ; return UNPIVOT;} 
DISK {palabra=yytext(); linea = yyline ; col = yycolumn ; return DISK;} 
OPENQUERY {palabra=yytext(); linea = yyline ; col = yycolumn ; return OPENQUERY;} 
UPDATE {palabra=yytext(); linea = yyline ; col = yycolumn ; return UPDATE;} 
DISTINCT {palabra=yytext(); linea = yyline ; col = yycolumn ; return DISTINCT;} 
OPENROWSET {palabra=yytext(); linea = yyline ; col = yycolumn ; return OPENROWSET;} 
UPDATETEXT {palabra=yytext(); linea = yyline ; col = yycolumn ; return UPDATETEXT;} 
DISTRIBUTED {palabra=yytext(); linea = yyline ; col = yycolumn ; return DISTRIBUTED;} 
OPENXML {palabra=yytext(); linea = yyline ; col = yycolumn ; return OPENXML;} 
USE {palabra=yytext(); linea = yyline ; col = yycolumn ; return USE;} 
DOUBLE {palabra=yytext(); linea = yyline ; col = yycolumn ; return DOUBLE;} 
OPTION {palabra=yytext(); linea = yyline ; col = yycolumn ; return OPTION;} 
USER {palabra=yytext(); linea = yyline ; col = yycolumn ; return USER;} 
DROP {palabra=yytext(); linea = yyline ; col = yycolumn ; return DROP;} 
OR {palabra=yytext(); linea = yyline ; col = yycolumn ; return OR;} 
VALUES {palabra=yytext(); linea = yyline ; col = yycolumn ; return VALUES;} 
DUMP {palabra=yytext(); linea = yyline ; col = yycolumn ; return DUMP;} 
ORDER {palabra=yytext(); linea = yyline ; col = yycolumn ; return ORDER;} 
VARYING {palabra=yytext(); linea = yyline ; col = yycolumn ; return VARYING;} 
ELSE {palabra=yytext(); linea = yyline ; col = yycolumn ; return ELSE;} 
OUTER {palabra=yytext(); linea = yyline ; col = yycolumn ; return OUTER;} 
VIEW {palabra=yytext(); linea = yyline ; col = yycolumn ; return VIEW;} 
END {palabra=yytext(); linea = yyline ; col = yycolumn ; return END;} 
OVER {palabra=yytext(); linea = yyline ; col = yycolumn ; return OVER;} 
WAITFOR {palabra=yytext(); linea = yyline ; col = yycolumn ; return WAITFOR;} 
ERRLVL {palabra=yytext(); linea = yyline ; col = yycolumn ; return ERRLVL;} 
PERCENT {palabra=yytext(); linea = yyline ; col = yycolumn ; return PERCENT;} 
WHEN {palabra=yytext(); linea = yyline ; col = yycolumn ; return WHEN;} 
ESCAPE {palabra=yytext(); linea = yyline ; col = yycolumn ; return ESCAPE;} 
PIVOT {palabra=yytext(); linea = yyline ; col = yycolumn ; return PIVOT;} 
WHERE {palabra=yytext(); linea = yyline ; col = yycolumn ; return WHERE;} 
EXCEPT {palabra=yytext(); linea = yyline ; col = yycolumn ; return EXCEPT;} 
PLAN {palabra=yytext(); linea = yyline ; col = yycolumn ; return PLAN;} 
WHILE {palabra=yytext(); linea = yyline ; col = yycolumn ; return WHILE;} 
EXEC {palabra=yytext(); linea = yyline ; col = yycolumn ; return EXEC;} 
PRECISION {palabra=yytext(); linea = yyline ; col = yycolumn ; return PRECISION;} 
WITH {palabra=yytext(); linea = yyline ; col = yycolumn ; return WITH;} 
EXECUTE {palabra=yytext(); linea = yyline ; col = yycolumn ; return EXECUTE;} 
PRIMARY {palabra=yytext(); linea = yyline ; col = yycolumn ; return PRIMARY;} 
"WITHINGROUP" {palabra=yytext(); linea = yyline ; col = yycolumn ; return WITHINGROUP;} 
EXISTS {palabra=yytext(); linea = yyline ; col = yycolumn ; return EXISTS;} 
PRINT {palabra=yytext(); linea = yyline ; col = yycolumn ; return PRINT;} 
WRITETEXT {palabra=yytext(); linea = yyline ; col = yycolumn ; return WRITETEXT;} 
EXIT {palabra=yytext(); linea = yyline ; col = yycolumn ; return EXIT;} 
PROC {palabra=yytext(); linea = yyline ; col = yycolumn ; return PROC;} 
ABSOLUTE {palabra=yytext(); linea = yyline ; col = yycolumn ; return ABSOLUTE;} 
OVERLAPS {palabra=yytext(); linea = yyline ; col = yycolumn ; return OVERLAPS;} 
ACTION {palabra=yytext(); linea = yyline ; col = yycolumn ; return ACTION;} 
PAD {palabra=yytext(); linea = yyline ; col = yycolumn ; return PAD;} 
ADA {palabra=yytext(); linea = yyline ; col = yycolumn ; return ADA;} 
PARTIAL {palabra=yytext(); linea = yyline ; col = yycolumn ; return PARTIAL;} 
PASCAL {palabra=yytext(); linea = yyline ; col = yycolumn ; return PASCAL;} 
EXTRACT {palabra=yytext(); linea = yyline ; col = yycolumn ; return EXTRACT;} 
POSITION {palabra=yytext(); linea = yyline ; col = yycolumn ; return POSITION;} 
ALLOCATE {palabra=yytext(); linea = yyline ; col = yycolumn ; return ALLOCATE;} 
FALSE {palabra=yytext(); linea = yyline ; col = yycolumn ; return FALSE;} 
PREPARE {palabra=yytext(); linea = yyline ; col = yycolumn ; return PREPARE;} 
FIRST {palabra=yytext(); linea = yyline ; col = yycolumn ; return FIRST;} 
PRESERVE {palabra=yytext(); linea = yyline ; col = yycolumn ; return PRESERVE;} 
FLOAT {palabra=yytext(); linea = yyline ; col = yycolumn ; return FLOAT;} 
ARE {palabra=yytext(); linea = yyline ; col = yycolumn ; return ARE;} 
PRIOR {palabra=yytext(); linea = yyline ; col = yycolumn ; return PRIOR;} 
PRIVILEGES {palabra=yytext(); linea = yyline ; col = yycolumn ; return PRIVILEGES;} 
FORTRAN {palabra=yytext(); linea = yyline ; col = yycolumn ; return FORTRAN;} 
ASSERTION {palabra=yytext(); linea = yyline ; col = yycolumn ; return ASSERTION;} 
FOUND {palabra=yytext(); linea = yyline ; col = yycolumn ; return FOUND;} 
AT {palabra=yytext(); linea = yyline ; col = yycolumn ; return AT;} 
REAL {palabra=yytext(); linea = yyline ; col = yycolumn ; return REAL;} 
AVG {palabra=yytext(); linea = yyline ; col = yycolumn ; return AVG;} 
GET {palabra=yytext(); linea = yyline ; col = yycolumn ; return GET;} 
GLOBAL {palabra=yytext(); linea = yyline ; col = yycolumn ; return GLOBAL;} 
RELATIVE {palabra=yytext(); linea = yyline ; col = yycolumn ; return RELATIVE;} 
GO {palabra=yytext(); linea = yyline ; col = yycolumn ; return GO;} 
BIT {palabra=yytext(); linea = yyline ; col = yycolumn ; return BIT;} 
BIT_LENGTH {palabra=yytext(); linea = yyline ; col = yycolumn ; return BIT_LENGTH;} 
BOTH {palabra=yytext(); linea = yyline ; col = yycolumn ; return BOTH;} 
ROWS {palabra=yytext(); linea = yyline ; col = yycolumn ; return ROWS;} 
HOUR {palabra=yytext(); linea = yyline ; col = yycolumn ; return HOUR;} 
CASCADED {palabra=yytext(); linea = yyline ; col = yycolumn ; return CASCADED;} 
SCROLL {palabra=yytext(); linea = yyline ; col = yycolumn ; return SCROLL;} 
IMMEDIATE {palabra=yytext(); linea = yyline ; col = yycolumn ; return IMMEDIATE;} 
SECOND {palabra=yytext(); linea = yyline ; col = yycolumn ; return SECOND;} 
CAST {palabra=yytext(); linea = yyline ; col = yycolumn ; return CAST;} 
SECTION {palabra=yytext(); linea = yyline ; col = yycolumn ; return SECTION;} 
CATALOG {palabra=yytext(); linea = yyline ; col = yycolumn ; return CATALOG;} 
INCLUDE {palabra=yytext(); linea = yyline ; col = yycolumn ; return INCLUDE;} 
CHAR {palabra=yytext(); linea = yyline ; col = yycolumn ; return CHAR;} 
SESSION {palabra=yytext(); linea = yyline ; col = yycolumn ; return SESSION;} 
CHAR_LENGTH {palabra=yytext(); linea = yyline ; col = yycolumn ; return CHAR_LENGTH;} 
INDICATOR {palabra=yytext(); linea = yyline ; col = yycolumn ; return INDICATOR;} 
CHARACTER {palabra=yytext(); linea = yyline ; col = yycolumn ; return CHARACTER;} 
INITIALLY {palabra=yytext(); linea = yyline ; col = yycolumn ; return INITIALLY;} 
CHARACTER_LENGTH {palabra=yytext(); linea = yyline ; col = yycolumn ; return CHARACTER_LENGTH;} 
SIZE {palabra=yytext(); linea = yyline ; col = yycolumn ; return SIZE;} 
INPUT {palabra=yytext(); linea = yyline ; col = yycolumn ; return INPUT;} 
SMALLINT {palabra=yytext(); linea = yyline ; col = yycolumn ; return SMALLINT;} 
INSENSITIVE {palabra=yytext(); linea = yyline ; col = yycolumn ; return INSENSITIVE;} 
SPACE {palabra=yytext(); linea = yyline ; col = yycolumn ; return SPACE;} 
INT {palabra=yytext(); linea = yyline ; col = yycolumn ; return INT;} 
SQL {palabra=yytext(); linea = yyline ; col = yycolumn ; return SQL;} 
COLLATION {palabra=yytext(); linea = yyline ; col = yycolumn ; return COLLATION;} 
INTEGER {palabra=yytext(); linea = yyline ; col = yycolumn ; return INTEGER;} 
SQLCA {palabra=yytext(); linea = yyline ; col = yycolumn ; return SQLCA;} 
SQLCODE {palabra=yytext(); linea = yyline ; col = yycolumn ; return SQLCODE;} 
INTERVAL {palabra=yytext(); linea = yyline ; col = yycolumn ; return INTERVAL;} 
SQLERROR {palabra=yytext(); linea = yyline ; col = yycolumn ; return SQLERROR;} 
CONNECT {palabra=yytext(); linea = yyline ; col = yycolumn ; return CONNECT;} 
SQLSTATE {palabra=yytext(); linea = yyline ; col = yycolumn ; return SQLSTATE;} 
CONNECTION {palabra=yytext(); linea = yyline ; col = yycolumn ; return CONNECTION;} 
SQLWARNING {palabra=yytext(); linea = yyline ; col = yycolumn ; return SQLWARNING;} 
ISOLATION {palabra=yytext(); linea = yyline ; col = yycolumn ; return ISOLATION;} 
SUBSTRING {palabra=yytext(); linea = yyline ; col = yycolumn ; return SUBSTRING;} 
CONSTRAINTS {palabra=yytext(); linea = yyline ; col = yycolumn ; return CONSTRAINTS;} 
SUM {palabra=yytext(); linea = yyline ; col = yycolumn ; return SUM;} 
LANGUAGE {palabra=yytext(); linea = yyline ; col = yycolumn ; return LANGUAGE;} 
CORRESPONDING {palabra=yytext(); linea = yyline ; col = yycolumn ; return CORRESPONDING;} 
LAST {palabra=yytext(); linea = yyline ; col = yycolumn ; return LAST;} 
TEMPORARY {palabra=yytext(); linea = yyline ; col = yycolumn ; return TEMPORARY;} 
COUNT {palabra=yytext(); linea = yyline ; col = yycolumn ; return COUNT;} 
LEADING {palabra=yytext(); linea = yyline ; col = yycolumn ; return LEADING;} 
TIME {palabra=yytext(); linea = yyline ; col = yycolumn ; return TIME;} 
LEVEL {palabra=yytext(); linea = yyline ; col = yycolumn ; return LEVEL;} 
TIMESTAMP {palabra=yytext(); linea = yyline ; col = yycolumn ; return TIMESTAMP;} 
TIMEZONE_HOUR {palabra=yytext(); linea = yyline ; col = yycolumn ; return TIMEZONE_HOUR;} 
LOCAL {palabra=yytext(); linea = yyline ; col = yycolumn ; return LOCAL;} 
TIMEZONE_MINUTE {palabra=yytext(); linea = yyline ; col = yycolumn ; return TIMEZONE_MINUTE;} 
LOWER {palabra=yytext(); linea = yyline ; col = yycolumn ; return LOWER;} 
MATCH {palabra=yytext(); linea = yyline ; col = yycolumn ; return MATCH;} 
TRAILING {palabra=yytext(); linea = yyline ; col = yycolumn ; return TRAILING;} 
MAX {palabra=yytext(); linea = yyline ; col = yycolumn ; return MAX;} 
MIN {palabra=yytext(); linea = yyline ; col = yycolumn ; return MIN;} 
TRANSLATE {palabra=yytext(); linea = yyline ; col = yycolumn ; return TRANSLATE;} 
DATE {palabra=yytext(); linea = yyline ; col = yycolumn ; return DATE;} 
MINUTE {palabra=yytext(); linea = yyline ; col = yycolumn ; return MINUTE;} 
TRANSLATION {palabra=yytext(); linea = yyline ; col = yycolumn ; return TRANSLATION;} 
DAY {palabra=yytext(); linea = yyline ; col = yycolumn ; return DAY;} 
MODULE {palabra=yytext(); linea = yyline ; col = yycolumn ; return MODULE;} 
TRIM {palabra=yytext(); linea = yyline ; col = yycolumn ; return TRIM;} 
MONTH {palabra=yytext(); linea = yyline ; col = yycolumn ; return MONTH;} 
TRUE {palabra=yytext(); linea = yyline ; col = yycolumn ; return TRUE;} 
DEC {palabra=yytext(); linea = yyline ; col = yycolumn ; return DEC;} 
NAMES {palabra=yytext(); linea = yyline ; col = yycolumn ; return NAMES;} 
DECIMAL {palabra=yytext(); linea = yyline ; col = yycolumn ; return DECIMAL;} 
NATURAL {palabra=yytext(); linea = yyline ; col = yycolumn ; return NATURAL;} 
UNKNOWN {palabra=yytext(); linea = yyline ; col = yycolumn ; return UNKNOWN;} 
NCHAR {palabra=yytext(); linea = yyline ; col = yycolumn ; return NCHAR;} 
DEFERRABLE {palabra=yytext(); linea = yyline ; col = yycolumn ; return DEFERRABLE;} 
NEXT {palabra=yytext(); linea = yyline ; col = yycolumn ; return NEXT;} 
UPPER {palabra=yytext(); linea = yyline ; col = yycolumn ; return UPPER;} 
DEFERRED {palabra=yytext(); linea = yyline ; col = yycolumn ; return DEFERRED;} 
NO {palabra=yytext(); linea = yyline ; col = yycolumn ; return NO;} 
USAGE {palabra=yytext(); linea = yyline ; col = yycolumn ; return USAGE;} 
NONE {palabra=yytext(); linea = yyline ; col = yycolumn ; return NONE;} 
USING {palabra=yytext(); linea = yyline ; col = yycolumn ; return USING;} 
DESCRIBE {palabra=yytext(); linea = yyline ; col = yycolumn ; return DESCRIBE;} 
VALUE {palabra=yytext(); linea = yyline ; col = yycolumn ; return VALUE;} 
DESCRIPTOR {palabra=yytext(); linea = yyline ; col = yycolumn ; return DESCRIPTOR;} 
DIAGNOSTICS {palabra=yytext(); linea = yyline ; col = yycolumn ; return DIAGNOSTICS;} 
NUMERIC {palabra=yytext(); linea = yyline ; col = yycolumn ; return NUMERIC;} 
VARCHAR {palabra=yytext(); linea = yyline ; col = yycolumn ; return VARCHAR;} 
DISCONNECT {palabra=yytext(); linea = yyline ; col = yycolumn ; return DISCONNECT;} 
OCTET_LENGTH {palabra=yytext(); linea = yyline ; col = yycolumn ; return OCTET_LENGTH;} 
DOMAIN {palabra=yytext(); linea = yyline ; col = yycolumn ; return DOMAIN;} 
ONLY {palabra=yytext(); linea = yyline ; col = yycolumn ; return ONLY;} 
WHENEVER {palabra=yytext(); linea = yyline ; col = yycolumn ; return WHENEVER;} 
WORK {palabra=yytext(); linea = yyline ; col = yycolumn ; return WORK;} 
END-EXEC {palabra=yytext(); linea = yyline ; col = yycolumn ; return ENDEXEC;} 
WRITE {palabra=yytext(); linea = yyline ; col = yycolumn ; return WRITE;} 
YEAR {palabra=yytext(); linea = yyline ; col = yycolumn ; return YEAR;} 
OUTPUT {palabra=yytext(); linea = yyline ; col = yycolumn ; return OUTPUT;} 
ZONE {palabra=yytext(); linea = yyline ; col = yycolumn ; return ZONE;} 
EXCEPTION {palabra=yytext(); linea = yyline ; col = yycolumn ; return EXCEPTION;} 
LOGIN {palabra=yytext(); linea = yyline ; col = yycolumn ; return LOGIN;} 
TEXT {palabra=yytext(); linea = yyline ; col = yycolumn ; return TEXT;} 
IMAGE {palabra=yytext(); linea = yyline ; col = yycolumn ; return IMAGE;} 
VARBINARY {palabra=yytext(); linea = yyline ; col = yycolumn ; return VARBINARY;} 
DATETIME {palabra=yytext(); linea = yyline ; col = yycolumn ; return DATETIME;} 
DATETIME2 {palabra=yytext(); linea = yyline ; col = yycolumn ; return DATETIME2;} 
SMALLDATETIME {palabra=yytext(); linea = yyline ; col = yycolumn ; return SMALLDATETIME;} 
DATETIMEOFFSET {palabra=yytext(); linea = yyline ; col = yycolumn ; return DATETIMEOFFSET;} 
MONEY {palabra=yytext(); linea = yyline ; col = yycolumn ; return MONEY;} 
MODIFY {palabra=yytext(); linea = yyline ; col = yycolumn ; return MODIFY;} 
NAME {palabra=yytext(); linea = yyline ; col = yycolumn ; return NAME;} 
DISABLE {palabra=yytext(); linea = yyline ; col = yycolumn ; return DISABLE;} 
REBUILD {palabra=yytext(); linea = yyline ; col = yycolumn ; return REBUILD;} 
UNUSABLE {palabra=yytext(); linea = yyline ; col = yycolumn ; return UNUSABLE;} 
USABLE {palabra=yytext(); linea = yyline ; col = yycolumn ; return USABLE;} 




0|1|"NULL" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return BIT_NUM;}


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
"&&" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return AND_OP;}
"||" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return OR_OP;}
"!" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return ADMIRACION_CERRADO;}
";" {palabra=yytext() ; linea = yyline ; col = yycolumn ; return PUNTO_COMA;}

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


{L}({L}|{D})*| {S}({L}({L}|{D})*){A} {palabra=yytext() ; linea = yyline ; col = yycolumn ; return IDENTIFICADOR;}

({D})+ {palabra=yytext() ; linea = yyline ; col = yycolumn ; return INT_NUM;}


({D})+(".")(({D})*("E+"|"e+"|"E"|"e"|"E-"|"e-")?({D})+)? {palabra=yytext() ; linea = yyline ; col = yycolumn ; return FLOAT_NUM;}


"\'"[^\n']*("\'")|("\'")("\'") {palabra=yytext() ; linea = yyline ; col = yycolumn ; return STRING;}

{espacio} {/*Ignore*/}

"--" {Char}*(\r|\n|\r\n) {/*Ignore*/}

"/*"~("*/") | "/*" ("*"+ "/") {/*Ignore*/}

"\'"[^\n']* {palabra=yytext() ; linea = yyline ; col = yycolumn ; return ERROR_STRING;}

"/*"[^\n*\/]* {palabra=yytext() ; linea = yyline ; col = yycolumn ; return ERROR_COMENTARIO;}

 . {palabra=yytext() ; linea = yyline ; col = yycolumn ;return ERROR;}