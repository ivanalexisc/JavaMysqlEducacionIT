package com.educacionIT.daos;

import java.sql.Connection;
import java.sql.Statement;

import com.educacionIT.conexiones.Conexion;
import com.educacionIT.entidades.Cliente;

public class ClienteDAO {

	
	public void insertar(Cliente c) {
		try {
			// #1 obtener la conexion con la base de datos
			Connection conexion = Conexion.conectar();
			//#2 armar la query
			String sql = "INSERT INTO CLIENTE (DNI, NOMBRE, EMAIL) VALUES "
			           + "('" + c.getDni() + "', '" + c.getNombre() + "', " + c.getEmail() + ")";
			//#3 crear el estado de la conexion
			Statement stmt = conexion.createStatement();
			
			//#4 ejecutar
			
			stmt.execute(sql);
			System.out.println("Datos del cliente guardados correctamente en la base de datos");
			
			//#5 cerrar recursos 
			
			stmt.close();
			conexion.close();
			
			
		} catch (Exception e) {
		
			System.out.println("No pude guardar los datos");
			e.printStackTrace();
			
		}
	}
	
}
