package DBConnect;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class DBconnect {
    
//    public static Connection connect(){
//        Connection con = null;
//        
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/teadb","root","");
//            
//        } catch (Exception e) {
//            System.out.println("DBConnector error" +e);
//        }
//        return con;
//    }
    
     public static Connection getConnection(){
        Connection con=null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/teadb","root","");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }
}
