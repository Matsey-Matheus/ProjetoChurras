package br.com.churras.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;

import br.com.churras.model.BaseModel;
import br.com.churras.model.Item;
import br.com.churras.view.SomaView;

/**
 * 
 * @author Matheus Martins Santos
 * 
 */
public class CalculadorService {

	private static SomaView view = new SomaView();

	public static void somarTotal(BaseModel base) {
		int numeroConvidados = base.getConvidado().getNome().size();
		if (numeroConvidados > 0) {
			BigDecimal valorTotalItens = somarItens(base.getMapaItens());
			somarPorConvidados(numeroConvidados, valorTotalItens);
		} else {
			view.printaMensagemErro("\nNão há convidados cadastrados para somar o churrasco");
		}
	}

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

	private static BigDecimal somarItens(Map<String, List<Item>> itens) {
		BigDecimal totalCarne = BigDecimal.ZERO;
		BigDecimal totalRefrigerante = BigDecimal.ZERO;
		BigDecimal totalCerveja = BigDecimal.ZERO;

		for (Item carne : itens.get("carne")) {
			totalCarne = totalCarne.add(carne.getValor());
		}
		for (Item refrigerante : itens.get("refrigerante")) {
			totalRefrigerante = totalRefrigerante.add(refrigerante.getValor());
		}
		for (Item cerveja : itens.get("cerveja")) {
			totalCerveja = totalCerveja.add(cerveja.getValor());
		}

		BigDecimal total = totalCarne.add(totalRefrigerante.add(totalCerveja));

		view.printaMensagem("");
		view.mostrarTotalValoresSeparados(totalCarne, totalRefrigerante, totalCerveja);
		view.printaMensagem("");
		view.mostrarValorTotalJunto(total);

		return total;
	}

	public static void somarPorConvidados(int nmrConvidados, BigDecimal vlTotalItens) {
		BigDecimal divisaoPorConvidado = vlTotalItens.divide(BigDecimal.valueOf(nmrConvidados));
		view.printaMensagem("Valor para cada convidado: R$" + divisaoPorConvidado.setScale(2, RoundingMode.HALF_EVEN));
	}
}
