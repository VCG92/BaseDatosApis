package com.example.demo.models;

public class MovilFilter {
	private String marca = "any";
	private Range<Float> precio = new Range<Float>(0f, 10000f);
	private Range<Integer> ram = new Range<Integer>(0, 35);
	private boolean nfc = false;
	private String tecnologia = "any";
	
	public MovilFilter(String marca, Range<Float> precio, Range<Integer> ram, boolean nfc, String tecnologia) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.ram = ram;
		this.nfc = nfc;
		this.tecnologia = tecnologia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Range<Float> getPrecio() {
		return precio;
	}

	public void setPrecio(Range<Float> precio) {
		this.precio = precio;
	}

	public Range<Integer> getRam() {
		return ram;
	}

	public void setRam(Range<Integer> ram) {
		this.ram = ram;
	}

	public boolean isNfc() {
		return nfc;
	}

	public void setNfc(boolean nfc) {
		this.nfc = nfc;
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}
	
	
	
}
