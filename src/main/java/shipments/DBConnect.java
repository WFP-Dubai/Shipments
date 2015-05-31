package shipments;

import java.sql.*;

public class DBConnect {

     public Connection connect() {

         try {
             Class.forName("org.postgresql.Driver").newInstance();
             Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Shipments", "postgres", "wfp@1234");
             
             System.out.println("SuccessfulConnection");
             return conn;

         } catch (Exception e) {
             e.printStackTrace();
             return null;
         }
     }

     public boolean close(Connection c) {
         try {
             c.close();
             return true;
         } catch (Exception e) {
             return false;
         }
     }


}

