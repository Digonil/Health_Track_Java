/**
 * Classe que abstrai o de cadastro de um usu�rio, onde al�m dos seus atributos, possui duas classes de composi��o.
 * @author Grupo D
 * @version 1.0
 */

package br.com.fiap.healthtrack;

public abstract class CadastroUsuario  {
	
		private String nomeUsuario;
		private String email;
		private String senha;
		
	/**
	 * Utilizado composi��o de classes para os atributos abaixo.
	 */
		
		protected Amigos amigo = new Amigos();
		protected TelefoneUsuario telefone = new TelefoneUsuario();
		protected DadosFisicos dadosFisicos = new DadosFisicos();
		
		
	/**
	 * M�todos getters e setters, utilizados para consulta e configura��o dos par�metros.
	 * @param nomeUsuario, email, senha
	 */
	
		public String getNomeUsuario() {
			return nomeUsuario;
		}
		public void setNomeUsuario(String nomeUsuario) {
			this.nomeUsuario = nomeUsuario;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		
		public void setSenha(String senha) {
			this.senha = senha;
		}
	
	
	
	}
		

