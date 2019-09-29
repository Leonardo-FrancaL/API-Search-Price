/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.repository;

import com.apirest.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    Categoria findById(long id);
    
}
