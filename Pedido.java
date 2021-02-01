package itscoming;

public class Pedido {

	int numeroPedido;
	int chaveRastreio;
	private Endereco endereco;
	private Loja loja;
	
	/**
	 * @return the numeroPedido
	 */
	public int getNumeroPedido() {
		return numeroPedido;
	}
	
	/**
	 * @param numeroPedido the numeroPedido to set
	 */
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	
	/**
	 * @return the chaveRastreio
	 */
	public int getChaveRastreio() {
		return chaveRastreio;
	}
	
	/**
	 * @param chaveRastreio the chaveRastreio to set
	 */
	public void setChaveRastreio(int chaveRastreio) {
		this.chaveRastreio = chaveRastreio;
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
	 * @return the loja
	 */
	public Loja getLoja() {
		return loja;
	}
	
	/**
	 * @param loja the loja to set
	 */
	public void setLoja(Loja loja) {
		this.loja = loja;
	}
	
}
