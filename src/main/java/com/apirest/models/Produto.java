package com.apirest.models;

import java.io.File;
import java.io.Serializable;
import java.util.Base64;
import java.util.List;
import javax.persistence.CascadeType;
import static javax.persistence.CascadeType.ALL;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="TB_PRODUTO")
public class Produto implements Serializable {
    /*Cria a tabela produto e seus campos mostrados abaixo*/
    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "PROD_ID")
    private Long id;

    @NotNull
    private String nome_produto;

    @NotNull
    private float preco_produto;

    private String desc_produto;


    @Column(length = 1000)
    private String picture;

    @OneToOne
    @JoinColumn(name = "CAT_ID")
    private Categoria categoria;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PROD_ID")
    private List <Especificacoes> especfiEspecificacoes;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name = "PROD_ID")
    private List<Oferta> ofertas;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name = "PROD_ID")
    private List<Avaliacao> avaliacoes;

    public List<Oferta> getOfertas() {
        return ofertas;
    }

    public void setOfertas(List<Oferta> ofertas) {
        this.ofertas = ofertas;
    }

    public void convert(MultipartFile foto) throws Exception{
        try{
           this.picture = "C:\\xampp\\htdocs\\"+ foto.getOriginalFilename();

            foto.transferTo(new File(this.picture));
            this.picture = "http://localhost/"+foto.getOriginalFilename();
        }catch(Exception e ){
            throw new Exception(e.getMessage());
        }
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public List<Especificacoes> getEspecfiEspecificacoes() {
        return especfiEspecificacoes;
    }

    public void setEspecfiEspecificacoes(List<Especificacoes> especfiEspecificacoes) {
        this.especfiEspecificacoes = especfiEspecificacoes;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Long getId() {
            return id;
    }

    public void setId(Long id) {
            this.id = id;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public float getPreco_produto() {
        return preco_produto;
    }

    public void setPreco_produto(float preco_produto) {
        this.preco_produto = preco_produto;
    }

    public String getDesc_produto() {
        return desc_produto;
    }

    public void setDesc_produto(String desc_produto) {
        this.desc_produto = desc_produto;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }


        
	

}
