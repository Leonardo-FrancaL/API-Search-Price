/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.resources;

import com.apirest.models.HistoricoMelhorPreco;
import com.apirest.repository.HistoricoMelhorPrecoRepository;
import io.swagger.annotations.Api;
import java.util.List;
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
@RequestMapping(value="/hist")
@Api(value="API REST Produtos")
@CrossOrigin(origins="*", allowedHeaders = "*")
public class HistoricoResource {
    
    @Autowired
    private HistoricoMelhorPrecoRepository his;
    
    @GetMapping("/historico")
    public List<HistoricoMelhorPreco> getHistorico(){
        return his.findAll();
    }
    
    @PostMapping("/historico")
    public HistoricoMelhorPreco salvarHistorico(@RequestBody @Valid HistoricoMelhorPreco his){
        return this.his.save(his);
    }
    
    @GetMapping("/historico/{id}")
    public List<HistoricoMelhorPreco> listaCategoriasFilhas(@PathVariable(value = "id") int id) {
        return his.findByIdProd(id);
    }
}
