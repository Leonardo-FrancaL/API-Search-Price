package com.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.models.Produto;
import java.util.List;
import com.apirest.models.Categoria;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	Produto findById(long id);

        //Produto findByDescproduto(String nome);
        List<Produto> findByCategoria(Categoria cat);
}
