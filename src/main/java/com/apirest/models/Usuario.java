/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_USER")
public class Usuario  implements Serializable {

    /*Cria a tabela de usuario, o user que vai logar para cadastrar produtos 
    ou seja nesse caso uma empresa que quer exibir o seus produtos no site*/
    private static final long serialVersionUID = 1l;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
   
    private String email;
    private String senha;
    private String empresa;
    private String linkSite;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getLinkSite() {
        return linkSite;
    }

    public void setLinkSite(String linkSite) {
        this.linkSite = linkSite;
    }
    
    
}
