package br.com.churras.service;

import java.math.BigDecimal;

/**
 * 
 * @author Matheus Martins Santos
 * 
 */
public class CalculadorService {
/**
 * 
 * @param valor
 * @return Em desenvolvimentos
 */
	
	/**
	 * 
	 * Calcula 450g do valor do kil
	 * 
	 * @param valorKilo
	 * @return Valor de 450g do kilo da carne digitada
	 */
	public static BigDecimal calculaCarne(double valorKilo) {
		BigDecimal valorKiloConvertido = BigDecimal.valueOf(valorKilo);
		BigDecimal porcentagem = BigDecimal.valueOf(55).divide(BigDecimal.valueOf(100));
		return valorKiloConvertido.subtract(porcentagem.multiply(valorKiloConvertido));
	}
	
	public static BigDecimal calculaCerveja(double valorLata) {
		BigDecimal valorLataConvertido = BigDecimal.valueOf(valorLata);
		return valorLataConvertido.multiply(BigDecimal.valueOf(5));
	}
	
	
}
