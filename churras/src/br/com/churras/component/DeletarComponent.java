package br.com.churras.component;

import br.com.churras.util.LeitorDeDados;

public class DeletarComponent {
	public void deletar() {
		LeitorDeDados scanner = new LeitorDeDados();
		
		int continuarDeletar = 0;
		int digitado;
		do {
			System.out.println("\n------------- Tela de Remover Convidados e Itens -------------\n");
			System.out.println(" 1 - Remover tudo         - (ao remover tudo você estará deletando tanto convidados quanto refrigerantes e cervejas)");
			System.out.println(" 2 - Limpar unitariamente - (escolhendo esta opcao voce poderá escolher oque remover separadamente)");
			System.out.println(" 0 - Voltar");
			digitado = scanner.pegarInteiroDigitado();
			switch (digitado) {
			case 1: {
				// TODO metodo para remover tudo (convidados e itens)
				break;
			}
			case 2: {
				removerUnitario();
				break;
			}
			case 0: {
				continuarDeletar = 1;
				break;
			}
			default:
				System.out.println("   Escolha uma opcao valida");
			}
		} while(continuarDeletar == 0);
		scanner.fechar();
	}
	
	public void removerUnitario() {
		// TODO metodo para remover unitariamente ( convidados/refrrigerante/cerveja )
	}
}
