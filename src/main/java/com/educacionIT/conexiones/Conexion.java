package com.educacionIT.conexiones;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	static Connection conexion = null;
	
	public static Connection conectar() {
		
		try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");	
		conexion = DriverManager.getConnection("jdbc:mysql://localhost/java", "root","");	
		System.out.println("La conexion a la base de datos funcionó");
			
		} catch (Exception e) {
			System.out.println("La conexión a la base de datos falló");
			e.printStackTrace();
		}
		return conexion;
	};
	
	
}
