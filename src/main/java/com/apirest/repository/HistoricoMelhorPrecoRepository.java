/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.repository;

import com.apirest.models.HistoricoMelhorPreco;
import com.apirest.models.Produto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricoMelhorPrecoRepository extends JpaRepository<HistoricoMelhorPreco,Long>{
    HistoricoMelhorPreco findById(long id);
    List<HistoricoMelhorPreco> findByIdProd(int produto);
}