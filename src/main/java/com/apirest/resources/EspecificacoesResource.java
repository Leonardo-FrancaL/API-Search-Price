/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.resources;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/espc")
@Api(value="API REST Especificacoes")
@CrossOrigin(origins="*", allowedHeaders = "*") 
public class EspecificacoesResource {
    /*Como tem a classe ProdutoResouce essa classe não é necessaria
    pois a classe ProdutoResouce já tem um metodo que retorna um JSON com o produto e suas respectivas informações*/
}
