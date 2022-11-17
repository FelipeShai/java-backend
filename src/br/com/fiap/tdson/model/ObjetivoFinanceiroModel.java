package br.com.fiap.tdson.model;

public class ObjetivoFinanceiroModel {
	

	private int id_objetivo; 
	private String ds_descricao_obj_fin;
	private int id_usuario;
	
	public ObjetivoFinanceiroModel() {
		super();
	}
	
	public int getId_objetivo() {
		return id_objetivo;
	}
	public void setId_objetivo(int id_objetivo) {
		this.id_objetivo = id_objetivo;
	}
	public String getDs_descricao_obj_fin() {
		return ds_descricao_obj_fin;
	}
	public void setDs_descricao_obj_fin(String ds_descricao_obj_fin) {
		this.ds_descricao_obj_fin = ds_descricao_obj_fin;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	
	@Override
	public String toString() {
		return "ObjetivoFinanceiroModel [id_objetivo=" + id_objetivo + ", ds_descricao_obj_fin=" + ds_descricao_obj_fin
				+ ", id_usuario=" + id_usuario + "]";
	}

}
