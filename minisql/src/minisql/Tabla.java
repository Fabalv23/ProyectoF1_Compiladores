/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minisql;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author godin
 */
public class Tabla {
     private String nombre;
     private String schema;
     private String ambito;
     public LinkedList<Campo> campos;
     
     public Tabla(){
         campos = new LinkedList<Campo>();
     }
     
     public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }
    
     public int buscar_campo(String id,String ambito)
    {       
        int index=-1;
        int i=0;
        for (Campo var : campos ) {            
            if(var.getNombre().equals(id) ){
            index=i;
            }
            i++;
        }
        return index;
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
