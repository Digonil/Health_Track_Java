package br.com.fiap.dao;

public class TesteRemoverDao {

	public static void main(String[] args) {
		
		AtividadesDAO dao = new AtividadesDAO();
		      
		//Remove o colaborador com c�digo 1
		      dao.remover(1);
		      
	}
		    
}