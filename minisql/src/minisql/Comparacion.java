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
    public Symbol comparador;

    public Symbol getComparador() {
        return comparador;
    }

    public void setComparador(Symbol comparador) {
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
        return Campo_alias;
    }

    public void setCampo(Campo_alias Campo) {
        this.Campo_alias = Campo;
    }
    
    
    
    
    
}
