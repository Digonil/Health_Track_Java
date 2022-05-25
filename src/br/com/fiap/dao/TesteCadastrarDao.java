package br.com.fiap.dao;

import java.util.Calendar;


import br.com.fiap.healthtrack.Atividades;

public class TesteCadastrarDao {

	public static void main(String[] args) {
		
		      //Instancia o DAO
			
			AtividadesDAO dao = new AtividadesDAO();
		      
		  
		      //Instancia a Atividade
		      Atividades atividade = new Atividades();
		      atividade.setNomeAtividade("Supino");
		      atividade.setDataExecucao(Calendar.getInstance());
		      atividade.setCalQueimadas(700);
		      
		  
		      //Cadastra no banco de dados
		      dao.cadastrar(atividade);
		  
		      System.out.println("Cadastrado!");
		    }	

	}


