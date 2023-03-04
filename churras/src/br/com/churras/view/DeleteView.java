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
		lnPrintaMensagemLn("------------- Tela de Remover Convidados e Itens -------------");
		printaMensagem(" 1 - Remover tudo         ");
		printaMensagem(" 2 - Remover unitariamente ");
		printaMensagem(" 0 - Voltar");
	}
}
