package TestesSQL;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.fiap.tdson.dao.ObjetivoFinanceiroDAO;
import br.com.fiap.tdson.dao.TransacaoFinanceiroDAO;
import br.com.fiap.tdson.model.ObjetivoFinanceiroModel;
import br.com.fiap.tdson.model.TransacaoFinanceiroModel;

//


public class TesteDeConexao {

  public static void main(String[] args) throws SQLException {
	  //1
	  ObjetivoFinanceiroModel obj1 = new ObjetivoFinanceiroModel();
	  obj1.setDs_descricao_obj_fin("Primeiro Objetivo Financeiro");
	  obj1.setId_usuario(1);
	  //2
	  ObjetivoFinanceiroModel obj2 = new ObjetivoFinanceiroModel();
	  obj2.setDs_descricao_obj_fin("Segundo Objetivo Financeiro");
	  obj2.setId_usuario(2);
	  //3
	  ObjetivoFinanceiroModel obj3 = new ObjetivoFinanceiroModel();
	  obj3.setDs_descricao_obj_fin("Terceiro Objetivo Financeiro com mais caracteres");
	  obj3.setId_usuario(3);
	  //4
	  ObjetivoFinanceiroModel obj4 = new ObjetivoFinanceiroModel();
	  obj4.setDs_descricao_obj_fin("4° obj abc");
	  obj4.setId_usuario(4);
	  //5
	  ObjetivoFinanceiroModel obj5 = new ObjetivoFinanceiroModel();
	  obj5.setDs_descricao_obj_fin("ObJetIvO EstTRANho");
	  obj5.setId_usuario(5);
	  
	  ObjetivoFinanceiroDAO.insertObjetivo(obj1);
	  ObjetivoFinanceiroDAO.insertObjetivo(obj2);
	  ObjetivoFinanceiroDAO.insertObjetivo(obj3);
	  ObjetivoFinanceiroDAO.insertObjetivo(obj4);
	  ObjetivoFinanceiroDAO.insertObjetivo(obj5);
	  
	  ObjetivoFinanceiroDAO.getAll();
	  
	  //--------------------------------------------------------------------------
	  TransacaoFinanceiroModel transacao1 = new TransacaoFinanceiroModel();
	  java.util.Date date1 = new java.util.Date();
	  java.sql.Date sqldate1 = new java.sql.Date(date1.getTime());
	  transacao1.setId_usuario(1);
	  transacao1.setDs_descricao("Bolo na dona benta");
	  transacao1.setDt_transacao(sqldate1);
	  transacao1.setCt_categoria("Receita");
	  transacao1.setVl_valor(30);
	  
	  
	  TransacaoFinanceiroModel transacao2 = new TransacaoFinanceiroModel();
	  java.util.Date date2 = new java.util.Date();
	  java.sql.Date sqldate2 = new java.sql.Date(date2.getTime());
	  transacao2.setId_usuario(2);
	  transacao2.setDs_descricao("Aluguel");
	  transacao2.setDt_transacao(sqldate2);
	  transacao2.setCt_categoria("Despesa");
	  transacao2.setVl_valor(5000);
	  
	  TransacaoFinanceiroModel transacao3 = new TransacaoFinanceiroModel();
	  java.util.Date date3 = new java.util.Date();
	  java.sql.Date  sqldate3 = new java.sql.Date(date3.getTime());
	  transacao3.setId_usuario(3);
	  transacao3.setDs_descricao("TERAPIA, pois dps desse trabalho vou precisar");
	  transacao3.setDt_transacao(sqldate3);
	  transacao3.setCt_categoria("Despesa");
	  transacao3.setVl_valor(600);
	  
	  TransacaoFinanceiroModel transacao4 = new TransacaoFinanceiroModel();
	  java.util.Date date4 = new java.util.Date();
	  java.sql.Date sqldate4 = new java.sql.Date(date4.getTime());
	  transacao4.setId_usuario(4);
	  transacao4.setDs_descricao("Carro");
	  transacao4.setDt_transacao(sqldate4);
	  transacao4.setCt_categoria("Despesa");
	  transacao4.setVl_valor(40000);
	  
	  TransacaoFinanceiroModel transacao5 = new TransacaoFinanceiroModel();
	  java.util.Date date5 = new java.util.Date();
	  java.sql.Date sqldate5 = new java.sql.Date(date5.getTime());
	  transacao5.setId_usuario(5);
	  transacao5.setDs_descricao("Salário");
	  transacao5.setDt_transacao(sqldate5);
	  transacao5.setCt_categoria("Receita");
	  transacao5.setVl_valor(10000);
	  
	  TransacaoFinanceiroDAO.insertTransacao(transacao1);
	  TransacaoFinanceiroDAO.insertTransacao(transacao2);
	  TransacaoFinanceiroDAO.insertTransacao(transacao3);
	  TransacaoFinanceiroDAO.insertTransacao(transacao4);
	  TransacaoFinanceiroDAO.insertTransacao(transacao5);
	  TransacaoFinanceiroDAO.getAll();
  }
}