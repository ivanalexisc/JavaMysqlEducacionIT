package com.educacionIT.entidades;

public class Comida {

//ATRIBUTOS
private int id;
private String nombre;
private String descripcion;
private double precio;



//METODOS

//este constructor esta mal, porque el ID es autoincremental en la base de datos y si yo construyo un nuevo objeto tengo que pasarle 4 parametros si o si
public Comida(int id, String nombre, String descripcion, double precio) {
	this.id = id;
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.precio = precio;
}
public Comida(String nombre, String descripcion, double precio) {
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.precio = precio;
}

public Comida() {
	
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}

@Override
public String toString() {
	return "Comida [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + "]";
}


	
	
}
