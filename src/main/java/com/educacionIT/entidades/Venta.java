package com.educacionIT.entidades;

public class Venta {
    private int idVenta;
    private int idCliente;
    private int idComida;
    private String vendedor;

    // Constructores
    public Venta(int idVenta, int idCliente, int idComida, String vendedor) {
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.idComida = idComida;
        this.vendedor = vendedor;
    }

    public Venta(int idCliente, int idComida, String vendedor) {
        this.idCliente = idCliente;
        this.idComida = idComida;
        this.vendedor = vendedor;
    }

    // Getters y Setters
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Venta [idVenta=" + idVenta + ", idCliente=" + idCliente + ", idComida=" + idComida + ", vendedor=" + vendedor + "]";
    }
}

