/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Frame;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Giovani B...
 */
public class FrmRegistrar extends javax.swing.JFrame{
      

    /**
     * Creates new form FmrProductos
     * @param parent
     */
   
    
         public FrmRegistrar() {              
              initComponents();
              setLocationRelativeTo(this);
              asignarFecha();
              this.JtexaRadicado.setEnabled(false);
              this.jDcFechaRecib.getDateEditor().setEnabled(false);                                                                  
//            this.jDcFechaElab.getDateEditor().setEnabled(false);
//            this.jDateChooser2.setEnabled(false);
              this.JBCAgregar.setEnabled(false);
              jDcFechaRecib.setEnabled(false);
      
                jDcFechaElab.setEnabled(false);
    
      
              
         }
           public static void DeshablitarMenu() {
   
        JBCRadicado.setEnabled(true);
    }

  public void deshabilitarControles(){
              this.JtexaRadicado.setEnabled(false);
              this.jDcFechaRecib.getDateEditor().setEnabled(false);                                                                  
//            this.VtnRegistro.jDcFechaElab.getDateEditor().setEnabled(false);
//            this.VtnRegistro.jDateChooser2.setEnabled(false);
              this.JBCAgregar.setEnabled(false);
              this.JBCRadicado.setEnabled(false);
              jDcFechaRecib.setEnabled(true);
      
                jDcFechaElab.setEnabled(true);
        
        
              
           
    }
     public void habilitarControles(){
              this.JtexaRadicado.setEnabled(true);
              this.jDcFechaRecib.getDateEditor().setEnabled(true); 
//            this.VtnRegistro.jDcFechaElab.getDateEditor().setEnabled(false);
//            this.VtnRegistro.jDateChooser2.setEnabled(false);
              this.JBCAgregar.setEnabled(true);
                 this.JBCRadicado.setEnabled(true);
            jDcFechaRecib.setEnabled(false);
      
                jDcFechaElab.setEnabled(false);
    }
               
    public void Hablitar() {
       this.JBCAgregar.setEnabled(false);      
    }
       
   
    

     
      
          
      
         private void asignarFecha(){
            Calendar fecha = new GregorianCalendar();
            
            String hoy = "";
            System.out.println(fecha.get(Calendar.MONTH));
            int año = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH)+1;
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
            int hora = fecha.get(Calendar.HOUR_OF_DAY);
            int minuto = fecha.get(Calendar.MINUTE);
            int segundo = fecha.get(Calendar.SECOND);
            hoy = dia+"/"+mes+"/"+año+" "+hora+":"+minuto+":"+segundo; 
            
//             JOptionPane.showMessageDialog(rootPane, hoy);
             
             try{   
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    Date fechaDate = new Date();
                    fechaDate = formato.parse(hoy);              
                    
                                                          
                    this.jDcFechaRecib.setDate(fechaDate);
                    jDcFechaRecib.getDateEditor().setEnabled(false);
                    this.jDcFechaElab.setDate(fechaDate);
                    jDcFechaElab.getDateEditor().setEnabled(false);
      
                 


                    
                 
             }catch (ParseException ex){
             Logger.getLogger(FrmRegistrar.class.getName()).log(Level.SEVERE,null, ex);
         }
         } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JLUsuario = new javax.swing.JLabel();
        JBCAgregar = new javax.swing.JButton();
        JtexaRadicado = new javax.swing.JTextField();
        JLUsuario1 = new javax.swing.JLabel();
        JLUsuario2 = new javax.swing.JLabel();
        JLUsuario3 = new javax.swing.JLabel();
        JLUsuario5 = new javax.swing.JLabel();
        jDcFechaRecib = new com.toedter.calendar.JDateChooser();
        jDcFechaElab = new com.toedter.calendar.JDateChooser();
        jTexRemitente = new javax.swing.JTextField();
        JBCRadicado = new javax.swing.JButton();
        JLUsuario6 = new javax.swing.JLabel();
        jComboEstado = new javax.swing.JComboBox();
        JLUsuario7 = new javax.swing.JLabel();
        JLUsuario8 = new javax.swing.JLabel();
        JLUsuario9 = new javax.swing.JLabel();
        JLUsuario10 = new javax.swing.JLabel();
        JLUsuario11 = new javax.swing.JLabel();
        Asunto = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaRecibido = new javax.swing.JTextArea();
        jComboRespuesta = new javax.swing.JComboBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableUsuarios = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextObservacion = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextConsteado = new javax.swing.JTextArea();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Correspondencia de Entrada");
        setBackground(new java.awt.Color(0, 204, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JLUsuario.setText("NUMERO RADICADO ENTRADA:");

        JBCAgregar.setText("AGREGAR CORRESPONDENCIA");
        JBCAgregar.setEnabled(false);
        JBCAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCAgregarActionPerformed(evt);
            }
        });
        JBCAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JBCAgregarKeyTyped(evt);
            }
        });

        JtexaRadicado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtexaRadicadoActionPerformed(evt);
            }
        });
        JtexaRadicado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JtexaRadicadoFocusLost(evt);
            }
        });
        JtexaRadicado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtexaRadicadoKeyTyped(evt);
            }
        });

        JLUsuario1.setText("FECHA RECIBIDO:");

        JLUsuario2.setText("FECHA ELABORACIÓN:");

        JLUsuario3.setText("OBSERVACION:");

        JLUsuario5.setText("TIPO DOCUMENTO:");

        jDcFechaRecib.setDateFormatString("dd/MM/yyyy HH:mm:ss");
        jDcFechaRecib.setEnabled(false);
        jDcFechaRecib.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDcFechaRecibFocusLost(evt);
            }
        });
        jDcFechaRecib.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDcFechaRecibPropertyChange(evt);
            }
        });
        jDcFechaRecib.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDcFechaRecibKeyTyped(evt);
            }
        });

        jDcFechaElab.setEnabled(false);
        jDcFechaElab.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDcFechaElabFocusLost(evt);
            }
        });
        jDcFechaElab.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDcFechaElabPropertyChange(evt);
            }
        });
        jDcFechaElab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDcFechaElabKeyTyped(evt);
            }
        });
        jDcFechaElab.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jDcFechaElabVetoableChange(evt);
            }
        });

        jTexRemitente.setEnabled(false);
        jTexRemitente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexRemitenteActionPerformed(evt);
            }
        });
        jTexRemitente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTexRemitenteFocusLost(evt);
            }
        });
        jTexRemitente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTexRemitenteKeyTyped(evt);
            }
        });

        JBCRadicado.setText("NUEVO RADICADO");
        JBCRadicado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCRadicadoActionPerformed(evt);
            }
        });
        JBCRadicado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JBCRadicadoKeyTyped(evt);
            }
        });

        JLUsuario6.setText("RESPUESTA:");

        jComboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "No Activo" }));
        jComboEstado.setEnabled(false);
        jComboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboEstadoActionPerformed(evt);
            }
        });

        JLUsuario7.setText("ESTADO:");

        JLUsuario8.setText("CONTESTADO:");

        JLUsuario9.setText("DOCUMENTOS RECIBIDOS:");

        JLUsuario10.setText("REMITENTE:");

        JLUsuario11.setText("ASUNTO:");

        Asunto.setEnabled(false);
        Asunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsuntoActionPerformed(evt);
            }
        });
        Asunto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                AsuntoFocusLost(evt);
            }
        });
        Asunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AsuntoKeyTyped(evt);
            }
        });

        jComboBox1.setEnabled(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextAreaRecibido.setColumns(20);
        jTextAreaRecibido.setRows(5);
        jTextAreaRecibido.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaRecibido);

        jComboRespuesta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        jComboRespuesta.setEnabled(false);
        jComboRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboRespuestaActionPerformed(evt);
            }
        });

        TableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableUsuarios.setEnabled(false);
        jScrollPane4.setViewportView(TableUsuarios);

        jTextObservacion.setColumns(20);
        jTextObservacion.setRows(5);
        jTextObservacion.setEnabled(false);
        jTextObservacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextObservacionKeyTyped(evt);
            }
        });
        jScrollPane5.setViewportView(jTextObservacion);

        jTextConsteado.setColumns(20);
        jTextConsteado.setRows(5);
        jTextConsteado.setEnabled(false);
        jTextConsteado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextConsteadoFocusLost(evt);
            }
        });
        jTextConsteado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextConsteadoKeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(jTextConsteado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLUsuario7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                                .addGap(30, 30, 30))
                            .addComponent(jComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLUsuario11, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLUsuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLUsuario6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Asunto, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JLUsuario10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(jTexRemitente, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JLUsuario8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JLUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JLUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JtexaRadicado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jDcFechaRecib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(71, 71, 71)
                                        .addComponent(JLUsuario2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jDcFechaElab, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLUsuario9, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBCRadicado, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(JBCAgregar)
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLUsuario)
                    .addComponent(JtexaRadicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLUsuario2)
                            .addComponent(jDcFechaRecib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDcFechaElab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLUsuario1)
                        .addGap(23, 23, 23)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLUsuario3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLUsuario11)
                        .addComponent(Asunto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLUsuario10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTexRemitente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLUsuario5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLUsuario7)
                            .addComponent(jComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLUsuario6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLUsuario9)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLUsuario8)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(125, 125, 125)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBCAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCRadicado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCAgregarActionPerformed
        // TODO add your handling code here:
                jTextObservacion.setEnabled(false);
                jComboRespuesta.setEnabled(false);
                jComboEstado.setEnabled(false);
                jDcFechaRecib.setEnabled(false);
      
                jDcFechaElab.setEnabled(false);
                jTexRemitente.setEnabled(false);
                jTextConsteado.setEnabled(false);
                jComboBox1.setEnabled(false);
                Asunto.setEnabled(false);
                jTextAreaRecibido.setEnabled(false);
                JBCAgregar.setEnabled(false);
                JBCRadicado.setEnabled(false);
       
            
              this.habilitarControles();
         
        
      
           
    }//GEN-LAST:event_JBCAgregarActionPerformed

    
    

    private void JtexaRadicadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtexaRadicadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtexaRadicadoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    
    }//GEN-LAST:event_formWindowOpened

    private void jTexRemitenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexRemitenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexRemitenteActionPerformed

    private void jTexRemitenteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTexRemitenteFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexRemitenteFocusLost

    private void jTexRemitenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTexRemitenteKeyTyped
        // TODO add your handling code here:
               char caracter = evt.getKeyChar();
        if(caracter < '0' || caracter > '9') evt.consume(); 
        
        String cadena = jTexRemitente.getText();
        if(cadena.length() >=10)evt.consume();
    }//GEN-LAST:event_jTexRemitenteKeyTyped

    private void JtexaRadicadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtexaRadicadoKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if(caracter < '0' || caracter > '9') evt.consume(); 
        
        String cadena = JtexaRadicado.getText();
        if(cadena.length() >=0)evt.consume();
    }//GEN-LAST:event_JtexaRadicadoKeyTyped

    private void JBCRadicadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCRadicadoActionPerformed
        // TODO add your handling code here: FrmRegistrar.JBCAgregar.setEnabled(false);
                    jTextObservacion.setEnabled(true);
                    jComboRespuesta.setEnabled(true);
                    jComboEstado.setEnabled(true);
            
                    jTexRemitente.setEnabled(true);
                    jTextConsteado.setEnabled(true);
                    jComboBox1.setEnabled(true);
                    Asunto.setEnabled(true);
                    jTextAreaRecibido.setEnabled(true);
                    JBCAgregar.setEnabled(true);
                    JBCRadicado.setEnabled(true);
                    jTextObservacion.requestFocus(true);
               this.deshabilitarControles();
 
      
        
    }//GEN-LAST:event_JBCRadicadoActionPerformed

    private void jComboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboEstadoActionPerformed

    private void AsuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AsuntoActionPerformed

    private void AsuntoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AsuntoFocusLost
        // TODO add your handling code here:
        if( Asunto.getText().equals("")){


        JOptionPane.showMessageDialog(null, "Campo Obligatorio");

        }else{
 
}
    }//GEN-LAST:event_AsuntoFocusLost

    private void AsuntoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AsuntoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_AsuntoKeyTyped

    private void jDcFechaRecibKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDcFechaRecibKeyTyped
        // TODO add your handling code here:
                 char caracter = evt.getKeyChar();
        if(caracter < '0' || caracter > '9') evt.consume(); 
        
        String cadena = jDcFechaRecib.getDateFormatString();
        if(cadena.length() >=0)evt.consume();
        
    }//GEN-LAST:event_jDcFechaRecibKeyTyped

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboRespuestaActionPerformed

    private void jTextConsteadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextConsteadoFocusLost
     
            if( jTextConsteado.getText().equals("")){


            JOptionPane.showMessageDialog(null, "Campo Obligatorio");

            }else{
 
}
    }//GEN-LAST:event_jTextConsteadoFocusLost

    private void JtexaRadicadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtexaRadicadoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_JtexaRadicadoFocusLost

    private void jDcFechaRecibFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDcFechaRecibFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jDcFechaRecibFocusLost

    private void jTextObservacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextObservacionKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextObservacionKeyTyped

    private void jDcFechaElabVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jDcFechaElabVetoableChange
        // TODO add your handling code here:



      
    }//GEN-LAST:event_jDcFechaElabVetoableChange

    private void jDcFechaElabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDcFechaElabKeyTyped
        // TODO add your handling code here:
     

    }//GEN-LAST:event_jDcFechaElabKeyTyped

    private void jDcFechaElabFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDcFechaElabFocusLost
        // TODO add your handling  code here:
//         Date fecha1,fecha2;
//        fecha1 = jDateChooser1.getDate();
//        fecha2 = jDateChooser2.getDate();
//        if (fecha2.before(fecha1)){
//            System.out.println("fechas iguales");
//        }   else {
//            System.out.println("nasa");
//        }   
    }//GEN-LAST:event_jDcFechaElabFocusLost

    private void JBCRadicadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBCRadicadoKeyTyped
        // TODO add your handling code here:
   
    }//GEN-LAST:event_JBCRadicadoKeyTyped

    private void JBCAgregarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBCAgregarKeyTyped
        // TODO add your handling code here:
       
           this.JBCAgregar.setEnabled(true);
        
     
    }//GEN-LAST:event_JBCAgregarKeyTyped

    private void jTextConsteadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextConsteadoKeyPressed
        // TODO add your handling code here:
        String cadena = jTextConsteado.getText();
        if(cadena.length() > 0){
        this.JBCAgregar.setEnabled(true);
        }
    }//GEN-LAST:event_jTextConsteadoKeyPressed

    private void jDcFechaElabPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDcFechaElabPropertyChange
        // TODO add your handling code here:
        ((JTextField)this.jDcFechaElab.getDateEditor().getUiComponent()).setEditable(false);
    }//GEN-LAST:event_jDcFechaElabPropertyChange

    private void jDcFechaRecibPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDcFechaRecibPropertyChange
        // TODO add your handling code here:
         ((JTextField)this.jDcFechaRecib.getDateEditor().getUiComponent()).setEditable(false);
    }//GEN-LAST:event_jDcFechaRecibPropertyChange

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
            java.util.logging.Logger.getLogger(FrmRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmRegistrar dialog = new FrmRegistrar();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Asunto;
    public static javax.swing.JButton JBCAgregar;
    public static javax.swing.JButton JBCRadicado;
    public javax.swing.JLabel JLUsuario;
    public javax.swing.JLabel JLUsuario1;
    public javax.swing.JLabel JLUsuario10;
    public javax.swing.JLabel JLUsuario11;
    public javax.swing.JLabel JLUsuario2;
    public javax.swing.JLabel JLUsuario3;
    public javax.swing.JLabel JLUsuario5;
    public javax.swing.JLabel JLUsuario6;
    public javax.swing.JLabel JLUsuario7;
    public javax.swing.JLabel JLUsuario8;
    public javax.swing.JLabel JLUsuario9;
    public javax.swing.JTextField JtexaRadicado;
    public javax.swing.JTable TableUsuarios;
    public javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox jComboBox1;
    public javax.swing.JComboBox jComboEstado;
    public javax.swing.JComboBox jComboRespuesta;
    public com.toedter.calendar.JDateChooser jDcFechaElab;
    public com.toedter.calendar.JDateChooser jDcFechaRecib;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextField jTexRemitente;
    public javax.swing.JTextArea jTextAreaRecibido;
    public javax.swing.JTextArea jTextConsteado;
    public javax.swing.JTextArea jTextObservacion;
    // End of variables declaration//GEN-END:variables

   
   
    }
