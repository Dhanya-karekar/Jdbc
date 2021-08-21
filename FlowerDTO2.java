package com.xworkz.jdbc.flower;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FlowerDTO2 {

	public static void main(String[] args) {
		String username = "root";
		String password = "4PM15IS@011";
		String url = "jdbc:mysql://127.0.0.1:3306/flower";
		String fqnOdDriverImpl = "com.mysql.cj.jdbc.Driver";

		Connection connection = null;

		try {
			Class.forName(fqnOdDriverImpl);
			connection = DriverManager.getConnection(url, username, password);
			String query = "insert into flowers_table2 values(2, 'lotus','Pink',100.000,true,'decoration','lotus','wild flower',120,8)";
			Statement statement = connection.createStatement();
			statement.execute(query);
			System.out.println(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

}
