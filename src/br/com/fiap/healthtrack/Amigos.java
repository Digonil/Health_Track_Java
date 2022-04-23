
/**
 * Classe de composição para cadastro de amigos, que será um atributos na classe CadastroUsuario.
 * @author Grupo D
 * @version 1.0
 */

package br.com.fiap.healthtrack;

public class Amigos {
	
	/**
	 * * Atributos da classe Amigos.
	*/	
	String nomeContato;
	String email;
	
	
	/**
	 * Métodos getters e setters da classe.
	 * @param nomeContato, email
	 */
	public String getNomeContato() {
		return nomeContato;
	}
	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
