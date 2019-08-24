/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minisql;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import jflex.*;

/**
 *
 * @author fabia
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

    //Se definen las variables para manipular el archivo
    String nombre_archivo, ruta_origen, nombre_archivo_salida, archivo_a_crear;

    //Se define la ruta donde se almacenaran los archivos out
    String ruta_salida = "C:\\Users\\fabia\\Desktop\\Archivos_Out_minisql\\";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carga de Archivo");

        jLabel1.setText("Carga de Archivo");

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Ruta de Destino");

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton2.setText("Leer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Compilar Archivo flex");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1))
                        .addComponent(jLabel2)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser dialogo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo minisql", "sql");
        File archivosql;
        String rutaArchivo;
        dialogo.setFileFilter(filtro);
        int valor = dialogo.showOpenDialog(this);
        if (valor == JFileChooser.APPROVE_OPTION) {
            archivosql = dialogo.getSelectedFile();
            rutaArchivo = archivosql.getPath();
            nombre_archivo = archivosql.getName();

            if (nombre_archivo != "") {
                nombre_archivo_salida = nombre_archivo.substring(0, nombre_archivo.indexOf("."));
                nombre_archivo_salida = nombre_archivo_salida + ".out";
            }

            archivo_a_crear = ruta_salida + nombre_archivo_salida;

            ruta_origen = rutaArchivo;
            jTextField1.setText(rutaArchivo);
            jTextField2.setText(archivo_a_crear);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        File archivo = new File(archivo_a_crear);
        PrintWriter escribir;

        Reader lector;
        try {
            lector = new BufferedReader(new FileReader(ruta_origen));

            Lexico lexer = new Lexico(lector);
            try {
                escribir = new PrintWriter(archivo);

                String resultado = "";
                while (true) {
                    Tokens tokens = lexer.yylex();
                    if (tokens == null) {
                        resultado += "FIN";
                        escribir.print(resultado);
                        escribir.close();
                        return;
                    }
                    switch (tokens) {
                        case ERROR:
                            resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + "ERROR, SIMBOLO NO RECONOCIDO" + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                                                                                                      
                            break;

                        case ERROR_COMENTARIO:
                            resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + "ERROR, FALTA CIERRE COMENTARIO" + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                                            
                            break;

                        case ERROR_STRING:
                            resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + "ERROR, FALTA CIERRE STRING" + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                                            
                            break;
                            

                        case ERROR_FLOAT:
                            resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + "ERROR, INICIO INVALIDO DE DECIMAL" + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                                            
                            break;
                                    
                                    
                        case IDENTIFICADOR:

                            if (lexer.palabra.length() > 31) {

                                String truncado = "";

                                truncado = lexer.palabra.substring(0, 31);

//                                JOptionPane.showMessageDialog(null, "Identificador mayor a 31 caracteres \n Original: " + lexer.palabra + "\n Reemplazo: " + truncado,
//                                        "Mensaje de Error ", HEIGHT);
                                
                                resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " Original con ERROR  \n";                                
                                
                                
                                resultado += "TOKEN: "+ truncado + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";
                                                                
                                break;

                            } else {

                                resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                                
                                break;
                            }

                        case RESERVADAS:

                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                

                            break;

                        case BIT:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case FLOAT:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case INT:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case Comentario_LineaUnica:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case SUMA:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case RESTA:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case MULTIPLICACION:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case DIVISION:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case PORCENTAJE:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case MENOR_QUE:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case MENOR_IGUAL:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case MAYOR_QUE:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case MAYOR_IGUAL:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case ASIGNAR:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case IGUAL_IGUAL:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case DIFERENTE_DE:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case AND:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case OR:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case ADMIRACION_CERRADO:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case PUNTO_COMA:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case PUNTO:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case COMA:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case CORCHETE_ABIERTO:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case CORCHETE_CERRADO:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case PARENTESIS_ABIERTO:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case PARENTESIS_CERRADO:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case LLAVE_ABIERTA:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case LLAVE_CERRADA:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case CORCHETES:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case PARENTESIS:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case LLAVES:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case ARROBA:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case NUMERAL:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case NUMERALES:
                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                
                            break;

                        case STRING:

                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                

                            break;

                        case COMENTARIO_MULTILINEA:

                             resultado += "TOKEN: "+ lexer.palabra + " TIPO: " + tokens + " Fila: " + lexer.linea + "  Columna Inicio: " + lexer.col + "  Columna Final: " + (lexer.col)+lexer.palabra.length() + " \n";                                

                            break;
                            
                            
                            
                            

                        default:
                            resultado += "Token: " + tokens + "\n";
                            break;
                    }
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        String ruta = "C:\\Users\\fabia\\Desktop\\Url 2do Ciclo 2019\\Compiladores\\Proyecto_F1\\Github\\ProyectoF1_Compiladores\\minisql\\src\\minisql\\Lexico.flex";
        generarFlex(ruta);

    }//GEN-LAST:event_jButton3ActionPerformed

    public static void generarFlex(String ruta) {
        File archivo = new File(ruta);

        jflex.Main.generate(archivo);

        JOptionPane.showMessageDialog(null, "Programa compilado exitosamente", "Mensaje de exito ", HEIGHT);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
