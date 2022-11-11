/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HeartGame.GUI_Levels;

import HeartGame.CODE.RandomGenarate;
import HeartGame.GUI_Game.MainUI;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Thulani Wickramasinghe
 */
public class Level10 extends javax.swing.JFrame {

    /**
     * Creates new form Level10
     */
    public Level10() {
        initComponents();

        //center the form
        this.setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtans = new javax.swing.JTextField();
        btngo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnexit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HeartGame - 2022");
        setMinimumSize(new java.awt.Dimension(940, 585));

        jPanel1.setMaximumSize(new java.awt.Dimension(940, 585));
        jPanel1.setMinimumSize(new java.awt.Dimension(940, 585));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 1, 36)); // NOI18N
        jLabel2.setText("HEART GAME");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 20, 274, 50);

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        jLabel4.setText("Answer: ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 520, 110, 30);

        txtans.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        jPanel1.add(txtans);
        txtans.setBounds(180, 520, 170, 40);

        btngo.setFont(new java.awt.Font("Felix Titling", 1, 16)); // NOI18N
        btngo.setText("GO");
        btngo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngoActionPerformed(evt);
            }
        });
        jPanel1.add(btngo);
        btngo.setBounds(390, 510, 120, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HeartGameImages/10.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 90, 830, 400);

        btnexit.setFont(new java.awt.Font("Felix Titling", 1, 16)); // NOI18N
        btnexit.setText("EXIT");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel1.add(btnexit);
        btnexit.setBounds(810, 510, 120, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HeartGameImages/sii.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 940, 780);

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

    private void btngoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngoActionPerformed
        //to calculate the total score
        RandomGenarate.getScore();
        try {
            //genarate random game levels
            RandomGenarate.getRandom();
        } catch (SQLException ex) {
            Logger.getLogger(Level10.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btngoActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        //goto the main UI
        MainUI main = new MainUI();
        main.setVisible(true);
        main.pack();
        main.setLocationRelativeTo(null);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnexitActionPerformed

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
            java.util.logging.Logger.getLogger(Level10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Level10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Level10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Level10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Level10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnexit;
    private javax.swing.JButton btngo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtans;
    // End of variables declaration//GEN-END:variables
}
