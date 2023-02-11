package br.com.churras.service;

import java.math.BigDecimal;

/**
 * 
 * @author Matheus Martins Santos
 * 
 */
public class CalculadorService {
/**
 * Calcula com base nos convidados e nos itens cadastrados a quantidade que cada convidado irá contribuir para o Churras
 * 
 * @param valor
 * @return Em desenvolvimentos
 */
	public BigDecimal calcularPorPessoa(BigDecimal valor) {
		BigDecimal porcentagem = BigDecimal.valueOf(55).divide(BigDecimal.valueOf(100));
		return valor.subtract(porcentagem.multiply(valor));
	}
	
}
