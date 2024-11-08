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
	   //private String select_sql = "select * from order_details";
	   private String insert_sql="insert into tour values(?,?,?,?,?,?,?)";
	  // private String billing_sql ="select o.oid,o.odt,f.fid,f.fname,o.oqty,f.fprice,o.oqty*f.fprice totalprice from food f,order_details o where f.fid=o.fid";
	  // private String delete_sql = "delete from food where fid=?";
	   //private String update_sql = "update food set fname=?,fprice=? where fid=?";
	   
	   
	   public void insertData(TourDto tdto)
		{
			try
			{
				ConnectionFactory con = new ConnectionFactory();
				cn=con.getConn();
				ps=cn.prepareStatement(insert_sql);
				
				ps.setString(1,tdto.getTid());
				ps.setString(2,tdto.getTname());
				ps.setString(3,tdto.getTplace1());
				ps.setString(4,tdto.getTplace2());
				ps.setString(5,tdto.getTplace3());
				ps.setString(6,tdto.getStdt());
				ps.setDouble(7,tdto.getPrice());
				ps.executeUpdate();//Insert Data
			}
			
			catch(SQLException se)
			{
				se.printStackTrace();
			}
		}
		
//		public void deleteData(FoodDto fdto)
//		{
//			try
//			{
//				ConnectionFactory con = new ConnectionFactory();
//				cn=con.getConn();
//				ps=cn.prepareStatement(delete_sql);
//				
//				ps.setString(1,fdto.getFid());
//				ps.executeUpdate();//Insert Data
//			}
//			
//			catch(SQLException se)
//			{
//				se.printStackTrace();
//			}
//		}
//		
//		public ResultSet getData()
//		{
//			try
//			{
//				ConnectionFactory con = new ConnectionFactory();
//				cn=con.getConn();
//				st=cn.createStatement();
//				rs=st.executeQuery(select_sql);
//			}
//			
//			catch(SQLException se)
//			{
//				se.printStackTrace();
//			}
//			return rs;
//		}
//		
//		public void updateData(FoodDto fdto)
//		{
//			try
//			{
//				ConnectionFactory con = new ConnectionFactory();
//				cn=con.getConn();
//				ps=cn.prepareStatement(update_sql);
//				
//				ps.setString(3,fdto.getFid());
//				ps.setString(1,fdto.getFname());
//				ps.setDouble(2,fdto.getFprice());
//				ps.executeUpdate();//Insert Data
//			}
//			
//			catch(SQLException se)
//			{
//				se.printStackTrace();
//			}
//		}
//		
//		public ResultSet searchData(String fname)
//		{
//			String sql="select * from food where fname='"+fname+"'";
//			try
//			{
//				ConnectionFactory con = new ConnectionFactory();
//				cn=con.getConn();
//				st=cn.createStatement();
//				rs=st.executeQuery(sql);
//			}
//			
//			catch(SQLException se)
//			{
//				se.printStackTrace();
//			}
//			return rs;
//		}
}
