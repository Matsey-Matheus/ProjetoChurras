package br.com.churras.view;

/**
 * @author Miguel Arcanjo
 */
public class DeleteView extends MensagemView {
	/**
	 * mostra ao usuario o menu de opcoes sobre remoção de convidados e itens
	 * 
	 * @author Miguel Arcanjo
	 */
	public void telaRemoverConvidadosEItens() {
		printaMensagem("\n------------- Tela de Remover Convidados e Itens -------------\n");
		printaMensagem(" 1 - Remover tudo         - (ao remover tudo você estará deletando tanto convidados quanto refrigerantes e cervejas)");
		printaMensagem(" 2 - Limpar unitariamente - (escolhendo esta opcao voce poderá escolher oque remover separadamente)");
		printaMensagem(" 0 - Voltar");
	}
}
