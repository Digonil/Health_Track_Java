/**
 * Classe que que herda a classe CadastroUsuario .
 * Seus atributos s�o compostos pelos atributos  herdados da classe CadastroUsuario e de seus pr�prios atributos.
 * @author Grupo D
 * @version 1.0
 */

package br.com.fiap.healthtrack;

public class UsuarioCorporativo extends CadastroUsuario{
	
	private String nomeEmpresa;
	private String cnpj ;
	
	/**
	 * Construtor padr�o.
	 */
	public UsuarioCorporativo() {
		System.out.println("Usu�rio Comum");
	}

	/**
	 * Construtor que inicializa com par�metros.
	 * @param nomeEmpresa
	 * @param cnpj
	 */
	public UsuarioCorporativo(String nomeEmpresa, String cnpj) {
		super();
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
	}

	/**
	 * M�todos getters e setters, utilizados para consulta e configura��o dos par�metros.
	 * @param nomeEMpresa, Cnpj
	 * Herdas os m�todos da classe CadastroUsu�rio
	 */
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	

}
