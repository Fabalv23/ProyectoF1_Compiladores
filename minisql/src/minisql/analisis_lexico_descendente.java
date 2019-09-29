/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minisql;

import java.util.ArrayList;

/**
 *
 * @author fabia
 */
public class analisis_lexico_descendente {

    public analisis_lexico_descendente(ArrayList<Tokens> lista, ArrayList<detalle_token> lista2) {
        this.tokens_a_evaluar = lista;
        this.tokens_a_evaluar_detalle = lista2;
    }

    public Tokens token_actual = null;
    public Tokens token_siguiente = null;
    public ArrayList<Tokens> tokens_a_evaluar = new ArrayList<>();
    public ArrayList<detalle_token> tokens_a_evaluar_detalle = new ArrayList<>();
    public ArrayList<error_token> Errores = new ArrayList<>();
    int cont = 0;
    public error_token error_agregar = null;

    public void cambio_token(int siguiente) {
        if (siguiente < tokens_a_evaluar.size()) {
            this.token_siguiente = tokens_a_evaluar.get(siguiente);
        } else {
            this.token_siguiente = null;
        }

    }

    public void Validar_Cambio(Tokens siguiente, int cambio) {

        if (tokens_a_evaluar.get(cont) == siguiente) {
            cambio_token(cont);
        } else {
            /**
             * AQUI VA EL ERROR DE SINTAXIS *
             */
        }

    }

    public void analisis(Tokens actual) {

        switch (actual) {
//SENTENCIAS DML

            case UPDATE:
                cont++;
                cambio_token(cont);
                update(token_siguiente);
                if (token_siguiente != null) {

                    switch (token_siguiente) {
                        case PUNTO_COMA:
                            cont++;
                            cambio_token(cont);
                            if (token_siguiente == Tokens.GO) {
                                cont++;
                                cambio_token(cont);
                                System.out.println("CADENA ANALIZADA CORRECTAMENTE");
                            } else {
                                error_sintaxis(token_siguiente, cont, "GO");
                            }

                            if (token_siguiente != null) {
                                analisis(token_siguiente);
                            } else {

                            }

                            break;

                        default:
                            if (token_siguiente == Tokens.CREATE || token_siguiente == Tokens.ALTER || token_siguiente == Tokens.SELECT || token_siguiente == Tokens.INSERT || token_siguiente == Tokens.UPDATE || token_siguiente == Tokens.DROP || token_siguiente == Tokens.TRUNCATE || token_siguiente == Tokens.DELETE) {
                                error_sintaxis(token_siguiente, cont, "PUNTO y COMA");
                            }
                            analisis(token_siguiente);

                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "PUNTO y COMA");
                }

                break;

            case DELETE:
                cont++;
                cambio_token(cont);
                delete(token_siguiente);
                if (token_siguiente != null) {

                    switch (token_siguiente) {
                        case PUNTO_COMA:
                            cont++;
                            cambio_token(cont);
                            if (token_siguiente == Tokens.GO) {
                                cont++;
                                cambio_token(cont);
                                System.out.println("CADENA ANALIZADA CORRECTAMENTE");
                            } else {
                                error_sintaxis(token_siguiente, cont, "GO");
                            }

                            if (token_siguiente != null) {
                                analisis(token_siguiente);
                            } else {

                            }

                            break;

                        default:
                            if (token_siguiente == Tokens.CREATE || token_siguiente == Tokens.ALTER || token_siguiente == Tokens.SELECT || token_siguiente == Tokens.INSERT || token_siguiente == Tokens.UPDATE || token_siguiente == Tokens.DROP || token_siguiente == Tokens.TRUNCATE || token_siguiente == Tokens.DELETE) {
                                error_sintaxis(token_siguiente, cont, "PUNTO y COMA");
                            }
                            analisis(token_siguiente);

                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "PUNTO y COMA");
                }

                break;

            case INSERT:
                cont++;
                cambio_token(cont);
                insert(token_siguiente);
                values(token_siguiente);

                if (token_siguiente != null) {

                    switch (token_siguiente) {
                        case PUNTO_COMA:
                            cont++;
                            cambio_token(cont);
                            if (token_siguiente == Tokens.GO) {
                                cont++;
                                cambio_token(cont);
                                System.out.println("CADENA ANALIZADA CORRECTAMENTE");
                            } else {
                                error_sintaxis(token_siguiente, cont, "GO");
                            }

                            if (token_siguiente != null) {
                                analisis(token_siguiente);
                            } else {

                            }

                            break;

                        default:
                            if (token_siguiente == Tokens.CREATE || token_siguiente == Tokens.ALTER || token_siguiente == Tokens.SELECT || token_siguiente == Tokens.INSERT || token_siguiente == Tokens.UPDATE || token_siguiente == Tokens.DROP || token_siguiente == Tokens.TRUNCATE || token_siguiente == Tokens.DELETE) {
                                error_sintaxis(token_siguiente, cont, "PUNTO y COMA");
                            }
                            analisis(token_siguiente);

                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "PUNTO y COMA");
                }

                break;
//sentencias dml
            case ALTER:
                cont++;
                cambio_token(cont);
                alter(token_siguiente);

                if (token_siguiente != null) {

                    switch (token_siguiente) {
                        case PUNTO_COMA:
                            cont++;
                            cambio_token(cont);
                            if (token_siguiente == Tokens.GO) {
                                cont++;
                                cambio_token(cont);
                                System.out.println("CADENA ANALIZADA CORRECTAMENTE");
                            } else {
                                error_sintaxis(token_siguiente, cont, "GO");
                            }

                            if (token_siguiente != null) {
                                analisis(token_siguiente);
                            } else {

                            }

                            break;

                        default:
                            if (token_siguiente == Tokens.CREATE || token_siguiente == Tokens.ALTER || token_siguiente == Tokens.SELECT || token_siguiente == Tokens.INSERT || token_siguiente == Tokens.UPDATE || token_siguiente == Tokens.DROP || token_siguiente == Tokens.TRUNCATE || token_siguiente == Tokens.DELETE) {
                                error_sintaxis(token_siguiente, cont, "PUNTO y COMA");
                            }
                            analisis(token_siguiente);

                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "PUNTO y COMA");
                }

                break;

            case DROP:
                cont++;
                cambio_token(cont);

                drop(token_siguiente);

                if (token_siguiente != null) {

                    switch (token_siguiente) {
                        case PUNTO_COMA:
                            cont++;
                            cambio_token(cont);
                            if (token_siguiente == Tokens.GO) {
                                cont++;
                                cambio_token(cont);
                                System.out.println("CADENA ANALIZADA CORRECTAMENTE");
                            } else {
                                error_sintaxis(token_siguiente, cont, "GO");
                            }

                            if (token_siguiente != null) {
                                analisis(token_siguiente);
                            } else {

                            }

                            break;

                        default:
                            if (token_siguiente == Tokens.CREATE || token_siguiente == Tokens.ALTER || token_siguiente == Tokens.SELECT || token_siguiente == Tokens.INSERT || token_siguiente == Tokens.UPDATE || token_siguiente == Tokens.DROP || token_siguiente == Tokens.TRUNCATE || token_siguiente == Tokens.DELETE) {
                                error_sintaxis(token_siguiente, cont, "PUNTO y COMA");
                            }
                            analisis(token_siguiente);

                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "PUNTO y COMA");
                }

                break;

            case TRUNCATE:
                cont++;
                cambio_token(cont);
                truncate(token_siguiente);

                if (token_siguiente != null) {

                    switch (token_siguiente) {
                        case PUNTO_COMA:
                            cont++;
                            cambio_token(cont);
                            if (token_siguiente == Tokens.GO) {
                                cont++;
                                cambio_token(cont);
                                System.out.println("CADENA ANALIZADA CORRECTAMENTE");
                            } else {
                                error_sintaxis(token_siguiente, cont, "GO");
                            }

                            if (token_siguiente != null) {
                                analisis(token_siguiente);
                            } else {

                            }

                            break;

                        default:
                            if (token_siguiente == Tokens.CREATE || token_siguiente == Tokens.ALTER || token_siguiente == Tokens.SELECT || token_siguiente == Tokens.INSERT || token_siguiente == Tokens.UPDATE || token_siguiente == Tokens.DROP || token_siguiente == Tokens.TRUNCATE || token_siguiente == Tokens.DELETE) {
                                error_sintaxis(token_siguiente, cont, "PUNTO y COMA");
                            }
                            analisis(token_siguiente);

                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "PUNTO y COMA");
                }

                break;

            case CREATE:

                cont++;
                cambio_token(cont);
                create(token_siguiente);

                if (token_siguiente != null) {

                    switch (token_siguiente) {
                        case PUNTO_COMA:
                            cont++;
                            cambio_token(cont);
                            if (token_siguiente == Tokens.GO) {
                                cont++;
                                cambio_token(cont);
                                System.out.println("CADENA ANALIZADA CORRECTAMENTE");
                            } else {
                                error_sintaxis(token_siguiente, cont, "GO");
                            }

                            if (token_siguiente != null) {
                                analisis(token_siguiente);
                            } else {

                            }

                            break;

                        default:
                            if (token_siguiente == Tokens.CREATE || token_siguiente == Tokens.ALTER || token_siguiente == Tokens.SELECT || token_siguiente == Tokens.INSERT || token_siguiente == Tokens.UPDATE || token_siguiente == Tokens.DROP || token_siguiente == Tokens.TRUNCATE || token_siguiente == Tokens.DELETE) {
                                error_sintaxis(token_siguiente, cont, "PUNTO y COMA");
                            }
                            analisis(token_siguiente);

                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "PUNTO y COMA");
                }

                break;

            default:
                cont++;
                cambio_token(cont);

                if (token_siguiente != null) {
                    switch (token_siguiente) {
                        case PUNTO_COMA:
                            cont++;
                            cambio_token(cont);

                            if (token_siguiente == Tokens.GO) {
                                cont++;
                                cambio_token(cont);
                            } else {
                                error_sintaxis(token_siguiente, cont, "GO");
                            }

                            if (token_siguiente != null) {
                                analisis(token_siguiente);
                            }

                            break;

                        default:
                            analisis(token_siguiente);

                    }

                }
                break;
        }

    }

    public void update(Tokens c) {

        switch (c) {

            case TOP:
                cont++;
                cambio_token(cont);
                top(token_siguiente);

                if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);
                    if (token_siguiente == Tokens.PUNTO) {
                        objeto_nombre(token_siguiente);

                        if (token_siguiente == Tokens.SET) {

                            set(token_siguiente);
                            where(token_siguiente);
                        } else {
                            error_sintaxis(token_siguiente, cont, "SET");
                        }

                    } else if (token_siguiente == Tokens.SET) {
                        set(token_siguiente);
                        where(token_siguiente);
                    }

                }
                break;

            case IDENTIFICADOR:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.PUNTO) {
                    objeto_nombre(token_siguiente);

                    if (token_siguiente == Tokens.SET) {

                        set(token_siguiente);
                        where(token_siguiente);
                    } else {
                        error_sintaxis(token_siguiente, cont, "SET");
                    }

                } else if (token_siguiente == Tokens.SET) {
                    set(token_siguiente);
                    where(token_siguiente);
                }

                break;

        }

    }

    public void set(Tokens a) {

        switch (a) {
            case SET:
                cont++;
                cambio_token(cont);

                mas_asignaciones(token_siguiente);

                break;

        }

    }

    public void mas_asignaciones(Tokens a) {

        switch (a) {
            case IDENTIFICADOR:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.ASIGNAR) {
                    cont++;
                    cambio_token(cont);

                    operaciones(token_siguiente);

                    if (token_siguiente == Tokens.COMA) {

                        cont++;
                        cambio_token(cont);

                        mas_asignaciones(token_siguiente);
                    }

                }

                break;

        }

    }

    //Cualquier operacion aritmetica
    public void operaciones(Tokens o) {

        switch (o) {

            case PARENTESIS_ABIERTO:
                cont++;
                cambio_token(cont);

                operaciones(token_siguiente);

                if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.SUMA || token_siguiente == Tokens.RESTA || token_siguiente == Tokens.MULTIPLICACION || token_siguiente == Tokens.DIVISION || token_siguiente == Tokens.PORCENTAJE) {
                        cont++;
                        cambio_token(cont);

                        operaciones(token_siguiente);

                    }

                } else {
                    error_sintaxis(token_siguiente, cont, ")");
                }

                break;

            case IDENTIFICADOR:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.SUMA || token_siguiente == Tokens.RESTA || token_siguiente == Tokens.MULTIPLICACION || token_siguiente == Tokens.DIVISION || token_siguiente == Tokens.PORCENTAJE) {
                    cont++;
                    cambio_token(cont);

                    operaciones(token_siguiente);

                }

                break;

            case STRING:
                cont++;
                cambio_token(cont);

                break;

            case INT_NUM:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.SUMA || token_siguiente == Tokens.RESTA || token_siguiente == Tokens.MULTIPLICACION || token_siguiente == Tokens.DIVISION || token_siguiente == Tokens.PORCENTAJE) {
                    cont++;
                    cambio_token(cont);

                    operaciones(token_siguiente);

                }

                break;

            case FLOAT_NUM:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.SUMA || token_siguiente == Tokens.RESTA || token_siguiente == Tokens.MULTIPLICACION || token_siguiente == Tokens.DIVISION || token_siguiente == Tokens.PORCENTAJE) {
                    cont++;
                    cambio_token(cont);

                    operaciones(token_siguiente);

                }

                break;

            case BIT_NUM:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.SUMA || token_siguiente == Tokens.RESTA || token_siguiente == Tokens.MULTIPLICACION || token_siguiente == Tokens.DIVISION || token_siguiente == Tokens.PORCENTAJE) {
                    cont++;
                    cambio_token(cont);

                    operaciones(token_siguiente);

                }

                break;

        }

    }

  

    public void delete(Tokens s) {

        switch (s) {
            case TOP:
                cont++;
                cambio_token(cont);
                top(token_siguiente);
                if (token_siguiente == Tokens.FROM) {
                    delete(Tokens.FROM);
                }
                break;

            case FROM:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.PUNTO) {
                        objeto_nombre(token_siguiente);
                        where(token_siguiente);
                    } else if (token_siguiente == Tokens.WHERE) {
                        where(token_siguiente);
                    }

                }

                break;
        }

    }

    public void where(Tokens a) {

        switch (a) {

            case WHERE:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.BETWEEN || token_siguiente == Tokens.LIKE || token_siguiente == Tokens.MAYOR_QUE || token_siguiente == Tokens.MENOR_QUE || token_siguiente == Tokens.MAYOR_IGUAL || token_siguiente == Tokens.MENOR_IGUAL || token_siguiente == Tokens.DIFERENTE_DE || token_siguiente == Tokens.IGUAL_IGUAL || token_siguiente == Tokens.ASIGNAR) {
                        if (token_siguiente == Tokens.BETWEEN || token_siguiente == Tokens.LIKE) {

                            switch (token_siguiente) {
                                case BETWEEN:
                                    cont++;
                                    cambio_token(cont);

                                    if (token_siguiente == Tokens.INT_NUM) {
                                        cont++;
                                        cambio_token(cont);
                                        if (token_siguiente == Tokens.AND || token_siguiente == Tokens.OR || token_siguiente == Tokens.AND_OP || token_siguiente == Tokens.OR_OP) {
                                            cont++;
                                            cambio_token(cont);
                                            if (token_siguiente == Tokens.INT_NUM) {
                                                cont++;
                                                cambio_token(cont);
                                            }
                                        }
                                    } else {
                                        error_sintaxis(token_siguiente, cont, "VALOR");
                                    }

                                    break;

                                case LIKE:
                                    cont++;
                                    cambio_token(cont);
                                    if (token_siguiente == Tokens.STRING) {
                                        cont++;
                                        cambio_token(cont);
                                    } else {
                                        error_sintaxis(token_siguiente, cont, "STRING");
                                    }

                                    break;

                            }
                            if (token_siguiente == Tokens.AND || token_siguiente == Tokens.OR || token_siguiente == Tokens.AND_OP || token_siguiente == Tokens.OR_OP) {
                                mas_de_un_check(token_siguiente);
                            }

                        } else {

                            cont++;
                            cambio_token(cont);

                            if (token_siguiente == Tokens.STRING || token_siguiente == Tokens.INT_NUM || token_siguiente == Tokens.FLOAT_NUM || token_siguiente == Tokens.BIT_NUM) {
                                cont++;
                                cambio_token(cont);

                                if (token_siguiente == Tokens.AND || token_siguiente == Tokens.OR || token_siguiente == Tokens.AND_OP || token_siguiente == Tokens.OR_OP) {
                                    mas_de_un_check(token_siguiente);
                                }

                            } else {
                                error_sintaxis(token_siguiente, cont, "valor");
                            }
                        }

                    }

                    break;

                }

        }
    }

    public void top(Tokens a) {

        switch (a) {
            case PARENTESIS_ABIERTO:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.INT_NUM) {
                    cont++;
                    cambio_token(cont);
                    if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                        cont++;
                        cambio_token(cont);
                        if (token_siguiente == Tokens.PERCENT) {
                            cont++;
                            cambio_token(cont);
                        }

                    } else {
                        error_sintaxis(token_siguiente, cont, ")");
                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "INT");
                }

                break;

            case INT_NUM:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.PERCENT) {
                    cont++;
                    cambio_token(cont);
                }

                break;

        }

    }

    public void create(Tokens c) {

        switch (c) {

            case DATABASE:      //listo
                cont++;
                cambio_token(cont);
                database_create(token_siguiente);

                break;
            case TABLE:
                cont++;
                cambio_token(cont);
                table_create(token_siguiente);

                break;

            //index
            case UNIQUE:
                cont++;
                cambio_token(cont);
                index_create(token_siguiente);
                break;

            case CLUSTERED:
                cont++;
                cambio_token(cont);
                index_create(token_siguiente);
                break;

            case NONCLUSTERED:
                cont++;
                cambio_token(cont);
                index_create(token_siguiente);
                break;

            case INDEX:
                index_create(token_siguiente);
                break;

            case USER:
                cont++;
                cambio_token(cont);
                user_create(token_siguiente);
                break;

            case VIEW:
                cont++;
                cambio_token(cont);
                view(token_siguiente);

                break;

        }

    }

    public void user_create(Tokens u) {

        switch (u) {
            case IDENTIFICADOR:

                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.FOR) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.LOGIN) {
                        cont++;
                        cambio_token(cont);

                        if (token_siguiente == Tokens.IDENTIFICADOR) {
                            cont++;
                            cambio_token(cont);
                        } else {
                            error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                        }

                    } else {
                        error_sintaxis(token_siguiente, cont, "LOGIN");
                    }

                }

                break;

            default:
                error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                break;

        }

    }

    public void index_create(Tokens a) {
        switch (a) {
            case INDEX:
                cont++;
                cambio_token(cont);
                index_create_1(token_siguiente);

                if (token_siguiente == Tokens.INCLUDE) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                        cont++;
                        cambio_token(cont);
                        if (token_siguiente == Tokens.IDENTIFICADOR) {
                            cont++;
                            cambio_token(cont);

                            if (token_siguiente == Tokens.PUNTO) {
                                objeto_nombre(token_siguiente);
                            } else if (token_siguiente == Tokens.COMA) {
                                cont++;
                                cambio_token(cont);
                                mas_de_un_objeto(token_siguiente);
                            }

                            if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                cont++;
                                cambio_token(cont);
                            } else {
                                error_sintaxis(token_siguiente, cont, ")");
                            }

                        } else {
                            error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                        }

                    } else {
                        error_sintaxis(token_siguiente, cont, "(");
                    }

                }

                break;

            default:

                error_sintaxis(token_siguiente, cont, "INDEX");

                break;
        }

    }

    public void index_create_1(Tokens v) {

        switch (v) {
            case IDENTIFICADOR:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.PUNTO) {
                    objeto_nombre(token_siguiente);
                    if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                        cont++;
                        cambio_token(cont);
                        if (token_siguiente == Tokens.IDENTIFICADOR) {
                            cont++;
                            cambio_token(cont);

                            if (token_siguiente == Tokens.PUNTO) {
                                objeto_nombre(token_siguiente);
                            } else if (token_siguiente == Tokens.COMA) {
                                cont++;
                                cambio_token(cont);
                                mas_de_un_objeto(token_siguiente);
                            }

                            if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                cont++;
                                cambio_token(cont);
                            } else {
                                error_sintaxis(token_siguiente, cont, ")");
                            }

                        } else {
                            error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                        }

                    }

                } else if (token_siguiente == Tokens.ON) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.IDENTIFICADOR) {
                        cont++;
                        cambio_token(cont);

                        if (token_siguiente == Tokens.PUNTO) {
                            objeto_nombre(token_siguiente);
                        }

                        if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                            cont++;
                            cambio_token(cont);
                            if (token_siguiente == Tokens.IDENTIFICADOR) {
                                cont++;
                                cambio_token(cont);

                                if (token_siguiente == Tokens.PUNTO) {
                                    objeto_nombre(token_siguiente);
                                } else if (token_siguiente == Tokens.COMA) {
                                    cont++;
                                    cambio_token(cont);
                                    mas_de_un_objeto(token_siguiente);
                                }

                                if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                    cont++;
                                    cambio_token(cont);
                                } else {
                                    error_sintaxis(token_siguiente, cont, ")");
                                }

                            } else {
                                error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                            }

                        } else {
                            error_sintaxis(token_siguiente, cont, "(");
                        }

                    } else {
                        error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                    }

                }

                break;

        }

    }

    public void table_create(Tokens tb) {
        switch (tb) {

            case IDENTIFICADOR:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.PUNTO) {
                    objeto_nombre(token_siguiente);
                    if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                        cont++;
                        cambio_token(cont);
                        add_column(token_siguiente);
                        if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                            cont++;
                            cambio_token(cont);
                        } else {
                            error_sintaxis(token_siguiente, cont, ")");
                        }
                    } else {
                        error_sintaxis(token_siguiente, cont, "(");
                    }
                } else if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                    cont++;
                    cambio_token(cont);
                    add_column(token_siguiente);
                    if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                        cont++;
                        cambio_token(cont);
                    } else {
                        error_sintaxis(token_siguiente, cont, ")");
                    }
                } else {
                    error_sintaxis(token_siguiente, cont, "(");
                }

                break;

        }

    }

    public void add_column(Tokens a) {

        switch (a) {
            case IDENTIFICADOR:

                cont++;
                cambio_token(cont);

                tipo_dato(token_siguiente);
                constraint(token_siguiente);

                if (token_siguiente == Tokens.IDENTITY) {

                    constraint(Tokens.IDENTITY);
                }

                if (token_siguiente == Tokens.COMA) {
                    cont++;
                    cambio_token(cont);

                    switch (token_siguiente) {

                        case FOREIGN:
                            constraint(Tokens.FOREIGN);
                            break;

                        case UNIQUE:

                            cont++;
                            cambio_token(cont);

                            if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {

                                cont++;
                                cambio_token(cont);

                                if (token_siguiente == Tokens.IDENTIFICADOR) {
                                    cont++;
                                    cambio_token(cont);

                                    if (token_siguiente == Tokens.COMA) {
                                        mas_de_un_identificador(token_siguiente);

                                        if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                            cont++;
                                            cambio_token(cont);

                                        } else {
                                            error_sintaxis(token_siguiente, cont, ")");
                                        }

                                    }

                                } else {
                                    error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                                }

                            } else {
                                error_sintaxis(token_siguiente, cont, "(");
                            }

                            break;

                        case PRIMARY:
                            cont++;
                            cambio_token(cont);
                            if (token_siguiente != Tokens.KEY) {
                                error_sintaxis(token_siguiente, cont, "KEY");
                            } else {
                                cont++;
                                cambio_token(cont);

                                if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                                    cont++;
                                    cambio_token(cont);

                                    if (token_siguiente == Tokens.IDENTIFICADOR) {
                                        cont++;
                                        cambio_token(cont);

                                        if (token_siguiente == Tokens.COMA) {
                                            mas_de_un_identificador(token_siguiente);

                                            if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                                cont++;
                                                cambio_token(cont);

                                            } else {
                                                error_sintaxis(token_siguiente, cont, ")");
                                            }

                                        } else if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                            cont++;
                                            cambio_token(cont);

                                        } else {
                                            error_sintaxis(token_siguiente, cont, ")");
                                        }

                                    } else {
                                        error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                                    }

                                } else {
                                    error_sintaxis(token_siguiente, cont, "(");
                                }

                            }

                            break;

                        case CHECK:
                            constraint(Tokens.CHECK);
                            break;

                        case IDENTIFICADOR:
                            add_column(token_siguiente);
                            break;
                        case CONSTRAINT:
                            add_table_constraint(token_siguiente);
                            break;
                    }

                    if (token_siguiente == Tokens.COMA) {

                        cont++;
                        cambio_token(cont);
                        add_column(token_siguiente);
                    }

                }

                break;

            case CONSTRAINT:
                add_table_constraint(token_siguiente);
                break;

            default:

                error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");

                break;

        }

    }

    public void add_table_constraint(Tokens a) {
        switch (a) {

            case CONSTRAINT:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);

                    switch (token_siguiente) {
                        case FOREIGN:
                            constraint(Tokens.FOREIGN);
                            break;

                        case UNIQUE:

                            cont++;
                            cambio_token(cont);

                            if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {

                                cont++;
                                cambio_token(cont);

                                if (token_siguiente == Tokens.IDENTIFICADOR) {
                                    cont++;
                                    cambio_token(cont);

                                    if (token_siguiente == Tokens.COMA) {
                                        mas_de_un_identificador(token_siguiente);

                                        if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                            cont++;
                                            cambio_token(cont);

                                        } else {
                                            error_sintaxis(token_siguiente, cont, ")");
                                        }

                                    }

                                } else {
                                    error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                                }

                            } else {
                                error_sintaxis(token_siguiente, cont, "(");
                            }

                            break;

                        case PRIMARY:
                            cont++;
                            cambio_token(cont);
                            if (token_siguiente != Tokens.KEY) {
                                error_sintaxis(token_siguiente, cont, "KEY");
                            } else {
                                cont++;
                                cambio_token(cont);

                                if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                                    cont++;
                                    cambio_token(cont);

                                    if (token_siguiente == Tokens.IDENTIFICADOR) {
                                        cont++;
                                        cambio_token(cont);

                                        if (token_siguiente == Tokens.COMA) {
                                            mas_de_un_identificador(token_siguiente);

                                            if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                                cont++;
                                                cambio_token(cont);

                                            } else {
                                                error_sintaxis(token_siguiente, cont, ")");
                                            }

                                        } else if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                            cont++;
                                            cambio_token(cont);

                                        } else {
                                            error_sintaxis(token_siguiente, cont, ")");
                                        }

                                    } else {
                                        error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                                    }

                                } else {
                                    error_sintaxis(token_siguiente, cont, "(");
                                }

                            }

                            break;

                        case CHECK:
                            constraint(Tokens.CHECK);
                            break;
                    }

                }

                break;

        }

    }

    public void database_create(Tokens db) {
        switch (db) {

            case IDENTIFICADOR:
                cont++;
                cambio_token(cont);
                break;

            default:

                error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                break;
        }

    }

    public void truncate(Tokens t) {
        switch (t) {
            case TABLE:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.IDENTIFICADOR) {

                    cont++;
                    cambio_token(cont);
                    if (token_siguiente == Tokens.PUNTO) {
                        objeto_nombre(token_siguiente);
                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                }

                break;

            default:
                error_sintaxis(token_siguiente, cont, "TABLE");
                break;
        }
    }

    public void drop(Tokens d) {
        switch (d) {
            case TABLE:

                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.IF) {
                    if_op(token_siguiente);
                    if (token_siguiente == Tokens.IDENTIFICADOR) {
                        cont++;
                        cambio_token(cont);
                        if (token_siguiente == Tokens.PUNTO) {
                            objeto_nombre(token_siguiente);
                            if (token_siguiente == Tokens.COMA) {
                                cont++;
                                cambio_token(cont);
                                mas_de_un_objeto(token_siguiente);
                            }
                        } else if (token_siguiente == Tokens.COMA) {
                            mas_de_un_objeto(token_siguiente);
                        }

                    } else {
                        error_sintaxis(token_siguiente, cont, "IF O IDENTIFICADOR");
                    }

                } else if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);
                    if (token_siguiente == Tokens.PUNTO) {
                        objeto_nombre(token_siguiente);
                    } else if (token_siguiente == Tokens.COMA) {
                        mas_de_un_objeto(token_siguiente);
                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "IF O IDENTIFICADOR");
                }

                break;

            case INDEX:

                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.IF) {
                    if_op(token_siguiente);
                    if (token_siguiente == Tokens.IDENTIFICADOR) {
                        cont++;
                        cambio_token(cont);
                        drop_relational_or_xml_or_spatial_index(token_siguiente);
                    } else {
                        error_sintaxis(token_siguiente, cont, "IF O IDENTIFICADOR");
                    }

                } else if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);
                    drop_relational_or_xml_or_spatial_index(token_siguiente);
                } else {
                    error_sintaxis(token_siguiente, cont, "IF O IDENTIFICADOR");
                }

                break;

            case DATABASE:

                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.IF) {
                    if_op(token_siguiente);
                    if (token_siguiente == Tokens.IDENTIFICADOR) {
                        cont++;
                        cambio_token(cont);

                        if (token_siguiente == Tokens.COMA) {
                            mas_de_un_identificador(token_siguiente);
                        }

                    } else {
                        error_sintaxis(token_siguiente, cont, "IF O IDENTIFICADOR");
                    }

                } else if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);
                    if (token_siguiente == Tokens.COMA) {
                        mas_de_un_identificador(token_siguiente);
                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                }

                break;

            default:

                error_sintaxis(token_siguiente, cont, "ELEMENTO DROP");

                break;

        }
    }

    public void drop_relational_or_xml_or_spatial_index(Tokens i) {
        switch (i) {
            case ON:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);
                    if (token_siguiente == Tokens.PUNTO) {
                        objeto_nombre(token_siguiente);

                        if (token_siguiente == Tokens.COMA) {
                            cont++;
                            cambio_token(cont);
                            if (token_siguiente == Tokens.IDENTIFICADOR) {
                                cont++;
                                cambio_token(cont);
                                drop_relational_or_xml_or_spatial_index(token_siguiente);
                            }
                        }

                    } else if (token_siguiente == Tokens.COMA) {
                        cont++;
                        cambio_token(cont);
                        if (token_siguiente == Tokens.IDENTIFICADOR) {
                            cont++;
                            cambio_token(cont);
                            drop_relational_or_xml_or_spatial_index(token_siguiente);
                        }
                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "IF O IDENTIFICADOR");
                }

                break;

            case COMA:

                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);
                    if (token_siguiente == Tokens.PUNTO) {
                        objeto_nombre(token_siguiente);

                        if (token_siguiente == Tokens.COMA) {
                            cont++;
                            cambio_token(cont);
                            if (token_siguiente == Tokens.IDENTIFICADOR) {
                                cont++;
                                cambio_token(cont);
                                drop_relational_or_xml_or_spatial_index(token_siguiente);
                            }
                        }

                    } else if (token_siguiente == Tokens.COMA) {
                        cont++;
                        cambio_token(cont);
                        if (token_siguiente == Tokens.IDENTIFICADOR) {
                            cont++;
                            cambio_token(cont);
                            drop_relational_or_xml_or_spatial_index(token_siguiente);
                        }
                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "IF O IDENTIFICADOR");
                }

                break;

            default:
                error_sintaxis(token_siguiente, cont, "ON O PUNTO");

                break;
        }
    }

    public void if_op(Tokens i) {
        switch (i) {
            case IF:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.EXISTS) {
                    cont++;
                    cambio_token(cont);
                } else {
                    error_sintaxis(token_siguiente, cont, "EXISTS");
                }

                break;
        }

    }

    public void values(Tokens v) {
        switch (v) {
            case VALUES:
                cont++;
                cambio_token(cont);
                if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                    cont++;
                    cambio_token(cont);
                    valores_insertar(token_siguiente);

                    if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                        cont++;
                        cambio_token(cont);
                        if (token_siguiente == Tokens.COMA) {
                            cont++;
                            cambio_token(cont);
                            if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                                cont++;
                                cambio_token(cont);
                                valores_insertar(token_siguiente);
                                if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                    cont++;
                                    cambio_token(cont);
                                } else {
                                    error_sintaxis(token_siguiente, cont, ")");
                                }
                            } else {
                                error_sintaxis(token_siguiente, cont, "(");
                            }
                        }
                    } else {
                        error_sintaxis(token_siguiente, cont, ")");
                    }
                } else {
                    error_sintaxis(token_siguiente, cont, "(");
                }
                break;

            case DEFAULT:
                cont++;
                cambio_token(cont);
                if (token_siguiente == Tokens.VALUES) {
                    cont++;
                    cambio_token(cont);
                } else {
                    error_sintaxis(token_siguiente, cont, "VALUES");
                }
                break;
        }
    }

    public void valores_insertar(Tokens a) {
        switch (a) {
            case STRING:
                cont++;
                cambio_token(cont);
                if (token_siguiente == Tokens.COMA) {
                    cont++;
                    cambio_token(cont);
                    valores_insertar(token_siguiente);
                }
                break;
            case BIT_NUM:
                cont++;
                cambio_token(cont);
                if (token_siguiente == Tokens.COMA) {
                    cont++;
                    cambio_token(cont);
                    valores_insertar(token_siguiente);
                }
                break;
            case INT_NUM:
                cont++;
                cambio_token(cont);
                if (token_siguiente == Tokens.COMA) {
                    cont++;
                    cambio_token(cont);
                    valores_insertar(token_siguiente);
                }
                break;
            case FLOAT_NUM:
                cont++;
                cambio_token(cont);
                if (token_siguiente == Tokens.COMA) {
                    cont++;
                    cambio_token(cont);
                    valores_insertar(token_siguiente);
                }
                break;

            case NULL:
                cont++;
                cambio_token(cont);
                if (token_siguiente == Tokens.COMA) {
                    cont++;
                    cambio_token(cont);
                    valores_insertar(token_siguiente);
                }
                break;

            default:
                error_sintaxis(token_siguiente, cont, "CONSTANTE");
                break;
        }
    }

    public void insert(Tokens token_alter) {

        switch (token_alter) {

            case INTO:
                cont++;
                cambio_token(cont);
                if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);
                    if (token_siguiente == Tokens.PUNTO) {
                        objeto_nombre(token_siguiente);
                        if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                            cont++;
                            cambio_token(cont);
                            if (token_siguiente == Tokens.IDENTIFICADOR) {
                                columnas(token_siguiente);

                                if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                    cont++;
                                    cambio_token(cont);

                                } else {
                                    error_sintaxis(token_siguiente, cont, ")");
                                }
                            } else {
                                error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                            }
                        } else if (token_siguiente == Tokens.DEFAULT) {

                        } else if (token_siguiente == Tokens.VALUES) {

                        } else {
                            error_sintaxis(token_siguiente, cont, "(");
                        }

                    } else if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                        cont++;
                        cambio_token(cont);
                        if (token_siguiente == Tokens.IDENTIFICADOR) {
                            columnas(token_siguiente);

                            if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                cont++;
                                cambio_token(cont);

                            } else {
                                error_sintaxis(token_siguiente, cont, ")");
                            }
                        } else {
                            error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                        }
                    } else if (token_siguiente == Tokens.DEFAULT) {

                    } else if (token_siguiente == Tokens.VALUES) {

                    } else {
                        error_sintaxis(token_siguiente, cont, "(");
                    }
                } else {
                    error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                }
                break;

            case IDENTIFICADOR:
                cont++;
                cambio_token(cont);
                if (token_siguiente == Tokens.PUNTO) {
                    objeto_nombre(token_siguiente);
                    if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                        cont++;
                        cambio_token(cont);
                        if (token_siguiente == Tokens.IDENTIFICADOR) {
                            columnas(token_siguiente);

                            if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                cont++;
                                cambio_token(cont);

                            } else {
                                error_sintaxis(token_siguiente, cont, ")");
                            }
                        } else {
                            error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                        }
                    } else if (token_siguiente == Tokens.VALUES) {

                    } else if (token_siguiente == Tokens.DEFAULT) {

                    } else {
                        error_sintaxis(token_siguiente, cont, "(");
                    }

                } else if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                    cont++;
                    cambio_token(cont);
                    if (token_siguiente == Tokens.IDENTIFICADOR) {
                        columnas(token_siguiente);

                        if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                            cont++;
                            cambio_token(cont);

                        } else {
                            error_sintaxis(token_siguiente, cont, ")");
                        }
                    } else {
                        error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                    }
                } else if (token_siguiente == Tokens.VALUES) {

                } else if (token_siguiente == Tokens.DEFAULT) {

                } else {
                    error_sintaxis(token_siguiente, cont, "(");
                }

                break;

            default:
                error_sintaxis(token_siguiente, cont, "INTO O IDENTIFICADOR");
                break;

        }

    }

    public void columnas(Tokens a) {
        switch (a) {
            case IDENTIFICADOR:
                cont++;
                cambio_token(cont);
                if (token_siguiente == Tokens.COMA) {
                    mas_de_un_identificador(token_siguiente);
                }
                break;

            default:
                error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
        }
    }

    public void alter(Tokens token_alter) {

        switch (token_alter) {

            case DATABASE:      //listo
                cont++;
                cambio_token(cont);
                database(token_siguiente);

                break;
            case TABLE:
                cont++;
                cambio_token(cont);
                table(token_siguiente);

                break;

            case INDEX:
                cont++;
                cambio_token(cont);
                if (token_siguiente == Tokens.IDENTIFICADOR || token_siguiente == Tokens.ALL) {
                    cont++;
                    cambio_token(cont);
                    index(token_siguiente);
                } else {
                    error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                }

                break;

            case USER:
                cont++;
                cambio_token(cont);
                user(token_siguiente);
                break;

            case VIEW:
                cont++;
                cambio_token(cont);
                view(token_siguiente);

                break;

        }

    }

    public void view(Tokens a) {
        switch (a) {
            case IDENTIFICADOR:

                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.PUNTO) {
                    objeto_nombre(token_siguiente);

                    if (token_siguiente == Tokens.IDENTIFICADOR) {
                        cont++;
                        cambio_token(cont);
                        if (token_siguiente == Tokens.AS) {
                            cont++;
                            cambio_token(cont);
                            if (token_siguiente == Tokens.SELECT) {
                                analisis(token_siguiente);
                            } else {
                                error_sintaxis(token_siguiente, cont, "SELECT");
                            }
                        } else {
                            error_sintaxis(token_siguiente, cont, "AS");
                        }
                    } else {
                        error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                    }

                } else if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);
                    if (token_siguiente == Tokens.AS) {
                        cont++;
                        cambio_token(cont);
                        if (token_siguiente == Tokens.SELECT) {
                            analisis(token_siguiente);
                        } else {
                            error_sintaxis(token_siguiente, cont, "SELECT");
                        }
                    } else {
                        error_sintaxis(token_siguiente, cont, "AS");
                    }
                } else {
                    error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                }

                break;

            default:

                error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");

                break;
        }
    }

    public void user(Tokens a) {
        switch (a) {
            case IDENTIFICADOR:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.WITH) {
                    cont++;
                    cambio_token(cont);
                    set_item(token_siguiente);

                } else {
                    error_sintaxis(token_siguiente, cont, "WITH");
                }

                break;
        }
    }

    public void set_item(Tokens b) {
        switch (b) {
            case NAME:
                cont++;
                cambio_token(cont);
                if (token_siguiente == Tokens.ASIGNAR) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.IDENTIFICADOR) {
                        cont++;
                        cambio_token(cont);

                    } else {
                        error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                    }
                } else {
                    error_sintaxis(token_siguiente, cont, "=");
                }
                break;

            case NULL:
                cont++;
                cambio_token(cont);
                break;

            case LOGIN:
                cont++;
                cambio_token(cont);
                if (token_siguiente == Tokens.ASIGNAR) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.IDENTIFICADOR) {
                        cont++;
                        cambio_token(cont);

                    } else {
                        error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                    }
                } else {
                    error_sintaxis(token_siguiente, cont, "=");
                }
                break;

        }
    }

    public void index(Tokens token_alter) {
        switch (token_alter) {
            case ON:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);
                    if (token_siguiente == Tokens.PUNTO) {
                        objeto_nombre(token_siguiente);
                        accion_index(token_siguiente);
                    } else if (token_siguiente == Tokens.DISABLE || token_siguiente == Tokens.REBUILD || token_siguiente == Tokens.UNUSABLE || token_siguiente == Tokens.USABLE) {
                        accion_index(token_siguiente);
                    } else {
                        error_sintaxis(token_siguiente, cont, "ACCION INDEX");
                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                }

                break;
            default:
                error_sintaxis(token_siguiente, cont, "ON");
                break;
        }
    }

    public void accion_index(Tokens cambio) {
        switch (cambio) {
            case DISABLE:
                cont++;
                cambio_token(cont);
                break;

            case REBUILD:
                cont++;
                cambio_token(cont);
                break;

            case UNUSABLE:
                cont++;
                cambio_token(cont);

                break;

            case USABLE:
                cont++;
                cambio_token(cont);
                break;
            default:
                error_sintaxis(token_siguiente, cont, "ACCION INDEX");
                break;

        }
    }

    public void set_index(Tokens a) {
        switch (a) {
            default:

                break;
        }
    }

    public void database(Tokens token_alert) {//listo
        switch (token_alert) {

            case IDENTIFICADOR:
                cont++;
                cambio_token(cont);
                tipo_alter_base(token_siguiente);
                break;

            case CURRENT:
                cont++;
                cambio_token(cont);
                tipo_alter_base(token_siguiente);
                break;

            default:
                error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                break;
        }
    }

    public void tipo_alter_base(Tokens token_alert) {//listo
        switch (token_alert) {

            case MODIFY:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.NAME) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.ASIGNAR) {
                        cont++;
                        cambio_token(cont);

                        if (token_siguiente == Tokens.IDENTIFICADOR) {
                            cont++;
                            cambio_token(cont);

                        } else {
                            error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                        }

                    } else {
                        error_sintaxis(token_siguiente, cont, "=");
                    }
                } else {
                    error_sintaxis(token_siguiente, cont, "NAME");
                }

                break;
            default:
                error_sintaxis(token_siguiente, cont, "MODIFY");
                break;
        }
    }

    public void table(Tokens token_alter) {

        switch (token_alter) {

            case IDENTIFICADOR:
                cont++;
                cambio_token(cont);
                if (token_siguiente == Tokens.PUNTO) {
                    objeto_nombre(token_siguiente);
                    accion_alter(token_siguiente);
                } else if (token_siguiente == Tokens.ADD || token_siguiente == Tokens.ALTER || token_siguiente == Tokens.DROP) {
                    accion_alter(token_siguiente);
                } else {
                    error_sintaxis(token_siguiente, cont, "ADD DROP ALTER");
                }
                break;

            default:
                error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                break;
        }
    }

    public void accion_alter(Tokens token_alter) {

        switch (token_alter) {

            case ALTER:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.COLUMN) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.IDENTIFICADOR) {
                        cont++;
                        cambio_token(cont);
                        if (token_siguiente == Tokens.PUNTO) {
                            objeto_nombre(token_siguiente);
                        }
                        tipo_dato(token_siguiente);
                        constraint(token_siguiente);

                    } else {
                        error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                    }
                } else {
                    error_sintaxis(token_siguiente, cont, "COLUMN");
                }

                break;

            case ADD:
                cont++;
                cambio_token(cont);
                tipo_add(token_siguiente);

                break;

            case DROP:
                cont++;
                cambio_token(cont);
                tipo_drop(token_siguiente);
                break;

        }
    }
//eliminar solo un objeto

    public void tipo_drop(Tokens alter_token) {
        switch (alter_token) {

            case CONSTRAINT:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.COMA) {
                        mas_de_un_identificador(token_siguiente);

                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                }

                break;

            case COLUMN:
                cont++;
                cambio_token(cont);
                if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);
                    if (token_siguiente == Tokens.COMA) {
                        mas_de_un_identificador(token_siguiente);

                    }
                } else {
                    error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                }
                break;

            case INDEX:
                cont++;
                cambio_token(cont);
                if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);
                    if (token_siguiente == Tokens.COMA) {
                        mas_de_un_identificador(token_siguiente);

                    }
                } else {
                    error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                }
                break;

            default:
                error_sintaxis(token_siguiente, cont, "UN VALOR FINAL");
                break;
        }

    }

    //opciones para agregar algo a una tabla
    public void tipo_add(Tokens token_alter) {
        switch (token_alter) {

            case CONSTRAINT:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);

                    switch (token_siguiente) {

                        case FOREIGN:
                            constraint(Tokens.FOREIGN);
                            break;

                        case UNIQUE:

                            cont++;
                            cambio_token(cont);

                            if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {

                                cont++;
                                cambio_token(cont);

                                if (token_siguiente == Tokens.IDENTIFICADOR) {
                                    cont++;
                                    cambio_token(cont);

                                    if (token_siguiente == Tokens.COMA) {
                                        mas_de_un_identificador(token_siguiente);

                                        if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                            cont++;
                                            cambio_token(cont);

                                        } else {
                                            error_sintaxis(token_siguiente, cont, ")");
                                        }

                                    }

                                } else {
                                    error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                                }

                            } else {
                                error_sintaxis(token_siguiente, cont, "(");
                            }

                            break;

                        case PRIMARY:
                            cont++;
                            cambio_token(cont);
                            if (token_siguiente != Tokens.KEY) {
                                error_sintaxis(token_siguiente, cont, "KEY");
                            } else {
                                cont++;
                                cambio_token(cont);

                                if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                                    cont++;
                                    cambio_token(cont);

                                    if (token_siguiente == Tokens.IDENTIFICADOR) {
                                        cont++;
                                        cambio_token(cont);

                                        if (token_siguiente == Tokens.COMA) {
                                            mas_de_un_identificador(token_siguiente);

                                            if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                                cont++;
                                                cambio_token(cont);

                                            } else {
                                                error_sintaxis(token_siguiente, cont, ")");
                                            }

                                        } else if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                            cont++;
                                            cambio_token(cont);

                                        } else {
                                            error_sintaxis(token_siguiente, cont, ")");
                                        }

                                    } else {
                                        error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                                    }

                                } else {
                                    error_sintaxis(token_siguiente, cont, "(");
                                }

                            }

                            break;

                        case CHECK:
                            constraint(Tokens.CHECK);
                            break;
                    }

                }

                break;

            case IDENTIFICADOR:
                cont++;
                cambio_token(cont);
                switch (token_siguiente) {
                    case CHECK:
                        constraint(Tokens.CHECK);
                        break;

                    default:
                        if (token_siguiente != null) {
                            tipo_dato(token_siguiente);
                            constraint(token_siguiente);
                        }

                        break;

                }

                if (token_siguiente == Tokens.COMA) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.IDENTIFICADOR) {
                        tipo_add(Tokens.IDENTIFICADOR);
                    } else {
                        error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                    }

                }

                break;

            case FOREIGN:
                constraint(Tokens.FOREIGN);
                break;

            case CHECK:
                constraint(Tokens.CHECK);
                break;

        }
    }

    public void mas_de_un_check(Tokens token_alter) {

        switch (token_siguiente) {
            case AND:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.BETWEEN || token_siguiente == Tokens.LIKE || token_siguiente == Tokens.MAYOR_QUE || token_siguiente == Tokens.MENOR_QUE || token_siguiente == Tokens.MAYOR_IGUAL || token_siguiente == Tokens.MENOR_IGUAL || token_siguiente == Tokens.DIFERENTE_DE || token_siguiente == Tokens.IGUAL_IGUAL || token_siguiente == Tokens.ASIGNAR) {
                        if (token_siguiente == Tokens.BETWEEN || token_siguiente == Tokens.LIKE) {

                            switch (token_siguiente) {
                                case BETWEEN:
                                    cont++;
                                    cambio_token(cont);

                                    if (token_siguiente == Tokens.INT_NUM) {
                                        cont++;
                                        cambio_token(cont);
                                        if (token_siguiente == Tokens.AND || token_siguiente == Tokens.OR || token_siguiente == Tokens.AND_OP || token_siguiente == Tokens.OR_OP) {
                                            cont++;
                                            cambio_token(cont);
                                            if (token_siguiente == Tokens.INT_NUM) {
                                                cont++;
                                                cambio_token(cont);
                                            }
                                        }
                                    } else {
                                        error_sintaxis(token_siguiente, cont, "VALOR");
                                    }

                                    break;

                                case LIKE:
                                    cont++;
                                    cambio_token(cont);
                                    if (token_siguiente == Tokens.STRING) {
                                        cont++;
                                        cambio_token(cont);
                                    } else {
                                        error_sintaxis(token_siguiente, cont, "STRING");
                                    }

                                    break;

                            }
                            if (token_siguiente == Tokens.AND || token_siguiente == Tokens.OR || token_siguiente == Tokens.AND_OP || token_siguiente == Tokens.OR_OP) {
                                mas_de_un_check(token_siguiente);
                            }

                        } else {

                            cont++;
                            cambio_token(cont);

                            if (token_siguiente == Tokens.STRING || token_siguiente == Tokens.INT_NUM || token_siguiente == Tokens.FLOAT_NUM || token_siguiente == Tokens.BIT_NUM) {
                                cont++;
                                cambio_token(cont);

                                if (token_siguiente == Tokens.AND || token_siguiente == Tokens.OR || token_siguiente == Tokens.AND_OP || token_siguiente == Tokens.OR_OP) {
                                    mas_de_un_check(token_siguiente);
                                }

                            } else {
                                error_sintaxis(token_siguiente, cont, "valor");
                            }
                        }
                    } else {
                        error_sintaxis(token_siguiente, cont, "OPERADOR LOGICO");
                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                }

                break;

            case OR:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.BETWEEN || token_siguiente == Tokens.LIKE || token_siguiente == Tokens.MAYOR_QUE || token_siguiente == Tokens.MENOR_QUE || token_siguiente == Tokens.MAYOR_IGUAL || token_siguiente == Tokens.MENOR_IGUAL || token_siguiente == Tokens.DIFERENTE_DE || token_siguiente == Tokens.IGUAL_IGUAL || token_siguiente == Tokens.ASIGNAR) {
                        if (token_siguiente == Tokens.BETWEEN || token_siguiente == Tokens.LIKE) {

                            switch (token_siguiente) {
                                case BETWEEN:
                                    cont++;
                                    cambio_token(cont);

                                    if (token_siguiente == Tokens.INT_NUM) {
                                        cont++;
                                        cambio_token(cont);
                                        if (token_siguiente == Tokens.AND || token_siguiente == Tokens.OR || token_siguiente == Tokens.AND_OP || token_siguiente == Tokens.OR_OP) {
                                            cont++;
                                            cambio_token(cont);
                                            if (token_siguiente == Tokens.INT_NUM) {
                                                cont++;
                                                cambio_token(cont);
                                            }
                                        }
                                    } else {
                                        error_sintaxis(token_siguiente, cont, "VALOR");
                                    }

                                    break;

                                case LIKE:
                                    cont++;
                                    cambio_token(cont);
                                    if (token_siguiente == Tokens.STRING) {
                                        cont++;
                                        cambio_token(cont);
                                    } else {
                                        error_sintaxis(token_siguiente, cont, "STRING");
                                    }

                                    break;

                            }
                            if (token_siguiente == Tokens.AND || token_siguiente == Tokens.OR || token_siguiente == Tokens.AND_OP || token_siguiente == Tokens.OR_OP) {
                                mas_de_un_check(token_siguiente);
                            }
                        } else {

                            cont++;
                            cambio_token(cont);

                            if (token_siguiente == Tokens.STRING || token_siguiente == Tokens.INT_NUM || token_siguiente == Tokens.FLOAT_NUM || token_siguiente == Tokens.BIT_NUM) {
                                cont++;
                                cambio_token(cont);

                                if (token_siguiente == Tokens.AND || token_siguiente == Tokens.OR || token_siguiente == Tokens.AND_OP || token_siguiente == Tokens.OR_OP) {
                                    mas_de_un_check(token_siguiente);
                                }

                            } else {
                                error_sintaxis(token_siguiente, cont, "valor");
                            }
                        }
                    } else {
                        error_sintaxis(token_siguiente, cont, "OPERADOR LOGICO");
                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                }

                break;

            case AND_OP:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.BETWEEN || token_siguiente == Tokens.LIKE || token_siguiente == Tokens.MAYOR_QUE || token_siguiente == Tokens.MENOR_QUE || token_siguiente == Tokens.MAYOR_IGUAL || token_siguiente == Tokens.MENOR_IGUAL || token_siguiente == Tokens.DIFERENTE_DE || token_siguiente == Tokens.IGUAL_IGUAL || token_siguiente == Tokens.ASIGNAR) {
                        if (token_siguiente == Tokens.BETWEEN || token_siguiente == Tokens.LIKE) {

                            switch (token_siguiente) {
                                case BETWEEN:
                                    cont++;
                                    cambio_token(cont);

                                    if (token_siguiente == Tokens.INT_NUM) {
                                        cont++;
                                        cambio_token(cont);
                                        if (token_siguiente == Tokens.AND || token_siguiente == Tokens.OR || token_siguiente == Tokens.AND_OP || token_siguiente == Tokens.OR_OP) {
                                            cont++;
                                            cambio_token(cont);
                                            if (token_siguiente == Tokens.INT_NUM) {
                                                cont++;
                                                cambio_token(cont);
                                            }
                                        }
                                    } else {
                                        error_sintaxis(token_siguiente, cont, "VALOR");
                                    }

                                    break;

                                case LIKE:
                                    cont++;
                                    cambio_token(cont);
                                    if (token_siguiente == Tokens.STRING) {
                                        cont++;
                                        cambio_token(cont);
                                    } else {
                                        error_sintaxis(token_siguiente, cont, "STRING");
                                    }

                                    break;

                            }
                            if (token_siguiente == Tokens.AND || token_siguiente == Tokens.OR || token_siguiente == Tokens.AND_OP || token_siguiente == Tokens.OR_OP) {
                                mas_de_un_check(token_siguiente);
                            }

                        } else {

                            cont++;
                            cambio_token(cont);

                            if (token_siguiente == Tokens.STRING || token_siguiente == Tokens.INT_NUM || token_siguiente == Tokens.FLOAT_NUM || token_siguiente == Tokens.BIT_NUM) {
                                cont++;
                                cambio_token(cont);

                                if (token_siguiente == Tokens.AND || token_siguiente == Tokens.OR || token_siguiente == Tokens.AND_OP || token_siguiente == Tokens.OR_OP) {
                                    mas_de_un_check(token_siguiente);
                                }

                            } else {
                                error_sintaxis(token_siguiente, cont, "valor");
                            }
                        }
                    } else {
                        error_sintaxis(token_siguiente, cont, "OPERADOR LOGICO");
                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                }

                break;

            case OR_OP:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.BETWEEN || token_siguiente == Tokens.LIKE || token_siguiente == Tokens.MAYOR_QUE || token_siguiente == Tokens.MENOR_QUE || token_siguiente == Tokens.MAYOR_IGUAL || token_siguiente == Tokens.MENOR_IGUAL || token_siguiente == Tokens.DIFERENTE_DE || token_siguiente == Tokens.IGUAL_IGUAL || token_siguiente == Tokens.ASIGNAR) {
                        if (token_siguiente == Tokens.BETWEEN || token_siguiente == Tokens.LIKE) {

                            switch (token_siguiente) {
                                case BETWEEN:
                                    cont++;
                                    cambio_token(cont);

                                    if (token_siguiente == Tokens.INT_NUM) {
                                        cont++;
                                        cambio_token(cont);
                                        if (token_siguiente == Tokens.AND || token_siguiente == Tokens.OR || token_siguiente == Tokens.AND_OP || token_siguiente == Tokens.OR_OP) {
                                            cont++;
                                            cambio_token(cont);
                                            if (token_siguiente == Tokens.INT_NUM) {
                                                cont++;
                                                cambio_token(cont);
                                            }
                                        }
                                    } else {
                                        error_sintaxis(token_siguiente, cont, "VALOR");
                                    }

                                    break;

                                case LIKE:
                                    cont++;
                                    cambio_token(cont);
                                    if (token_siguiente == Tokens.STRING) {
                                        cont++;
                                        cambio_token(cont);
                                    } else {
                                        error_sintaxis(token_siguiente, cont, "STRING");
                                    }

                                    break;

                            }
                            if (token_siguiente == Tokens.AND || token_siguiente == Tokens.OR || token_siguiente == Tokens.AND_OP || token_siguiente == Tokens.OR_OP) {
                                mas_de_un_check(token_siguiente);
                            }
                        } else {

                            cont++;
                            cambio_token(cont);

                            if (token_siguiente == Tokens.STRING || token_siguiente == Tokens.INT_NUM || token_siguiente == Tokens.FLOAT_NUM || token_siguiente == Tokens.BIT_NUM) {
                                cont++;
                                cambio_token(cont);

                                if (token_siguiente == Tokens.AND || token_siguiente == Tokens.OR || token_siguiente == Tokens.AND_OP || token_siguiente == Tokens.OR_OP) {
                                    mas_de_un_check(token_siguiente);
                                }

                            } else {
                                error_sintaxis(token_siguiente, cont, "valor");
                            }
                        }
                    } else {
                        error_sintaxis(token_siguiente, cont, "OPERADOR LOGICO");
                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                }

                break;
        }

    }

    //constraint de un alter de columna
    public void constraint(Tokens token_alter) {
        switch (token_alter) {

            case CHECK:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.IDENTIFICADOR) {
                        cont++;
                        cambio_token(cont);

                        if (token_siguiente == Tokens.BETWEEN || token_siguiente == Tokens.LIKE || token_siguiente == Tokens.MAYOR_QUE || token_siguiente == Tokens.MENOR_QUE || token_siguiente == Tokens.MAYOR_IGUAL || token_siguiente == Tokens.MENOR_IGUAL || token_siguiente == Tokens.DIFERENTE_DE || token_siguiente == Tokens.IGUAL_IGUAL || token_siguiente == Tokens.ASIGNAR) {
                            if (token_siguiente == Tokens.BETWEEN || token_siguiente == Tokens.LIKE) {

                                switch (token_siguiente) {
                                    case BETWEEN:
                                        cont++;
                                        cambio_token(cont);

                                        if (token_siguiente == Tokens.INT_NUM) {
                                            cont++;
                                            cambio_token(cont);
                                            if (token_siguiente == Tokens.AND || token_siguiente == Tokens.OR || token_siguiente == Tokens.AND_OP || token_siguiente == Tokens.OR_OP) {
                                                cont++;
                                                cambio_token(cont);
                                                if (token_siguiente == Tokens.INT_NUM) {
                                                    cont++;
                                                    cambio_token(cont);
                                                }
                                            }
                                        } else {
                                            error_sintaxis(token_siguiente, cont, "VALOR");
                                        }

                                        break;

                                    case LIKE:
                                        cont++;
                                        cambio_token(cont);
                                        if (token_siguiente == Tokens.STRING) {
                                            cont++;
                                            cambio_token(cont);
                                        } else {
                                            error_sintaxis(token_siguiente, cont, "STRING");
                                        }

                                        break;

                                }

                                if (token_siguiente == Tokens.AND || token_siguiente == Tokens.OR || token_siguiente == Tokens.AND_OP || token_siguiente == Tokens.OR_OP) {
                                    mas_de_un_check(token_siguiente);
                                }

                            } else {

                                cont++;
                                cambio_token(cont);

                                if (token_siguiente == Tokens.STRING || token_siguiente == Tokens.INT_NUM || token_siguiente == Tokens.FLOAT_NUM || token_siguiente == Tokens.BIT_NUM) {
                                    cont++;
                                    cambio_token(cont);

                                    if (token_siguiente == Tokens.AND || token_siguiente == Tokens.OR || token_siguiente == Tokens.AND_OP || token_siguiente == Tokens.OR_OP) {
                                        mas_de_un_check(token_siguiente);
                                    }

                                    if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                        cont++;
                                        cambio_token(cont);

                                    } else {
                                        error_sintaxis(token_siguiente, cont, ")");
                                    }

                                } else {
                                    error_sintaxis(token_siguiente, cont, "VALOR");
                                }
                            }
                        } else {
                            error_sintaxis(token_siguiente, cont, "OPERADOR LOGICO");
                        }

                    } else {
                        error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "(");
                }

                break;

            case NULL:
                cont++;
                cambio_token(cont);

                break;

            case NOT:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.NULL) {
                    cont++;
                    cambio_token(cont);
                }

                break;

            case UNIQUE:
                cont++;
                cambio_token(cont);

                break;

            case PRIMARY:
                cont++;
                cambio_token(cont);

                if (token_siguiente != Tokens.KEY) {
                    error_sintaxis(token_siguiente, cont, "KEY");
                } else {
                    cont++;
                    cambio_token(cont);
                }

                break;

            case FOREIGN:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.KEY) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                        cont++;
                        cambio_token(cont);

                        if (token_siguiente == Tokens.IDENTIFICADOR) {
                            cont++;
                            cambio_token(cont);

                            if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                cont++;
                                cambio_token(cont);

                                if (token_siguiente == Tokens.REFERENCES) {
                                    cont++;
                                    cambio_token(cont);

                                    if (token_siguiente == Tokens.IDENTIFICADOR) {
                                        cont++;
                                        cambio_token(cont);

                                        if (token_siguiente == Tokens.PUNTO) {
                                            objeto_nombre(token_siguiente);

                                            if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                                                cont++;
                                                cambio_token(cont);

                                                if (token_siguiente == Tokens.IDENTIFICADOR) {
                                                    cont++;
                                                    cambio_token(cont);

                                                    if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                                        cont++;
                                                        cambio_token(cont);

                                                    } else {
                                                        error_sintaxis(token_siguiente, cont, ")");

                                                    }

                                                } else {
                                                    error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");

                                                }

                                            } else {
                                                error_sintaxis(token_siguiente, cont, "(");

                                            }

                                        } else if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                                            cont++;
                                            cambio_token(cont);

                                            if (token_siguiente == Tokens.IDENTIFICADOR) {
                                                cont++;
                                                cambio_token(cont);

                                                if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                                    cont++;
                                                    cambio_token(cont);

                                                } else {
                                                    error_sintaxis(token_siguiente, cont, ")");
                                                }

                                            } else {
                                                error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");

                                            }

                                        } else {
                                            error_sintaxis(token_siguiente, cont, "(");

                                        }

                                    } else {
                                        error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                                    }

                                } else {
                                    error_sintaxis(token_siguiente, cont, "REFERENCES");
                                }

                            } else {
                                error_sintaxis(token_siguiente, cont, ")");

                            }

                        } else {
                            error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");

                        }

                    } else {
                        error_sintaxis(token_siguiente, cont, "(");

                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "KEY");

                }

                break;

            case DEFAULT:
                cont++;
                cambio_token(cont);
                data_tipo(token_siguiente);
                break;

            case IDENTITY:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.INT_NUM || token_siguiente == Tokens.BIT_NUM) {

                        cont++;
                        cambio_token(cont);

                        if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                            cont++;
                            cambio_token(cont);
                        } else if (token_siguiente == Tokens.COMA) {
                            cont++;
                            cambio_token(cont);
                            if (token_siguiente == Tokens.INT_NUM || token_siguiente == Tokens.BIT_NUM) {

                                cont++;
                                cambio_token(cont);
                                if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                    cont++;
                                    cambio_token(cont);
                                } else {
                                    error_sintaxis(token_siguiente, cont, ")");

                                }
                            } else {
                                error_sintaxis(token_siguiente, cont, "INT");

                            }
                        } else {
                            error_sintaxis(token_siguiente, cont, ",");

                        }

                    } else {
                        error_sintaxis(token_siguiente, cont, "INT");

                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "(");

                }

                break;
        }
    }

    //valores para el default
    public void data_tipo(Tokens token_alter) {

        switch (token_alter) {

            case STRING:
                cont++;
                cambio_token(cont);

                break;

            case BIT_NUM:
                cont++;
                cambio_token(cont);

                break;

            case INT_NUM:
                cont++;
                cambio_token(cont);

                break;

            case FLOAT_NUM:
                cont++;
                cambio_token(cont);

                break;

            default:
                error_sintaxis(token_siguiente, cont, "Tipo de dato");
                break;
        }

    }

    //Tipos de dato para cuando se crea una columna
    public void tipo_dato(Tokens token_alter) {
        switch (token_alter) {

            case CHAR:
                cont++;
                cambio_token(cont);
                if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.INT_NUM) {

                        cont++;
                        cambio_token(cont);

                        if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                            cont++;
                            cambio_token(cont);
                        } else {
                            error_sintaxis(token_siguiente, cont, ")");
                        }

                    } else {
                        error_sintaxis(token_siguiente, cont, "INT");
                    }

                }

                break;

            case VARCHAR:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.INT_NUM) {

                        cont++;
                        cambio_token(cont);

                        if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                            cont++;
                            cambio_token(cont);
                        } else {
                            error_sintaxis(token_siguiente, cont, ")");
                        }

                    } else {
                        error_sintaxis(token_siguiente, cont, "INT");
                    }

                }

                break;

            case TEXT:
                cont++;
                cambio_token(cont);
                break;

            case IMAGE:
                cont++;
                cambio_token(cont);

                break;

            case VARBINARY:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.MAX) {

                        cont++;
                        cambio_token(cont);

                        if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                            cont++;
                            cambio_token(cont);
                        } else {
                            error_sintaxis(token_siguiente, cont, ")");
                        }

                    } else {
                        error_sintaxis(token_siguiente, cont, "MAX");
                    }

                }
                break;

            case DATE:
                cont++;
                cambio_token(cont);

                break;

            case DATETIME:
                cont++;
                cambio_token(cont);

                break;

            case DATETIME2:
                cont++;
                cambio_token(cont);

                break;

            case SMALLDATETIME:
                cont++;
                cambio_token(cont);

                break;

            case TIME:
                cont++;
                cambio_token(cont);

                break;

            case DATETIMEOFFSET:
                cont++;
                cambio_token(cont);

                break;

            case TIMESTAMP:
                cont++;
                cambio_token(cont);

                break;

            case FLOAT:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.INT_NUM) {

                        cont++;
                        cambio_token(cont);

                        if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                            cont++;
                            cambio_token(cont);
                        } else {
                            error_sintaxis(token_siguiente, cont, ")");
                        }

                    } else {
                        error_sintaxis(token_siguiente, cont, "INT");
                    }

                }

                break;

            case MONEY:
                cont++;
                cambio_token(cont);

                break;

            case REAL:
                cont++;
                cambio_token(cont);

                break;

            case BIT:
                cont++;
                cambio_token(cont);

                break;

            case INT:
                cont++;
                cambio_token(cont);

                break;

            case DECIMAL:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.INT_NUM) {

                        cont++;
                        cambio_token(cont);

                        if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                            cont++;
                            cambio_token(cont);
                        } else if (token_siguiente == Tokens.COMA) {
                            cont++;
                            cambio_token(cont);
                            if (token_siguiente == Tokens.INT_NUM) {

                                cont++;
                                cambio_token(cont);
                                if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                    cont++;
                                    cambio_token(cont);
                                } else {
                                    error_sintaxis(token_siguiente, cont, ")");
                                }
                            } else {
                                error_sintaxis(token_siguiente, cont, "INT");
                            }
                        } else {
                            error_sintaxis(token_siguiente, cont, "COMA");
                        }

                    } else {
                        error_sintaxis(token_siguiente, cont, "INT");
                    }

                }

                break;

            case NUMERIC:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.PARENTESIS_ABIERTO) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.INT_NUM) {

                        cont++;
                        cambio_token(cont);

                        if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                            cont++;
                            cambio_token(cont);
                        } else if (token_siguiente == Tokens.COMA) {
                            cont++;
                            cambio_token(cont);
                            if (token_siguiente == Tokens.INT_NUM) {

                                cont++;
                                cambio_token(cont);
                                if (token_siguiente == Tokens.PARENTESIS_CERRADO) {
                                    cont++;
                                    cambio_token(cont);
                                } else {
                                    error_sintaxis(token_siguiente, cont, ")");
                                }
                            } else {
                                error_sintaxis(token_siguiente, cont, "INT");
                            }
                        } else {
                            error_sintaxis(token_siguiente, cont, "COMA");
                        }

                    } else {
                        error_sintaxis(token_siguiente, cont, "INT");
                    }

                }
                break;

            default:
                error_sintaxis(token_siguiente, cont, "TIPO DE DATO");
                break;
        }

    }

    //valida el nombre de un objeto
    public void objeto_nombre(Tokens token_alter) {
        switch (token_alter) {

            case PUNTO:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.PUNTO) {
                        objeto_nombre(token_siguiente);
                    } else if (token_siguiente == Tokens.COMA) {
                        mas_de_un_objeto(token_siguiente);
                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");

                }

                break;

        }
    }

    public void mas_de_un_identificador(Tokens token_alter) {

        switch (token_alter) {
            case COMA:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.IDENTIFICADOR) {

                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.COMA) {
                        mas_de_un_identificador(token_siguiente);
                    }

                } else {
                    error_sintaxis(token_siguiente, cont, "IDENTIFICADOR");
                }

                break;

        }

    }

    //mas de un objeto 
    public void mas_de_un_objeto(Tokens token_alter) {
        switch (token_alter) {

            case IDENTIFICADOR:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.PUNTO) {
                    objeto_nombre(token_siguiente);
                }

                break;

        }
    }

    //error de sintaxis
    public void error_sintaxis(Tokens token_siguiente, int pos, String mensaje) {
        if (token_siguiente != null) {

            error_agregar = new error_token(tokens_a_evaluar_detalle.get(pos).token, tokens_a_evaluar_detalle.get(pos).linea, tokens_a_evaluar_detalle.get(pos).Columna, "SE ESPERABA " + mensaje);
            Errores.add(error_agregar);

        } else {
            error_agregar = new error_token(tokens_a_evaluar_detalle.get(pos - 1).token, tokens_a_evaluar_detalle.get(pos - 1).linea, tokens_a_evaluar_detalle.get(pos - 1).Columna, "SE ESPERABA " + mensaje);
            Errores.add(error_agregar);
        }
    }

}
