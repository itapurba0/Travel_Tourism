package master.dao;

import java.sql.*;

//import master.dto.BookingDto;
import master.utilities.ConnectionFactory;

public class BookingDao {
	private Connection cn = null;
	   private Statement st = null;
	   private PreparedStatement ps = null;
	   private ResultSet rs = null;
	   //private String select_sql = "select * from book";
	   //private String insert_sql="insert into book(tid,hid1,hid2,hid3,roomtype,uname) values(?,?,?,?,?,?)";
	   private String selectHotel_sql="select h.hname t.tplace1from tour_hotel h,tour t where h.place=t.tplace1";
	  // private String billing_sql ="select o.oid,o.odt,f.fid,f.fname,o.oqty,f.fprice,o.oqty*f.fprice totalprice from food f,order_details o where f.fid=o.fid";
	  // private String delete_sql = "delete from food where fid=?";
	   //private String update_sql = "update food set fname=?,fprice=? where fid=?";
	   
	   
//	   public void insertData(BookingDto bdto)
//		{
//			try
//			{
//				ConnectionFactory con = new ConnectionFactory();
//				cn=con.getConn();
//				ps=cn.prepareStatement(insert_sql);
//				
//				ps.setString(1,bdto.getTid());
//				ps.setString(2,bdto.getHid1());
//				ps.setString(3,bdto.getHid2());
//				ps.setString(4,bdto.getHid3());
//				ps.setString(5,bdto.getRoomtype());
//				ps.setString(6,bdto.getUname());
//				ps.executeUpdate();//Insert Data
//			}
//			
//			catch(SQLException se)
//			{
//				se.printStackTrace();
//			}
//		}
	   
	   public ResultSet getHotelData() {
		   try
			{
				ConnectionFactory con = new ConnectionFactory();
				cn=con.getConn();
				st=cn.createStatement();
				this.rs=st.executeQuery(selectHotel_sql);
			
			}
			
			catch(SQLException se)
			{
				se.printStackTrace();
			}
		   return rs;
		   
	   }
	   
//	   public ResultSet searchData(String bookid)
//		{
//			String sql="select * from book where bookid='"+bookid+"'";
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
