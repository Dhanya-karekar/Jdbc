package com.xworkz.jdbc.flower;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FlowerDTO9 {

	public static void main(String[] args) {
		String username = "root";
		String password = "4PM15IS@011";
		String url = "jdbc:mysql://127.0.0.1:3306/flower";
		String fqnOdDriverImpl = "com.mysql.cj.jdbc.Driver";

		Connection connection = null;

		try {
			Class.forName(fqnOdDriverImpl);
			connection = DriverManager.getConnection(url, username, password);
			String query = "insert into flowers_table2 values(9, 'dahlia','red',300.000,false,'decoration','dahlia','wild flower',7,9)";
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
