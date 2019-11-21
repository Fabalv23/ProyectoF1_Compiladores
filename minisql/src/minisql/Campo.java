/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minisql;

/**
 *
 * @author godin
 */
public class Campo {
    private String nombre;
    private String data_tipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getData_tipo() {
        return data_tipo;
    }

    public void setData_tipo(String data_tipo) {
        this.data_tipo = data_tipo;
    }
    
    public String escribirCampo()
    {
        String linea = "";
        
        linea = String.format("%1$31s",nombre) + ", " + String.format("%1$14s",data_tipo);
        
        return linea;
    }
    
}
