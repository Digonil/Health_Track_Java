/**
 * Classe de composição que será utilizado como um atributo na classe CadastroUsuário, onde irá guardar os dados de número de telefone do usuário.
 * @author Grupo D
 * @version 1.0
 */


package br.com.fiap.healthtrack;

public class TelefoneUsuario {

/**
 * Atributos da classe TelefoneUsuario.
 */
		private int numTelefone;
		private String tipoContato;
		
	
		
	/**
	 * Métodos getters e setters da classe.
	 * @param numTelefone, tipoContato
	 */
		public int getNumTelefone() {
			return numTelefone;
		}
		public void setNumTelefone(int numTelefone) {
			this.numTelefone = numTelefone;
		}
		public String getTipoContato() {
			return tipoContato;
		}
		public void setTipoContato(String tipoContato) {
			this.tipoContato = tipoContato;
		}
		
		
}
