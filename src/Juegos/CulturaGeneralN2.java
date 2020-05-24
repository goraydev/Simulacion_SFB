package Juegos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CulturaGeneralN2 extends javax.swing.JFrame {

    public CulturaGeneralN2() {
        initComponents();

        CulturaGeneralN1 v = new CulturaGeneralN1();

        ImageIcon icono = new ImageIcon("src/images/mundo rojo.jpg");
        setIconImage(icono.getImage());
        setLocationRelativeTo(null);
        //Ocultamos las demás preguntas
        jLabeln2.setVisible(false);
        jLabel4N2.setVisible(false);
        jLabel5N2.setVisible(false);
        jLabel6N2.setVisible(false);

        jTextFieldTerceraN2.setVisible(false);
        jTextFieldQuintaN2.setVisible(false);

        jRadioButtonPACIFICO.setVisible(false);
        jRadioButtonATLAN.setVisible(false);
        jRadioButtonINDICO.setVisible(false);

        jRadioButtonEURO.setVisible(false);
        jRadioButtonLIBRA.setVisible(false);
        jRadioButtonLUBRAINGLESA.setVisible(false);

        jButtonCalificar2N2.setVisible(false);
        jButtonCalificar3N2.setVisible(false);
        jButtonCalificar4N2.setVisible(false);
        jButtonCalificar5N2.setVisible(false);

        jButtonPista2N2.setEnabled(false);
        jButtonPista3N2.setEnabled(false);
        jButtonPista4N2.setEnabled(false);
        jButtonPista5N2.setEnabled(false);
        jButtonPASARN2.setVisible(false);

        jLabelVidaN2.setText("" + v.vida);

    }

    public CulturaGeneralN1 ventana = new CulturaGeneralN1();

    public void opor() {
        if (ventana.vida == 0) {
            JInternalPerdio perdio = new JInternalPerdio();
            jDesktopPane.add(perdio);
            perdio.setVisible(true);

            //Ocultamos las demás preguntas
            jLabelN2.setVisible(false);
            jLabeln2.setVisible(false);
            jLabel4N2.setVisible(false);
            jLabel5N2.setVisible(false);
            jLabel6N2.setVisible(false);

            jTextFieldPrimeraN2.setVisible(false);
            jTextFieldTerceraN2.setVisible(false);
            jTextFieldQuintaN2.setVisible(false);

            jRadioButtonPACIFICO.setVisible(false);
            jRadioButtonATLAN.setVisible(false);
            jRadioButtonINDICO.setVisible(false);

            jRadioButtonEURO.setVisible(false);
            jRadioButtonLIBRA.setVisible(false);
            jRadioButtonLUBRAINGLESA.setVisible(false);

            jButtonCalificar1N2.setVisible(false);
            jButtonCalificar2N2.setVisible(false);
            jButtonCalificar3N2.setVisible(false);
            jButtonCalificar4N2.setVisible(false);
            jButtonCalificar5N2.setVisible(false);

            jButtonPista1N2.setEnabled(false);
            jButtonPista2N2.setEnabled(false);
            jButtonPista3N2.setEnabled(false);
            jButtonPista4N2.setEnabled(false);
            jButtonPista5N2.setEnabled(false);

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
        jButtonPASARN2 = new javax.swing.JButton();
        jDesktopPane = new javax.swing.JDesktopPane();
        jLabelTITLE = new javax.swing.JLabel();
        jLabelN2 = new javax.swing.JLabel();
        jTextFieldPrimeraN2 = new javax.swing.JTextField();
        jPanelPistas = new javax.swing.JPanel();
        jButtonPista1N2 = new javax.swing.JButton();
        jButtonPista2N2 = new javax.swing.JButton();
        jButtonPista3N2 = new javax.swing.JButton();
        jButtonPista4N2 = new javax.swing.JButton();
        jButtonPista5N2 = new javax.swing.JButton();
        jButtonCalificar1N2 = new javax.swing.JButton();
        jLabeln2 = new javax.swing.JLabel();
        jRadioButtonPACIFICO = new javax.swing.JRadioButton();
        jRadioButtonATLAN = new javax.swing.JRadioButton();
        jRadioButtonINDICO = new javax.swing.JRadioButton();
        jButtonCalificar2N2 = new javax.swing.JButton();
        jLabel4N2 = new javax.swing.JLabel();
        jTextFieldTerceraN2 = new javax.swing.JTextField();
        jButtonCalificar3N2 = new javax.swing.JButton();
        jLabel5N2 = new javax.swing.JLabel();
        jRadioButtonEURO = new javax.swing.JRadioButton();
        jRadioButtonLIBRA = new javax.swing.JRadioButton();
        jRadioButtonLUBRAINGLESA = new javax.swing.JRadioButton();
        jButtonCalificar4N2 = new javax.swing.JButton();
        jLabel6N2 = new javax.swing.JLabel();
        jTextFieldQuintaN2 = new javax.swing.JTextField();
        jButtonCalificar5N2 = new javax.swing.JButton();

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

        jButtonPASARN2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha.jpg"))); // NOI18N
        jButtonPASARN2.setText("Pasar al siguiente nivel");
        jButtonPASARN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPASARN2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInstruccionesLayout = new javax.swing.GroupLayout(jPanelInstrucciones);
        jPanelInstrucciones.setLayout(jPanelInstruccionesLayout);
        jPanelInstruccionesLayout.setHorizontalGroup(
            jPanelInstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInstruccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonInstrucc)
                .addGap(190, 190, 190)
                .addComponent(jButtonPASARN2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelVida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVidaN2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanelInstruccionesLayout.setVerticalGroup(
            jPanelInstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInstruccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelVida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelInstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonInstrucc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelVidaN2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInstruccionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPASARN2)
                .addGap(21, 21, 21))
        );

        jLabelTITLE.setText("NIVEL 2");

        jLabelN2.setText("1. ¿Quién pinto \"La última cena\" ?");

        jTextFieldPrimeraN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrimeraN2ActionPerformed(evt);
            }
        });

        jPanelPistas.setBackground(new java.awt.Color(0, 0, 0));
        jPanelPistas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonPista1N2.setText("Pista");
        jButtonPista1N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista1N2ActionPerformed(evt);
            }
        });

        jButtonPista2N2.setText("Pista");
        jButtonPista2N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista2N2ActionPerformed(evt);
            }
        });

        jButtonPista3N2.setText("Pista");
        jButtonPista3N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista3N2ActionPerformed(evt);
            }
        });

        jButtonPista4N2.setText("Pista");
        jButtonPista4N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista4N2ActionPerformed(evt);
            }
        });

        jButtonPista5N2.setText("Pista");
        jButtonPista5N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista5N2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPistasLayout = new javax.swing.GroupLayout(jPanelPistas);
        jPanelPistas.setLayout(jPanelPistasLayout);
        jPanelPistasLayout.setHorizontalGroup(
            jPanelPistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPistasLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanelPistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPista1N2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPista2N2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPista3N2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPista4N2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPista5N2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanelPistasLayout.setVerticalGroup(
            jPanelPistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPistasLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButtonPista1N2)
                .addGap(37, 37, 37)
                .addComponent(jButtonPista2N2)
                .addGap(57, 57, 57)
                .addComponent(jButtonPista3N2)
                .addGap(56, 56, 56)
                .addComponent(jButtonPista4N2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPista5N2)
                .addGap(52, 52, 52))
        );

        jButtonCalificar1N2.setText("Calificar");
        jButtonCalificar1N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalificar1N2ActionPerformed(evt);
            }
        });

        jLabeln2.setText("2. ¿Qué óceano es el más grande?");

        buttonGroupOCEANO.add(jRadioButtonPACIFICO);
        jRadioButtonPACIFICO.setText("Pacífico");

        buttonGroupOCEANO.add(jRadioButtonATLAN);
        jRadioButtonATLAN.setText("Átlantico");

        buttonGroupOCEANO.add(jRadioButtonINDICO);
        jRadioButtonINDICO.setText("Indíco");

        jButtonCalificar2N2.setText("Calificar");
        jButtonCalificar2N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalificar2N2ActionPerformed(evt);
            }
        });

        jLabel4N2.setText("3. Si 50 es el 100%, ¿cuánto es el 90%?");

        jTextFieldTerceraN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTerceraN2ActionPerformed(evt);
            }
        });

        jButtonCalificar3N2.setText("Calificar");
        jButtonCalificar3N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalificar3N2ActionPerformed(evt);
            }
        });

        jLabel5N2.setText("4. ¿Cuál es la moneda del Reino Unido?");

        buttonGroupREINO.add(jRadioButtonEURO);
        jRadioButtonEURO.setText("Euro");

        buttonGroupREINO.add(jRadioButtonLIBRA);
        jRadioButtonLIBRA.setText("Libra");

        buttonGroupREINO.add(jRadioButtonLUBRAINGLESA);
        jRadioButtonLUBRAINGLESA.setText("LIbra inglesa");

        jButtonCalificar4N2.setText("Calificar");
        jButtonCalificar4N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalificar4N2ActionPerformed(evt);
            }
        });

        jLabel6N2.setText("5.¿Cuál fue el primer metal que empleó el hombre?");

        jButtonCalificar5N2.setText("Calificar");
        jButtonCalificar5N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalificar5N2ActionPerformed(evt);
            }
        });

        jDesktopPane.setLayer(jLabelTITLE, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLabelN2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jTextFieldPrimeraN2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jPanelPistas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jButtonCalificar1N2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLabeln2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jRadioButtonPACIFICO, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jRadioButtonATLAN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jRadioButtonINDICO, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jButtonCalificar2N2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLabel4N2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jTextFieldTerceraN2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jButtonCalificar3N2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLabel5N2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jRadioButtonEURO, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jRadioButtonLIBRA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jRadioButtonLUBRAINGLESA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jButtonCalificar4N2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLabel6N2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jTextFieldQuintaN2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jButtonCalificar5N2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabelTITLE))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelN2))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jTextFieldPrimeraN2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCalificar1N2))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabeln2))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jRadioButtonPACIFICO)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonATLAN)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonINDICO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCalificar2N2))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4N2))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jTextFieldTerceraN2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCalificar3N2))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5N2))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButtonEURO)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonLIBRA)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonLUBRAINGLESA)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCalificar4N2))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6N2))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jTextFieldQuintaN2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCalificar5N2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 389, Short.MAX_VALUE)
                .addComponent(jPanelPistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTITLE)
                .addGap(18, 18, 18)
                .addComponent(jLabelN2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrimeraN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCalificar1N2))
                .addGap(18, 18, 18)
                .addComponent(jLabeln2)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonPACIFICO)
                    .addComponent(jRadioButtonATLAN)
                    .addComponent(jRadioButtonINDICO)
                    .addComponent(jButtonCalificar2N2))
                .addGap(29, 29, 29)
                .addComponent(jLabel4N2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTerceraN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCalificar3N2))
                .addGap(18, 18, 18)
                .addComponent(jLabel5N2)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonEURO)
                    .addComponent(jRadioButtonLIBRA)
                    .addComponent(jRadioButtonLUBRAINGLESA)
                    .addComponent(jButtonCalificar4N2))
                .addGap(33, 33, 33)
                .addComponent(jLabel6N2)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldQuintaN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCalificar5N2))
                .addContainerGap(9, Short.MAX_VALUE))
            .addComponent(jPanelPistas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jDesktopPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPrimeraN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrimeraN2ActionPerformed

    }//GEN-LAST:event_jTextFieldPrimeraN2ActionPerformed

    private void jButtonPista1N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista1N2ActionPerformed

        JInternalPista1N2 pista1 = new JInternalPista1N2();
        jDesktopPane.add(pista1);
        pista1.setVisible(true);
    }//GEN-LAST:event_jButtonPista1N2ActionPerformed

    private void jButtonInstruccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInstruccActionPerformed
        JInternalInstrucciones instruc = new JInternalInstrucciones();
        jDesktopPane.add(instruc);
        instruc.setVisible(true);
    }//GEN-LAST:event_jButtonInstruccActionPerformed

    private void jButtonCalificar1N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalificar1N2ActionPerformed

        String rep1 = new String(jTextFieldPrimeraN2.getText());

        if (rep1.equals("Leonardo Da Vinci")) {
            JOptionPane.showMessageDialog(null, "Congratulations");

            //Mostramos la segunda pregunta si es acerta
            jLabeln2.setVisible(true);
            jRadioButtonPACIFICO.setVisible(true);
            jRadioButtonATLAN.setVisible(true);
            jRadioButtonINDICO.setVisible(true);
            jButtonPista2N2.setEnabled(true);
            jButtonCalificar2N2.setVisible(true);

            //Ocultamos las opciones que ya aceto
            jLabelN2.setEnabled(false);
            jTextFieldPrimeraN2.setEnabled(false);
            jButtonPista1N2.setEnabled(false);
            jButtonCalificar1N2.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(null, "Revise su respuesta");
            ventana.vida--;
            jLabelVidaN2.setText("" + ventana.vida);
            opor();

        }

    }//GEN-LAST:event_jButtonCalificar1N2ActionPerformed

    private void jButtonCalificar2N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalificar2N2ActionPerformed

        if (jRadioButtonPACIFICO.isSelected()) {
            JOptionPane.showMessageDialog(null, "Congratulations");

            //Ocultamos las opciones que ya aceto
            jLabeln2.setEnabled(false);
            jRadioButtonPACIFICO.setEnabled(false);
            jRadioButtonATLAN.setEnabled(false);
            jRadioButtonINDICO.setEnabled(false);
            jButtonPista2N2.setEnabled(false);
            jButtonCalificar2N2.setEnabled(false);

            //Mostramos las opciones de la otra pregunta
            jLabel4N2.setVisible(true);
            jTextFieldTerceraN2.setVisible(true);
            jButtonCalificar3N2.setVisible(true);
            jButtonPista3N2.setEnabled(true);

        } else {
            JOptionPane.showMessageDialog(null, "Revise su respuesta");
            ventana.vida--;
            jLabelVidaN2.setText("" + ventana.vida);
            opor();
        }
    }//GEN-LAST:event_jButtonCalificar2N2ActionPerformed

    private void jButtonPista2N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista2N2ActionPerformed
        JInternalPista2N2 pista2 = new JInternalPista2N2();
        jDesktopPane.add(pista2);
        pista2.setVisible(true);
    }//GEN-LAST:event_jButtonPista2N2ActionPerformed

    private void jTextFieldTerceraN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTerceraN2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTerceraN2ActionPerformed

    private void jButtonCalificar3N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalificar3N2ActionPerformed
        int rep3 = Integer.parseInt(jTextFieldTerceraN2.getText());

        if (rep3 == 45) {
            JOptionPane.showMessageDialog(null, "Congratulations");
            //Ocultamos las opciones de la pregunta

            jLabel4N2.setEnabled(false);
            jTextFieldTerceraN2.setEnabled(false);
            jButtonCalificar3N2.setEnabled(false);
            jButtonPista3N2.setEnabled(false);

            //Mostramos las respuestas de la otra pregunta
            jLabel5N2.setVisible(true);
            jRadioButtonEURO.setVisible(true);
            jRadioButtonLIBRA.setVisible(true);
            jRadioButtonLUBRAINGLESA.setVisible(true);
            jButtonCalificar4N2.setVisible(true);
            jButtonPista4N2.setEnabled(true);

        } else {
            JOptionPane.showMessageDialog(null, "Revise su respuesta");
            ventana.vida--;
            jLabelVidaN2.setText("" + ventana.vida);
            opor();
        }
    }//GEN-LAST:event_jButtonCalificar3N2ActionPerformed

    private void jButtonPista3N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista3N2ActionPerformed

        JInternalPista3N2 pista3 = new JInternalPista3N2();
        jDesktopPane.add(pista3);
        pista3.setVisible(true);
    }//GEN-LAST:event_jButtonPista3N2ActionPerformed

    private void jButtonCalificar4N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalificar4N2ActionPerformed

        if (jRadioButtonLIBRA.isSelected()) {
            JOptionPane.showMessageDialog(null, "Congratulations");

            //Ocultamos las opciones de esta pregunta
            jLabel5N2.setEnabled(false);
            jRadioButtonEURO.setEnabled(false);
            jRadioButtonLIBRA.setEnabled(false);
            jRadioButtonLUBRAINGLESA.setEnabled(false);
            jButtonCalificar4N2.setEnabled(false);
            jButtonPista4N2.setEnabled(false);

            //Mostramos las opciones de la otra pregunta
            jLabel6N2.setVisible(true);
            jTextFieldQuintaN2.setVisible(true);
            jButtonCalificar5N2.setVisible(true);
            jButtonPista5N2.setEnabled(true);

        } else {
            JOptionPane.showMessageDialog(null, "Revise su respuesta");
            ventana.vida--;
            jLabelVidaN2.setText("" + ventana.vida);
            opor();
        }


    }//GEN-LAST:event_jButtonCalificar4N2ActionPerformed

    private void jButtonPista4N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista4N2ActionPerformed

        JInternalPista4N2 pista4 = new JInternalPista4N2();
        jDesktopPane.add(pista4);
        pista4.setVisible(true);
    }//GEN-LAST:event_jButtonPista4N2ActionPerformed

    private void jButtonCalificar5N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalificar5N2ActionPerformed
        String rep5 = new String(jTextFieldQuintaN2.getText());
        if (rep5.equals("el bronce") || rep5.equals("Bronce") || rep5.equals("bronce")) {
            JOptionPane.showMessageDialog(null, "Congratulations");
            jButtonPASARN2.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Revise su respuesta");
            ventana.vida--;
            jLabelVidaN2.setText("" + ventana.vida);

            opor();
        }


    }//GEN-LAST:event_jButtonCalificar5N2ActionPerformed

    private void jButtonPista5N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista5N2ActionPerformed
        JInternalPista5N2 pista5 = new JInternalPista5N2();
        jDesktopPane.add(pista5);
        pista5.setVisible(true);

    }//GEN-LAST:event_jButtonPista5N2ActionPerformed

    private void jButtonPASARN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPASARN2ActionPerformed
        CulturaGeneralN3 v = new CulturaGeneralN3();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonPASARN2ActionPerformed

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
            java.util.logging.Logger.getLogger(CulturaGeneralN2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CulturaGeneralN2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CulturaGeneralN2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CulturaGeneralN2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new CulturaGeneralN2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupOCEANO;
    private javax.swing.ButtonGroup buttonGroupREINO;
    private javax.swing.JButton jButtonCalificar1N2;
    private javax.swing.JButton jButtonCalificar2N2;
    private javax.swing.JButton jButtonCalificar3N2;
    private javax.swing.JButton jButtonCalificar4N2;
    private javax.swing.JButton jButtonCalificar5N2;
    private javax.swing.JButton jButtonInstrucc;
    private javax.swing.JButton jButtonPASARN2;
    private javax.swing.JButton jButtonPista1N2;
    private javax.swing.JButton jButtonPista2N2;
    private javax.swing.JButton jButtonPista3N2;
    private javax.swing.JButton jButtonPista4N2;
    private javax.swing.JButton jButtonPista5N2;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel jLabel4N2;
    private javax.swing.JLabel jLabel5N2;
    private javax.swing.JLabel jLabel6N2;
    private javax.swing.JLabel jLabelN2;
    private javax.swing.JLabel jLabelTITLE;
    private javax.swing.JLabel jLabelVida;
    private javax.swing.JLabel jLabelVidaN2;
    private javax.swing.JLabel jLabeln2;
    private javax.swing.JPanel jPanelInstrucciones;
    private javax.swing.JPanel jPanelPistas;
    private javax.swing.JRadioButton jRadioButtonATLAN;
    private javax.swing.JRadioButton jRadioButtonEURO;
    private javax.swing.JRadioButton jRadioButtonINDICO;
    private javax.swing.JRadioButton jRadioButtonLIBRA;
    private javax.swing.JRadioButton jRadioButtonLUBRAINGLESA;
    private javax.swing.JRadioButton jRadioButtonPACIFICO;
    private javax.swing.JTextField jTextFieldPrimeraN2;
    private javax.swing.JTextField jTextFieldQuintaN2;
    private javax.swing.JTextField jTextFieldTerceraN2;
    // End of variables declaration//GEN-END:variables
}
