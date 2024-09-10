package master.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import master.dto.RegisterDto;
import master.utilities.ConnectionFactory;

public class RegisterDao {
	 private Connection cn = null;
	   private Statement st = null;
	   private PreparedStatement ps = null;
	   private ResultSet rs = null;
	   //private String select_sql = "select * from food";
	   private String insert_sql = "insert into register values(?,?,?)";
	   //private String delete_sql = "delete from food where fid=?";
	   //private String update_sql = "update food set fname=?,fprice=? where fid=?";
	   
	   
	   
//	   public ResultSet getData() {
//		      try {
//		         ConnectionFactory con = new ConnectionFactory();
//		         this.cn = con.getConn();
//		         this.st = this.cn.createStatement();
//		         this.rs = this.st.executeQuery(this.select_sql);
//
//		         
//		      } catch (SQLException var2) {
//		         var2.printStackTrace();
//		      }
//		      return rs;
//
//		   }
//	
	   public void insertData(RegisterDto rdto) {
		      try {
		         ConnectionFactory con = new ConnectionFactory();
		         this.cn = con.getConn();
		         this.ps = this.cn.prepareStatement(this.insert_sql);
		         this.ps.setString(1, rdto.getUname());
		         this.ps.setString(2, rdto.getPass());
		         this.ps.setString(3, rdto.getNm());
		         this.ps.executeUpdate();
		      } catch (SQLException var2) {
		         var2.printStackTrace();
		      }

		   }
	   public boolean checkLogin(String uname,String pass)
		{
			boolean flag=false;
			String sql="select * from register where uname='"+uname+"' and pass='"+pass+"'";
			try
			{
				ConnectionFactory con=new ConnectionFactory();
				cn=con.getConn();
			    st=cn.createStatement();
			    rs=st.executeQuery(sql);
			    if(rs.next())
			    {
			    	flag=true;
			    }
			 	
			}
			
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			
			return flag;
		}
}
