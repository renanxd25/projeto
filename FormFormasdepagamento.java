/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;

/**
 *
 * @author HOUSE
 */
public class FormFormasdepagamento extends javax.swing.JFrame {

    /**
     * Creates new form FormFormasdepagamento
     */
    public FormFormasdepagamento() {
        initComponents();
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
        seldinheiro = new javax.swing.JRadioButton();
        selcartao = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        seldinheiro.setText("Dinheiro");
        seldinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seldinheiroActionPerformed(evt);
            }
        });

        selcartao.setText("Cartão");
        selcartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selcartaoActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/money.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/visa.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/maestro.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mastercard.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/paypal.png"))); // NOI18N

        jButton1.setText("Finalizar pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seldinheiro)
                    .addComponent(selcartao))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addComponent(jLabel2))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(seldinheiro))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(selcartao)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 51, 399, 217);

        jLabel1.setFont(new java.awt.Font("AngryBirds", 1, 14)); // NOI18N
        jLabel1.setText("FORMAS DE PAGAMENTO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(129, 16, 177, 19);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo-branco.png"))); // NOI18N
        jLabel7.setText("jLabel1");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 420, 300);

        setSize(new java.awt.Dimension(435, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selcartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selcartaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selcartaoActionPerformed

    private void seldinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seldinheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seldinheiroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        /*if(seldinheiro.getText().isEmpty()) or (campoParaCadastrarSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os dados de usuario ");
            campoParanomeDoUsuario.requestFocus();
        }else if(campoParaCadastrarSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha os dados de Senha ");
            campoParaCadastrarSenha.requestFocus();
        } else if(campoCadastrarEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha os dados de Email");
            campoCadastrarEmail.requestFocus();
        } else 
            if (dev==0){
            users.setNomedousuario(campoParanomeDoUsuario.getText());
            users.setNomedasenha(campoParaCadastrarSenha.getText());
            users.setNomedoemail(campoCadastrarEmail.getText());
            cad.Salvar(users);
            campoParanomeDoUsuario.setText("");
            campoParaCadastrarSenha.setText("");
            campoCadastrarEmail.setText("");
            campoParanomeDoUsuario.setEnabled(false);
            campoParaCadastrarSenha.setEnabled(false);
            campoCadastrarEmail.setEnabled(false);
            dispose();
        }   else{
       // JOptionPane.showMessageDialog(rootPane,"Cadastrado com sucesso");
        /*TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);*/
        dispose();
        JOptionPane.showMessageDialog(rootPane, "Seu pedido está a caminho");
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormFormasdepagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFormasdepagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFormasdepagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFormasdepagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFormasdepagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton selcartao;
    private javax.swing.JRadioButton seldinheiro;
    // End of variables declaration//GEN-END:variables
}
