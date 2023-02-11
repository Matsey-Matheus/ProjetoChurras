package br.com.churras.view;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SomaView extends MensagemView {

	public void mostrarTotalValoresSeparados(BigDecimal... valores) {
		printaMensagem("Total carne: R$" + valores[0].setScale(2, RoundingMode.HALF_EVEN));
		printaMensagem("Total refrigerante: R$" + valores[1].setScale(2, RoundingMode.HALF_EVEN));
		printaMensagem("Total cerveja: R$" + valores[2].setScale(2, RoundingMode.HALF_EVEN));		
	}

	public void mostrarValorTotalJunto(BigDecimal valorTotal) {
		printaMensagem("Valor total do Churrasco: R$" + valorTotal.setScale(2, RoundingMode.HALF_EVEN));
	}
	
	
	
}
