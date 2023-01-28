package br.com.churras.util;

import java.util.Scanner;

public class LeitorDeDados {
	
	private Scanner sc;
	
	public LeitorDeDados() {
		sc = new Scanner(System.in);
	}

	public String pegarTextoCompletoDigitado() {
		return sc.nextLine();
	}
	
	public int pegarInteiroDigitado() {
		return Integer.parseInt(sc.nextLine());
	}
	
	public double pegarNumeroFracionadoDigitado() {
		return Double.parseDouble(sc.nextLine());
	}
	
	public void fechar() {
		sc.close();
	}
	
}
