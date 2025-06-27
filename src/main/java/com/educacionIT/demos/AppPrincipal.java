package com.educacionIT.demos;

import java.util.Scanner;

import com.educacionIT.conexiones.Conexion;
import com.educacionIT.daos.ClienteDAO;
import com.educacionIT.daos.ComidaDAO;
import com.educacionIT.entidades.Cliente;
import com.educacionIT.entidades.Comida;

public class AppPrincipal {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		// Conexion.conectar();
//		ComidaDAO cDAO = new ComidaDAO();
//		System.out.print("Ingrese el nombre de la comida: ");
//        String nombre = scanner.nextLine();
//        System.out.print("Ingrese la descripcion de la comida: ");
//        String descripcion = scanner.nextLine();
//        System.out.print("Ingrese el precio de la comida: ");
//        Double precio = scanner.nextDouble();
//		
//        Comida comida5 = new Comida(nombre, descripcion, precio);
//        // cDAO.insertar(comida5);
//		Comida comida1 = new Comida();
//		
//		comida1.setNombre("Milanesa");
//		comida1.setDescripcion("Milanesa de carne con pure");
//		comida1.setPrecio(15000);
//		
//		
//		// cDAO.insertar(comida1);
//		
//		Comida comida2 = new Comida(2,"Pollo","Pollo con papas",13000);
//		// cDAO.insertar(comida2);
//		Comida comida3 = new Comida("Pizza", "pizza con queso", 14000);
//		// cDAO.insertar(comida3);
//		
//		Comida comida4 = new Comida("Empanada", "Empanada de carne", 2000);
//		//cDAO.insertar(comida4);
		
		//Eliminar un registro
		// ComidaDAO.borrar(2);
		
		// EDITAR UN REGISTRO
//		Comida comida5 = new Comida(1, "Canelones", "Canelones de espinaca con salsa blanca",18000);
//		ComidaDAO cDAO = new ComidaDAO();
//		cDAO.editar(comida5);
		
//LISTADO DE TODAS LAS COMIDAS
		ComidaDAO cDAO = new ComidaDAO();
		cDAO.consultar();
		
		//Agregar nuevo cliente
//		ClienteDAO nuevoCliente = new ClienteDAO();
//		Cliente cliente1 = new Cliente(41785403, "Lucas", "lucas@hotmail.com");
//		nuevoCliente.insertar(cliente1);
		
		//Eliminar cliente
//		ClienteDAO.eliminarCliente(3);

		//Actualizar cliente
		
//		Cliente clienteModificado = new Cliente(1, 42022311, "Iván Chanenko", "nuevo.email@hotmail.com");
//		ClienteDAO dao = new ClienteDAO();
//		dao.actualizar(clienteModificado);
		
		//LISTAR CLIENTES
		ClienteDAO clientesDAO = new ClienteDAO();
		clientesDAO.consultar();

	}

}
