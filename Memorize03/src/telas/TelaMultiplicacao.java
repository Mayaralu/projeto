/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author Mayara Lu
 */
public class TelaMultiplicacao extends javax.swing.JFrame {

    /**
     * Creates new form TelaMultiplicacao
     */
    public TelaMultiplicacao() {
        initComponents();
        panResultado.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        spnMultplicador = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        btnGerar = new javax.swing.JButton();
        lblMultiplicador = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblMultiplicando = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        panResultado = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblResposta = new javax.swing.JLabel();
        lblProduto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Escolha Multiplicador");

        spnMultplicador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        spnMultplicador.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnMultplicadorStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Gerar Multiplicando");

        btnGerar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGerar.setText("Gerar");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        lblMultiplicador.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblMultiplicador.setText("X");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText(".");

        lblMultiplicando.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblMultiplicando.setText("X");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("=");

        txtProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnVerificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVerificar.setText("?");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Resposta");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Soma ou Total");

        lblResposta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout panResultadoLayout = new javax.swing.GroupLayout(panResultado);
        panResultado.setLayout(panResultadoLayout);
        panResultadoLayout.setHorizontalGroup(
            panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(43, 43, 43)
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panResultadoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panResultadoLayout.setVerticalGroup(
            panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lblProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/multiply.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblMultiplicador)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(lblMultiplicando)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerificar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGerar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(spnMultplicador, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(42, 42, 42)
                .addComponent(jLabel5)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addComponent(panResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(spnMultplicador))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnGerar))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMultiplicador)
                            .addComponent(jLabel9)
                            .addComponent(lblMultiplicando)
                            .addComponent(jLabel11)
                            .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerificar))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(panResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spnMultplicadorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnMultplicadorStateChanged
        // TODO add your handling code here:
        //Pegando o Valor do Spinner da Primeira Parcela e transformando em Inteiro
        int multiplicador = Integer.parseInt(spnMultplicador.getValue().toString());
        //Gerando númeroa de 1 a 10
        double num = 1 + Math.random() * (11-1);
        //Pegando apenas a parte inteira de num
        int nInteiro = (int) num;

        lblMultiplicador.setText(Integer.toString(multiplicador));
        lblMultiplicando.setText(Integer.toString(nInteiro));

    }//GEN-LAST:event_spnMultplicadorStateChanged

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        // TODO add your handling code here:
        GeraInteiro num = new GeraInteiro();
        lblMultiplicando.setText(Integer.toString(num.getNInteiro()));

    }//GEN-LAST:event_btnGerarActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:
        //Pegando o que está na caixa de texto
        int soma = Integer.parseInt(txtProduto.getText());
        //Pegando a primeira parcela
        int multiplicador = Integer.parseInt(lblMultiplicador.getText());
        //Segunda parcela
        int multiplicando = Integer.parseInt(lblMultiplicando.getText());
        int produto = multiplicador * multiplicando;
        if(soma == produto){
            lblResposta.setText("RIGHT!!");
        }else{
            lblResposta.setText("WRONG!!");
        }
        lblProduto.setText(Integer.toString(produto));
        panResultado.setVisible(true);
    }//GEN-LAST:event_btnVerificarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMultiplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMultiplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMultiplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMultiplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMultiplicacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblMultiplicador;
    private javax.swing.JLabel lblMultiplicando;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JPanel panResultado;
    private javax.swing.JSpinner spnMultplicador;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables
}
