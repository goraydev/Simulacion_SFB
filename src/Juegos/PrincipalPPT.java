package Juegos;

import javax.swing.JOptionPane;

/**
 *
 * @author Absolute
 */
public class PrincipalPPT extends javax.swing.JFrame {

    int cont1 = 0, cont2 = 0;

    public PrincipalPPT() {

        initComponents();
        setResizable(false);
        setSize(1280, 720);
        this.setLocationRelativeTo(null);
        score.setText("0");
        score2.setText("0");

        rock1.setVisible(false);
        paper1.setVisible(false);
        scissors1.setVisible(false);
        lizard1.setVisible(false);
        spoke1.setVisible(false);

        rock3.setVisible(false);
        paper3.setVisible(false);
        scissors3.setVisible(false);
        lizard3.setVisible(false);
        spoke3.setVisible(false);

        label1.setVisible(false);
        label2.setVisible(false);

    }

    public void IA() {
        rock2.setEnabled(true);
        paper2.setEnabled(true);
        scissors2.setEnabled(true);
        lizard2.setEnabled(true);
        spoke2.setEnabled(true);
        int computer = (int) (Math.random() * 5);
        String cadena = String.valueOf(computer);
        label2.setText(cadena);

        if (computer == 0) {

            rock2.setEnabled(false);

        } else if (computer == 1) {

            paper2.setEnabled(false);
        } else if (computer == 2) {
            scissors2.setEnabled(false);
        } else if (computer == 3) {
            lizard2.setEnabled(false);
        } else if (computer == 4) {
            spoke2.setEnabled(false);
        }
    }

    public void game() {

        int computer = Integer.parseInt(label2.getText());

        if (label1.getText() == "0" && computer == 0) {

            rock1.setVisible(true);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(true);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("EMPATE!");

        } else if (label1.getText() == "0" && computer == 1) {

            rock1.setVisible(true);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(true);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("COMPUTER WIN!");
            cont2 = cont2 + 1;

        } else if (label1.getText() == "0" && computer == 2) {

            rock1.setVisible(true);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(true);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("PLAYER WIN!");
            cont1 = cont1 + 1;

        } else if (label1.getText() == "0" && computer == 3) {

            rock1.setVisible(true);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(true);
            spoke3.setVisible(false);
            NOTE.setText("PLAYER WIN!");
            cont1 = cont1 + 1;

        } else if (label1.getText() == "0" && computer == 4) {

            rock1.setVisible(true);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(true);
            NOTE.setText("COMPUTER WIN!");
            cont2 = cont2 + 1;

///////////////////////////////////////////////////////////////
        } else if (label1.getText() == "1" && computer == 0) {

            rock1.setVisible(false);
            paper1.setVisible(true);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(true);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("PLAYER WIN!");
            cont1 = cont1 + 1;

        } else if (label1.getText() == "1" && computer == 1) {

            rock1.setVisible(false);
            paper1.setVisible(true);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(true);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("EMPATE!");

        } else if (label1.getText() == "1" && computer == 2) {

            rock1.setVisible(false);
            paper1.setVisible(true);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(true);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("COMPUTER WIN!");
            cont2 = cont2 + 1;

        } else if (label1.getText() == "1" && computer == 3) {

            rock1.setVisible(false);
            paper1.setVisible(true);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(true);
            spoke3.setVisible(false);
            NOTE.setText("COMPUTER WIN!");
            cont2 = cont2 + 1;

        } else if (label1.getText() == "1" && computer == 4) {

            rock1.setVisible(false);
            paper1.setVisible(true);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(true);
            NOTE.setText("PLAYER WIN!");
            cont1 = cont1 + 1;

            ////////////////////////////////////////////
        } else if (label1.getText() == "2" && computer == 0) {

            rock1.setVisible(false);
            paper1.setVisible(false);
            lizard1.setVisible(false);
            scissors1.setVisible(true);
            spoke1.setVisible(false);
            rock3.setVisible(true);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("COMPUTER WIN!");
            cont2 = cont2 + 1;

        } else if (label1.getText() == "2" && computer == 1) {

            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(true);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(true);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("PLAYER WIN!");
            cont1 = cont1 + 1;

        } else if (label1.getText() == "2" && computer == 2) {

            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(true);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(true);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("EMPATE!");

        } else if (label1.getText() == "2" && computer == 3) {

            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(true);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(true);
            spoke3.setVisible(false);
            NOTE.setText("PLAYER WIN!");
            cont1 = cont1 + 1;

        } else if (label1.getText() == "2" && computer == 4) {

            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(true);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(true);
            NOTE.setText("COMPUTER WIN!");
            cont2 = cont2 + 1;

////////////////////////////////////////
        } else if (label1.getText() == "3" && computer == 0) {

            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(true);
            spoke1.setVisible(false);
            rock3.setVisible(true);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("COMPUTER WIN!");
            cont2 = cont2 + 1;

        } else if (label1.getText() == "3" && computer == 1) {

            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(true);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(true);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("PLAYER WIN!");
            cont1 = cont1 + 1;

        } else if (label1.getText() == "3" && computer == 2) {

            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(true);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(true);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("COMPUTER WIN!");
            cont2 = cont2 + 1;

        } else if (label1.getText() == "3" && computer == 3) {

            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(true);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(true);
            spoke3.setVisible(false);
            NOTE.setText("EMPATE!");

        } else if (label1.getText() == "3" && computer == 4) {

            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(true);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(true);
            NOTE.setText("PLAYER WIN!");
            cont1 = cont1 + 1;

/////////////////////////////////////
        } else if (label1.getText() == "4" && computer == 0) {

            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(true);
            rock3.setVisible(true);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("PLAYER WIN!");
            cont1 = cont1 + 1;

        } else if (label1.getText() == "4" && computer == 1) {

            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(true);
            rock3.setVisible(false);
            paper3.setVisible(true);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("COMPUTER WIN!");
            cont2 = cont2 + 1;

        } else if (label1.getText() == "4" && computer == 2) {

            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(true);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(true);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("PLAYER WIN!");
            cont1 = cont1 + 1;

        } else if (label1.getText() == "4" && computer == 3) {

            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(true);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(true);
            spoke3.setVisible(false);
            NOTE.setText("COMPUTER WIN!");
            cont2 = cont2 + 1;

        } else if (label1.getText() == "4" && computer == 4) {

            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(true);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(true);
            NOTE.setText("EMPATE!");

        }

        score2.setText(cont2 + "");
        score.setText(cont1 + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rock = new javax.swing.JButton();
        paper = new javax.swing.JButton();
        lizard = new javax.swing.JButton();
        scissors = new javax.swing.JButton();
        spoke = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        spoke2 = new javax.swing.JButton();
        scissors2 = new javax.swing.JButton();
        paper2 = new javax.swing.JButton();
        rock2 = new javax.swing.JButton();
        lizard2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        score2 = new javax.swing.JLabel();
        NOTE = new javax.swing.JLabel();
        rock1 = new javax.swing.JButton();
        paper1 = new javax.swing.JButton();
        scissors1 = new javax.swing.JButton();
        lizard1 = new javax.swing.JButton();
        spoke1 = new javax.swing.JButton();
        rock3 = new javax.swing.JButton();
        paper3 = new javax.swing.JButton();
        scissors3 = new javax.swing.JButton();
        lizard3 = new javax.swing.JButton();
        spoke3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 153, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rock (1).png"))); // NOI18N
        rock.setBorderPainted(false);
        rock.setContentAreaFilled(false);
        rock.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsM/rock (1).png"))); // NOI18N
        rock.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsG/rock (1).png"))); // NOI18N
        rock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockActionPerformed(evt);
            }
        });
        jPanel1.add(rock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 160, 160));

        paper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paper.png"))); // NOI18N
        paper.setBorderPainted(false);
        paper.setContentAreaFilled(false);
        paper.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsM/paper.png"))); // NOI18N
        paper.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsG/paper.png"))); // NOI18N
        paper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperActionPerformed(evt);
            }
        });
        jPanel1.add(paper, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 279, 180, 170));

        lizard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lizard.png"))); // NOI18N
        lizard.setBorderPainted(false);
        lizard.setContentAreaFilled(false);
        lizard.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsM/lizard.png"))); // NOI18N
        lizard.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsG/lizard.png"))); // NOI18N
        lizard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lizardActionPerformed(evt);
            }
        });
        jPanel1.add(lizard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 447, 170, 170));

        scissors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scissors.png"))); // NOI18N
        scissors.setBorderPainted(false);
        scissors.setContentAreaFilled(false);
        scissors.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsM/scissors.png"))); // NOI18N
        scissors.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsG/scissors.png"))); // NOI18N
        scissors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scissorsActionPerformed(evt);
            }
        });
        jPanel1.add(scissors, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 279, 170, 180));

        spoke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/spock.png"))); // NOI18N
        spoke.setBorderPainted(false);
        spoke.setContentAreaFilled(false);
        spoke.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsM/spock.png"))); // NOI18N
        spoke.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsG/spock.png"))); // NOI18N
        spoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spokeActionPerformed(evt);
            }
        });
        jPanel1.add(spoke, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 170, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/VS.png"))); // NOI18N
        jLabel1.setText("\n\n");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        spoke2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/spock2.png"))); // NOI18N
        spoke2.setBorderPainted(false);
        spoke2.setContentAreaFilled(false);
        spoke2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spoke2ActionPerformed(evt);
            }
        });
        jPanel1.add(spoke2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 480, 180, 130));

        scissors2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scissors2.png"))); // NOI18N
        scissors2.setBorderPainted(false);
        scissors2.setContentAreaFilled(false);
        scissors2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scissors2ActionPerformed(evt);
            }
        });
        jPanel1.add(scissors2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 300, 140, -1));

        paper2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paper2.png"))); // NOI18N
        paper2.setBorderPainted(false);
        paper2.setContentAreaFilled(false);
        paper2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paper2ActionPerformed(evt);
            }
        });
        jPanel1.add(paper2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 300, 140, -1));

        rock2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rock2.png"))); // NOI18N
        rock2.setBorderPainted(false);
        rock2.setContentAreaFilled(false);
        rock2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rock2ActionPerformed(evt);
            }
        });
        jPanel1.add(rock2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 130, 130));

        lizard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lizard2.png"))); // NOI18N
        lizard2.setBorderPainted(false);
        lizard2.setContentAreaFilled(false);
        lizard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lizard2ActionPerformed(evt);
            }
        });
        jPanel1.add(lizard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 470, 130, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 460, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 150, 440));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 460, 20));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 20, 440));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Computer");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Player ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        label2.setText("jLabel4");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 140, -1, -1));

        label1.setText("jLabel4");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        score.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        score.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 5, -1, -1));

        score2.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        score2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(score2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 5, -1, -1));

        NOTE.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        NOTE.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(NOTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 310, 60));

        rock1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rock (1).png"))); // NOI18N
        rock1.setBorderPainted(false);
        rock1.setContentAreaFilled(false);
        rock1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rock1ActionPerformed(evt);
            }
        });
        jPanel1.add(rock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 130, 130));

        paper1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paper.png"))); // NOI18N
        paper1.setBorderPainted(false);
        paper1.setContentAreaFilled(false);
        paper1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paper1ActionPerformed(evt);
            }
        });
        jPanel1.add(paper1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 160, -1));

        scissors1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scissors.png"))); // NOI18N
        scissors1.setBorderPainted(false);
        scissors1.setContentAreaFilled(false);
        scissors1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scissors1ActionPerformed(evt);
            }
        });
        jPanel1.add(scissors1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 140, -1));

        lizard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lizard.png"))); // NOI18N
        lizard1.setBorderPainted(false);
        lizard1.setContentAreaFilled(false);
        lizard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lizard1ActionPerformed(evt);
            }
        });
        jPanel1.add(lizard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 130, -1));

        spoke1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/spock.png"))); // NOI18N
        spoke1.setBorderPainted(false);
        spoke1.setContentAreaFilled(false);
        spoke1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spoke1ActionPerformed(evt);
            }
        });
        jPanel1.add(spoke1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 150, 140));

        rock3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rock2.png"))); // NOI18N
        rock3.setBorderPainted(false);
        rock3.setContentAreaFilled(false);
        rock3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rock3ActionPerformed(evt);
            }
        });
        jPanel1.add(rock3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 90, 130, 130));

        paper3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paper2.png"))); // NOI18N
        paper3.setBorderPainted(false);
        paper3.setContentAreaFilled(false);
        paper3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paper3ActionPerformed(evt);
            }
        });
        jPanel1.add(paper3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 90, 180, -1));

        scissors3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scissors2.png"))); // NOI18N
        scissors3.setBorderPainted(false);
        scissors3.setContentAreaFilled(false);
        scissors3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scissors3ActionPerformed(evt);
            }
        });
        jPanel1.add(scissors3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 90, 140, -1));

        lizard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lizard2.png"))); // NOI18N
        lizard3.setBorderPainted(false);
        lizard3.setContentAreaFilled(false);
        lizard3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lizard3ActionPerformed(evt);
            }
        });
        jPanel1.add(lizard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 90, 130, -1));

        spoke3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/spock2.png"))); // NOI18N
        spoke3.setBorderPainted(false);
        spoke3.setContentAreaFilled(false);
        spoke3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spoke3ActionPerformed(evt);
            }
        });
        jPanel1.add(spoke3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 90, 180, 130));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fondo.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 1320, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rockActionPerformed
        // TODO add your handling code here:
        label1.setText("0");
        IA();
        game();

    }//GEN-LAST:event_rockActionPerformed

    private void paperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperActionPerformed
        // TODO add your handling code here:
        label1.setText("1");
        IA();
        game();
    }//GEN-LAST:event_paperActionPerformed

    private void scissorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scissorsActionPerformed
        // TODO add your handling code here:
        label1.setText("2");
        IA();
        game();
    }//GEN-LAST:event_scissorsActionPerformed

    private void lizardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lizardActionPerformed
        // TODO add your handling code here:
        label1.setText("3");
        IA();
        game();
    }//GEN-LAST:event_lizardActionPerformed

    private void spokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spokeActionPerformed
        // TODO add your handling code here:
        label1.setText("4");
        IA();
        game();
    }//GEN-LAST:event_spokeActionPerformed

    private void rock2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rock2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_rock2ActionPerformed

    private void paper2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paper2ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_paper2ActionPerformed

    private void scissors2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scissors2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_scissors2ActionPerformed

    private void lizard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lizard2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_lizard2ActionPerformed

    private void spoke2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spoke2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_spoke2ActionPerformed

    private void rock1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rock1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rock1ActionPerformed

    private void paper1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paper1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paper1ActionPerformed

    private void scissors1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scissors1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scissors1ActionPerformed

    private void lizard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lizard1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lizard1ActionPerformed

    private void spoke1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spoke1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spoke1ActionPerformed

    private void rock3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rock3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rock3ActionPerformed

    private void paper3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paper3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paper3ActionPerformed

    private void scissors3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scissors3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scissors3ActionPerformed

    private void lizard3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lizard3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lizard3ActionPerformed

    private void spoke3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spoke3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spoke3ActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalPPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalPPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalPPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalPPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalPPT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NOTE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JButton lizard;
    private javax.swing.JButton lizard1;
    private javax.swing.JButton lizard2;
    private javax.swing.JButton lizard3;
    private javax.swing.JButton paper;
    private javax.swing.JButton paper1;
    private javax.swing.JButton paper2;
    private javax.swing.JButton paper3;
    private javax.swing.JButton rock;
    private javax.swing.JButton rock1;
    private javax.swing.JButton rock2;
    private javax.swing.JButton rock3;
    private javax.swing.JButton scissors;
    private javax.swing.JButton scissors1;
    private javax.swing.JButton scissors2;
    private javax.swing.JButton scissors3;
    private javax.swing.JLabel score;
    private javax.swing.JLabel score2;
    private javax.swing.JButton spoke;
    private javax.swing.JButton spoke1;
    private javax.swing.JButton spoke2;
    private javax.swing.JButton spoke3;
    // End of variables declaration//GEN-END:variables
}
