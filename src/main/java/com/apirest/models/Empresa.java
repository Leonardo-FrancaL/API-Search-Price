/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="TB_EMPRESA")
public class Empresa {
    
    /*Ainda sera implementado 
    tera uma relação de 1 para muitos com produto
    Ex: 1 empresa pode ter varios produtos */
    
    private static final long serialVersionUID = 1l;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "EMP_ID")
    private Long id;
    
    @Column(length = 1000)
    private String linkFoto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLinkFoto() {
        return linkFoto;
    }

    public void setLinkFoto(String linkFoto) {
        this.linkFoto = linkFoto;
    }
    
    
}
