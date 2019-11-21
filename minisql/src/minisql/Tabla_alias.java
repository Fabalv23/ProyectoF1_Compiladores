/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minisql;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author godin
 */
public class Tabla_alias {
        private String nombre;
        private String ambito;
        private String alias;

        public Tabla_alias()
        {
            nombre = "";
            ambito = "";
            alias = "";
        }
        
         
        
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

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


}
