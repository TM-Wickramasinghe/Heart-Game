/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HeartGame.GUI_Game;

import HeartGame.CODE.MyConnCheck;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFrame;
import javax.mail.Session;
import javax.mail.Transport;
import javax.swing.JOptionPane;

/**
 *
 * @author Thulani Wickramasinghe
 */
public class ForgotPassword extends javax.swing.JFrame {

    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnsend = new javax.swing.JButton();
        lblshow = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HeartGame - 2022");
        setMaximumSize(new java.awt.Dimension(726, 447));
        setMinimumSize(new java.awt.Dimension(726, 447));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(726, 447));
        jPanel1.setMinimumSize(new java.awt.Dimension(726, 447));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(726, 447));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 36)); // NOI18N
        jLabel1.setText("HEART GAME");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(12, 13, 274, 50);

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 22)); // NOI18N
        jLabel2.setText("Recover Your Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 100, 273, 28);

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel3.setText(" Email");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 200, 80, 34);

        btnsend.setFont(new java.awt.Font("Felix Titling", 1, 16)); // NOI18N
        btnsend.setText("SEND");
        btnsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendActionPerformed(evt);
            }
        });
        jPanel1.add(btnsend);
        btnsend.setBounds(210, 250, 98, 39);

        lblshow.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        lblshow.setToolTipText("");
        jPanel1.add(lblshow);
        lblshow.setBounds(194, 330, 360, 60);

        txtemail.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(txtemail);
        txtemail.setBounds(210, 200, 330, 39);

        btnback.setFont(new java.awt.Font("Felix Titling", 1, 16)); // NOI18N
        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback);
        btnback.setBounds(600, 370, 98, 39);

        btnreset.setFont(new java.awt.Font("Felix Titling", 1, 16)); // NOI18N
        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel1.add(btnreset);
        btnreset.setBounds(320, 250, 98, 39);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HeartGameImages/img.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(650, 349));
        jLabel5.setMinimumSize(new java.awt.Dimension(650, 349));
        jLabel5.setPreferredSize(new java.awt.Dimension(650, 349));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(180, 10, 500, 440);

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

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        //reset the fields
        txtemail.setText("");
        lblshow.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        //back to the login 
        LogIn log = new LogIn();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendActionPerformed
        /**
         *send an email using java mail API
         * 
         * 
         * @author Bintu Harwani
         */

//email sending using api with smtp server
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", 465);
        props.put("mail.smtp.user", "heartgame.hg@gmail.com");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.debug", "true");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");

        try {

            Statement st = MyConnCheck.getConnection().createStatement();
            ResultSet result = st.executeQuery("SELECT `password` FROM `players` WHERE `email` LIKE '" + txtemail.getText().trim() + "'");

            if (result.next()) {
                String fetchedPassword = result.getString("password");
                Session session = Session.getDefaultInstance(props, null);
                session.setDebug(true);
                MimeMessage message = new MimeMessage(session);
                message.setText("Password for your Heart Game account is " + fetchedPassword);
                message.setSubject("The Heart Game");
                message.setFrom(new InternetAddress("heartgame.hg@gmail.com"));
                message.addRecipient(RecipientType.TO, new InternetAddress(txtemail.getText().trim()));
                message.saveChanges();
                Transport transport = session.getTransport("smtp");
                transport.connect("smtp.gmail.com", "heartgame.hg@gmail.com", "Heart123*");
                transport.sendMessage(message, message.getAllRecipients());
                transport.close();
                lblshow.setText("Your password has mailed to you");
            }else{
                JOptionPane.showMessageDialog(rootPane,"Email Address is not found","Invalid Email!",2);
            }
            
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }//GEN-LAST:event_btnsendActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblshow;
    private javax.swing.JTextField txtemail;
    // End of variables declaration//GEN-END:variables
}