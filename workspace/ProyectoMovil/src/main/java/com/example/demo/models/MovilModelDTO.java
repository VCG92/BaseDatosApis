package com.example.demo.models;

public class MovilModelDTO {
	
	private String modelo;
    private String marca;
    private int nucleos;
    private int ram;
    private int almacenamiento;
    private float precio;
    
	public MovilModelDTO() {
		super();
	}

	public MovilModelDTO(String modelo, String marca, int nucleos, int ram, int almacenamiento, float precio) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.nucleos = nucleos;
		this.ram = ram;
		this.almacenamiento = almacenamiento;
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
    

}
