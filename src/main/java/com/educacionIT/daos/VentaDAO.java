package com.educacionIT.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.educacionIT.conexiones.Conexion;
import com.educacionIT.entidades.Venta;

public class VentaDAO {

    public static void insertar(Venta v) {
        try {
            Connection conexion = Conexion.conectar();
            String sql = "INSERT INTO VENTA (IDCLIENTE, IDCOMIDA, VENDEDOR) VALUES ("
                    + v.getIdCliente() + ", "
                    + v.getIdComida() + ", '"
                    + v.getVendedor() + "')";

            Statement stmt = conexion.createStatement();
            stmt.execute(sql);

            System.out.println("Venta insertada correctamente.");
            stmt.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("No se pudo insertar la venta.");
            e.printStackTrace();
        }
    }

    public static void borrar(int idVenta) {
        try {
            Connection conexion = Conexion.conectar();
            String sql = "DELETE FROM VENTA WHERE IDVENTA = " + idVenta;

            Statement stmt = conexion.createStatement();
            stmt.execute(sql);

            System.out.println("Venta eliminada correctamente.");
            stmt.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("No se pudo eliminar la venta.");
            e.printStackTrace();
        }
    }

    public static void editar(Venta v) {
        try {
            Connection conexion = Conexion.conectar();
            String sql = "UPDATE VENTA SET IDCLIENTE = " + v.getIdCliente()
                    + ", IDCOMIDA = " + v.getIdComida()
                    + ", VENDEDOR = '" + v.getVendedor()
                    + "' WHERE IDVENTA = " + v.getIdVenta();

            Statement stmt = conexion.createStatement();
            stmt.execute(sql);

            System.out.println("Venta actualizada correctamente.");
            stmt.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("No se pudo actualizar la venta.");
            e.printStackTrace();
        }
    }

    public static void consultar() {
        try {
            Connection conexion = Conexion.conectar();
            String sql = "SELECT * FROM VENTA";
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Listado de ventas:");
            while (rs.next()) {
                System.out.println("ID Venta: " + rs.getInt("IDVENTA"));
                System.out.println("ID Cliente: " + rs.getInt("IDCLIENTE"));
                System.out.println("ID Comida: " + rs.getInt("IDCOMIDA"));
                System.out.println("Vendedor: " + rs.getString("VENDEDOR"));
                System.out.println("---------------------------");
            }

            stmt.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("No se pudieron consultar las ventas.");
            e.printStackTrace();
        }
    }
}

