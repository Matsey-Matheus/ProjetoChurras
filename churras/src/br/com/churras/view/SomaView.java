package br.com.churras.view;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SomaView extends MensagemView {

	/**
	 * exibe 3 linhas no console contendo o valor total de cada item do churrasco
	 * (carne, refrigerante e cerveja)
	 * 
	 * @param valores
	 */
	public void mostrarTotalValoresSeparados(BigDecimal... valores) {
		printaMensagem(" Total carne: R$" + valores[0].setScale(2, RoundingMode.HALF_EVEN));
		printaMensagem(" Total refrigerante: R$" + valores[1].setScale(2, RoundingMode.HALF_EVEN));
		printaMensagem(" Total cerveja: R$" + valores[2].setScale(2, RoundingMode.HALF_EVEN));
	}

	/**
	 * exibe o valor total de todos os itens do churrasco juntos (carne,
	 * refrigerante e carveja)
	 * 
	 * @param valorTotal
	 */
	public void mostrarValorTotalJunto(BigDecimal valorTotal) {
		printaMensagem(" Valor total do Churrasco: R$" + valorTotal.setScale(2, RoundingMode.HALF_EVEN));
	}

}
