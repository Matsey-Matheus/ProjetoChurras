package br.com.churras.view;

import java.util.Scanner;

import br.com.churras.component.ChurrasComponent;
import br.com.churras.component.DeletarComponent;
import br.com.churras.model.BaseModel;
import br.com.churras.service.ItensChurrasService;

/**
 * 
 * 
 * @author Matheus Martins
 * @author Miguel Arcanjo
 * @author Bruno Polido
 *
 */
public class BaseView {

	public void inicializacaoSistema(BaseModel base) {
		ItensChurrasService itemService = new ItensChurrasService();

		itemService.preCadastroItensBase(base.getMapaItens());
		selecao(base);
//		menuOpcoes();
	}

	public void informacao() {
		System.out.println("------------- APRESENTAÇÂO DO SISTEMA -------------");
		System.out.println("De acordo com a pesquisa feita cada pessoa em um churrasco consome 450g de carne");
		System.out.println("1.5l de refrigerante ou 5 latas de 330ml");
		System.out.println("Com base nesses dados fizemos um sistema para calcular o valor total do churrasco");
		System.out.println("e valor que cada pessoa vai precisar pagar");
		System.out.println("Tendo em Base que o valor dos itens para o churasco e de de");
		System.out.println("--------------- =============================== ---------------");
		System.out.println("");

	}

	public void menuOpcoes() {
		System.out.println("\n------------- Tela Inicial -------------");
		System.out.println("\n  1 - Cadastrar \n  2 - Visualizar \n  3 - Deletar  \n  4 - Calcular Valor por Pessoa \n  5 - Como Usar o Sistema \n  0 - Sair");
	}

	public void selecao(BaseModel base) {
		Scanner scanner = new Scanner(System.in);
		ChurrasComponent churrasComponent = new ChurrasComponent();
		DeletarComponent deletarCompenent = new DeletarComponent();

		int continuarLoop = 1;

		do {
			menuOpcoes();

			System.out.print("\n Selecione: ");
			int escolhaUsuario = scanner.nextInt();

			switch (escolhaUsuario) {
			case 1: {
				churrasComponent.cadastrar(base);
				break;
			}
			case 2: {
				churrasComponent.vizualizar(base);
				break;
			}
			case 3: {
				deletarCompenent.deletar();
				break;
			}
			case 4: {
//				BigDecimal total = churrasComponent.valorCalculoPessoa(item);
				// System.out.println("O valor parcial para cada pessoa vai ficar: " + total);
				break;

			}
			case 5: {
				System.out.println("\n------------- Como Funciona o Sistema -------------\n");
				comoFuncionaSistema();
				break;
			}
			case 0: { // sair
				System.out.println("\n          Saindo do Programa...");
				continuarLoop = 0;
				break;
			}
			default:
				System.out.println("Escolha Uma Opção Válida");
				continuarLoop = 1;
			}
		} while (continuarLoop == 1);

		scanner.close();
	}

	/**
	 * @author Bruno Polido
	 */
	public void comoFuncionaSistema() {
		System.out.println("1 - Entra no Menu de Cadastrar Convidados e Produtos ira aparecer subcategorias de 1 a 4");
		System.out.println("= 1 - Para Cadastrar Convidados");
		System.out.println("	Para Cadastrar um Novo Convidado voce precisara Colocar o nome dele e aperta Enter");
		System.out.println("= 2 - Para Cadastrar Carnes");
		System.out.println("	Para Cadastrar uma carne voce precisara Colocar o nome da carne e quantidade de 1Kg");
		System.out.println("= 3 - Para Cadastrar Refrigerante");
		System.out.println("	Para Cadastrar um Novo Refrigerante Voce pode colocar a quantidade de Refrigerante ex 1 equivale a 1.5 litros");
		System.out.println("= 4 - Para Cadastrar Cerveja");
		System.out.println("	Para Cadastrar Cerveja e nessesario colocar o nome e a quantidade de 1 equivale a 5 latas de cerveja cada lata tem 330ml \n");
		System.out.println("2 - Entra no Menu de Visualizar Convidados e Produtos cadastrados para o churasco\n");
		System.out.println("3 -	Calcula o valor por pessoa ira mostra o valor que saira para cada pessoa o churrasco ");
		// TODO ajustar o numero das opcoes - (adicionei o deletar e coloquei na opcao 3)
		// TODO informações sobre como remover
	}

}
