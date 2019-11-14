/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author godin
 */
public class Tabla_alias {
         private String nombre;
   private String ambito;
     private List<Campo> campos;
        private String alias;

        
         public int buscar_campo(String id,String ambito)
    {       
        int index=-1;
        int i=0;
        for (Campo var : campos ) {            
            if(var.getNombre()==id ){
            index=i;
            }
            i++;
        }
        return index;
    }
        
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    public Tabla_alias(List<Campo> campos) {
        this.campos = new ArrayList<>();
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

    public List<Campo> getCampos() {
        return campos;
    }

    public void setCampos(List<Campo> campos) {
        this.campos = campos;
    }
}
