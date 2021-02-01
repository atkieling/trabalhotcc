
package itscoming;

import java.util.Scanner;

public class CriarCliente {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Nome Cliente: ");
		String nome = entrada.next();
		System.out.println("CPF: ");
		String cpf = entrada.next();
		System.out.println("CNPJ: ");
		String cnpj = entrada.next();

		Cliente cliente = new Cliente(nome, cpf, cnpj, null, null, null);

		System.out.printf("\nResultado: ");
		System.out.println(cliente.setCpf(cpf));
		System.out.println(Cliente.imprimeCPF(cpf));
		
		System.out.printf("\nResultado: ");
		System.out.println(cliente.setCnpj(cnpj));
		System.out.println(Cliente.imprimeCNPJ(cnpj));

		entrada.close();
	}
}
