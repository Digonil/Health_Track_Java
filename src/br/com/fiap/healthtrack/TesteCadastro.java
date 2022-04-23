/**
 * Classe TesteCadastro com o m�todo main, para instanciar e enviar mensagens entre classes.
 * @author Grupo D
 * @version 1.0
 */


package br.com.fiap.healthtrack;

public class TesteCadastro {

	public static void main(String[] args) {
		
		/**
		 * Cria��o de um usu�rio, dando entrada nos par�metros de email e nome de usu�rio
		 */
		CadastroUsuario diego = new CadastroUsuario();
		diego.setNomeUsuario("Diego Niles da Silva");
		diego.setEmail("diego@email.com");
		diego.dadosFisicos.setDataPesagem("17/04/22");
		diego.telefone.setNumTelefone(999998888);
		
		CadastroUsuario gabriel = new CadastroUsuario();
		gabriel.setNomeUsuario("Gabriel Morais Dias");
		gabriel.setEmail("gabriel@email.com");
		gabriel.dadosFisicos.setDataPesagem("17/04/22");
		gabriel.telefone.setNumTelefone(999998888);
		
		CadastroUsuario carlos = new CadastroUsuario();
		carlos.setNomeUsuario("Carlos Morette");
		carlos.setEmail("carlos@email.com");
		carlos.dadosFisicos.setDataPesagem("17/04/22");
		carlos.telefone.setNumTelefone(999998888);
		
		CadastroUsuario caique = new CadastroUsuario();
		caique.setNomeUsuario("Ca�que Vennuccio Tagliari");
		caique.setEmail("caique@email.com");
		caique.dadosFisicos.setDataPesagem("17/04/22");
		caique.telefone.setNumTelefone(999998888);
		
		/*
		 * Retorno de entrada de dados gerados na classe CadastroUsuario e nas classes de composi��o DadosFisicos Telefone.
		 */
		System.out.println("O nome do usu�rio � : " + diego.getNomeUsuario());
		System.out.println("O email do usu�rio � : " + diego.getEmail());
		System.out.println("A primeira data de pesagem � de: " + diego.dadosFisicos.getDataPesagem());
		System.out.println("O n�mero de telefone do usu�rio �: " + diego.telefone.getNumTelefone());
		
		System.out.println("************************************");
		
		System.out.println("O nome do usu�rio � : " + gabriel.getNomeUsuario());
		System.out.println("O email do usu�rio � : " + gabriel.getEmail());
		System.out.println("A primeira data de pesagem � de: " + gabriel.dadosFisicos.getDataPesagem());
		System.out.println("O n�mero de telefone do usu�rio �: " + gabriel.telefone.getNumTelefone());
		
		System.out.println("************************************");
		
		System.out.println("O nome do usu�rio � : " + carlos.getNomeUsuario());
		System.out.println("O email do usu�rio � : " + carlos.getEmail());
		System.out.println("A primeira data de pesagem � de: " + carlos.dadosFisicos.getDataPesagem());
		System.out.println("O n�mero de telefone do usu�rio �: " + carlos.telefone.getNumTelefone());
		
		System.out.println("************************************");
		
		System.out.println("O nome do usu�rio � : " + caique.getNomeUsuario());
		System.out.println("O email do usu�rio � : " + caique.getEmail());
		System.out.println("A primeira data de pesagem � de: " + caique.dadosFisicos.getDataPesagem());
		System.out.println("O n�mero de telefone do usu�rio �: " + caique.telefone.getNumTelefone());

	}

}
