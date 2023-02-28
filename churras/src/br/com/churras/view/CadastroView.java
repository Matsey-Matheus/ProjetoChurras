package br.com.churras.view;

import java.math.RoundingMode;
import java.util.List;
import java.util.Map;

import br.com.churras.model.Convidado;
import br.com.churras.model.ConvidadosEvento;
import br.com.churras.model.Item;

public class CadastroView extends MensagemView {

	/**
	 * exibe no console todos os convidados cadastrados
	 * 
	 * @param convidados
	 */
	public void convidadosCadastrados(ConvidadosEvento convidados) {
		// montarTopo();
		printaMensagem("");

		int numeroConvidadoAtual = 1;
		for (Convidado convidado : convidados.getConvidados()) {
			String nome = convidado.getNome();
			printaMensagemSemPularLinha(
					"|\t" + (nome.split(" ")[0].length() <= 7 ? nome.split(" ")[0] : nome.substring(0, 7)) + "\t");
			if (numeroConvidadoAtual % 3 == 0) {
				printaMensagemSemPularLinha("\t|");
				printaMensagem("");
			}

			numeroConvidadoAtual++;
		}
		printaMensagem("");
	}

	/**
	 * exibe no console todos os itens cadastrados no sistema (carnes, refrigerante
	 * e cervejas)
	 * 
	 * @param item
	 */
	public void itensCadastrados(Map<String, List<Item>> item) {
		printaMensagemLn("------------- Itens cadastrados ------------- ");
		if (!item.isEmpty()) {
			printaMensagem("Carnes: ");
			for (Item cada : item.get("carne")) {
				printaMensagem("	" + cada.getNome() + " - R$" + cada.getValor().setScale(2, RoundingMode.HALF_EVEN));
			}
			printaMensagem("Refrigerantes: ");
			for (Item cada : item.get("refrigerante")) {
				printaMensagem("	" + cada.getNome() + " - R$" + cada.getValor().setScale(2, RoundingMode.HALF_EVEN));
			}
			printaMensagem("Cervejas: ");
			for (Item cada : item.get("cerveja")) {
				printaMensagem("	" + cada.getNome() + " - R$" + cada.getValor().setScale(2, RoundingMode.HALF_EVEN));
			}
		}
	}

	/**
	 * Mostra no console o menu da tela de cadastro
	 */
	public void inicioCadastroView() {
		lnPrintaMensagemLn("------------- Tela de Cadastros -------------");
		printaMensagemLn("              Você deseja cadastrar: ");
		printaMensagem("    1 - Convidados ");
		printaMensagem("    2 - Carnes ");
		printaMensagem("    3 - Refrigerante ");
		printaMensagem("    4 - Cervejas ");
		printaMensagem("    0 - Voltar");

		lnPrintaMensagemSemPularLinha(" Selecione: ");
	}

}
