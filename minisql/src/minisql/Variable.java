/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minisql;

/**
 *
 * @author User
 */
public class Variable {
    private  String nombre;
    private  String tipo_dato;
    private  String valor;
    private  String ambito;

    public Variable()
    {
        nombre = "";
        tipo_dato = "";
        valor = "";
        ambito = "";
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_dato() {
        return tipo_dato;
    }

    public void setTipo_dato(String tipo_dato) {
        this.tipo_dato = tipo_dato;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }
    
    public String escribirVariable()
    {
        String linea = "";
        
        linea = "|" + String.format("%1$31s",nombre) + "|" + String.format("%1$14s",tipo_dato)+ "|"+ String.format("%1$63s",valor)+ "|"+ String.format("%1$31s",ambito)+ "|" ;
        
        return linea;
    }
    
    public String escribirParametro()
    {
        String linea = "";
        
        linea = String.format("%1$31s",nombre) + ", " + String.format("%1$31s",tipo_dato);
        
        return linea;
    }
    
}
