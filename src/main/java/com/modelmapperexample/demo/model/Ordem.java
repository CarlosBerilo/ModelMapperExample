package com.modelmapperexample.demo.model;

public class Ordem {
	private Cliente cliente;
	private Endereco enderecoFinanceiro;
	private BicicletaOrigem bicicletaOrigem;

	public Ordem() {
		super();
	}

	public Ordem(Cliente cliente, Endereco enderecoFinanceiro, BicicletaOrigem bicicletaOrigem) {
		super();
		this.cliente = cliente;
		this.enderecoFinanceiro = enderecoFinanceiro;
		this.bicicletaOrigem = bicicletaOrigem;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Endereco getEnderecoFinanceiro() {
		return enderecoFinanceiro;
	}

	public void setEnderecoFinanceiro(Endereco enderecoFinanceiro) {
		this.enderecoFinanceiro = enderecoFinanceiro;
	}

	public BicicletaOrigem getBicicletaOrigem() {
		return bicicletaOrigem;
	}

	public void setBicicletaOrigem(BicicletaOrigem bicicletaOrigem) {
		this.bicicletaOrigem = bicicletaOrigem;
	}

}
