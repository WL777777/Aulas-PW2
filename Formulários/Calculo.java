package Formulários;

public class Calculo extends javax.swing.JFrame {

    public Calculo() {
        initComponents();
        Desabilitar();
        
    }
    void Desabilitar(){
         txt_n1.setEditable(false);
         txt_n2.setEditable(false);
         txt_res.setEditable(false);
 
 }
void Habilitar(){
        txt_n1.setEditable(true);
        txt_n2.setEditable(true);
        txt_res.setEditable(true);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_n1 = new javax.swing.JTextField();
        txt_n2 = new javax.swing.JTextField();
        txt_res = new javax.swing.JTextField();
        btn_Soma = new javax.swing.JButton();
        btn_Subtração = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_Divisão = new javax.swing.JButton();
        btn_Novo = new javax.swing.JButton();
        btn_Limpar = new javax.swing.JButton();
        btn_Sair = new javax.swing.JButton();
        btn_Comparação = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Programação de Computadores"));

        jLabel1.setText("N1");

        jLabel2.setText("N2");

        jLabel3.setText("Resultado");

        txt_n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_n1ActionPerformed(evt);
            }
        });

        txt_n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_n2ActionPerformed(evt);
            }
        });

        btn_Soma.setText("+");
        btn_Soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SomaActionPerformed(evt);
            }
        });

        btn_Subtração.setText("-");
        btn_Subtração.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SubtraçãoActionPerformed(evt);
            }
        });

        jButton3.setText("*");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btn_Divisão.setText("/");
        btn_Divisão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DivisãoActionPerformed(evt);
            }
        });

        btn_Novo.setText("Novo");
        btn_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NovoActionPerformed(evt);
            }
        });

        btn_Limpar.setText("Limpar");
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });

        btn_Sair.setText("Sair");
        btn_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SairActionPerformed(evt);
            }
        });

        btn_Comparação.setText("Comparação");
        btn_Comparação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ComparaçãoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_n2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_n1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_res, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_Soma)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Subtração)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Comparação))
                                    .addComponent(btn_Divisão))))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Soma)
                    .addComponent(btn_Subtração)
                    .addComponent(jButton3)
                    .addComponent(btn_Divisão))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Novo)
                    .addComponent(btn_Limpar)
                    .addComponent(btn_Sair)
                    .addComponent(btn_Comparação))
                .addContainerGap(17, Short.MAX_VALUE))
        );

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

    private void txt_n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_n1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_n1ActionPerformed

    private void txt_n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_n2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_n2ActionPerformed

    private void btn_SomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SomaActionPerformed
        int x, y, z;
        String r; 


        x = Integer.parseInt( txt_n1.getText());
        y = Integer.parseInt( txt_n2.getText());

        z= x + y;
        r = String.valueOf(z); 
        txt_res.setText(r);
    }//GEN-LAST:event_btn_SomaActionPerformed

    private void btn_SubtraçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SubtraçãoActionPerformed
        int x, y, z;
        String r; 


        x = Integer.parseInt( txt_n1.getText());
        y = Integer.parseInt( txt_n2.getText());

        z= x - y;
        r = String.valueOf(z); 
        txt_res.setText(r);
    }//GEN-LAST:event_btn_SubtraçãoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int x, y, z;
        String r; 


        x = Integer.parseInt( txt_n1.getText());
        y = Integer.parseInt( txt_n2.getText());

        z= x * y;
        r = String.valueOf(z); 
        txt_res.setText(r);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_DivisãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DivisãoActionPerformed
        int x, y, z;
        String r; 


        x = Integer.parseInt( txt_n1.getText());
        y = Integer.parseInt( txt_n2.getText());

        z= x / y;
        r = String.valueOf(z); 
        txt_res.setText(r);
    }//GEN-LAST:event_btn_DivisãoActionPerformed

    private void btn_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NovoActionPerformed
        Habilitar();
    }//GEN-LAST:event_btn_NovoActionPerformed

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed
        txt_n1.setText("");
        txt_n2.setText("");
        txt_res.setText("");
    }//GEN-LAST:event_btn_LimparActionPerformed

    private void btn_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_SairActionPerformed

    private void btn_ComparaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ComparaçãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ComparaçãoActionPerformed

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
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Comparação;
    private javax.swing.JButton btn_Divisão;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JButton btn_Multiplicação;
    private javax.swing.JButton btn_Multiplicação1;
    private javax.swing.JButton btn_Multiplicação10;
    private javax.swing.JButton btn_Multiplicação11;
    private javax.swing.JButton btn_Multiplicação12;
    private javax.swing.JButton btn_Multiplicação13;
    private javax.swing.JButton btn_Multiplicação14;
    private javax.swing.JButton btn_Multiplicação15;
    private javax.swing.JButton btn_Multiplicação16;
    private javax.swing.JButton btn_Multiplicação17;
    private javax.swing.JButton btn_Multiplicação18;
    private javax.swing.JButton btn_Multiplicação19;
    private javax.swing.JButton btn_Multiplicação2;
    private javax.swing.JButton btn_Multiplicação20;
    private javax.swing.JButton btn_Multiplicação21;
    private javax.swing.JButton btn_Multiplicação22;
    private javax.swing.JButton btn_Multiplicação23;
    private javax.swing.JButton btn_Multiplicação3;
    private javax.swing.JButton btn_Multiplicação4;
    private javax.swing.JButton btn_Multiplicação5;
    private javax.swing.JButton btn_Multiplicação6;
    private javax.swing.JButton btn_Multiplicação7;
    private javax.swing.JButton btn_Multiplicação8;
    private javax.swing.JButton btn_Multiplicação9;
    private javax.swing.JButton btn_Novo;
    private javax.swing.JButton btn_Sair;
    private javax.swing.JButton btn_Soma;
    private javax.swing.JButton btn_Subtração;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_n1;
    private javax.swing.JTextField txt_n2;
    private javax.swing.JTextField txt_res;
    // End of variables declaration//GEN-END:variables
}
