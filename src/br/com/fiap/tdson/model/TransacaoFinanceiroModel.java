package br.com.fiap.tdson.model;

import java.sql.Date;

public class TransacaoFinanceiroModel {
	
	private int id_transacao;
	private int id_usuario;
	private String ds_descricao;
	private Date dt_transacao;
	private String ct_categoria;
	private float vl_valor;
	
	public TransacaoFinanceiroModel() {
		super();
	}

	public int getId_transacao() {
		return id_transacao;
	}

	public void setId_transacao(int id_transacao) {
		this.id_transacao = id_transacao;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getDs_descricao() {
		return ds_descricao;
	}

	public void setDs_descricao(String ds_descricao) {
		this.ds_descricao = ds_descricao;
	}

	public Date getDt_transacao() {
		return dt_transacao;
	}

	public void setDt_transacao(Date dt_transacao) {
		this.dt_transacao = dt_transacao;
	}

	public String getCt_categoria() {
		return ct_categoria;
	}

	public void setCt_categoria(String ct_categoria) {
		this.ct_categoria = ct_categoria;
	}

	public float getVl_valor() {
		return vl_valor;
	}

	public void setVl_valor(float vl_valor) {
		this.vl_valor = vl_valor;
	}

	@Override
	public String toString() {
		return "TransacaoFinanceiroModel [id_transacao=" + id_transacao + ", id_usuario=" + id_usuario
				+ ", ds_descricao=" + ds_descricao + ", dt_transacao=" + dt_transacao + ", ct_categoria=" + ct_categoria
				+ ", vl_valor=" + vl_valor + "]";
	}
	
	
	
}
