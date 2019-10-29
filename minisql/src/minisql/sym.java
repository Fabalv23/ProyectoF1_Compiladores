
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package minisql;

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
  public static final int DISABLE = 121;
  public static final int ASC = 69;
  public static final int NOCOUNT = 82;
  public static final int PROC = 129;
  public static final int FLOAT = 111;
  public static final int GO = 9;
  public static final int LIKE = 21;
  public static final int INCLUDE = 96;
  public static final int PARENTESIS_CERRADO = 6;
  public static final int VARBINARY = 103;
  public static final int ORDER = 68;
  public static final int CREATE = 71;
  public static final int BEGIN = 138;
  public static final int IMAGE = 102;
  public static final int NAMES = 77;
  public static final int VARCHAR = 100;
  public static final int INTO = 48;
  public static final int INSENSITIVE = 152;
  public static final int WHERE = 11;
  public static final int PARENTESIS_ABIERTO = 5;
  public static final int PUNTO = 7;
  public static final int DATETIMEOFFSET = 109;
  public static final int REAL = 113;
  public static final int MAYOR_QUE = 15;
  public static final int VALUES = 47;
  public static final int MODIFY = 119;
  public static final int IDENTITY = 83;
  public static final int ADD = 128;
  public static final int CURSOR = 151;
  public static final int HAVING = 67;
  public static final int BIT = 114;
  public static final int NULL = 44;
  public static final int REBUILD = 120;
  public static final int EOF = 0;
  public static final int INT = 25;
  public static final int MAX = 56;
  public static final int SUMA = 31;
  public static final int PAUSE = 124;
  public static final int SIZE = 80;
  public static final int USER = 72;
  public static final int END = 139;
  public static final int DROP = 38;
  public static final int CHAR = 99;
  public static final int EXEC = 141;
  public static final int OR = 13;
  public static final int ENCRYPTION = 135;
  public static final int COMMIT = 148;
  public static final int NAME = 76;
  public static final int ON = 43;
  public static final int UNIQUE = 93;
  public static final int AND = 12;
  public static final int CURRENT = 118;
  public static final int COUNT = 54;
  public static final int BY = 66;
  public static final int BIT_NUM = 24;
  public static final int LOGIN = 97;
  public static final int NEXT = 155;
  public static final int RETURNS = 143;
  public static final int GROUP = 65;
  public static final int PROCEDURE = 130;
  public static final int PRIMARY = 73;
  public static final int PASSWORD = 126;
  public static final int LEFT = 61;
  public static final int FOREIGN = 85;
  public static final int TABLE = 37;
  public static final int RECOMPILE = 136;
  public static final int DELETE = 2;
  public static final int DECIMAL = 115;
  public static final int RIGHT = 62;
  public static final int ASIGNAR = 28;
  public static final int DIFERENTE_DE = 19;
  public static final int AS = 57;
  public static final int BETWEEN = 22;
  public static final int FULL = 63;
  public static final int INT_NUM = 23;
  public static final int NUMERIC = 116;
  public static final int ALL = 58;
  public static final int PORCENTAJE = 45;
  public static final int EXISTS = 42;
  public static final int ALTER = 117;
  public static final int OUTER = 64;
  public static final int OPEN = 156;
  public static final int DATABASE = 40;
  public static final int RESTA = 32;
  public static final int SELECT = 50;
  public static final int MENOR_QUE = 16;
  public static final int ROLLBACK = 149;
  public static final int DIVISION = 34;
  public static final int TIME = 108;
  public static final int TOP = 4;
  public static final int TIMESTAMP = 110;
  public static final int PUNTO_COMA = 8;
  public static final int VIEW = 81;
  public static final int SUM = 52;
  public static final int DATE = 104;
  public static final int FILE = 78;
  public static final int SCROLL = 153;
  public static final int NOT = 87;
  public static final int OUT = 132;
  public static final int PERCENT = 10;
  public static final int MIN = 55;
  public static final int NONCLUSTERED = 95;
  public static final int WITH = 75;
  public static final int JOIN = 59;
  public static final int DESC = 70;
  public static final int ARROBA = 131;
  public static final int MENOR_IGUAL = 18;
  public static final int TEXT = 101;
  public static final int RETURN = 144;
  public static final int OUTPUT = 133;
  public static final int FLOAT_NUM = 26;
  public static final int SAVE = 150;
  public static final int FOR = 98;
  public static final int FUNCTION = 142;
  public static final int MARK = 147;
  public static final int TRANSACTION = 146;
  public static final int AVG = 53;
  public static final int TRUNCATE = 36;
  public static final int IGUAL_IGUAL = 20;
  public static final int READONLY = 134;
  public static final int REORGANIZE = 122;
  public static final int STRING = 14;
  public static final int INSERT = 46;
  public static final int DATETIME = 105;
  public static final int DATETIME2 = 106;
  public static final int CLAUSE = 90;
  public static final int COLUMN = 127;
  public static final int INNER = 60;
  public static final int FROM = 3;
  public static final int MAYOR_IGUAL = 17;
  public static final int REFERENCES = 86;
  public static final int IDENTIFICADOR = 27;
  public static final int FETCH = 154;
  public static final int COLLATE = 74;
  public static final int MULTIPLICACION = 33;
  public static final int REPLICATION = 91;
  public static final int CONSTRAINT = 89;
  public static final int IS = 92;
  public static final int MONEY = 112;
  public static final int INDEX = 39;
  public static final int DECLARE = 140;
  public static final int COMA = 30;
  public static final int ABORT = 125;
  public static final int error = 1;
  public static final int IF = 41;
  public static final int FILENAME = 79;
  public static final int DEFAULT = 49;
  public static final int SMALLDATETIME = 107;
  public static final int CLUSTERED = 94;
  public static final int SET = 29;
  public static final int RESUME = 123;
  public static final int EXECUTE = 137;
  public static final int CHECK = 88;
  public static final int DISTINCT = 51;
  public static final int TRAN = 145;
  public static final int UPDATE = 35;
  public static final int KEY = 84;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "DELETE",
  "FROM",
  "TOP",
  "PARENTESIS_ABIERTO",
  "PARENTESIS_CERRADO",
  "PUNTO",
  "PUNTO_COMA",
  "GO",
  "PERCENT",
  "WHERE",
  "AND",
  "OR",
  "STRING",
  "MAYOR_QUE",
  "MENOR_QUE",
  "MAYOR_IGUAL",
  "MENOR_IGUAL",
  "DIFERENTE_DE",
  "IGUAL_IGUAL",
  "LIKE",
  "BETWEEN",
  "INT_NUM",
  "BIT_NUM",
  "INT",
  "FLOAT_NUM",
  "IDENTIFICADOR",
  "ASIGNAR",
  "SET",
  "COMA",
  "SUMA",
  "RESTA",
  "MULTIPLICACION",
  "DIVISION",
  "UPDATE",
  "TRUNCATE",
  "TABLE",
  "DROP",
  "INDEX",
  "DATABASE",
  "IF",
  "EXISTS",
  "ON",
  "NULL",
  "PORCENTAJE",
  "INSERT",
  "VALUES",
  "INTO",
  "DEFAULT",
  "SELECT",
  "DISTINCT",
  "SUM",
  "AVG",
  "COUNT",
  "MIN",
  "MAX",
  "AS",
  "ALL",
  "JOIN",
  "INNER",
  "LEFT",
  "RIGHT",
  "FULL",
  "OUTER",
  "GROUP",
  "BY",
  "HAVING",
  "ORDER",
  "ASC",
  "DESC",
  "CREATE",
  "USER",
  "PRIMARY",
  "COLLATE",
  "WITH",
  "NAME",
  "NAMES",
  "FILE",
  "FILENAME",
  "SIZE",
  "VIEW",
  "NOCOUNT",
  "IDENTITY",
  "KEY",
  "FOREIGN",
  "REFERENCES",
  "NOT",
  "CHECK",
  "CONSTRAINT",
  "CLAUSE",
  "REPLICATION",
  "IS",
  "UNIQUE",
  "CLUSTERED",
  "NONCLUSTERED",
  "INCLUDE",
  "LOGIN",
  "FOR",
  "CHAR",
  "VARCHAR",
  "TEXT",
  "IMAGE",
  "VARBINARY",
  "DATE",
  "DATETIME",
  "DATETIME2",
  "SMALLDATETIME",
  "TIME",
  "DATETIMEOFFSET",
  "TIMESTAMP",
  "FLOAT",
  "MONEY",
  "REAL",
  "BIT",
  "DECIMAL",
  "NUMERIC",
  "ALTER",
  "CURRENT",
  "MODIFY",
  "REBUILD",
  "DISABLE",
  "REORGANIZE",
  "RESUME",
  "PAUSE",
  "ABORT",
  "PASSWORD",
  "COLUMN",
  "ADD",
  "PROC",
  "PROCEDURE",
  "ARROBA",
  "OUT",
  "OUTPUT",
  "READONLY",
  "ENCRYPTION",
  "RECOMPILE",
  "EXECUTE",
  "BEGIN",
  "END",
  "DECLARE",
  "EXEC",
  "FUNCTION",
  "RETURNS",
  "RETURN",
  "TRAN",
  "TRANSACTION",
  "MARK",
  "COMMIT",
  "ROLLBACK",
  "SAVE",
  "CURSOR",
  "INSENSITIVE",
  "SCROLL",
  "FETCH",
  "NEXT",
  "OPEN"
  };
}

