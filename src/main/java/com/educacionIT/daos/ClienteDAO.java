package com.educacionIT.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.educacionIT.conexiones.Conexion;
import com.educacionIT.entidades.Cliente;

public class ClienteDAO {

	
	public void insertar(Cliente c) {
		try {
			// #1 obtener la conexion con la base de datos
			Connection conexion = Conexion.conectar();
			//#2 armar la query
			String sql = "INSERT INTO CLIENTE (DNI, NOMBRE, EMAIL) VALUES (" 
			           + c.getDni() + ", '" 
			           + c.getNombre() + "', '" 
			           + c.getEmail() + "')";
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
	
	public static void eliminarCliente(int id) {
		
		try {
			
			Connection conexion = Conexion.conectar();
			
			String borrarCliente = "DELETE FROM CLIENTE WHERE ID = "+ id;
			
			Statement stmtBorrarCliente = conexion.createStatement();
			
			stmtBorrarCliente.execute(borrarCliente);
			System.out.println("El registro fue eliminado con exito");
			
			stmtBorrarCliente.close();
			conexion.close();
			
		} catch (Exception e) {
			System.out.println("El registro no pudo ser eliminado");
			e.printStackTrace();
		}
		
		
	}
	
	public void actualizar(Cliente c) {
	    try {
	        // #1 obtener la conexión
	        Connection conexion = Conexion.conectar();

	        // #2 armar la query SQL con parámetros
	        String sql = "UPDATE CLIENTE SET DNI = ?, NOMBRE = ?, EMAIL = ? WHERE ID = ?";

	        // #3 preparar el statement
	        PreparedStatement ps = conexion.prepareStatement(sql);

	        // #4 setear los valores
	        ps.setInt(1, c.getDni());
	        ps.setString(2, c.getNombre());
	        ps.setString(3, c.getEmail());
	        ps.setInt(4, c.getId());

	        // #5 ejecutar la actualización
	        int filas = ps.executeUpdate();

	        if (filas > 0) {
	            System.out.println("Cliente actualizado correctamente.");
	        } else {
	            System.out.println("No se encontró un cliente con ese ID.");
	        }

	        // #6 cerrar recursos
	        ps.close();
	        conexion.close();

	    } catch (Exception e) {
	        System.out.println("Error al actualizar el cliente.");
	        e.printStackTrace();
	    }
	}
	
public static void consultar() {
		
		try {
			Connection conexion = Conexion.conectar();
			String sqlConsultar = "SELECT * FROM CLIENTE";
			Statement stmtConsultar = conexion.createStatement();
			ResultSet datos = stmtConsultar.executeQuery(sqlConsultar);
			System.out.println("Los datos fueron mostrados correctamente ....");
			
			while(datos.next()) {
				System.out.println("DNI : " + datos.getInt("dni"));
				System.out.println("Email : " + datos.getString("email"));
				System.out.println("Id : " + datos.getInt("id"));
				System.out.println("Nombre : " + datos.getString("nombre"));
			}
			
			
			
			
			stmtConsultar.close();
			conexion.close();
			
			
			
		} catch (Exception e) {

			System.out.println("No se pudo listar los clientes");
		
		}
		
	}
	
}
