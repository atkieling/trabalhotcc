package itscoming;

public class Transportadora {

	private String nome;
	private String cnpj;
	private int telefone;
	private Endereco endereco;
	private Pedido pedido;
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}
	
	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	/**
	 * @return the telefone
	 */
	public int getTelefone() {
		return telefone;
	}
	
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}
	
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	/**
	 * @return the pedido
	 */
	public Pedido getPedido() {
		return pedido;
	}
	
	/**
	 * @param pedido the pedido to set
	 */
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
}
