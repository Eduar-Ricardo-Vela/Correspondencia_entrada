/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Registro_Modelo;
import Vista.FrmRegistrar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;  

public class Controlador_Registro implements ActionListener,MouseListener{
    FrmRegistrar VtnRegistro ;
    Registro_Modelo modelo = new Registro_Modelo();//validad el boton ingresar                 
       
   public String cambiarFormatoFecha(Date fecha){
       SimpleDateFormat output = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       String formattedTime = output.format(fecha);       
       return formattedTime;
   }
    
    public enum AccionMVC{        
        __AGREGAR_Registro,
        __VER_USUARIOS,
        __ENTER_,
        __Nuevo_Registro
    }
    
    

    public Controlador_Registro(FrmRegistrar vista){
        this.VtnRegistro = vista;
        for (int i = 0; i < modelo.LlenarComboBox().length; i++) {            
            vista.jComboBox1.addItem(modelo.LlenarComboBox()[i]);            
        }
    }
    
    public Calendar FormatoHora(){
    Calendar calendario = Calendar.getInstance();
        int  hora, minutos, segundos;
        
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        return calendario;
        
    }
        
    public void iniciar(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows."
                    + "WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(VtnRegistro);
            VtnRegistro.setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {}
          catch (ClassNotFoundException ex) {
              JOptionPane.showMessageDialog(VtnRegistro, "Error de driver de "
                      + "video: "+ex.getMessage());
          }
          catch (InstantiationException ex) {}
          catch (IllegalAccessException ex) {}
       
        this.VtnRegistro.JBCRadicado.setActionCommand("__Nuevo_Registro");
        this.VtnRegistro.JBCRadicado.addActionListener(this);
        
        this.VtnRegistro.JBCAgregar.setActionCommand("__AGREGAR_Registro");
        this.VtnRegistro.JBCAgregar.addActionListener(this);
                        
        this.VtnRegistro.jTexRemitente.setActionCommand("__ENTER_");
        this.VtnRegistro.jTexRemitente.addActionListener(this);   
    }

    public void mouseClicked(MouseEvent e) {
       //boton izquierdo
                                
    }
    

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) { }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (AccionMVC.valueOf(e.getActionCommand())){
             case __ENTER_:{
                    this.VtnRegistro.TableUsuarios.setModel(this.modelo.
                            getTablaUsuarios(this.VtnRegistro.jTexRemitente.getText()));                                                         
                    break;
                }
                 
             case __Nuevo_Registro:{
                 
                  this.VtnRegistro.JtexaRadicado.setText(this.modelo.numRadicado());
          
                  this.VtnRegistro.jTextObservacion.setEnabled(true);

                  this.VtnRegistro.jComboRespuesta.setEnabled(true);
                  this.VtnRegistro.jComboEstado.setEnabled(true);
                  this.VtnRegistro.jDcFechaRecib.setEnabled(true);
                  this.VtnRegistro.jDcFechaElab.setEnabled(true);
                  this.VtnRegistro.jTexRemitente.setEnabled(true);
                  this.VtnRegistro.jTextConsteado.setEnabled(true);
                  this.VtnRegistro.jComboBox1.setEnabled(true);
                  this.VtnRegistro.Asunto.setEnabled(true);
                  this.VtnRegistro.jTextAreaRecibido.setEnabled(true);
                  this.VtnRegistro.JBCRadicado.setEnabled(false);
                  
                  break;
             }
             
            case __AGREGAR_Registro:{ 
                Date fecha1,fecha2;
                fecha1 = this.VtnRegistro.jDcFechaRecib.getDate();
                fecha2 = this.VtnRegistro.jDcFechaElab.getDate();
                this.VtnRegistro.jDcFechaRecib.setEnabled(false);
                this.VtnRegistro.jDcFechaElab.setEnabled(false);
        
        
        
        
        if (fecha2.after(fecha1)){
                JOptionPane.showMessageDialog(null, "La fecha de elaboración no debe ser posterior a la de envío!! ");    
                this.VtnRegistro.jDcFechaElab.setDate(null);
                this.VtnRegistro.jDcFechaElab.requestFocus();
        
        } 
    
                    if (this.modelo.NuevoRegistro(this.VtnRegistro.JtexaRadicado.getText(),
                            cambiarFormatoFecha(this.VtnRegistro.jDcFechaRecib.getDate()),
                            cambiarFormatoFecha(this.VtnRegistro.jDcFechaElab.getDate()),
                            this.VtnRegistro.jTextObservacion.getText(),
                            this.VtnRegistro.Asunto.getText(),  
                            this.VtnRegistro.jTextConsteado.getText(),
                            modelo.retornarCodigo((String)this.VtnRegistro.jComboBox1.getSelectedItem()),
                            this.VtnRegistro.jTexRemitente.getText(),
                            (String)this.VtnRegistro.jComboEstado.getSelectedItem(),
                            (String)this.VtnRegistro.jComboRespuesta.getSelectedItem(),
                            (String)this.VtnRegistro.jTextAreaRecibido.getText())){
                    
                            JOptionPane.showMessageDialog(VtnRegistro,"Registro creado!.");
                        
                    }else{
//                        JOptionPane.showMessageDialog(VtnRegistro,"Registro NOOOOO creado!.");
                    }
                            
                        
                            this.VtnRegistro.JtexaRadicado.setText("");           
                            this.VtnRegistro.jTextObservacion.setText("");
                            this.VtnRegistro.Asunto.setText("");
                            this.VtnRegistro.jTextConsteado.setText("");
                            this.VtnRegistro.jComboBox1.setSelectedItem("");
                            this.VtnRegistro.jTexRemitente.setText("");
                            this.VtnRegistro.jComboEstado.setSelectedItem("");
//                          this.VtnRegistro.jComboRespuesta.setSelectedItem(null);
                            this.VtnRegistro.jTextAreaRecibido.setText("");
                                    this.VtnRegistro.JBCRadicado.requestFocus();
//                            
                          
                }
                       
                    
//                        JOptionPane.showMessageDialog(VtnRegistro,"Datos incorrectos!
                
                
                 
                  
                   
                }
            }

    public void deshabilitarControles(){
              this.VtnRegistro.JtexaRadicado.setEnabled(false);
              this.VtnRegistro.jDcFechaRecib.getDateEditor().setEnabled(false);                                                                  
//            this.VtnRegistro.jDcFechaElab.getDateEditor().setEnabled(false);
//            this.VtnRegistro.jDateChooser2.setEnabled(false);
              this.VtnRegistro.JBCAgregar.setEnabled(false);
           
    }
    
    public void habilitarControles(){
              this.VtnRegistro.JtexaRadicado.setEnabled(true);
              this.VtnRegistro.jDcFechaRecib.getDateEditor().setEnabled(true); 
//            this.VtnRegistro.jDcFechaElab.getDateEditor().setEnabled(false);
//            this.VtnRegistro.jDateChooser2.setEnabled(false);
              this.VtnRegistro.JBCAgregar.setEnabled(true);
    }
}

