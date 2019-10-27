/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TB_AVALIACAO")
public class Avaliacao implements Serializable {
    /*Cria a tabela produto e seus campos mostrados abaixo*/
    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private boolean aval_status;

    @NotNull
    private int aval_rating_star;

    @NotNull
    @Column(length = 1000)
    private String aval_comentario;

    @NotNull
    private String aval_titulo;
    
    private String aval_post_owner;

    public String getAval_post_owner() {
        return aval_post_owner;
    }

    public void setAval_post_owner(String aval_post_owner) {
        this.aval_post_owner = aval_post_owner;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAval_status() {
        return aval_status;
    }

    public void setAval_status(boolean aval_status) {
        this.aval_status = aval_status;
    }

    public int getAval_rating_star() {
        return aval_rating_star;
    }

    public void setAval_rating_star(int aval_rating_star) {
        this.aval_rating_star = aval_rating_star;
    }

    public String getAval_comentario() {
        return aval_comentario;
    }

    public void setAval_comentario(String aval_comentario) {
        this.aval_comentario = aval_comentario;
    }

    public String getAval_titulo() {
        return aval_titulo;
    }

    public void setAval_titulo(String aval_titulo) {
        this.aval_titulo = aval_titulo;
    }

        
}
