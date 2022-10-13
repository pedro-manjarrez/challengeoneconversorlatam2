package PaquetePrincipal;



public class ConvertidorDivisas extends javax.swing.JFrame {

    
  
    public ConvertidorDivisas() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Variable2 = new javax.swing.JButton();
        Variable1 = new javax.swing.JButton();
        Variable4 = new javax.swing.JButton();
        Variable3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Variable5 = new javax.swing.JButton();
        Variable6 = new javax.swing.JButton();
        Variable7 = new javax.swing.JButton();
        Variable8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convertidor de divisas");

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Conversión de divisas");

        Variable2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Variable2.setText("Conversión de pesos mexicanos a euros o euros a pesos mexicanos ");
        Variable2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Variable2ActionPerformed(evt);
            }
        });

        Variable1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Variable1.setText("Conversión de pesos mexicanos a dólares o dólares a pesos mexicanos ");
        Variable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Variable1ActionPerformed(evt);
            }
        });

        Variable4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Variable4.setText("Conversión de peso mexicano a rublos o rublos a pesos mexicanos ");
        Variable4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Variable4ActionPerformed(evt);
            }
        });

        Variable3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Variable3.setText("Conversión de peso mexicano a yenes o yenes a pesos mexicanos");
        Variable3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Variable3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Regresar al Menú principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Variable5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Variable5.setText("Conversión de pesos mexicanos a pesos cubanos o pesos cubanos a pesos mexicanos ");
        Variable5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Variable5ActionPerformed(evt);
            }
        });

        Variable6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Variable6.setText("Conversión de pesos mexicanos a pesos colombianos o pesos colombianos a pesos mexicanos ");
        Variable6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Variable6ActionPerformed(evt);
            }
        });

        Variable7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Variable7.setText("Conversión de pesos mexicanos a dólares canadienses o dólares canadienses a pesos mexicanos ");
        Variable7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Variable7ActionPerformed(evt);
            }
        });

        Variable8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Variable8.setText("Conversión de dólares a euros ó euros a dólares ");
        Variable8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Variable8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Variable8, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Variable6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Variable5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Variable4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Variable3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Variable2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Variable7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(Variable1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(53, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(66, 66, 66)
                .addComponent(Variable2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Variable3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Variable4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Variable5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Variable6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Variable7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(Variable8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(Variable1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(373, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Variable2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Variable2ActionPerformed
       TransPesoEuro newframe = new TransPesoEuro();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Variable2ActionPerformed

    private void Variable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Variable1ActionPerformed
        TransPesoDolar newframe = new TransPesoDolar();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Variable1ActionPerformed

    private void Variable4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Variable4ActionPerformed
        TransPesoRublo newframe = new TransPesoRublo();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Variable4ActionPerformed

    private void Variable3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Variable3ActionPerformed
        TransPesoYen newframe = new TransPesoYen();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Variable3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuPrincipal newframe = new MenuPrincipal();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Variable5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Variable5ActionPerformed
        TransPesoPesoCU newframe = new TransPesoPesoCU();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Variable5ActionPerformed

    private void Variable6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Variable6ActionPerformed
        TransPesoPesoCOL newframe = new TransPesoPesoCOL();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Variable6ActionPerformed

    private void Variable7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Variable7ActionPerformed
        TransPesoDolasCA newframe = new TransPesoDolasCA();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Variable7ActionPerformed

    private void Variable8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Variable8ActionPerformed
        TransEuroDolar newframe = new TransEuroDolar();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Variable8ActionPerformed

  
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
            java.util.logging.Logger.getLogger(ConvertidorDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConvertidorDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConvertidorDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConvertidorDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConvertidorDivisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Variable1;
    private javax.swing.JButton Variable2;
    private javax.swing.JButton Variable3;
    private javax.swing.JButton Variable4;
    private javax.swing.JButton Variable5;
    private javax.swing.JButton Variable6;
    private javax.swing.JButton Variable7;
    private javax.swing.JButton Variable8;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
