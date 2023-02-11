package br.com.churras.view;

import java.math.RoundingMode;
import java.util.List;
import java.util.Map;

import br.com.churras.model.Convidado;
import br.com.churras.model.Item;

public class CadastroView extends MensagemView {

	/**
	 * exibe no console todos os convidados cadastrados
	 * 
	 * @param convidados
	 */
	public void convidadosCadastrados(Convidado convidados) {
	//	montarTopo();
		printaMensagem("");

		int numeroConvidadoAtual = 1;
		for (String convidado : convidados.getNome()) {
			printaMensagemSemPularLinha("|\t" + convidado.split(" ")[0] + "\t");
			if (numeroConvidadoAtual % 3 == 0) {
				printaMensagemSemPularLinha("\t|");
				printaMensagem("");
			} 
			
			numeroConvidadoAtual++;
		}
		printaMensagem("");
	}

	/**
	 * exibe no console todos os itens cadastrados no sistema (carnes, refrigerante e cervejas)
	 * @param item
	 */
	public void itensCadastrados(Map<String, List<Item>> item) {
		printaMensagem("------------- Itens cadastrados ------------- \n");
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
		printaMensagem("\n------------- Tela de Cadastros -------------\n");
		printaMensagem("              Você deseja cadastrar: \n");
		printaMensagem("    1 - Convidados \n    2 - Carnes \n    3 - Refrigerante \n    4 - Cervejas \n    0 - Voltar");
		
		printaMensagemSemPularLinha("\n Selecione: ");
	}

}
