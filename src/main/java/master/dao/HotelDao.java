package master.dao;
import java.sql.*;

import master.dto.HotelDto;
import master.utilities.ConnectionFactory;
public class HotelDao {
	  private Connection cn = null;
	   private Statement st = null;
	   private PreparedStatement ps = null;
	   private ResultSet rs = null;
	   private String select_sql = "select * from food";
	   private String insert_sql = "insert into hotel values(?,?,?)";
	   private String delete_sql = "delete from hotel where hid=?";
	   private String update_sql = "update hotel set hname=?,Tplace=? where hid=?";
	   
	   
	   
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
	   public void insertData(HotelDto hdto) {
		      try {
		         ConnectionFactory con = new ConnectionFactory();
		         this.cn = con.getConn();
		         this.ps = this.cn.prepareStatement(this.insert_sql);
		         this.ps.setString(1, hdto.getHid());
		         this.ps.setString(2, hdto.getHname());
		         this.ps.setString(3, hdto.getTplace());
		         this.ps.executeUpdate();
		      } catch (SQLException var2) {
		         var2.printStackTrace();
		      }

		   }
	   public void deleteData(HotelDto hdto) {
		      try {
		         ConnectionFactory con = new ConnectionFactory();
		         this.cn = con.getConn();
		         this.ps = this.cn.prepareStatement(this.delete_sql);
		         this.ps.setString(1, hdto.getHid());
		         this.ps.executeUpdate();
		      } catch (SQLException var2) {
		         var2.printStackTrace();
		      }

		   }
	   public void updateData(HotelDto hdto) {
		      try {
		         ConnectionFactory con = new ConnectionFactory();
		         this.cn = con.getConn();
		         this.ps = this.cn.prepareStatement(this.update_sql);
		         this.ps.setString(3, hdto.getHid());
		         this.ps.setString(1, hdto.getHname());
		         this.ps.setString(2, hdto.getTplace());
		         this.ps.executeUpdate();
		      } catch (SQLException var2) {
		         var2.printStackTrace();
		      }

		   }
	//  public ResultSet getDataByName(String name) {
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
