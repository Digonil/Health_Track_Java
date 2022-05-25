package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.healthtrack.Atividades;

public class TesteListarDao {

	public static void main(String[] args) {
		
		      AtividadesDAO dao = new AtividadesDAO();
		      
		      List<Atividades> lista = dao.listar();
		      
		      for (Atividades item : lista) {
		        System.out.println(item.getCdAtividade() + " " + item.getCdUsuario() + " " + item.getNomeAtividade() + " " + item.getCalQueimadas() + " " + item.getDataExecucao().getTime());
		      }
		    } 
		  }
	