package br.com.churras.service;

import java.math.BigDecimal;

public class Calculador {

	public BigDecimal calcularPorPessoa(BigDecimal valor) {
		BigDecimal porcentagem = BigDecimal.valueOf(55).divide(BigDecimal.valueOf(100));
		return valor.subtract(porcentagem.multiply(valor));
	}
	
}
