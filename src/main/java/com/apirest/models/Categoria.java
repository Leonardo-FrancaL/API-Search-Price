/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="TB_CATEGORIA")
public class Categoria {
    
    
    private static final long serialVersionUID = 1l;
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String descricao;
    
   
    private Long idPAI;

    public Long getIdPAI() {
        return idPAI;
    }

    public void setIdPAI(Long idPAI) {
        this.idPAI = idPAI;
    }
    
    
    
    

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    
    
    
    
    
    
}
