/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minisql;

import java_cup.runtime.Symbol;

/**
 *
 * @author fabian
 */
public class Comparacion {
    
    
    public String valor;
    public String data;
    public Campo_alias Campo;
    public String comparador;

    public String getComparador() {
        return comparador;
    }

    public void setComparador(String comparador) {
        this.comparador = comparador;
    }
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Campo_alias getCampo() {
        return Campo;
    }

    public void setCampo(Campo_alias Campo) {
        this.Campo = Campo;
    }
    
    public boolean isObjeto()
    {
        boolean esObjeto = true;
        if(data.equals("string") || data.equals("int") ||data.equals("float") ||data.equals("bit"))
             esObjeto = false;
        return esObjeto;
    }
    
    
    
}
