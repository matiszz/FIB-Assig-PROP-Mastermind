/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prop.presentacio;

/**
 *
 * @author mati
 */
public class Preferencies extends javax.swing.JFrame {
    
    private ControladorDePresentacio p = new ControladorDePresentacio();
    private String dificultat = null;
    private String mode = null;

    /**
     * Creates new form MenuPrincipal
     */
    public Preferencies() {
        initComponents();
        
        grpMode.add(rbCodeBreaker);
        grpMode.add(rbCodeMaker);
        grpDificultat.add(rbFacil);
        grpDificultat.add(rbMitja);
        grpDificultat.add(rbDificil);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpDificultat = new javax.swing.ButtonGroup();
        grpMode = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        btnAjuda = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rbCodeBreaker = new javax.swing.JRadioButton();
        rbCodeMaker = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        rbFacil = new javax.swing.JRadioButton();
        rbMitja = new javax.swing.JRadioButton();
        rbDificil = new javax.swing.JRadioButton();
        btnJugar = new javax.swing.JButton();
        txtError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MasterMind");
        setMinimumSize(new java.awt.Dimension(600, 500));

        jLabel1.setFont(new java.awt.Font("Ani", 0, 36)); // NOI18N
        jLabel1.setText("MasterMind");

        btnInfo.setText("Informació");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        btnAjuda.setText("Ajuda");
        btnAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjudaActionPerformed(evt);
            }
        });

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btnMenu.setText("Menú Principal");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Mode de joc");

        rbCodeBreaker.setText("Code Breaker");
        rbCodeBreaker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCodeBreakerActionPerformed(evt);
            }
        });

        rbCodeMaker.setText("Code Maker");
        rbCodeMaker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCodeMakerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(rbCodeBreaker)
                    .addComponent(rbCodeMaker))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(rbCodeBreaker)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbCodeMaker)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setText("Dificultat");

        rbFacil.setText("Fàcil");
        rbFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFacilActionPerformed(evt);
            }
        });

        rbMitja.setText("Mitjana");
        rbMitja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMitjaActionPerformed(evt);
            }
        });

        rbDificil.setText("Difícil");
        rbDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDificilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(rbFacil)
                    .addComponent(rbMitja)
                    .addComponent(rbDificil))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(rbFacil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbMitja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(rbDificil))
        );

        btnJugar.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons-land-vista-multimedia-play-1-hot.png"))); // NOI18N
        btnJugar.setText("Jugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        txtError.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtError.setForeground(new java.awt.Color(218, 0, 0));
        txtError.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAjuda))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnJugar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnMenu))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtError)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(112, 112, 112)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 121, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenu)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(txtError)
                .addGap(19, 19, 19)
                .addComponent(btnJugar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfo)
                    .addComponent(btnAjuda))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        Informacio nova = new Informacio();
        nova.setVisible(true);
        Preferencies.this.dispose();
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjudaActionPerformed
        Ajuda nova = new Ajuda();
        nova.setVisible(true);
        Preferencies.this.dispose();
    }//GEN-LAST:event_btnAjudaActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        MenuPrincipal nova = new MenuPrincipal();
        nova.setVisible(true);
        Preferencies.this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void rbDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDificilActionPerformed
        dificultat = "dificil";
    }//GEN-LAST:event_rbDificilActionPerformed

    private void rbFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFacilActionPerformed
        dificultat = "facil";
    }//GEN-LAST:event_rbFacilActionPerformed

    private void rbMitjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMitjaActionPerformed
        dificultat = "mitjana";
    }//GEN-LAST:event_rbMitjaActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        if (dificultat == null || mode == null) {
            if (dificultat == null) txtError.setText("Has d'escollir una dificultat de joc.");
            if (mode == null) txtError.setText("Has d'escollir un mode de joc.");
        } else {
            p.controller.crearPartida(mode, dificultat);
            if (mode.equals("CodeBreaker")) {   // En cas CodeBreaker
                p.controller.setRandomCodi();
                if (dificultat.equals("dificil")) {
                    PartidaDificil nova = new PartidaDificil();
                    nova.setVisible(true);
                } else if (dificultat.equals("mitjana")) {
                    PartidaMitjana nova = new PartidaMitjana();
                    nova.setVisible(true);
                } else if (dificultat.equals("facil")) {
                    PartidaFacil nova = new PartidaFacil();
                    nova.setVisible(true);
                }
                Preferencies.this.dispose();
            } else {                            // En cas CodeMaker
                CrearCodi nova = new CrearCodi(dificultat);
                nova.setVisible(true);
                Preferencies.this.dispose();
            }
        }
    }//GEN-LAST:event_btnJugarActionPerformed

    private void rbCodeBreakerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCodeBreakerActionPerformed
        mode = "CodeBreaker";
    }//GEN-LAST:event_rbCodeBreakerActionPerformed

    private void rbCodeMakerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCodeMakerActionPerformed
        mode = "CodeMaker";
    }//GEN-LAST:event_rbCodeMakerActionPerformed

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
            java.util.logging.Logger.getLogger(Preferencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Preferencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Preferencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Preferencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Preferencies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnMenu;
    private javax.swing.ButtonGroup grpDificultat;
    private javax.swing.ButtonGroup grpMode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbCodeBreaker;
    private javax.swing.JRadioButton rbCodeMaker;
    private javax.swing.JRadioButton rbDificil;
    private javax.swing.JRadioButton rbFacil;
    private javax.swing.JRadioButton rbMitja;
    private javax.swing.JLabel txtError;
    // End of variables declaration//GEN-END:variables
}
