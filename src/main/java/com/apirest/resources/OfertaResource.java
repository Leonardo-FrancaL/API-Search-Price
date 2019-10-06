/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.resources;

import com.apirest.models.Oferta;
import com.apirest.repository.OfertaRepository;
import io.swagger.annotations.Api;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/oferta")
@Api(value="API REST Produtos")
@CrossOrigin(origins="*", allowedHeaders = "*")
public class OfertaResource {
    
   /* 
    @Autowired 
    OfertaRepository ofertaRepository;
    
    
    @GetMapping("/oferta/{id}")
    public Oferta listarUnicaOferta(@PathVariable(value="id")long id){
        return ofertaRepository.findById(id);
    }
    
    @PostMapping("produto")
    public Oferta salvaUmaOferta(@RequestBody @Valid Oferta oferta)*/
    
}
