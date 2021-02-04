package com.modelmapperexample.demo.model;

public class OrdemDTO {
	  private String clienteNome;
	  private String clienteSobreNome;
	  private String enderecoRua;
	  private String enderecoCidade;
	  private BicicletaDestino bicicletaOrigemBicicletaOrigem;
	  
	  
	public OrdemDTO() {
		super();
	}
	public OrdemDTO(String clienteNome, String clienteSobreNome, String enderecoRua, String enderecoCidade,
			BicicletaDestino bicicletaOrigemBicicletaOrigem) {
		super();
		this.clienteNome = clienteNome;
		this.clienteSobreNome = clienteSobreNome;
		this.enderecoRua = enderecoRua;
		this.enderecoCidade = enderecoCidade;
		this.bicicletaOrigemBicicletaOrigem = bicicletaOrigemBicicletaOrigem;
	}
	public String getClienteNome() {
		return clienteNome;
	}
	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}
	public String getClienteSobreNome() {
		return clienteSobreNome;
	}
	public void setClienteSobreNome(String clienteSobreNome) {
		this.clienteSobreNome = clienteSobreNome;
	}
	public String getEnderecoRua() {
		return enderecoRua;
	}
	public void setEnderecoRua(String enderecoRua) {
		this.enderecoRua = enderecoRua;
	}
	public String getEnderecoCidade() {
		return enderecoCidade;
	}
	public void setEnderecoCidade(String enderecoCidade) {
		this.enderecoCidade = enderecoCidade;
	}
	public BicicletaDestino getBicicletaOrigemBicicletaOrigem() {
		return bicicletaOrigemBicicletaOrigem;
	}
	public void setBicicletaOrigemBicicletaOrigem(BicicletaDestino bicicletaOrigemBicicletaOrigem) {
		this.bicicletaOrigemBicicletaOrigem = bicicletaOrigemBicicletaOrigem;
	}
	  
}
