package com.apirest.models;

import java.io.Serializable;
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

@Entity
@Table(name="TB_PRODUTO")
public class Produto implements Serializable {
	
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
        
        @NotNull
        @Column(length = 1000)
        private String linkSite;

        public String getLinkSite() {
            return linkSite;
        }

        public void setLinkSite(String linkSite) {
            this.linkSite = linkSite;
        }        
        
        @OneToOne
        @JoinColumn(name = "CAT_ID")
        private Categoria categoria;
        
        @OneToMany(cascade = CascadeType.ALL)
        @JoinColumn(name = "PROD_ID")
        private List <Especificacoes> especfiEspecificacoes;

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


	

}
