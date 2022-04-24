/**
 * Classe que que herda a classe CadastroUsuario .
 * Seus atributos são compostos pelos atributos  herdados da classe CadastroUsuario e de seus próprios atributos.
 * @author Grupo D
 * @version 1.0
 */

package br.com.fiap.healthtrack;

public class UsuarioCorporativo extends CadastroUsuario{
	
	private String nomeEmpresa;
	private String cnpj ;
	
	/**
	 * Construtor padrão.
	 */
	public UsuarioCorporativo() {
		System.out.println("Usuário Comum");
	}

	/**
	 * Construtor que inicializa com parâmetros.
	 * @param nomeEmpresa
	 * @param cnpj
	 */
	public UsuarioCorporativo(String nomeEmpresa, String cnpj) {
		super();
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
	}

	/**
	 * Métodos getters e setters, utilizados para consulta e configuração dos parâmetros.
	 * @param nomeEMpresa, Cnpj
	 * Herdas os métodos da classe CadastroUsuário
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
