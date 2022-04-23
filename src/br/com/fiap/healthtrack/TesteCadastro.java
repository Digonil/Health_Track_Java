/**
 * Classe TesteCadastro com o método main, para instanciar e enviar mensagens entre classes.
 * @author Grupo D
 * @version 1.0
 */


package br.com.fiap.healthtrack;

public class TesteCadastro {

	public static void main(String[] args) {
		
		/**
		 * Criação de um usuário, dando entrada nos parâmetros de email e nome de usuário
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
		caique.setNomeUsuario("Caíque Vennuccio Tagliari");
		caique.setEmail("caique@email.com");
		caique.dadosFisicos.setDataPesagem("17/04/22");
		caique.telefone.setNumTelefone(999998888);
		
		/*
		 * Retorno de entrada de dados gerados na classe CadastroUsuario e nas classes de composição DadosFisicos Telefone.
		 */
		System.out.println("O nome do usuário é : " + diego.getNomeUsuario());
		System.out.println("O email do usuário é : " + diego.getEmail());
		System.out.println("A primeira data de pesagem é de: " + diego.dadosFisicos.getDataPesagem());
		System.out.println("O número de telefone do usuário é: " + diego.telefone.getNumTelefone());
		
		System.out.println("************************************");
		
		System.out.println("O nome do usuário é : " + gabriel.getNomeUsuario());
		System.out.println("O email do usuário é : " + gabriel.getEmail());
		System.out.println("A primeira data de pesagem é de: " + gabriel.dadosFisicos.getDataPesagem());
		System.out.println("O número de telefone do usuário é: " + gabriel.telefone.getNumTelefone());
		
		System.out.println("************************************");
		
		System.out.println("O nome do usuário é : " + carlos.getNomeUsuario());
		System.out.println("O email do usuário é : " + carlos.getEmail());
		System.out.println("A primeira data de pesagem é de: " + carlos.dadosFisicos.getDataPesagem());
		System.out.println("O número de telefone do usuário é: " + carlos.telefone.getNumTelefone());
		
		System.out.println("************************************");
		
		System.out.println("O nome do usuário é : " + caique.getNomeUsuario());
		System.out.println("O email do usuário é : " + caique.getEmail());
		System.out.println("A primeira data de pesagem é de: " + caique.dadosFisicos.getDataPesagem());
		System.out.println("O número de telefone do usuário é: " + caique.telefone.getNumTelefone());

	}

}
