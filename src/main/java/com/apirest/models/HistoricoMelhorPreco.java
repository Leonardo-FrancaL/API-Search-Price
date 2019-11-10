/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.models;

import com.apirest.repository.HistoricoMelhorPrecoRepository;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="TB_HISTORY")
public class HistoricoMelhorPreco implements Serializable{
    
    private static final long serialVersionUID = 1l;
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "HIS_ID")
    private Long id;
    
    private double his_preco;
    
    private String his_dt_periodo;
    
    @OneToOne
    @JoinColumn(name = "PROD_ID")
    private Produto produto;
    
    private int idProd;

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getHis_preco() {
        return his_preco;
    }

    public void setHis_preco(double his_preco) {
        this.his_preco = his_preco;
    }

    public String getHis_dt_periodo() {
        return his_dt_periodo;
    }

    public void setHis_dt_periodo(String his_dt_periodo) {
        this.his_dt_periodo = his_dt_periodo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
}
