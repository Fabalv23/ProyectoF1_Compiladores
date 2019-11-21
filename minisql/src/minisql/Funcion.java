/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minisql;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class Funcion {
    private String nombre;
    private String ambito;
    private String tipo_dato;
    private LinkedList<Variable> parametros = new LinkedList<Variable>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public String getTipo_dato() {
        return tipo_dato;
    }

    public void setTipo_dato(String tipo_dato) {
        this.tipo_dato = tipo_dato;
    }

    public LinkedList<Variable> getParametros() {
        return parametros;
    }

    public void setParametros(LinkedList<Variable> parametros) {
        this.parametros = parametros;
    }
    
    public String escribirFuncion()
    {
        String linea = "";
        
        linea = "|" + String.format("%1$31s",nombre) + "|" + String.format("%1$14s",tipo_dato)+ "|";
        
        if(parametros.isEmpty())
        {
            linea = linea +"                                                               |"+String.format("%1$31s",ambito) + "|";
        }
        else
        {
            if(parametros.size() == 1)
            {
                linea = linea + parametros.get(0).escribirParametro() + "|"+String.format("%1$31s",ambito) + "|";
            }
            else {
                linea = linea + parametros.get(0).escribirParametro() + "|"+String.format("%1$31s",ambito) + "|";
                int cont = 0;
                for (Variable var : parametros) {
                    if(cont == 0)
                    {
                        cont++;
                    }
                    else
                    {
                        linea = linea +"\n"+ "|                               |              |"+  var.escribirParametro() + "|                               |";
                    }
                }

            }
        }
        
        
        
        return linea;
    }
   }
