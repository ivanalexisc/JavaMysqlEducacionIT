package com.educacionIT.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.educacionIT.conexiones.Conexion;
import com.educacionIT.entidades.Comida;

public class ComidaDAO {

	public void insertar(Comida c) {
		try {
			// #1 obtener la conexion con la base de datos
			Connection conexion = Conexion.conectar();
			//#2 armar la query
			String sql = "INSERT INTO COMIDA (NOMBRE, DESCRIPCION, PRECIO) VALUES "
			           + "('" + c.getNombre() + "', '" + c.getDescripcion() + "', " + c.getPrecio() + ")";
			//#3 crear el estado de la conexion
			Statement stmt = conexion.createStatement();
			
			//#4 ejecutar
			
			stmt.execute(sql);
			System.out.println("Datos guardados correctamente en la base de datos");
			
			//#5 cerrar recursos 
			
			stmt.close();
			conexion.close();
			
			
		} catch (Exception e) {
		
			System.out.println("No pude guardar los datos");
			e.printStackTrace();
			
		}
	}
	
	public static void borrar (int id) {
		try {
			Connection conexion = Conexion.conectar();
			String sqlBorrar = "DELETE FROM COMIDA WHERE ID = " + id;
			
			Statement stmtBorrar = conexion.createStatement();
			
			stmtBorrar.execute(sqlBorrar);
			
			System.out.println("El registro fue eliminado con exito");
			stmtBorrar.close();
			conexion.close();
			
		} catch (Exception e) {
			System.out.println("No se pudo eliminar el registro");
			e.printStackTrace();
		}
		
	}
	
	public static void editar(Comida comida) {
		try {
			Connection conexion = Conexion.conectar();
			
			String sqlEditar = "UPDATE COMIDA SET NOMBRE = '" + comida.getNombre() + "', "
			           + "DESCRIPCION = '" + comida.getDescripcion() + "', "
			           + "PRECIO = " + comida.getPrecio()
			           + " WHERE ID = " + comida.getId();
			
			Statement stmtEditar = conexion.createStatement();
			stmtEditar.execute(sqlEditar);
			
			System.out.println("El registro fue editado correctamente");
			stmtEditar.close();
			conexion.close();

			
		} catch (Exception e) {
			
			System.out.println("No se pudo editar el registro");
			e.printStackTrace();
			
		}
	}
	
	public static void consultar() {
		
		try {
			Connection conexion = Conexion.conectar();
			String sqlConsultar = "SELECT * FROM COMIDA";
			Statement stmtConsultar = conexion.createStatement();
			ResultSet datos = stmtConsultar.executeQuery(sqlConsultar);
			System.out.println("Los datos fueron mostrados correctamente ....");
			
			while(datos.next()) {
				System.out.println("Id : " + datos.getInt("id"));
				System.out.println("Nombre : " + datos.getString("nombre"));
				System.out.println("Descripcion : " + datos.getString("descripcion"));
				System.out.println("Precio : " + datos.getDouble("precio"));
			}
			
			
			
			
			stmtConsultar.close();
			conexion.close();
			
			
			
		} catch (Exception e) {

			System.out.println("No se pudo listar las comidas");
		
		}
		
	}
	
	
}
