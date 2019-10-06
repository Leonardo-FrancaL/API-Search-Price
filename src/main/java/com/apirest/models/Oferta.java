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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name="TB_Oferta")
public class Oferta implements Serializable{
    
    private static final long serialVersionUID = 1l;
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "offer_id")
    private Long id;
    
    @NotNull
    private double offer_valorUni;
    
    private String offer_descricao;
    
    @OneToOne
    @JoinColumn(name = "EMP_ID")
    private Empresa empresa;
    
    @Column(length = 1000)
    private String linkOferta;

    public String getLinkOferta() {
        return linkOferta;
    }

    public void setLinkOferta(String linkOferta) {
        this.linkOferta = linkOferta;
    }
    
    
    
    public Long getOffer_id() {
        return id;
    }

    public void setOffer_id(Long offer_id) {
        this.id = offer_id;
    }

    public double getOffer_valorUni() {
        return offer_valorUni;
    }

    public void setOffer_valorUni(double offer_valorUni) {
        this.offer_valorUni = offer_valorUni;
    }

    public String getOffer_descricao() {
        return offer_descricao;
    }

    public void setOffer_descricao(String offer_descricao) {
        this.offer_descricao = offer_descricao;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    
    
}
