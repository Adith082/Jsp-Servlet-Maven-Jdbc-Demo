package com.adith.web.dao;
import java.sql.*;
import com.adith.web.model.Tech;

public class TechDao {

	public Tech getTech(int aid) {
		Tech a = new Tech();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginsystem", "root", "35821");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from tech where aid="+aid);
			if(rs.next()) {
				a.setAid(rs.getInt("aid"));
				a.setAname(rs.getString("aname"));
				a.setTech(rs.getString("tech"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return a;
	}
}
