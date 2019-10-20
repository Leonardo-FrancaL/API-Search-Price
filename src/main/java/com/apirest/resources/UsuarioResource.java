/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.resources;


import com.apirest.models.Usuario;
import com.apirest.repository.UsuarioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/user")
@Api(value="API REST Usuarios")
@CrossOrigin(origins="*", allowedHeaders = "*")
public class UsuarioResource {
    
    /*Utilizado para cadastrar os usuarios*/
    @Autowired
    UsuarioRepository usuarioRepository;
    
        @ApiOperation(value = "Mostra uma lista de usuario")
	@GetMapping("/usuarios")
	public List<Usuario> listaProdutos(){
		return usuarioRepository.findAll();
	}
	
        @ApiOperation(value="Mostra um unico usuario por email")
	@GetMapping("/usuario/{nome}")
	public Usuario listaUsuarioUnico(@PathVariable(value="nome")String u) {
		return usuarioRepository.findByEmail(u);
	}
        
        @GetMapping("/usuarioi/{id}")
        public Usuario listaUsuarioId(@PathVariable(value="id")long id) {
		return usuarioRepository.findById(id);
	}
        
	@ApiOperation(value="Salva um usuario")
	@PostMapping("/usuario")
	public Usuario salvarUsuario(@RequestBody @Valid Usuario produto) { 
		return usuarioRepository.save(produto);
	}
	
	@ApiOperation(value="Deleta um usuario")
	@DeleteMapping("/usuario/{id}")
	public void deletarProduto(@PathVariable(value="id")long id) {
            usuarioRepository.delete(usuarioRepository.findById(id));
	}
	
	@ApiOperation(value="Atualiza um usuario")
	@PutMapping("/usuario")
	public Usuario atualizarUsuario(@RequestBody @Valid Usuario produto) {
		return usuarioRepository.save(produto);
	}
}
