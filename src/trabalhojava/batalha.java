
package trabalhojava;

import java.util.Random;


public class batalha extends javax.swing.JFrame {

    public batalha() {
        initComponents();
        setSize(733,486);
        setResizable(false);
        setLocationRelativeTo(this);
        setTitle("Batalha");
        hpH(hpHarry);
        hpV(hpVal);
        
    }
    
    Random random = new Random(); 
    int hpHarry = 80;
    int hpVal = 90;

    public void hpH (int vida){
    this.hpHarry = vida;
    cash.setText(""+vida);
    }
    public void hpV (int vida){
    this.hpVal = vida;
    cash2.setText(""+vida);
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cash = new javax.swing.JLabel();
        cash2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        cash.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cash.setText("jLabel3");
        getContentPane().add(cash);
        cash.setBounds(120, 420, 80, 30);

        cash2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cash2.setText("jLabel5");
        getContentPane().add(cash2);
        cash2.setBounds(520, 410, 80, 40);

        jButton1.setText("Feitiço 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 290, 110, 25);

        jButton2.setText("Feitiço 2");
        getContentPane().add(jButton2);
        jButton2.setBounds(70, 320, 110, 25);

        jButton3.setText("Contra-Feitiço");
        getContentPane().add(jButton3);
        jButton3.setBounds(70, 350, 110, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/essa.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 870, 472);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(batalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(batalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(batalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(batalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new batalha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cash;
    private javax.swing.JLabel cash2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
