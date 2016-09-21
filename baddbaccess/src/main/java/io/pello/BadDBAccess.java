package io.pello;

/**
* ResumenSql
* Muestra las cuatro sentencias SQL b�sicas:
*   select, insert, delete y update
* javac ResumenSql.java
* java -cp .:sqlitejdbc-v056.jar ResumenSql
*/
import java.sql.*;

public class BadDBAccess {
  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    ResultSet resultset = null;
    Connection conn =
      DriverManager.getConnection("jdbc:mysql://localhost/pruebas","root","");
    
    Statement stat = conn.createStatement();

	///////////////////////////////////////////////////////
	// SELECT, mostrar datos
	///////////////////////////////////////////////////////	
    resultset = stat.executeQuery("select * from colegas;");
    while (resultset.next()) {
      System.out.println("id = " + resultset.getString("id"));
      System.out.println("nombre = " + resultset.getString("nombre"));
    }
    resultset.close();
    
	///////////////////////////////////////////////////////
    // ELIMINAR registros
	///////////////////////////////////////////////////////
    // Sentencia delete
//   	int resultado = stat.executeUpdate("delete from mitabla where id>4");
//   	System.out.println("Resultado del delete: " + resultado);
//   	
	///////////////////////////////////////////////////////
    // INSERTAR nuevos registros
	///////////////////////////////////////////////////////
    // Sentencia insert
//   	resultado = stat.executeUpdate("insert into mitabla (id, nombre) values(666,'Satan');");
//   	System.out.println("Resultado del insert: " + resultado);
   	

	///////////////////////////////////////////////////////
    // MODIFICAR registros
	///////////////////////////////////////////////////////
    // Sentencia update
//   	resultado = stat.executeUpdate("update mitabla set nombre='Mou' where id>5");
//   	System.out.println("Resultado del update: " + resultado);


	
	///////////////////////////////////////////////////////
    // Sentencias preparadas
	///////////////////////////////////////////////////////
	// Nos permiten ejecutar varios INSERT, UPDATE y DELETE en una sola orden.
//	PreparedStatement prep = conn.prepareStatement("insert into mitabla values (?, ?);");
//
//    prep.setInt(1, 5);
//    prep.setString(2, "Melkor");
//    prep.addBatch();
//
//    prep.setInt(1, 6);
//    prep.setString(2, "Sauron");
//    prep.addBatch();
//
//    prep.executeBatch();
//
//	/// SELECT final
//    resultset = stat.executeQuery("select * from mitabla;");
//    while (resultset.next()) {
//      System.out.println("id : " + resultset.getString("id"));
//      System.out.println("nombre : " + resultset.getString("nombre"));
//    }
//    resultset.close();
    conn.close();
  }
}