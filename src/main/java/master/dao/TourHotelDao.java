package master.dao;
import java.sql.*;

import master.dto.TourHotelDto;
import master.utilities.ConnectionFactory;

public class TourHotelDao {
    private Connection cn = null;
    private Statement st = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    private String select_sql = "SELECT hname, tplace FROM hotel WHERE hid=?";
    private String insert_sql = "INSERT INTO tour_hotel (hid,tid, hname,place) VALUES (?, ?, ?, ?)";

    public void insertData(TourHotelDto thdto) {
        try {
            ConnectionFactory con = new ConnectionFactory();
            this.cn = con.getConn();
            
            // Fetch data from hotel table using hid
            this.ps = this.cn.prepareStatement(this.select_sql);
            this.ps.setString(1, thdto.getHid());
            this.rs = this.ps.executeQuery();

            if (this.rs.next()) {
                // Prepare data for insert into tour_hotel table
                String hname = this.rs.getString("hname");
                String tplace = this.rs.getString("tplace");

                this.ps = this.cn.prepareStatement(this.insert_sql);
                this.ps.setString(1, thdto.getHid());
                this.ps.setString(2, thdto.getTid());
                this.ps.setString(3, hname);
                this.ps.setString(4, tplace);
                this.ps.executeUpdate();
            } else {
                System.out.println("No data found for the given hid.");
            }
        } catch (SQLException var2) {
            var2.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
