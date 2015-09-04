package br.com.vrosendo.securitytest.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Linha {

	public Linha() {
		super();
	}

	public Linha(long id) {
		this.id = id;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(unique=true)
	private long id;
	
	private String descricao;
	
	private String inativo;
	
	private Date dataInativo;
	
	public long getId() {
		return id;
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

	public String getInativo() {
		return inativo;
	}

	public void setInativo(String inativo) {
		this.inativo = inativo;
	}

	public Date getDataInativo() {
		return dataInativo;
	}

	public void setDataInativo(Date dataInativo) {
		this.dataInativo = dataInativo;
	}

	
	
}
