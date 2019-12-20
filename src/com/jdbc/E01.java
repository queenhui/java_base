package com.jdbc;
import java.sql.*;




public class E01 {

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/tb_user";
			String username="root";
			String password="123456";
			conn=DriverManager.getConnection(url,username,password);
			stmt=conn.createStatement();
			String sql="select*from tb_user";
			rs=stmt.executeQuery(sql);
			System.out.println("id  |   name   |  sex"+" |   email   |   birthday");
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String sex=rs.getString("sex");
				String email=rs.getString("email");
				String birthday=rs.getString("birthday");
				System.out.println(id+"   |   "+name+"   |   "+sex+"   |   "+email+"   |   "+birthday);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			if(rs !=null) {rs.close();}
			if(stmt !=null) {stmt.close();}
			if(conn !=null) {conn.close();}
			
		}
		
		

	}

}