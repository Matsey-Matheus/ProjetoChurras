package br.com.churras.view;

import java.util.List;
import java.util.Map;

import br.com.churras.model.Convidado;
import br.com.churras.model.Item;

public class CadastradoView extends MensagemBaseView {

	public void convidadosCadastrados(Convidado convidados) {
	//	montarTopo();
		System.out.println("");

		int numeroConvidadoAtual = 1;
		for (String convidado : convidados.getNome()) {
			System.out.print("|\t" + convidado + "\t");
			if (numeroConvidadoAtual % 3 == 0) {
				System.out.print("\t|");
				System.out.println("");
			} 
			
			numeroConvidadoAtual++;
		}
		System.out.println("");
	}

	public void itensCadastrados(Map<String, List<Item>> item) {
		System.out.println("------------- Itens cadastrados ------------- \n");
		if (!item.isEmpty()) {
			System.out.println("Carnes: ");
			for (Item cada : item.get("carne")) {
				System.out.println("	" + cada.getNome() + " - R$" + cada.getValor());
			}
			System.out.println("Refrigerantes: ");
			for (Item cada : item.get("refrigerante")) {
				System.out.println("	" + cada.getNome() + " - R$" + cada.getValor());
			}
			System.out.println("Cervejas: ");
			for (Item cada : item.get("cerveja")) {
				System.out.println("	" + cada.getNome() + " - R$" + cada.getValor());
			}
		}
	}

	public void inicioCadastroView() {
		System.out.println("\n------------- Tela de Cadastros -------------\n");
		System.out.println("              Você deseja cadastrar: \n");
		System.out.println("    1 - Convidados \n    2 - Carnes \n    3 - Refrigerante \n    4 - Cervejas \n    0 - Voltar");
		
		System.out.print("\n Selecione: ");
	}

}
