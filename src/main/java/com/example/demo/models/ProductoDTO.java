package com.example.demo.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class ProductoDTO {

	@Id
	private String _id;
	
	private String nombre;
	
	private Double precio;
	
	private LocalDate expira_fecha;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public LocalDate getExpira_fecha() {
		return expira_fecha;
	}

	public void setExpira_fecha(LocalDate expira_fecha) {
		this.expira_fecha = expira_fecha;
	}
	
	
}
