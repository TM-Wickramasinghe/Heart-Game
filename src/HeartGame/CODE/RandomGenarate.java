package HeartGame.CODE;

import HeartGame.GUI_Levels.*;
import HeartGame.GUI_Game.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Thulani Wickramasinghe
 */
public class RandomGenarate {

    //public variables
    public static int r;
    public static int r1;
    public static int score;
    public static int ans;
    public static String answer;
    public static int digit;
    public static String user;
    public static int pID;
    public static Timer stopwatch;
    public static int count = 0;
    public static int delay = 1000;

    public static void player(int player) {
        pID = player;
    }

    public static void username(String uname) {
        user = uname;
    }

    //timer to the game
    public static void startTimer(int countPassed) {
        /**
         * Swing timer
         *
         *
         * @author plzHelpM3
         */

        //ACTION LISTNER
        ActionListener action;
        action = new ActionListener() {

            //POLYMORPHISM
            //in here below child class can override the startTimer(parent class) method
            @Override
            public void actionPerformed(ActionEvent e) {

                //check if the all levels are done by the player before the time is over.
                if (r1 != 10) {
                    switch (count) {
                        //time is over
                        case 0:
                            stopwatch.stop();
                            JOptionPane.showMessageDialog(null, "Your Time Is Over! ", "TimesUp!", 2);

                            break;
                        //reminde the player to left time
                        case 15:
                            JOptionPane.showMessageDialog(null, "You have 15 seconds remaining!!!", "TimesUp!", 2);
                            count--;
                            break;
                        default:
                            count--;
                            break;
                    }
                }else{
                    stopwatch.stop();
                }
            }
        };
        stopwatch = new Timer(delay, action);
        stopwatch.setInitialDelay(0);
        stopwatch.start();
        count = countPassed;
    }

    //genarate random UI game levels
    public static void getRandom() throws SQLException {

        //get random digits
        Random rnd = new Random();
        digit = rnd.nextInt(10) + 1;

        //check the left time is 3 seconds or not
        if ((count != 3)) {

            //check if the 10 levels are genarated or not
            if ((r != 10)) {

                //assigning digits to relavant game level UI
                switch (digit) {
                    case 1:
                        Level1 l1 = new Level1();
                        l1.setVisible(true);
                        l1.pack();
                        l1.setLocationRelativeTo(null);
                        l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        r = r + 1;
                        r1 = r;
                        break;
                    case 2:
                        Level2 l2 = new Level2();
                        l2.setVisible(true);
                        l2.pack();
                        l2.setLocationRelativeTo(null);
                        l2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        r = r + 1;
                        r1 = r;
                        break;
                    case 3:
                        Level3 l3 = new Level3();
                        l3.setVisible(true);
                        l3.pack();
                        l3.setLocationRelativeTo(null);
                        l3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        r = r + 1;
                        r1 = r;
                        break;
                    case 4:
                        Level4 l4 = new Level4();
                        l4.setVisible(true);
                        l4.pack();
                        l4.setLocationRelativeTo(null);
                        l4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        r = r + 1;
                        r1 = r;
                        break;
                    case 5:
                        Level5 l5 = new Level5();
                        l5.setVisible(true);
                        l5.pack();
                        l5.setLocationRelativeTo(null);
                        l5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        r = r + 1;
                        r1 = r;
                        break;
                    case 6:
                        Level6 l6 = new Level6();
                        l6.setVisible(true);
                        l6.pack();
                        l6.setLocationRelativeTo(null);
                        l6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        r = r + 1;
                        r1 = r;
                        break;
                    case 7:
                        Level7 l7 = new Level7();
                        l7.setVisible(true);
                        l7.pack();
                        l7.setLocationRelativeTo(null);
                        l7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        r = r + 1;
                        r1 = r;
                        break;
                    case 8:
                        Level8 l8 = new Level8();
                        l8.setVisible(true);
                        l8.pack();
                        l8.setLocationRelativeTo(null);
                        l8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        r = r + 1;
                        r1 = r;
                        break;
                    case 9:
                        Level9 l9 = new Level9();
                        l9.setVisible(true);
                        l9.pack();
                        l9.setLocationRelativeTo(null);
                        l9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        r = r + 1;
                        r1 = r;
                        break;
                    case 10:
                        Level10 l10 = new Level10();
                        l10.setVisible(true);
                        l10.pack();
                        l10.setLocationRelativeTo(null);
                        l10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        r = r + 1;
                        r1 = r;
                        break;
                    default:
                        System.out.println("Invalid Answer");
                        break;
                }

                //send the player username to the ranking UI via this method
                Ranking.username(user);

                //check the user has already play the game or not. if he played then update the score else insert to the database 
            } else {
                ResultSet rset;
                PreparedStatement st;

                if (checkplayer(pID)) {

                    String query = "UPDATE `ranking` SET `score`= ? WHERE `playerID` =?";
                    try {

                        st = MyConnCheck.getConnection().prepareStatement(query);
                        st.setInt(1, score);
                        st.setInt(2, pID);

                        if (st.executeUpdate() > 0) {

                            Result rs = new Result();
                            rs.setVisible(true);
                            rs.pack();
                            rs.setLocationRelativeTo(null);

                            if (score == 10) {
                                Result.lblresult.setText("  AWESOME ! ");
                                Result.result.setText(user + ", You Scored The Highest Score. Your Total Score is " + score);
                            } else if ((score <= 10) && (score >= 8)) {
                                Result.lblresult.setText("  EXCELLENT ! ");
                                Result.result.setText(user + ", Your Total Score is " + score);
                            } else if ((score > 5) && (score <= 7)) {
                                Result.lblresult.setText("  VERY GOOD ! ");
                                Result.result.setText(user + ", Your Total Score is " + score);
                            } else if ((score == 4) && (score == 5)) {
                                Result.lblresult.setText("  Keep It Up !");
                                Result.result.setText(user + ", Your Total Score is " + score);
                            } else {
                                Result.lblresult.setText("  DON'T GIVE UP !");
                                Result.result.setText(user + ", Your Total Score is " + score);
                            }
                            rs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            r = 0;
                            score = 0;
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(RandomGenarate.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {

                    String query = "INSERT INTO `ranking`( `playerID`, `score`) VALUES (?,?) ";
                    try {

                        st = MyConnCheck.getConnection().prepareStatement(query);
                        st.setInt(1, pID);
                        st.setInt(2, score);

                        if (st.executeUpdate() > 0) {

                            Result rs = new Result();
                            rs.setVisible(true);
                            rs.pack();
                            rs.setLocationRelativeTo(null);

                            if (score == 10) {
                                Result.lblresult.setText("  AWESOME ! ");
                                Result.result.setText(user + ", You Scored The Highest Score. Your Total Score is " + score);
                            } else if ((score <= 10) && (score >= 8)) {
                                Result.lblresult.setText("  EXCELLENT ! ");
                                Result.result.setText(user + ", Your Total Score is " + score);
                            } else if ((score > 5) && (score <= 7)) {
                                Result.lblresult.setText("  VERY GOOD ! ");
                                Result.result.setText(user + ", Your Total Score is " + score);
                            } else if ((score == 4) && (score == 5)) {
                                Result.lblresult.setText("  Keep It Up !");
                                Result.result.setText(user + ", Your Total Score is " + score);
                            } else {
                                Result.lblresult.setText("  DON'T GIVE UP !");
                                Result.result.setText(user + ", Your Total Score is " + score);
                            }
                            rs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            r = 0;
                            score = 0;
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(RandomGenarate.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
        //when time is over
        } else {
            
                switch (digit) {
                    case 1:
                        Level1 l1 = new Level1();
                        l1.dispose();
                        break;
                    case 2:
                        Level2 l2 = new Level2();
                        l2.dispose();
                        break;
                    case 3:
                        Level3 l3 = new Level3();
                        l3.dispose();
                        break;
                    case 4:
                        Level4 l4 = new Level4();
                        l4.dispose();
                        break;
                    case 5:
                        Level5 l5 = new Level5();
                        l5.dispose();
                        break;
                    case 6:
                        Level6 l6 = new Level6();
                        l6.dispose();
                        break;
                    case 7:
                        Level7 l7 = new Level7();
                        l7.dispose();
                        break;
                    case 8:
                        Level8 l8 = new Level8();
                        l8.dispose();
                        break;
                    case 9:
                        Level9 l9 = new Level9();
                        l9.dispose();
                        break;
                    case 10:
                        Level10 l10 = new Level10();
                        l10.dispose();
                        break;
                }
                
            PreparedStatement st;
            
            //check the user has already play the game or not. if he played then update the score else insert to the database 
            if (checkplayer(pID)) {

                String query = "UPDATE `ranking` SET `score`= ? WHERE `playerID` =?";
                try {

                    st = MyConnCheck.getConnection().prepareStatement(query);
                    st.setInt(1, score);
                    st.setInt(2, pID);

                    if (st.executeUpdate() > 0) {

                        Result rs = new Result();
                        rs.setVisible(true);
                        rs.pack();
                        rs.setLocationRelativeTo(null);

                        if (score == 10) {
                            Result.lblresult.setText("  AWESOME ! ");
                            Result.result.setText(user + ", You Scored The Highest Score. Your Total Score is " + score);
                        } else if ((score <= 10) && (score >= 8)) {
                            Result.lblresult.setText("  EXCELLENT ! ");
                            Result.result.setText(user + ", Your Total Score is " + score);
                        } else if ((score > 5) && (score <= 7)) {
                            Result.lblresult.setText("  VERY GOOD ! ");
                            Result.result.setText(user + ", Your Total Score is " + score);
                        } else if ((score == 4) && (score == 5)) {
                            Result.lblresult.setText("  Keep It Up !");
                            Result.result.setText(user + ", Your Total Score is " + score);
                        } else {
                            Result.lblresult.setText("  DON'T GIVE UP !");
                            Result.result.setText(user + ", Your Total Score is " + score);
                        }
                        rs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        r = 0;
                        score = 0;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(RandomGenarate.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {

                String query = "INSERT INTO `ranking`( `playerID`, `score`) VALUES (?,?) ";
                try {

                    st = MyConnCheck.getConnection().prepareStatement(query);
                    st.setInt(1, pID);
                    st.setInt(2, score);

                    if (st.executeUpdate() > 0) {

                        Result rs = new Result();
                        rs.setVisible(true);
                        rs.pack();
                        rs.setLocationRelativeTo(null);

                        if (score == 10) {
                            Result.lblresult.setText("  AWESOME ! ");
                            Result.result.setText(user + ", You Scored The Highest Score. Your Total Score is " + score);
                        } else if ((score <= 10) && (score >= 8)) {
                            Result.lblresult.setText("  EXCELLENT ! ");
                            Result.result.setText(user + ", Your Total Score is " + score);
                        } else if ((score > 5) && (score <= 7)) {
                            Result.lblresult.setText("  VERY GOOD ! ");
                            Result.result.setText(user + ", Your Total Score is " + score);
                        } else if ((score == 4) && (score == 5)) {
                            Result.lblresult.setText("  Keep It Up !");
                            Result.result.setText(user + ", Your Total Score is " + score);
                        } else {
                            Result.lblresult.setText("  DON'T GIVE UP !");
                            Result.result.setText(user + ", Your Total Score is " + score);
                        }
                        rs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        r = 0;
                        score = 0;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(RandomGenarate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    //calculate the total score
    public static void getScore() {

        //check the answer is correct or not in relavant game levels UI
        switch (digit) {
            case 1:
                answer = Level1.txtans.getText();
                ans = Integer.parseInt(answer);
                if (ans == 9) {
                    score = score + 1;
                }
                break;
            case 2:
                answer = Level2.txtans.getText();
                ans = Integer.parseInt(answer);
                if (ans == 1) {
                    score = score + 1;
                }
                break;
            case 3:
                answer = Level3.txtans.getText();
                ans = Integer.parseInt(answer);
                if (ans == 1) {
                    score = score + 1;
                }
                break;
            case 4:
                answer = Level4.txtans.getText();
                ans = Integer.parseInt(answer);
                if (ans == 5) {
                    score = score + 1;
                }
                break;
            case 5:
                answer = Level5.txtans.getText();
                ans = Integer.parseInt(answer);
                if (ans == 2) {
                    score = score + 1;
                }
                break;
            case 6:
                answer = Level6.txtans.getText();
                ans = Integer.parseInt(answer);
                if (ans == 7) {
                    score = score + 1;
                }
                break;
            case 7:
                answer = Level7.txtans.getText();
                ans = Integer.parseInt(answer);
                if (ans == 5) {
                    score = score + 1;
                }
                break;
            case 8:
                answer = Level8.txtans.getText();
                ans = Integer.parseInt(answer);
                if (ans == 1) {
                    score = score + 1;
                }
                break;
            case 9:
                answer = Level9.txtans.getText();
                ans = Integer.parseInt(answer);
                if (ans == 3) {
                    score = score + 1;
                }
                break;
            case 10:
                answer = Level10.txtans.getText();
                ans = Integer.parseInt(answer);
                if (ans == 2) {
                    score = score + 1;
                }
                break;
            default:
                break;
        }
    }

    //check if the player is already play the game once
    public static boolean checkplayer(int ID) {
        PreparedStatement st;
        ResultSet rs;
        boolean checkID = false;
        String query = "SELECT  * FROM `ranking` WHERE `playerID` = ?";
        try {
            st = MyConnCheck.getConnection().prepareStatement(query);
            st.setInt(1, ID);
            rs = st.executeQuery();

            if (rs.next()) {
                checkID = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RandomGenarate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return checkID;
    }

}
