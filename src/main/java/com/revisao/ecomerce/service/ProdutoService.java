package com.revisao.ecomerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.revisao.ecomerce.dto.ProdutoDTO;
import com.revisao.ecomerce.entity.Produto;
import com.revisao.ecomerce.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository repo;
	
	public List<ProdutoDTO> findAll(){
		List<Produto> lista = repo.findAll();
		return lista.stream().map(x -> new ProdutoDTO(x)).toList();
	}
	
	public Page<ProdutoDTO> FindPagina(Pageable pagina){
		Page<Produto> busca = repo.findAll(pagina);
		return busca.map(x -> new ProdutoDTO(x));
	} 
	
}
