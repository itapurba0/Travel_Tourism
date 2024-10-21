package master.utilities;
import java.sql.*;

public class ConnectionFactory {
   private Connection cn = null;


   public Connection getConn() {
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         this.cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_tourism", "root", "root");
      } catch (ClassNotFoundException var2) {
         var2.printStackTrace();
      } catch (SQLException var3) {
         var3.printStackTrace();
      }

      return this.cn;
   }
}