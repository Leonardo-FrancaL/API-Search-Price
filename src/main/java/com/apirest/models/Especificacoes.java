/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.models;

import javax.persistence.CascadeType;
import static javax.persistence.CascadeType.ALL;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name="TB_ESPEC_PROD")
public class Especificacoes {
    
    private static final long serialVersionUID = 1l;
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    private String titulo;
    
    private String descTitulo;
   
  

   
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescTitulo() {
        return descTitulo;
    }

    public void setDescTitulo(String descTitulo) {
        this.descTitulo = descTitulo;
    }
    
    
    
    
}
