package master.dao;
import java.sql.*;


import master.utilities.ConnectionFactory;
public class HotelDao {
	  private Connection cn = null;
	   private Statement st = null;
	   private PreparedStatement ps = null;
	   private ResultSet rs = null;
	   private String select_sql = "select * from food";
	   private String insert_sql = "insert into food values(?,?,?)";
	   private String delete_sql = "delete from food where fid=?";
	   private String update_sql = "update food set fname=?,fprice=? where fid=?";
	   
	   
	   
	//    public ResultSet getData() {
	// 	      try {
	// 	         ConnectionFactory con = new ConnectionFactory();
	// 	         this.cn = con.getConn();
	// 	         this.st = this.cn.createStatement();
	// 	         this.rs = this.st.executeQuery(this.select_sql);

		         
	// 	      } catch (SQLException var2) {
	// 	         var2.printStackTrace();
	// 	      }
	// 	      return rs;

	// 	   }
//	
//	   public void insertData(Dto fdto) {
//		      try {
//		         ConnectionFactory con = new ConnectionFactory();
//		         this.cn = con.getConn();
//		         this.ps = this.cn.prepareStatement(this.insert_sql);
//		         this.ps.setString(1, fdto.getFid());
//		         this.ps.setString(2, fdto.getFname());
//		         this.ps.setDouble(3, fdto.getFprice());
//		         this.ps.executeUpdate();
//		      } catch (SQLException var2) {
//		         var2.printStackTrace();
//		      }
//
//		   }
//	   public void deleteData(FoodDto fdto) {
//		      try {
//		         ConnectionFactory con = new ConnectionFactory();
//		         this.cn = con.getConn();
//		         this.ps = this.cn.prepareStatement(this.delete_sql);
//		         this.ps.setString(1, fdto.getFid());
//		         this.ps.executeUpdate();
//		      } catch (SQLException var2) {
//		         var2.printStackTrace();
//		      }
//
//		   }
//	   public void updateData(FoodDto fdto) {
//		      try {
//		         ConnectionFactory con = new ConnectionFactory();
//		         this.cn = con.getConn();
//		         this.ps = this.cn.prepareStatement(this.update_sql);
//		         this.ps.setString(3, fdto.getFid());
//		         this.ps.setString(1, fdto.getFname());
//		         this.ps.setDouble(2, fdto.getFprice());
//		         this.ps.executeUpdate();
//		      } catch (SQLException var2) {
//		         var2.printStackTrace();
//		      }
//
//		   }
//	   public ResultSet getDataByName(String name) {
//	        try {
//	        	 ConnectionFactory con = new ConnectionFactory();
//		         this.cn = con.getConn();
//	            PreparedStatement ps = cn.prepareStatement("SELECT * FROM food WHERE fname = ?");
//	            ps.setString(1, name);
//	            rs = ps.executeQuery();
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//	        return rs;
//	    }


}
