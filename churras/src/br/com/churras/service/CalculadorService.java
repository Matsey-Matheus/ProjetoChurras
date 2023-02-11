package br.com.churras.service;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import br.com.churras.model.BaseModel;
import br.com.churras.model.Convidado;
import br.com.churras.model.Item;
import br.com.churras.view.SomaView;

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
	
	public static BigDecimal somarTotal(BaseModel base) {
		int numeroConvidados = base.getConvidado().getNome().size();
		somarItens(base.getMapaItens());
		
		return null;
	}
	
	private static void somarItens(Map<String, List<Item>> itens) {
		SomaView view = new SomaView();
		BigDecimal totalCarne = BigDecimal.ZERO;
		BigDecimal totalRefrigerante = BigDecimal.ZERO;
		BigDecimal totalCerveja = BigDecimal.ZERO;
		for(Item carne:itens.get("carne")) {
			totalCarne = totalCarne.add(carne.getValor());
		}
		for(Item refrigerante:itens.get("refrigerante")) {
			totalRefrigerante = totalRefrigerante.add(refrigerante.getValor());
		}
		for(Item cerveja:itens.get("cerveja")) {
			totalCerveja = totalCerveja.add(cerveja.getValor());
		}
					
		System.out.println(totalCarne);
	}
}
