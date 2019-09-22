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

    public analisis_lexico_descendente(ArrayList<Tokens> lista) {
        this.tokens_a_evaluar = lista;
    }

    public Tokens token_actual = null;
    public Tokens token_siguiente = null;
    public ArrayList<Tokens> tokens_a_evaluar = new ArrayList<>();
    int cont = 0;

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

            case ALTER:
                cont++;
                cambio_token(cont);
                alter(token_siguiente);
                break;

        }

    }

    public void alter(Tokens token_alter) {

        switch (token_alter) {

            case DATABASE:
                cont++;
                cambio_token(cont);
                database(token_siguiente);

                break;

            case INDEX:
                cont++;

                break;

            case TABLE:
                cont++;
                cambio_token(cont);
                table(token_siguiente);

                break;

            case LOGIN:
                cont++;

                break;

            case VIEW:
                cont++;

                break;

        }

    }

    public void database(Tokens token_alert) {
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

        }
    }

    public void tipo_alter_base(Tokens token_alert) {
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

                            if (token_siguiente == Tokens.PUNTO_COMA) {
                                cont++;
                                cambio_token(cont);

                                if (token_siguiente != null) {
                                    analisis(token_siguiente);
                                } else {
                                    System.out.println("listo");
                                }
                            } else {
                                //error de sintaxis
                            }
                        } else {
                            //error
                        }

                    } else {
                        //error
                    }
                } else {
                    //error
                }

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
                    cont++;
                    cambio_token(cont);
                    accion_alter(token_siguiente);
                } else if (token_siguiente == Tokens.ADD || token_siguiente == Tokens.ALTER || token_siguiente == Tokens.DROP) {
                    accion_alter(token_siguiente);
                } else {
                    //Error de sintaxis
                }

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
                        tipo_dato(token_siguiente);
                        constraint(token_siguiente);

                    }
                } else {
                    //error sintaxis
                }

                break;

            case ADD:
                cont++;
                cambio_token(cont);
                tipo_add(token_siguiente);

                break;

            case DROP:
                cont++;

                break;

        }
    }

    public void tipo_add(Tokens token_alter) {
        switch (token_alter) {

            case CONSTRAINT:
                cont++;
                cambio_token(cont);

                if (token_siguiente == Tokens.IDENTIFICADOR) {
                    cont++;
                    cambio_token(cont);

                    if (token_siguiente == Tokens.PUNTO) {
                        objeto_nombre(token_siguiente);
                        cont++;
                        cambio_token(cont);
                    }else if(token_siguiente == Tokens.FOREIGN) {
                        tipo_add(Tokens.FOREIGN);       ///aqui va todo el tipo de add de constraints 
                    }else{
                        //error
                    }

                } else {
                    //error
                }

                break;

            case IDENTIFICADOR:
                cont++;
                cambio_token(cont);
                tipo_dato(token_siguiente);
                constraint(token_siguiente);

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

                                                    } else {
                                                        //error

                                                    }

                                                } else {
                                                    //error

                                                }

                                            } else {
                                                //error

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
                                                    //error

                                                }

                                            } else {
                                                //error

                                            }

                                        } else {
                                            //error

                                        }

                                    } else {
                                        //error

                                    }

                                } else {
                                    //error

                                }

                            } else {
                                //error

                            }

                        } else {
                            //error

                        }

                    } else {
                        //error

                    }

                } else {
                    //error

                }

                break;

        }
    }

    public void add_column(Tokens token_alter) {

        switch (token_alter) {

            case CONSTRAINT:
                cont++;

                break;

            case IDENTIFICADOR:
                cont++;
                cambio_token(cont);
                tipo_dato(token_siguiente);
                constraint(token_siguiente);
                break;

            case FOREIGN:
                cont++;

                break;

        }

    }

    //constraint de un alter de columna
    public void constraint(Tokens token_alter) {
        switch (token_alter) {

            case NULL:
                cont++;
                cambio_token(cont);

                break;

            case UNIQUE:
                cont++;
                cambio_token(cont);

                break;

            case PRIMARY:
                cont++;
                cambio_token(cont);

                if (token_siguiente != Tokens.KEY) {
                    //error
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

                                                    } else {
                                                        //error

                                                    }

                                                } else {
                                                    //error

                                                }

                                            } else {
                                                //error

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
                                                    //error

                                                }

                                            } else {
                                                //error

                                            }

                                        } else {
                                            //error

                                        }

                                    } else {
                                        //error

                                    }

                                } else {
                                    //error

                                }

                            } else {
                                //error

                            }

                        } else {
                            //error

                        }

                    } else {
                        //error

                    }

                } else {
                    //error

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
                                    //error
                                }
                            } else {
                                //error
                            }
                        } else {
                            //error
                        }

                    } else {
                        //error de sintaxis
                    }

                } else {
                    //error
                }

                break;

            case COMA:
                cont++;
                cambio_token(cont);
                add_column(token_siguiente);

                break;

            case PUNTO_COMA:
                cont++;
                cambio_token(cont);
                if (token_siguiente != null) {
                    analisis(token_siguiente);
                } else {
                    System.out.println("listo");
                }
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
                            //error sintaxis
                        }

                    } else {
                        //error de sintaxis
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
                            //error sintaxis
                        }

                    } else {
                        //error de sintaxis
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
                            //error sintaxis
                        }

                    } else {
                        //error de sintaxis
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
                            //error sintaxis
                        }

                    } else {
                        //error de sintaxis
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
                                    //error
                                }
                            } else {
                                //error
                            }
                        } else {
                            //error
                        }

                    } else {
                        //error de sintaxis
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
                                    //error
                                }
                            } else {
                                //error
                            }
                        } else {
                            //error
                        }

                    } else {
                        //error de sintaxis
                    }

                }

                break;

            default:

                //error de sintaxis
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
                    objeto_nombre(token_siguiente);
                } else {
                    //Error de sintaxis
                }

                break;

        }
    }

}
