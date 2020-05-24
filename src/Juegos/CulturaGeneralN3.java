package Juegos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class CulturaGeneralN3 extends javax.swing.JFrame {

    Timer tiempo;
    public int segundos = 60;
    public  JInternalPerdio perdio = new JInternalPerdio();
    public CulturaGeneralN3() {
        tiempo = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (segundos > 0) {
                    segundos--;
                    jLabelTIEMPO.setText(" "+segundos);
                    
                }
                if(segundos==0){
                  jDesktopPane.add(perdio);
                  perdio.setVisible(true);
                  tiempo.stop();
                  opor();
                }

            }
        });

        tiempo.start();
        initComponents();
        JInternalInfor info = new JInternalInfor();
        jDesktopPane.add(info);
        info.setVisible(true);

        CulturaGeneralN1 v = new CulturaGeneralN1();

        ImageIcon icono = new ImageIcon("src/images/mundo rojo.jpg");
        setIconImage(icono.getImage());
        setLocationRelativeTo(null);

        //Ocultamos las demás preguntas
        jLabeln2.setVisible(false);
        jLabel4N2.setVisible(false);
        jLabel5N2.setVisible(false);
        jLabel6N2.setVisible(false);

        jTextFieldTerceraN3.setVisible(false);
        jTextFieldQuintaN3.setVisible(false);

        jRadioButtonHEMEROTECA.setVisible(false);
        jRadioButtonPANOPLIA.setVisible(false);
        jRadioButtonFONOTECA.setVisible(false);

        jRadioButtonHIROSHIMA.setVisible(false);
        jRadioButtonNAGASAKI.setVisible(false);
        jRadioButtonTOKIO.setVisible(false);

        jButtonCalificar2N3.setVisible(false);
        jButtonCalificar3N3.setVisible(false);
        jButtonCalificar4N3.setVisible(false);
        jButtonCalificar5N3.setVisible(false);

        jLabelVidaN2.setText("" + v.vida);

    }
    
    public CulturaGeneralN1 ventana = new CulturaGeneralN1();
    
    public void opor() {
        if (ventana.vida == 0) {
            jDesktopPane.add(perdio);
            perdio.setVisible(true);

            //Ocultamos las demás preguntas
            jLabelN2.setVisible(false);
            jLabeln2.setVisible(false);
            jLabel4N2.setVisible(false);
            jLabel5N2.setVisible(false);
            jLabel6N2.setVisible(false);

            jTextFieldPrimeraN3.setVisible(false);
            jTextFieldTerceraN3.setVisible(false);
            jTextFieldQuintaN3.setVisible(false);

            jRadioButtonHEMEROTECA.setVisible(false);
            jRadioButtonPANOPLIA.setVisible(false);
            jRadioButtonFONOTECA.setVisible(false);

            jRadioButtonHIROSHIMA.setVisible(false);
            jRadioButtonNAGASAKI.setVisible(false);
            jRadioButtonTOKIO.setVisible(false);

            jButtonCalificar1N3.setVisible(false);
            jButtonCalificar2N3.setVisible(false);
            jButtonCalificar3N3.setVisible(false);
            jButtonCalificar4N3.setVisible(false);
            jButtonCalificar5N3.setVisible(false);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupOCEANO = new javax.swing.ButtonGroup();
        buttonGroupREINO = new javax.swing.ButtonGroup();
        jPanelInstrucciones = new javax.swing.JPanel();
        jButtonInstrucc = new javax.swing.JButton();
        jLabelVida = new javax.swing.JLabel();
        jLabelVidaN2 = new javax.swing.JLabel();
        jDesktopPane = new javax.swing.JDesktopPane();
        jTextFieldPrimeraN3 = new javax.swing.JTextField();
        jButtonCalificar1N3 = new javax.swing.JButton();
        jLabeln2 = new javax.swing.JLabel();
        jRadioButtonHEMEROTECA = new javax.swing.JRadioButton();
        jRadioButtonPANOPLIA = new javax.swing.JRadioButton();
        jRadioButtonFONOTECA = new javax.swing.JRadioButton();
        jButtonCalificar2N3 = new javax.swing.JButton();
        jLabel4N2 = new javax.swing.JLabel();
        jTextFieldTerceraN3 = new javax.swing.JTextField();
        jButtonCalificar3N3 = new javax.swing.JButton();
        jLabel5N2 = new javax.swing.JLabel();
        jRadioButtonHIROSHIMA = new javax.swing.JRadioButton();
        jRadioButtonNAGASAKI = new javax.swing.JRadioButton();
        jRadioButtonTOKIO = new javax.swing.JRadioButton();
        jButtonCalificar4N3 = new javax.swing.JButton();
        jLabel6N2 = new javax.swing.JLabel();
        jTextFieldQuintaN3 = new javax.swing.JTextField();
        jButtonCalificar5N3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelTIEMPO = new javax.swing.JLabel();
        jLabelN2 = new javax.swing.JLabel();
        jLabelTITLE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelInstrucciones.setBackground(new java.awt.Color(0, 204, 102));
        jPanelInstrucciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonInstrucc.setText("Instrucciones");
        jButtonInstrucc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInstruccActionPerformed(evt);
            }
        });

        jLabelVida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/corazon_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanelInstruccionesLayout = new javax.swing.GroupLayout(jPanelInstrucciones);
        jPanelInstrucciones.setLayout(jPanelInstruccionesLayout);
        jPanelInstruccionesLayout.setHorizontalGroup(
            jPanelInstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInstruccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonInstrucc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelVida)
                .addGap(18, 18, 18)
                .addComponent(jLabelVidaN2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanelInstruccionesLayout.setVerticalGroup(
            jPanelInstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelVida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInstruccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonInstrucc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabelVidaN2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTextFieldPrimeraN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrimeraN3ActionPerformed(evt);
            }
        });

        jButtonCalificar1N3.setText("Calificar");
        jButtonCalificar1N3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalificar1N3ActionPerformed(evt);
            }
        });

        jLabeln2.setText("2. ¿Cómo se le llama a una colección de revistas, diarios y publicaciones periódicas?");

        buttonGroupOCEANO.add(jRadioButtonHEMEROTECA);
        jRadioButtonHEMEROTECA.setText(" Hemeroteca.");

        buttonGroupOCEANO.add(jRadioButtonPANOPLIA);
        jRadioButtonPANOPLIA.setText("Panoplia");

        buttonGroupOCEANO.add(jRadioButtonFONOTECA);
        jRadioButtonFONOTECA.setText("Fonoteca");

        jButtonCalificar2N3.setText("Calificar");
        jButtonCalificar2N3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalificar2N3ActionPerformed(evt);
            }
        });

        jLabel4N2.setText("3. ¿Cómo se llama la energía contenida en el núcleo de los átomos?");

        jTextFieldTerceraN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTerceraN3ActionPerformed(evt);
            }
        });

        jButtonCalificar3N3.setText("Calificar");
        jButtonCalificar3N3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalificar3N3ActionPerformed(evt);
            }
        });

        jLabel5N2.setText("4. ¿En qué país se usó la primera bomba atómica en combate?");

        buttonGroupREINO.add(jRadioButtonHIROSHIMA);
        jRadioButtonHIROSHIMA.setText("Hiroshima");

        buttonGroupREINO.add(jRadioButtonNAGASAKI);
        jRadioButtonNAGASAKI.setText("Nagasaki");

        buttonGroupREINO.add(jRadioButtonTOKIO);
        jRadioButtonTOKIO.setText("Tokio");

        jButtonCalificar4N3.setText("Calificar");
        jButtonCalificar4N3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalificar4N3ActionPerformed(evt);
            }
        });

        jLabel6N2.setText("5.¿Cuál es el metal más caro del mundo?");

        jButtonCalificar5N3.setText("Calificar");
        jButtonCalificar5N3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalificar5N3ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/relojArena.gif"))); // NOI18N

        jLabel2.setText("TIEMPO");

        jLabelTIEMPO.setText("00");

        jLabelN2.setText("1. ¿Cómo se llama el animal más rápido del mundo?");

        jLabelTITLE.setText("NIVEL 3");

        jDesktopPane.setLayer(jTextFieldPrimeraN3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jButtonCalificar1N3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLabeln2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jRadioButtonHEMEROTECA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jRadioButtonPANOPLIA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jRadioButtonFONOTECA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jButtonCalificar2N3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLabel4N2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jTextFieldTerceraN3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jButtonCalificar3N3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLabel5N2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jRadioButtonHIROSHIMA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jRadioButtonNAGASAKI, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jRadioButtonTOKIO, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jButtonCalificar4N3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLabel6N2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jTextFieldQuintaN3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jButtonCalificar5N3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLabelTIEMPO, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLabelN2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLabelTITLE, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(jLabelTITLE))
                            .addComponent(jLabelN2)
                            .addComponent(jLabeln2)
                            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jRadioButtonHEMEROTECA)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonPANOPLIA)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonFONOTECA)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCalificar2N3))
                            .addComponent(jLabel4N2)
                            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jTextFieldTerceraN3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCalificar3N3))
                            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jRadioButtonHIROSHIMA)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonNAGASAKI)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonTOKIO)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCalificar4N3))
                            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jTextFieldQuintaN3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCalificar5N3))
                            .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jDesktopPaneLayout.createSequentialGroup()
                                    .addComponent(jLabel6N2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPaneLayout.createSequentialGroup()
                                    .addComponent(jLabel5N2)
                                    .addGap(126, 126, 126)))))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jTextFieldPrimeraN3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCalificar1N3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPaneLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPaneLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPaneLayout.createSequentialGroup()
                        .addComponent(jLabelTIEMPO)
                        .addGap(142, 142, 142))))
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTIEMPO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTITLE)
                .addGap(18, 18, 18)
                .addComponent(jLabelN2)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addComponent(jTextFieldPrimeraN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jLabeln2)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonHEMEROTECA)
                            .addComponent(jRadioButtonPANOPLIA)
                            .addComponent(jRadioButtonFONOTECA)
                            .addComponent(jButtonCalificar2N3))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4N2)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTerceraN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCalificar3N3))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5N2)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonHIROSHIMA)
                            .addComponent(jRadioButtonNAGASAKI)
                            .addComponent(jRadioButtonTOKIO)
                            .addComponent(jButtonCalificar4N3))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6N2)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldQuintaN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCalificar5N3))
                        .addGap(49, 49, 49))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addComponent(jButtonCalificar1N3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInstrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPrimeraN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrimeraN3ActionPerformed

    }//GEN-LAST:event_jTextFieldPrimeraN3ActionPerformed

    private void jButtonInstruccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInstruccActionPerformed
        JInternalInstrucciones instruc = new JInternalInstrucciones();
        jDesktopPane.add(instruc);
        instruc.setVisible(true);
    }//GEN-LAST:event_jButtonInstruccActionPerformed

    private void jButtonCalificar1N3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalificar1N3ActionPerformed

        String rep1 = new String(jTextFieldPrimeraN3.getText());

        if (rep1.equals("Guepardo")) {
            JOptionPane.showMessageDialog(null, "Congratulations");

            //Mostramos la segunda pregunta si es acerta
            jLabeln2.setVisible(true);
            jRadioButtonHEMEROTECA.setVisible(true);
            jRadioButtonPANOPLIA.setVisible(true);
            jRadioButtonFONOTECA.setVisible(true);

            jButtonCalificar2N3.setVisible(true);

            //Ocultamos las opciones que ya aceto
            jLabelN2.setEnabled(false);
            jTextFieldPrimeraN3.setEnabled(false);

            jButtonCalificar1N3.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(null, "Revise su respuesta");
            ventana.vida--;
            jLabelVidaN2.setText("" + ventana.vida);
            opor();

        }


    }//GEN-LAST:event_jButtonCalificar1N3ActionPerformed

    private void jButtonCalificar2N3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalificar2N3ActionPerformed

        if (jRadioButtonHEMEROTECA.isSelected()) {
            JOptionPane.showMessageDialog(null, "Congratulations");

            //Ocultamos las opciones que ya aceto
            jLabeln2.setEnabled(false);
            jRadioButtonHEMEROTECA.setEnabled(false);
            jRadioButtonPANOPLIA.setEnabled(false);
            jRadioButtonFONOTECA.setEnabled(false);

            jButtonCalificar2N3.setEnabled(false);

            //Mostramos las opciones de la otra pregunta
            jLabel4N2.setVisible(true);
            jTextFieldTerceraN3.setVisible(true);
            jButtonCalificar3N3.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Revise su respuesta");
            ventana.vida--;
            jLabelVidaN2.setText("" + ventana.vida);
            opor();
        }
    }//GEN-LAST:event_jButtonCalificar2N3ActionPerformed

    private void jTextFieldTerceraN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTerceraN3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTerceraN3ActionPerformed

    private void jButtonCalificar3N3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalificar3N3ActionPerformed
        String rep3 = new String(jTextFieldTerceraN3.getText());

        if (rep3.equals("Energía nuclear")) {
            JOptionPane.showMessageDialog(null, "Congratulations");
            //Ocultamos las opciones de la pregunta

            jLabel4N2.setEnabled(false);
            jTextFieldTerceraN3.setEnabled(false);
            jButtonCalificar3N3.setEnabled(false);

            //Mostramos las respuestas de la otra pregunta
            jLabel5N2.setVisible(true);
            jRadioButtonHIROSHIMA.setVisible(true);
            jRadioButtonNAGASAKI.setVisible(true);
            jRadioButtonTOKIO.setVisible(true);
            jButtonCalificar4N3.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Revise su respuesta");
            ventana.vida--;
            jLabelVidaN2.setText("" + ventana.vida);
            opor();
        }
    }//GEN-LAST:event_jButtonCalificar3N3ActionPerformed

    private void jButtonCalificar4N3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalificar4N3ActionPerformed

        if (jRadioButtonHIROSHIMA.isSelected()) {
            JOptionPane.showMessageDialog(null, "Congratulations");

            //Ocultamos las opciones de esta pregunta
            jLabel5N2.setEnabled(false);
            jRadioButtonHIROSHIMA.setEnabled(false);
            jRadioButtonNAGASAKI.setEnabled(false);
            jRadioButtonTOKIO.setEnabled(false);
            jButtonCalificar4N3.setEnabled(false);

            //Mostramos las opciones de la otra pregunta
            jLabel6N2.setVisible(true);
            jTextFieldQuintaN3.setVisible(true);
            jButtonCalificar5N3.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Revise su respuesta");
            ventana.vida--;
            jLabelVidaN2.setText("" + ventana.vida);
            opor();
        }


    }//GEN-LAST:event_jButtonCalificar4N3ActionPerformed

    private void jButtonCalificar5N3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalificar5N3ActionPerformed
        String rep5 = new String(jTextFieldQuintaN3.getText());
        if (rep5.equals("el rodio") || rep5.equals("Rodio") || rep5.equals("rodio")) {
            JOptionPane.showMessageDialog(null, "Congratulations");
            tiempo.stop();
            JInternalGanar ganar = new JInternalGanar();
            jDesktopPane.add(ganar);
            ganar.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Revise su respuesta");
            ventana.vida--;
            jLabelVidaN2.setText("" + ventana.vida);
            opor();
        }


    }//GEN-LAST:event_jButtonCalificar5N3ActionPerformed

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
            java.util.logging.Logger.getLogger(CulturaGeneralN3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CulturaGeneralN3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CulturaGeneralN3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CulturaGeneralN3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CulturaGeneralN3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupOCEANO;
    private javax.swing.ButtonGroup buttonGroupREINO;
    private javax.swing.JButton jButtonCalificar1N3;
    private javax.swing.JButton jButtonCalificar2N3;
    private javax.swing.JButton jButtonCalificar3N3;
    private javax.swing.JButton jButtonCalificar4N3;
    private javax.swing.JButton jButtonCalificar5N3;
    private javax.swing.JButton jButtonInstrucc;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4N2;
    private javax.swing.JLabel jLabel5N2;
    private javax.swing.JLabel jLabel6N2;
    private javax.swing.JLabel jLabelN2;
    private javax.swing.JLabel jLabelTIEMPO;
    private javax.swing.JLabel jLabelTITLE;
    private javax.swing.JLabel jLabelVida;
    private javax.swing.JLabel jLabelVidaN2;
    private javax.swing.JLabel jLabeln2;
    private javax.swing.JPanel jPanelInstrucciones;
    private javax.swing.JRadioButton jRadioButtonFONOTECA;
    private javax.swing.JRadioButton jRadioButtonHEMEROTECA;
    private javax.swing.JRadioButton jRadioButtonHIROSHIMA;
    private javax.swing.JRadioButton jRadioButtonNAGASAKI;
    private javax.swing.JRadioButton jRadioButtonPANOPLIA;
    private javax.swing.JRadioButton jRadioButtonTOKIO;
    private javax.swing.JTextField jTextFieldPrimeraN3;
    private javax.swing.JTextField jTextFieldQuintaN3;
    private javax.swing.JTextField jTextFieldTerceraN3;
    // End of variables declaration//GEN-END:variables
}
