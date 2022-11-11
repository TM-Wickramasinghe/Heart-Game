package HeartGame.CODE;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Thulani Wickramasinghe
 */
public class MyConnCheck {

    //get the connection with the Database
    public static Connection getConnection() {
        /**
         *load the JDBC driver
         * 
         * 
         * @author Maurice Muteti
         */
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/mathquiz", "root", "");
            System.out.println("Driver loaded Successfully");
        } catch (Exception ex) {
            System.out.println("Driver Failed to loaded Successfully");
            System.out.println(ex.getMessage());
        }
        return conn;
    }

}
