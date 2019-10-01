/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minisql;

/**
 *
 * @author fabia
 */
public class error_token {
    
    Tokens token;
    String linea;
    String columna;
    String detalle_error;

    public error_token(Tokens token, String linea, String columna,String detalle) {
        this.token = token;
        this.linea = linea;
        this.columna = columna;
        this.detalle_error = detalle;
    }

    @Override
    public String toString() {
        return "SINTAXIS ERROR "+detalle_error + " cercano a "+token+ " en la linea "+linea+" y columna "+columna;                        
    }
    
    
    
    
    
    
    
    
}
