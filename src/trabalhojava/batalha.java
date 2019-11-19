
package trabalhojava;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.util.Random;
import javax.swing.JOptionPane;


public class batalha extends javax.swing.JFrame {

    public batalha() {
        initComponents();
        setSize(733,486);
        setResizable(false);
        setLocationRelativeTo(this);
        setTitle("Batalha");
        hpH(hpHarry);
        hpV(hpVal);
        batalha();
    }
    public void batalha(){
        URL som = getClass().getResource("../sons/batalha.wav");
        AudioClip play = Applet.newAudioClip(som);
        play.play();
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
    
    public void jogadaadversario(){
     int num = (int)Math.round(Math.random()*3+1);
     if(num == 1){hpH(hpHarry - 10);
      JOptionPane.showMessageDialog(null,"Valdemort usou o feitiço 1");
     }
     if(num == 2){hpH(hpHarry - 15);JOptionPane.showMessageDialog(null,"Valdemort usou o feitiço 2");}
     if(num == 3){hpV(hpVal + 5);JOptionPane.showMessageDialog(null,"Valdemort usou o contra-feitiço");}
    
    }
    public void perdeu(){
    if (hpVal <= 0) {
            JOptionPane.showMessageDialog(null,"Valdemort perdeu");
                        new inicio().setVisible(true);
                        dispose();
        } 
    if (hpHarry <= 0){
            JOptionPane.showMessageDialog(null,"Harry perdeu");
            new inicio().setVisible(true);
            dispose();
}}
       
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

        cash.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        cash.setForeground(new java.awt.Color(255, 255, 255));
        cash.setText("jLabel3");
        getContentPane().add(cash);
        cash.setBounds(150, 420, 80, 30);

        cash2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        cash2.setForeground(new java.awt.Color(255, 255, 255));
        cash2.setText("jLabel5");
        getContentPane().add(cash2);
        cash2.setBounds(520, 420, 80, 40);

        jButton1.setBackground(new java.awt.Color(205, 154, 30));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton1.setText("Feitiço 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 320, 140, 27);

        jButton2.setBackground(new java.awt.Color(205, 154, 30));
        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton2.setText("Feitiço 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 350, 140, 27);

        jButton3.setBackground(new java.awt.Color(205, 154, 30));
        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton3.setText("Contra-Feitiço");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(40, 380, 140, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/essa.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 870, 472);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    hpV(hpVal- 10);
    JOptionPane.showMessageDialog(null,"Harry usou o feitiço 1");
    jogadaadversario();
    perdeu();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      hpV(hpVal - 15);
    JOptionPane.showMessageDialog(null,"Harry usou o feitiço 2");
    jogadaadversario();
     perdeu();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     hpH(hpHarry + 5);
    JOptionPane.showMessageDialog(null,"Harry usou o contra-feitiço");
    jogadaadversario();
     perdeu();
    }//GEN-LAST:event_jButton3ActionPerformed

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
