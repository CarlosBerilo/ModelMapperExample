package com.modelmapperexample.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import com.modelmapperexample.demo.mapper.OrdemDTOMapper;
import com.modelmapperexample.demo.model.BicicletaOrigem;
import com.modelmapperexample.demo.model.Cliente;
import com.modelmapperexample.demo.model.Endereco;
import com.modelmapperexample.demo.model.Nome;
import com.modelmapperexample.demo.model.Ordem;
import com.modelmapperexample.demo.model.OrdemDTO;

@SpringBootTest
public class ModelmapperexampleApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testModelmapperexample() {
		Ordem ordem = new Ordem();
		ordem.setCliente(new Cliente(new Nome("Davi", "Silva")));
		ordem.setEnderecoFinanceiro(new Endereco("Av. Matheus", "Tel Aviv"));
		ordem.setBicicletaOrigem(new BicicletaOrigem("Caloi", "vermelha", 20));
		
		OrdemDTOMapper  ordemDTOMapper = new OrdemDTOMapper();
		OrdemDTO ordemDTO = ordemDTOMapper.toOrdemDTO(ordem);
		
		assertEquals(ordem.getCliente().getNome().getNome(), ordemDTO.getClienteNome());
		assertEquals(ordem.getCliente().getNome().getSobreNome(), ordemDTO.getClienteSobreNome());
		assertEquals(ordem.getEnderecoFinanceiro().getRua(), ordemDTO.getEnderecoRua());
		assertEquals(ordem.getEnderecoFinanceiro().getCidade(), ordemDTO.getEnderecoCidade());
		assertEquals(ordem.getBicicletaOrigem().getMarca(), ordemDTO.getBicicletaOrigemBicicletaOrigem().getMarca());
		assertEquals(ordem.getBicicletaOrigem().getCor(), ordemDTO.getBicicletaOrigemBicicletaOrigem().getCor());
		assertEquals(ordem.getBicicletaOrigem().getAro(), ordemDTO.getBicicletaOrigemBicicletaOrigem().getAro());
		
		Ordem ordem2 = new Ordem();
		ordem2.setCliente(new Cliente(new Nome("Elias", "Oliveira")));
		ordem2.setEnderecoFinanceiro(new Endereco("Av. Pedro", "Tel Aviv"));
		ordem2.setBicicletaOrigem(new BicicletaOrigem("Monark", "vermelha", 20));
		
		OrdemDTO ordemDTO2 = ordemDTOMapper.toOrdemDTO(ordem2);
		
		assertEquals("Elias", ordemDTO2.getClienteNome());
		assertEquals("Oliveira", ordemDTO2.getClienteSobreNome());
		assertEquals("Av. Pedro", ordemDTO2.getEnderecoRua());
		assertEquals("Tel Aviv", ordemDTO2.getEnderecoCidade());
		assertEquals("Monark", ordemDTO2.getBicicletaOrigemBicicletaOrigem().getMarca());
		assertEquals( "vermelha", ordemDTO2.getBicicletaOrigemBicicletaOrigem().getCor()); 
		assertEquals(20, ordemDTO2.getBicicletaOrigemBicicletaOrigem().getAro());
	
	}

}