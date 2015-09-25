/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Controladores.MiModelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sala319
 */
public class Registro_Modelo extends Conexion {
       
    
    public  DefaultTableModel getTablaUsuarios(String doc){
        MiModelo tableModel = new MiModelo();
        int Registros = 0;
        String[] ColumNames = {"Documento","Nombres","Apellidos"};
        String sql = "SELECT count(*) as Total FROM Personas where documento = '"+doc+"';";
                
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(sql);
            ResultSet Resultado = pstm.executeQuery();
            Resultado.next();
            Registros = Resultado.getInt("Total");
            Resultado.close();
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    
          Object[][] data = new String[Registros][3];
          
          try {
              sql = "SELECT Documento, Nombres, Apellidos FROM Personas "
                  + "where documento = '"+doc+"';";
              
              PreparedStatement pstm = this.getConexion().prepareStatement(sql);
              ResultSet resultado = pstm.executeQuery();
              int i=0;
              while(resultado.next()){
                  data[i][0] = resultado.getString("Documento");                 
                  data[i][1] = resultado.getString("Nombres");
                  data[i][2] = resultado.getString("Apellidos");
                  i++;                  
              }
              
              resultado.close();
              
              tableModel.setDataVector(data, ColumNames);
              
          } catch (SQLException e) {
              
              JOptionPane.showMessageDialog(null, e.getMessage());
          }
          
          return tableModel;
      }
    
       public boolean NuevoRegistro(String  Nume_Radi_Entr, String Fech_Reci, String Fech_Elab, String Obse_Fech ,String Asunto, String Documento , String Codi_Tipo, String Contestado, String Estado, String Requ_Rta, String Docu_Reci){
          if(Valida_Datos (Nume_Radi_Entr,  Fech_Reci, Fech_Elab,Obse_Fech,Asunto,Documento,Codi_Tipo,Contestado,Estado,Requ_Rta,Docu_Reci))
          {                       
              
              JOptionPane.showMessageDialog(null, Nume_Radi_Entr);
              
              String SQl = "Insert into correspondencia_entrada (Nume_Radi_Entr,fech_Reci,Fech_Elab,Obse_Fech,Asunto,Contestado,Codi_Tipo,documento,Estado,Requ_Rta,Docu_Reci) "
                      + "Values('"+Nume_Radi_Entr+"','"+Fech_Reci+"','"+Fech_Elab+"','"+Obse_Fech+"','"+Asunto+"','"+Documento+"','"+Codi_Tipo+"','"+Contestado+"','"+Estado+"','"+Requ_Rta+"','"+Docu_Reci+"');";
//              System.out.println(SQl);
//              JOptionPane.showMessageDialog(null, SQl);
              
              try {
                  PreparedStatement pstm = this.getConexion().prepareStatement(SQl);
                  pstm.execute();
                  pstm.close();
                  return true;
                  
              } catch (Exception e) {
                  
                  JOptionPane.showMessageDialog(null, e.getMessage());
              }
              return false;
          }
          else 
              return false;
      }
       
        private boolean Valida_Datos (String  Nume_Radi_Entr, String Fech_Reci, String Fecha_Elab, String  Obse_Fech , String Asunto, String Documento , String Codi_Tipo, String Contestado, String Estado, String Requ_Rta, String Docu_Reci){
              if (Nume_Radi_Entr.length() > 0 && Obse_Fech.length() > 0  && Documento.length() > 0 && Codi_Tipo.length() > 0 && Contestado.length() > 0) {
                  return true;
              }
              else {
                  return false;
              }
          }
        
    public String[] LlenarComboBox(){
        
            String SQL = "Select Nomb_Tipo From tipos_de_documentos;";
            int i = 0;
                    
            try {
                PreparedStatement Sentencia = this.getConexion().prepareStatement(SQL);
                ResultSet Resultado = Sentencia.executeQuery();                
                while(Resultado.next()){                
                  i++;
                }    
                
            } catch (SQLException e) {
                
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
            String[] Combo = new String[i];
            
            SQL = "Select Nomb_Tipo From tipos_de_documentos order by Nomb_Tipo;";
            
            try {
                PreparedStatement Sentencia = this.getConexion().prepareStatement(SQL);
                ResultSet Resultado = Sentencia.executeQuery();
                i = 0;
                while(Resultado.next()){
                  Combo[i] = Resultado.getString("Nomb_Tipo");
                  i++;
                }
                Resultado.close();
                
            } catch (SQLException e) {
                
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            return Combo;  
         }
      
   
   
      public String numRadicado (){           
          String anterior_radicado = "";
          Calendar fecha = new GregorianCalendar();
          int xxx = 0;
          
          String anio = String.valueOf(fecha.get(Calendar.YEAR));
          String mes = String.valueOf(fecha.get(Calendar.MONTH)+1);              
          
          if(mes.length() == 1){
              mes="0"+mes;
          }
        
        String sql = "SELECT max(Nume_Radi_Entr) as radicado FROM correspondencia_entrada;";                        
                
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(sql);
            ResultSet Resultado = pstm.executeQuery();
            Resultado.next();
            anterior_radicado = String.valueOf(Resultado.getInt("radicado"));                           
            Resultado.close();                                 
               
            String mes_anterior = anterior_radicado.substring(2, 4);            
            
   
            
            if(!mes_anterior.equals(mes)){
                anterior_radicado = anio.substring(2, 4)+mes+"0001";
                
              
                
            }else{
        
                
                xxx = Integer.parseInt(anterior_radicado.substring(5, 8));            
                ++xxx;  
                String consecutivo = String.valueOf(xxx); 
                                                            
                int longitud = consecutivo.length();
               
                if (consecutivo.length() == 4){
                     consecutivo = String.valueOf(xxx);
                }
                if(longitud == 1){
                     consecutivo = "000"+String.valueOf(xxx);                                           
                }
                if(longitud == 2){
                         consecutivo = "00"+ xxx;
                }
                if(longitud == 3){
                         consecutivo = "0"+ xxx;
                }                                                  
           
                anterior_radicado = anio.substring(2)+mes+consecutivo;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
           return anterior_radicado;
      }
      
//         public String[] LlenarComboBoxa(){
//          String SQL = "Select Nomb_tipo from tipos_de_documentos;";
//          int i = 0;
//          try {
//                PreparedStatement Sentencia = this.getConexion().prepareStatement(SQL);
//                ResultSet Resultado = Sentencia.executeQuery();
//                while(Resultado.next()){
//                  i++;
//                }               
//          } catch (SQLException e) {
//                JOptionPane.showMessageDialog(null, e.getMessage());
//          }
//          
//          String[] Combo = new String[i];
//            
//          SQL = "Select Nomb_tipo From  tipos_de_documentos order by Nomb_tipo;";
//            
//            try {
//                PreparedStatement Sentencia = this.getConexion().prepareStatement(SQL);
//                ResultSet Resultado = Sentencia.executeQuery();
//                i = 0;
//                while(Resultado.next()){
//                  Combo[i] = Resultado.getString("Nomb_tipo");                  
//                  i++;
//                }
//                Resultado.close();
//            } catch (SQLException e) {
//                JOptionPane.showMessageDialog(null, e.getMessage());
//            }
//            return Combo;  
//     }
     
           public String retornarCodigo (String nombre) {                
                String sql = "SELECT codi_tipo FROM tipos_de_documentos WHERE Nomb_tipo='"+ nombre +"';";
                String codigo="";
                
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(sql);
            ResultSet Resultado = pstm.executeQuery();
            Resultado.next();            
            codigo = Resultado.getString("codi_tipo");
            Resultado.close();
            return codigo;
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            return codigo;
        }
        
    }

    

          }

    
      

  
    

