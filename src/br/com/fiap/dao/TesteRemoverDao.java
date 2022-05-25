package br.com.fiap.dao;

public class TesteRemoverDao {

	public static void main(String[] args) {
		
		AtividadesDAO dao = new AtividadesDAO();
		      
		//Remove o colaborador com código 1
		      dao.remover(1);
		      
	}
		    
}