/**
 * Classe de composi��o que ser� utilizado como um atributo na classe CadastroUsu�rio, onde ir� guardar os dados de n�mero de telefone do usu�rio.
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
	 * M�todos getters e setters da classe.
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
