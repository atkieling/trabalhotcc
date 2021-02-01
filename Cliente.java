package itscoming;

import java.util.InputMismatchException;

public class Cliente {

	private String nome;
	private String cpf;
	private String cnpj;
	private String email;
	private String senha;
	
	private Endereco endereco;
	private Pedido pedido;
	
	
	/**
	 * @param nome
	 * @param cpf
	 * @param email
	 * @param senha
	 * @param endereco
	 * @param pedido
	 */
	public Cliente(String nome, String cnpj, String email, String senha, Endereco endereco, Pedido pedido) {
		setNome(nome);
		setCnpj(cnpj);
		setEmail(email);
		setSenha(senha);
		setEndereco(endereco);
		setPedido(pedido);
	}
	
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
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	
	/**
	 * @param cpf the cpf to set
	 */
	public String setCpf(String cpf) {
		if(validaCPF(cpf)) {
		this.cpf = cpf;
	} else {
		return "0008 - CPF Inválido";
	}
		return "0001 - CPF inserido com sucesso";
	}
	
	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}
	
	/**
	 * @param cnpj the cnpj to set
	 * @return 
	 */
	public String setCnpj(String cnpj) {
		if(validaCNPJ(cnpj)) {
		this.cnpj = cnpj;
	} else {
		return "0009 - CNPJ Inválido";
	}
		return "0002 - CNPJ inserido com sucesso";
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}
	
	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
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
	
	//private boolean validaCpf
	
	public static boolean validaCPF(String CPF) {
		// considera-se erro CPF's formados por uma sequencia de numeros iguais
		if (CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222")
				|| CPF.equals("33333333333") || CPF.equals("44444444444") || CPF.equals("55555555555")
				|| CPF.equals("66666666666") || CPF.equals("77777777777") || CPF.equals("88888888888")
				|| CPF.equals("99999999999") || (CPF.length() != 11))
			return (false);

		char dig10, dig11;
		int somaParcelas, i, r, num, pesoMult;

		// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
		try {
			// Calculo do 1o. Digito Verificador
			somaParcelas = 0;
			pesoMult = 10;
			for (i = 0; i < 9; i++) {
				// converte o i-esimo caractere do CPF em um numero:
				// por exemplo, transforma o caractere '0' no inteiro 0
				// (48 eh a posicao de '0' na tabela ASCII)
				num = (int) (CPF.charAt(i) - 48);
				somaParcelas = somaParcelas + (num * pesoMult);
				pesoMult = pesoMult - 1;
			}

			r = 11 - (somaParcelas % 11);
			if ((r == 10) || (r == 11))
				dig10 = '0';
			else
				dig10 = (char) (r + 48); // converte no respectivo caractere numerico

			// Calculo do 2o. Digito Verificador
			somaParcelas = 0;
			pesoMult = 11;
			for (i = 0; i < 10; i++) {
				num = (int) (CPF.charAt(i) - 48);
				somaParcelas = somaParcelas + (num * pesoMult);
				pesoMult = pesoMult - 1;
			}

			r = 11 - (somaParcelas % 11);
			if ((r == 10) || (r == 11))
				dig11 = '0';
			else
				dig11 = (char) (r + 48);

			// Verifica se os digitos calculados conferem com os digitos informados.
			if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
				return (true);
			else
				return (false);
		} catch (InputMismatchException erro) {
			return (false);
		}
	}

	public static String imprimeCPF(String CPF) {
		return (CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." + CPF.substring(6, 9) + "-"
				+ CPF.substring(9, 11));
	}
	
	// Método validaCNPJ retorna um valor booleano que indica se o número de CNPJ é válido ou inválido.
	public static boolean validaCNPJ(String CNPJ) {
		// considera-se erro CNPJ's formados por uma sequencia de numeros iguais.
		if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") || CNPJ.equals("22222222222222")
				|| CNPJ.equals("33333333333333") || CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555")
				|| CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") || CNPJ.equals("88888888888888")
				|| CNPJ.equals("99999999999999") || (CNPJ.length() != 14))
			return (false);

		char dig13, dig14;
		int somaParcelas, i, r, num, pesoMult;

		// "try" - protege o código para eventuais erros de conversao de tipo (int)
		try {
				
			// === Calculo do 1o. Digito Verificador ===
			somaParcelas = 0; //SM = Soma das parcelas.
			pesoMult = 2; // É multiplicado por um peso que começa em 2 e que vai sendo incrementado de 1 a cada passo, somando-se as parcelas calculadas.
			for (i = 11; i >= 0; i--) {
				// converte o i-ésimo caractere do CNPJ em um número:
				// por exemplo, transforma o caractere '0' no inteiro 0
				// (48 eh a posição de '0' na tabela ASCII)
				num = (int) (CNPJ.charAt(i) - 48);
				somaParcelas = somaParcelas + (num * pesoMult);
				pesoMult = pesoMult + 1;
				if (pesoMult == 10)
					pesoMult = 2;
			}
			// Calcula-se o dígito através da seguinte expressão:
			r = somaParcelas % 11;
			if ((r == 0) || (r == 1))
				dig13 = '0';
			else
				dig13 = (char) ((11 - r) + 48);

			// === Calculo do 2o. Digito Verificador ===
			somaParcelas = 0;
			pesoMult = 2;
			for (i = 12; i >= 0; i--) {
				num = (int) (CNPJ.charAt(i) - 48);
				somaParcelas = somaParcelas + (num * pesoMult);
				pesoMult = pesoMult + 1;
				if (pesoMult == 10)
					pesoMult = 2;
			}
			// Calcula-se o dígito através da seguinte expressão:
			r = somaParcelas % 11;
			if ((r == 0) || (r == 1))
				dig14 = '0';
			else
				dig14 = (char) ((11 - r) + 48);

			// Verifica se os dígitos calculados conferem com os dígitos informados.
			if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13)))
				return (true);
			else
				return (false);
		} catch (InputMismatchException erro) {
			return (false);
		}
	}

	public static String imprimeCNPJ(String CNPJ) {
		// máscara do CNPJ: 99.999.999.9999-99
		return (CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "." + CNPJ.substring(5, 8) + "/"
				+ CNPJ.substring(8, 12) + "-" + CNPJ.substring(12, 14));
	}
}
