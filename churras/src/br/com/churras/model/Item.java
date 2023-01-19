package br.com.churras.model;

import java.math.BigDecimal;

/**
 * 
 * 
 * Modelo de item, nome (tipo de carne, refri ou cerveja)
 * 
 * @author Matheus Martins Santos
 * 
 */
public class Item {
	
	private String nome;
	private BigDecimal valor;
	
	public Item(String nome, BigDecimal valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
}
