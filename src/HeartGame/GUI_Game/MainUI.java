package HeartGame.GUI_Game;

import javax.swing.JFrame;

/**
 *
 * @author Thulani Wickramasinghe
 */
public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form MainUI
     */
    public MainUI() {
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
        btnlogIn = new javax.swing.JButton();
        btnsignIn = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        datetime = new javax.swing.JLabel();
        datelbl = new javax.swing.JLabel();
        timelbl1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HeartGame - 2022");
        setMinimumSize(new java.awt.Dimension(726, 447));

        jPanel1.setMaximumSize(new java.awt.Dimension(726, 447));
        jPanel1.setMinimumSize(new java.awt.Dimension(726, 447));
        jPanel1.setPreferredSize(new java.awt.Dimension(726, 447));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 36)); // NOI18N
        jLabel1.setText("HEART GAME");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 274, 50);

        btnlogIn.setFont(new java.awt.Font("Felix Titling", 1, 16)); // NOI18N
        btnlogIn.setText("LOG IN");
        btnlogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogInActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogIn);
        btnlogIn.setBounds(550, 130, 120, 50);

        btnsignIn.setFont(new java.awt.Font("Felix Titling", 1, 16)); // NOI18N
        btnsignIn.setText("SIGN IN");
        btnsignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignInActionPerformed(evt);
            }
        });
        jPanel1.add(btnsignIn);
        btnsignIn.setBounds(550, 220, 120, 50);

        btnexit.setFont(new java.awt.Font("Felix Titling", 1, 16)); // NOI18N
        btnexit.setText("EXIT");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel1.add(btnexit);
        btnexit.setBounds(550, 310, 120, 50);

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 19)); // NOI18N
        jLabel3.setText("LET'S FIND THE VALUE OF THE HEART !!!");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 60, 560, 60);

        datetime.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        datetime.setText("Date & Time");
        datetime.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                datetimeMouseMoved(evt);
            }
        });
        jPanel1.add(datetime);
        datetime.setBounds(40, 280, 140, 40);

        datelbl.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jPanel1.add(datelbl);
        datelbl.setBounds(30, 320, 210, 40);

        timelbl1.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jPanel1.add(timelbl1);
        timelbl1.setBounds(30, 360, 210, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HeartGameImages/reg1.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, -10, 728, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        //exit from the program
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnsignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignInActionPerformed
        //sign into the game
        SignUp sign = new SignUp();
        sign.setVisible(true);
        sign.pack();
        sign.setLocationRelativeTo(null);
        sign.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnsignInActionPerformed

    private void btnlogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogInActionPerformed
        //log into the game
        LogIn log = new LogIn();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnlogInActionPerformed

    //MOUSE MOVED EVENT
    private void datetimeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datetimeMouseMoved
        /**
         *world time web API simply creating
         * 
         * 
         * @author Sarmila Sivaraja
         */
        
        //EXTERNAL WEB API - World time API 
        //get the url and add current location /Asia/Colombo
        //Shows the time of the colombo city
        try (java.util.Scanner s = new java.util.Scanner(new java.net.URL("http://worldtimeapi.org/api/Asia/Colombo").openStream(), "UTF-8").useDelimiter("\\A")) {
            String x = s.next();
            System.out.println("today date " + x);

            String[] Xsplit = x.split(",");
            String dateApi = (Xsplit[2].split("\""))[3];
            String[] dateAndTime = dateApi.split("T");

            System.out.println(dateAndTime[0]);
            datelbl.setText(dateAndTime[0]);
            timelbl1.setText(dateAndTime[1]);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_datetimeMouseMoved

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnlogIn;
    private javax.swing.JButton btnsignIn;
    private javax.swing.JLabel datelbl;
    private javax.swing.JLabel datetime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel timelbl1;
    // End of variables declaration//GEN-END:variables
}