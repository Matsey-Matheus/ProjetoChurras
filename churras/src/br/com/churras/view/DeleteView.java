package br.com.churras.view;

/**
 * @author Miguel Arcanjo
 */
public class DeleteView extends MensagemBaseView {
	/**
	 * mostra ao usuario o menu de opcoes sobre remoção de convidados e itens
	 * 
	 * @author Miguel Arcanjo
	 */
	public void telaRemoverConvidadosEItens() {
		System.out.println("\n------------- Tela de Remover Convidados e Itens -------------\n");
		System.out.println(" 1 - Remover tudo         - (ao remover tudo você estará deletando tanto convidados quanto refrigerantes e cervejas)");
		System.out.println(" 2 - Limpar unitariamente - (escolhendo esta opcao voce poderá escolher oque remover separadamente)");
		System.out.println(" 0 - Voltar");
	}
}
