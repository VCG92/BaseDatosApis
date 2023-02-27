package com.example.demo.models;

public class MobileFilter {
	private String marca ;
	private Range<Float> precio;
	private Range<Integer> ram ;
	private boolean nfc;
	private String tecnologia;
	
	public MobileFilter(String marca, Range<Float> precio, Range<Integer> ram, boolean nfc, String tecnologia) {
		super();
		this.marca = "any";
		this.precio = new Range<Float>(0f, 10000f);
		this.ram = new Range<Integer>(0, 100);
		this.nfc = false;
		this.tecnologia = "any";
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
