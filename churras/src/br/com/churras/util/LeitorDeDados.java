package br.com.churras.util;

import java.util.Scanner;

public class LeitorDeDados {

	private Scanner sc;

	public LeitorDeDados() {
		sc = new Scanner(System.in);
	}

	/**
	 * Obtem oque o for digitado no console até o enter
	 * 
	 * @return nextLine
	 */
	public String pegarTextoCompletoDigitado() {
		return sc.nextLine();
	}

	/**
	 * Obtem um inteiro que for digitado no console
	 * 
	 * @return nextInt
	 */
	public int pegarInteiroDigitado() {
		return Integer.parseInt(sc.nextLine());
	}

	/**
	 * obtem um double que for digitado no console
	 * 
	 * @return nextDouble
	 */
	public double pegarNumeroFracionadoDigitado() {
		return Double.parseDouble(sc.nextLine());
	}

	/**
	 * fecha o scanner
	 */
	public void fechar() {
		sc.close();
	}

}