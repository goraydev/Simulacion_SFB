package Juegos;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CulturaGeneralN1 extends javax.swing.JFrame {

    public CulturaGeneralN1() {
        initComponents();
        setLocationRelativeTo(null);
        ImageIcon icono = new ImageIcon("src/images/mundo rojo.jpg");
        setIconImage(icono.getImage());

        //Ocultamos las demás preguntas
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);

        jTextFieldTercera.setVisible(false);
        jTextFieldQuinta.setVisible(false);

        jRadioButtonRusia.setVisible(false);
        jRadioButtonAlaska.setVisible(false);
        jRadioButtonAntartida.setVisible(false);

        jRadioButtonAmazonas.setVisible(false);
        jRadioButtonNilo.setVisible(false);
        jRadioButtonChino.setVisible(false);

        jButtonCalificar2.setVisible(false);
        jButtonCalificar3.setVisible(false);
        jButtonCalificar4.setVisible(false);
        jButtonCalificar5.setVisible(false);

        jButtonPista2.setEnabled(false);
        jButtonPista3.setEnabled(false);
        jButtonPista4.setEnabled(false);
        jButtonPista5.setEnabled(false);
        jButtonPASAR.setVisible(false);

        jLabelVida.setText("" + vida);

    }

    //Funcion para la vida
    public static int vida = 3;

    public void opor() {
        if (vida == 0) {
            JInternalPerdio perdio = new JInternalPerdio();
            jDesktopPane.add(perdio);
            perdio.setVisible(true);

            //Ocultamos las demás preguntas
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);

            jTextFieldPrimera.setVisible(false);
            jTextFieldTercera.setVisible(false);
            jTextFieldQuinta.setVisible(false);

            jRadioButtonRusia.setVisible(false);
            jRadioButtonAlaska.setVisible(false);
            jRadioButtonAntartida.setVisible(false);

            jRadioButtonAmazonas.setVisible(false);
            jRadioButtonNilo.setVisible(false);
            jRadioButtonChino.setVisible(false);

            jButtonCalificar1.setVisible(false);
            jButtonCalificar2.setVisible(false);
            jButtonCalificar3.setVisible(false);
            jButtonCalificar4.setVisible(false);
            jButtonCalificar5.setVisible(false);

            jButtonPista1.setEnabled(false);
            jButtonPista2.setEnabled(false);
            jButtonPista3.setEnabled(false);
            jButtonPista4.setEnabled(false);
            jButtonPista5.setEnabled(false);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupFrio = new javax.swing.ButtonGroup();
        buttonGroupRio = new javax.swing.ButtonGroup();
        jPanelInstrucciones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabelVida = new javax.swing.JLabel();
        jButtonPASAR = new javax.swing.JButton();
        jDesktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPrimera = new javax.swing.JTextField();
        jPanelPistas = new javax.swing.JPanel();
        jButtonPista1 = new javax.swing.JButton();
        jButtonPista2 = new javax.swing.JButton();
        jButtonPista3 = new javax.swing.JButton();
        jButtonPista4 = new javax.swing.JButton();
        jButtonPista5 = new javax.swing.JButton();
        jButtonCalificar1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButtonRusia = new javax.swing.JRadioButton();
        jRadioButtonAlaska = new javax.swing.JRadioButton();
        jRadioButtonAntartida = new javax.swing.JRadioButton();
        jButtonCalificar2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTercera = new javax.swing.JTextField();
        jButtonCalificar3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButtonAmazonas = new javax.swing.JRadioButton();
        jRadioButtonNilo = new javax.swing.JRadioButton();
        jRadioButtonChino = new javax.swing.JRadioButton();
        jButtonCalificar4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldQuinta = new javax.swing.JTextField();
        jButtonCalificar5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelInstrucciones.setBackground(new java.awt.Color(0, 204, 102));
        jPanelInstrucciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setText("Instrucciones");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/corazon_1.png"))); // NOI18N

        jButtonPASAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha.jpg"))); // NOI18N
        jButtonPASAR.setText("Pasar siguiente nivel");
        jButtonPASAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPASARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInstruccionesLayout = new javax.swing.GroupLayout(jPanelInstrucciones);
        jPanelInstrucciones.setLayout(jPanelInstruccionesLayout);
        jPanelInstruccionesLayout.setHorizontalGroup(
            jPanelInstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInstruccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(202, 202, 202)
                .addComponent(jButtonPASAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(9, 9, 9)
                .addComponent(jLabelVida, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanelInstruccionesLayout.setVerticalGroup(
            jPanelInstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInstruccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelInstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelVida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPASAR)))
                .addContainerGap())
        );

        jLabel1.setText("NIVEL 1");

        jLabel2.setText("1. ¿En qué país se dio a conocer el paciente cero de COVID - 19?");

        jTextFieldPrimera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrimeraActionPerformed(evt);
            }
        });

        jPanelPistas.setBackground(new java.awt.Color(0, 0, 0));
        jPanelPistas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonPista1.setText("Pista");
        jButtonPista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista1ActionPerformed(evt);
            }
        });

        jButtonPista2.setText("Pista");
        jButtonPista2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista2ActionPerformed(evt);
            }
        });

        jButtonPista3.setText("Pista");
        jButtonPista3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista3ActionPerformed(evt);
            }
        });

        jButtonPista4.setText("Pista");
        jButtonPista4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista4ActionPerformed(evt);
            }
        });

        jButtonPista5.setText("Pista");
        jButtonPista5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPista5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPistasLayout = new javax.swing.GroupLayout(jPanelPistas);
        jPanelPistas.setLayout(jPanelPistasLayout);
        jPanelPistasLayout.setHorizontalGroup(
            jPanelPistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPistasLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanelPistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPista1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPista2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPista3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPista4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPista5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanelPistasLayout.setVerticalGroup(
            jPanelPistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPistasLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButtonPista1)
                .addGap(37, 37, 37)
                .addComponent(jButtonPista2)
                .addGap(57, 57, 57)
                .addComponent(jButtonPista3)
                .addGap(56, 56, 56)
                .addComponent(jButtonPista4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPista5)
                .addGap(52, 52, 52))
        );

        jButtonCalificar1.setText("Calificar");
        jButtonCalificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalificar1ActionPerformed(evt);
            }
        });

        jLabel3.setText("2. ¿Cuál es el lugar más frío de la tierra?");

        buttonGroupFrio.add(jRadioButtonRusia);
        jRadioButtonRusia.setText("Rusia");

        buttonGroupFrio.add(jRadioButtonAlaska);
        jRadioButtonAlaska.setText("Alaska");

        buttonGroupFrio.add(jRadioButtonAntartida);
        jRadioButtonAntartida.setText("Antártida");

        jButtonCalificar2.setText("Calificar");
        jButtonCalificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalificar2ActionPerformed(evt);
            }
        });

        jLabel4.setText("3. ¿Quíén escribió La Odisea?");

        jTextFieldTercera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTerceraActionPerformed(evt);
            }
        });

        jButtonCalificar3.setText("Calificar");
        jButtonCalificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalificar3ActionPerformed(evt);
            }
        });

        jLabel5.setText("4. ¿Cúal es el rio más largo del mundo?");

        buttonGroupRio.add(jRadioButtonAmazonas);
        jRadioButtonAmazonas.setText("Rio Amazonas");

        buttonGroupRio.add(jRadioButtonNilo);
        jRadioButtonNilo.setText("Rio Nilo");

        buttonGroupRio.add(jRadioButtonChino);
        jRadioButtonChino.setText("Rio Yangtsé");

        jButtonCalificar4.setText("Calificar");
        jButtonCalificar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalificar4ActionPerformed(evt);
            }
        });

        jLabel6.setText("5. ¿Cuánto es la suma de los huesos de un adulto con las de un recién nacido?");

        jButtonCalificar5.setText("Calificar");
        jButtonCalificar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalificar5ActionPerformed(evt);
            }
        });

        jDesktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jTextFieldPrimera, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jPanelPistas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jButtonCalificar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jRadioButtonRusia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jRadioButtonAlaska, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jRadioButtonAntartida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jButtonCalificar2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jTextFieldTercera, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jButtonCalificar3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jRadioButtonAmazonas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jRadioButtonNilo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jRadioButtonChino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jButtonCalificar4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jTextFieldQuinta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jButtonCalificar5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel1))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jTextFieldPrimera, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCalificar1))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jRadioButtonRusia)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonAlaska)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonAntartida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCalificar2))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jTextFieldTercera, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCalificar3))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButtonAmazonas)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonNilo)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonChino)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCalificar4))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jTextFieldQuinta, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCalificar5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
                .addComponent(jPanelPistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrimera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCalificar1))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonRusia)
                    .addComponent(jRadioButtonAlaska)
                    .addComponent(jRadioButtonAntartida)
                    .addComponent(jButtonCalificar2))
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTercera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCalificar3))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonAmazonas)
                    .addComponent(jRadioButtonNilo)
                    .addComponent(jRadioButtonChino)
                    .addComponent(jButtonCalificar4))
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldQuinta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCalificar5))
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void jTextFieldPrimeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrimeraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrimeraActionPerformed

    private void jButtonPista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista1ActionPerformed

        JInternalPista1 pista1 = new JInternalPista1();
        jDesktopPane.add(pista1);
        pista1.setVisible(true);
    }//GEN-LAST:event_jButtonPista1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JInternalInstrucciones instruc = new JInternalInstrucciones();
        jDesktopPane.add(instruc);
        instruc.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonCalificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalificar1ActionPerformed

        String rep1 = new String(jTextFieldPrimera.getText());

        if (rep1.equals("China")) {
            JOptionPane.showMessageDialog(null, "Congratulations");

            //Mostramos la segunda pregunta si es acerta
            jLabel3.setVisible(true);
            jRadioButtonRusia.setVisible(true);
            jRadioButtonAlaska.setVisible(true);
            jRadioButtonAntartida.setVisible(true);
            jButtonPista2.setEnabled(true);
            jButtonCalificar2.setVisible(true);

            //Ocultamos las opciones que ya aceto
            jLabel2.setEnabled(false);
            jTextFieldPrimera.setEnabled(false);
            jButtonPista1.setEnabled(false);
            jButtonCalificar1.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(null, "Revise su respuesta");
            vida--;
            jLabelVida.setText("" + vida);
            opor();

        }

    }//GEN-LAST:event_jButtonCalificar1ActionPerformed

    private void jButtonCalificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalificar2ActionPerformed

        if (jRadioButtonAntartida.isSelected()) {
            JOptionPane.showMessageDialog(null, "Congratulations");

            //Ocultamos las opciones que ya aceto
            jLabel3.setEnabled(false);
            jRadioButtonRusia.setEnabled(false);
            jRadioButtonAlaska.setEnabled(false);
            jRadioButtonAntartida.setEnabled(false);
            jButtonPista2.setEnabled(false);
            jButtonCalificar2.setEnabled(false);

            //Mostramos las opciones de la otra pregunta
            jLabel4.setVisible(true);
            jTextFieldTercera.setVisible(true);
            jButtonCalificar3.setVisible(true);
            jButtonPista3.setEnabled(true);

        } else {
            JOptionPane.showMessageDialog(null, "Revise su respuesta");
            vida--;
            jLabelVida.setText("" + vida);
            opor();
        }
    }//GEN-LAST:event_jButtonCalificar2ActionPerformed

    private void jButtonPista2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista2ActionPerformed
        JInternalPista2 pista2 = new JInternalPista2();
        jDesktopPane.add(pista2);
        pista2.setVisible(true);
    }//GEN-LAST:event_jButtonPista2ActionPerformed

    private void jTextFieldTerceraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTerceraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTerceraActionPerformed

    private void jButtonCalificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalificar3ActionPerformed
        String rep3 = new String(jTextFieldTercera.getText());

        if (rep3.equals("Homero")) {
            JOptionPane.showMessageDialog(null, "Congratulations");
            //Ocultamos las opciones de la pregunta

            jLabel4.setEnabled(false);
            jTextFieldTercera.setEnabled(false);
            jButtonCalificar3.setEnabled(false);
            jButtonPista3.setEnabled(false);

            //Mostramos las respuestas de la otra pregunta
            jLabel5.setVisible(true);
            jRadioButtonAmazonas.setVisible(true);
            jRadioButtonNilo.setVisible(true);
            jRadioButtonChino.setVisible(true);
            jButtonCalificar4.setVisible(true);
            jButtonPista4.setEnabled(true);

        } else {
            JOptionPane.showMessageDialog(null, "Revise su respuesta");
            vida--;
            jLabelVida.setText("" + vida);
            opor();
        }
    }//GEN-LAST:event_jButtonCalificar3ActionPerformed

    private void jButtonPista3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista3ActionPerformed

        JInternalPista3 pista3 = new JInternalPista3();
        jDesktopPane.add(pista3);
        pista3.setVisible(true);
    }//GEN-LAST:event_jButtonPista3ActionPerformed

    private void jButtonCalificar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalificar4ActionPerformed

        if (jRadioButtonAmazonas.isSelected()) {
            JOptionPane.showMessageDialog(null, "Congratulations");

            //Ocultamos las opciones de esta pregunta
            jLabel5.setEnabled(false);
            jRadioButtonAmazonas.setEnabled(false);
            jRadioButtonNilo.setEnabled(false);
            jRadioButtonChino.setEnabled(false);
            jButtonCalificar4.setEnabled(false);
            jButtonPista4.setEnabled(false);

            //Mostramos las opciones de la otra pregunta
            jLabel6.setVisible(true);
            jTextFieldQuinta.setVisible(true);
            jButtonCalificar5.setVisible(true);
            jButtonPista5.setEnabled(true);

        } else {
            JOptionPane.showMessageDialog(null, "Revise su respuesta");
            vida--;
            jLabelVida.setText("" + vida);
            opor();
        }


    }//GEN-LAST:event_jButtonCalificar4ActionPerformed

    private void jButtonPista4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista4ActionPerformed

        JInternalPista4 pista4 = new JInternalPista4();
        jDesktopPane.add(pista4);
        pista4.setVisible(true);
    }//GEN-LAST:event_jButtonPista4ActionPerformed

    private void jButtonCalificar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalificar5ActionPerformed
        int rep5 = Integer.parseInt(jTextFieldQuinta.getText());
        if (rep5 == 506) {
            JOptionPane.showMessageDialog(null, "Congratulations");
            

            jButtonPASAR.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Revise su respuesta");
            vida--;
            jLabelVida.setText("" + vida);
            opor();
        }


    }//GEN-LAST:event_jButtonCalificar5ActionPerformed

    private void jButtonPista5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPista5ActionPerformed
        JInternalPista5 pista5 = new JInternalPista5();
        jDesktopPane.add(pista5);
        pista5.setVisible(true);

    }//GEN-LAST:event_jButtonPista5ActionPerformed

    private void jButtonPASARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPASARActionPerformed
       
        CulturaGeneralN2 n2 = new CulturaGeneralN2();
        n2.setVisible(true);
        this.dispose();

        
    }//GEN-LAST:event_jButtonPASARActionPerformed

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
            java.util.logging.Logger.getLogger(CulturaGeneralN1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CulturaGeneralN1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CulturaGeneralN1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CulturaGeneralN1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CulturaGeneralN1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupFrio;
    private javax.swing.ButtonGroup buttonGroupRio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCalificar1;
    private javax.swing.JButton jButtonCalificar2;
    private javax.swing.JButton jButtonCalificar3;
    private javax.swing.JButton jButtonCalificar4;
    private javax.swing.JButton jButtonCalificar5;
    private javax.swing.JButton jButtonPASAR;
    private javax.swing.JButton jButtonPista1;
    private javax.swing.JButton jButtonPista2;
    private javax.swing.JButton jButtonPista3;
    private javax.swing.JButton jButtonPista4;
    private javax.swing.JButton jButtonPista5;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelVida;
    private javax.swing.JPanel jPanelInstrucciones;
    private javax.swing.JPanel jPanelPistas;
    private javax.swing.JRadioButton jRadioButtonAlaska;
    private javax.swing.JRadioButton jRadioButtonAmazonas;
    private javax.swing.JRadioButton jRadioButtonAntartida;
    private javax.swing.JRadioButton jRadioButtonChino;
    private javax.swing.JRadioButton jRadioButtonNilo;
    private javax.swing.JRadioButton jRadioButtonRusia;
    private javax.swing.JTextField jTextFieldPrimera;
    private javax.swing.JTextField jTextFieldQuinta;
    private javax.swing.JTextField jTextFieldTercera;
    // End of variables declaration//GEN-END:variables
}
