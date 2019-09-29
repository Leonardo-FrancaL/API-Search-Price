/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.repository;

import com.apirest.models.Usuario;
import com.apirest.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Leonardo
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findById(long id);
    Usuario findByEmail(String email);
}
