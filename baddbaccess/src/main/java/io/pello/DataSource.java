package io.pello;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * 
 * @author pello altadill
 *
 */
public class DataSource {
	
	private Connection connection;
	
	public DataSource () {
		init();
	}
	
	private void init () {
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			    connection =
			      DriverManager.getConnection("jdbc:mysql://localhost/pruebas","root","");

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	/**
	 * @return the connection
	 */
	public Connection getConnection() {
		return connection;
	}

	/**
	 * @param connection the connection to set
	 */
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}

