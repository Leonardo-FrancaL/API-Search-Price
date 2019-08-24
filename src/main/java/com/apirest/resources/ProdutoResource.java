package com.apirest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.repository.ProdutoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.apirest.models.Produto;
import java.util.List;

import javax.validation.Valid;


@RestController
@RequestMapping(value="/api")
@Api(value="API REST Produtos")
@CrossOrigin(origins="*") //Determina quais domínios podem acessar a API
public class ProdutoResource {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@ApiOperation(value = "Mostra uma lista de produtos")
	@GetMapping("/produtos")
	public List<Produto> listaProdutos(){
		return produtoRepository.findAll();
	}
	
	@ApiOperation(value="Mostra um unico produto")
	@GetMapping("/produto/{id}")
	public Produto listaProdutoUnico(@PathVariable(value="id")long id) {
		return produtoRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um Produto")
	@PostMapping("/produto")
	public Produto salvarProduto(@RequestBody @Valid Produto produto) {
		return produtoRepository.save(produto);
	}
	
	@ApiOperation(value="Deleta um produto")
	@DeleteMapping("/produto")
	public void deletarProduto(@RequestBody @Valid Produto produto) {
		produtoRepository.delete(produto);
	}
	
	@ApiOperation(value="Atualiza um produto")
	@PutMapping("/produto")
	public Produto atualizarProduto(@RequestBody @Valid Produto produto) {
		return produtoRepository.save(produto);
	}

}
