package master.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import master.dto.TourDto;
import master.utilities.ConnectionFactory;

public class TourDao {
	 private Connection cn = null;
	   private Statement st = null;
	   private PreparedStatement ps = null;
	   private ResultSet rs = null;
	   private String select_sql = "select * from order_details";
	   private String insert_sql = "insert into order_details(fid,oqty) values(?,?)";
	   private String billing_sql ="select o.oid,o.odt,f.fid,f.fname,o.oqty,f.fprice,o.oqty*f.fprice totalprice from food f,order_details o where f.fid=o.fid";
	  // private String delete_sql = "delete from food where fid=?";
	   //private String update_sql = "update food set fname=?,fprice=? where fid=?";
	   
	   
	   public ResultSet getData() {
		      try {
		         ConnectionFactory con = new ConnectionFactory();
		         this.cn = con.getConn();
		         this.st = this.cn.createStatement();
		         this.rs = this.st.executeQuery(this.select_sql);

		         
		      } catch (SQLException var2) {
		         var2.printStackTrace();
		      }
		      return rs;
	   }
	   
	   public void insertData(TourDto tdto) {
		      try {
		         ConnectionFactory con = new ConnectionFactory();
		         this.cn = con.getConn();
		         this.ps = this.cn.prepareStatement(this.insert_sql);
		         this.ps.setString(1, tdto.getFid());
		         this.ps.setInt(2, tdto.getQty());
		         this.ps.executeUpdate();
		      } catch (SQLException var2) {
		         var2.printStackTrace();
		      }

		   }
	   public ResultSet getBillingData() {
		      try {
		         ConnectionFactory con = new ConnectionFactory();
		         this.cn = con.getConn();
		         this.st = this.cn.createStatement();
		         this.rs = this.st.executeQuery(this.billing_sql);

		         
		      } catch (SQLException var2) {
		         var2.printStackTrace();
		      }
		      return rs;
	   }
}
