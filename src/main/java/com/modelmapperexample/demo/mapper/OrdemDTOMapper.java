package com.modelmapperexample.demo.mapper;

import org.modelmapper.ModelMapper;

import com.modelmapperexample.demo.model.Ordem;
import com.modelmapperexample.demo.model.OrdemDTO;

public class OrdemDTOMapper {	
     public OrdemDTO toOrdemDTO(Ordem ordem) {
    	ModelMapper modelMapper = new ModelMapper();
    	OrdemDTO ordemDTO = modelMapper.map(ordem, OrdemDTO.class);
		return ordemDTO;		
	}
}
