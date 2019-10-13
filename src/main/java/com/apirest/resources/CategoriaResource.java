/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.resources;

import com.apirest.models.Categoria;
import com.apirest.repository.CategoriaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value="/cat")
@Api(value="API REST Categorias")
@CrossOrigin(origins="*", allowedHeaders = "*") 
public class CategoriaResource {
    
    
    /*Lista as catrgorias*/
    @Autowired
    CategoriaRepository categoriaRepository;
    
    @ApiOperation(value = "lista as categorias")
    @GetMapping("/categorias")
    public List<Categoria> getCategorias(){
        return categoriaRepository.findAll();
    }
    
    @ApiOperation(value="Mostra uma unica categoria")
    @GetMapping("/categorias/{id}")
    public Categoria listaProdutoUnico(@PathVariable(value="id")long id) {
        return categoriaRepository.findById(id);
    }
    
    @ApiOperation(value="Mostra uma unica categoria")
    @GetMapping("/categoriass/{id}")
    public List<Categoria> listaCategoriasFilhas(@PathVariable(value="id")long id){
        return categoriaRepository.findByIdPAI(id);
    }
}
