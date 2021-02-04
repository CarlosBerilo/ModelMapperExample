package com.modelmapperexample.demo.model;

public class BicicletaOrigem {
	private String marca;
	private String cor;
	private Integer Aro;
	public BicicletaOrigem() {
		super();
	}
	public BicicletaOrigem(String marca, String cor, Integer aro) {
		super();
		this.marca = marca;
		this.cor = cor;
		Aro = aro;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Integer getAro() {
		return Aro;
	}
	public void setAro(Integer aro) {
		Aro = aro;
	}
	
}
