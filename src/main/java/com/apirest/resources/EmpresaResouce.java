/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.resources;

import com.apirest.models.Empresa;
import com.apirest.repository.EmpresaRepository;
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
@RequestMapping(value="/emp")
@Api(value="API REST Site")
@CrossOrigin(origins="*", allowedHeaders = "*")
public class EmpresaResouce {
    
    @Autowired
    EmpresaRepository empresa;
    
    @GetMapping("/empresas/{id}")
    public Empresa getEmpresa(@PathVariable(value="id")long id){
        return empresa.findById(id);
    }
    
    @GetMapping("/empresas")
    public List<Empresa> getListEmpresas(){
        return empresa.findAll();
    }
    
    @PostMapping("/empresa")
    public Empresa salvaEmpresa(@RequestBody @Valid Empresa emp){
        return empresa.save(emp);
    }
}
