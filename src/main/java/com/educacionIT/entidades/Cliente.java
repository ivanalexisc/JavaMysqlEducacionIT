package com.educacionIT.entidades;

public class Cliente {

//ATRIBUTOS
	
private int id;
private int dni;
private String nombre;
private String email;


//metodos 

public Cliente(int id, int dni, String nombre, String email) {
	this.id = id;
	this.dni = dni;
	this.nombre = nombre;
	this.email = email;
}
public Cliente( int dni, String nombre, String email) {
	this.dni = dni;
	this.nombre = nombre;
	this.email = email;
}


public Cliente() {

}

//GETTERS SETTER

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getDni() {
	return dni;
}
public void setDni(int dni) {
	this.dni = dni;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

//TO STRING

@Override
public String toString() {
	return "Cliente [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", email=" + email + "]";
}

	
	
}
