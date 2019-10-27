/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_HISTORY")
public class HistoricoMelhorPreco implements Serializable{
    
    private static final long serialVersionUID = 1l;
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private double his_preco;
    
    private Date his_dt_periodo;
    
    
}
