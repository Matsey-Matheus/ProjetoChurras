package br.com.churras.component;

import br.com.churras.util.LeitorDeDados;
import br.com.churras.view.DeleteView;

/**
 * @author Miguel Arcanjo
 */
public class DeletarComponent {
	/**
	 * este método apresentará ao usuario duas opcoes:
	 * 1 - remover tudo (convidados e itens)
	 * 2 - remover unitariamente (somente convidado, somente refrigerante...)
	 * 
	 * @author Miguel Arcanjo
	 */
	public void deletar() {
		LeitorDeDados scanner = new LeitorDeDados();
		DeleteView view = new DeleteView();
		
		int continuarDeletar = 0;
		int digitado;
		do {
			view.telaRemoverConvidadosEItens();
			digitado = scanner.pegarInteiroDigitado();
			switch (digitado) {
			case 1: {
				view.printaMensagem("Remover Convidados...");
				// TODO metodo para remover tudo (convidados e itens)
				break;
			}
			case 2: {
				view.printaMensagem("Remover Unitariamente...");
				removerUnitario();
				break;
			}
			case 0: {
				continuarDeletar = 1;
				break;
			}
			default:
				view.printaMensagem("   Escolha uma opcao valida");
			}
		} while(continuarDeletar == 0);
		scanner.fechar();
	}
	
	public void removerUnitario() {
		// TODO metodo para remover unitariamente (convidados/refrrigerante/cerveja)
	}
	
	public void removerConvidadosEItens() {
		// TODO metodo para remover tudo (convidado e item)
	}
}
