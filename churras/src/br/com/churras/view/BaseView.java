package br.com.churras.view;

import java.util.Scanner;

import br.com.churras.component.ChurrasComponent;
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

	/**
	 * TODO REFATORAR OPÇÕES DO MENU
	 * 
	 * A tela deverá iniciar com informações mais simples, por exemplo: ( 1 -
	 * Cadastrar ( 1 - Itens (dentro de convidados) 2 - Convidados (dentro de
	 * convidados) ) 2 - Visualizar ( 1 - Itens (dentro de convidados) 2 -
	 * Convidados (dentro de convidados) ) 3 - Calcular 4 - Como usar o programa )
	 * Assim em sequencia, por exemplo, digitou 1 (Cadastrar), entrar na área de
	 * cadastro mostrando em 3 opções o que a pessoa quer cadastrar (carne, refri ou
	 * cerveja).
	 * 
	 * Nas opções Itens ou Convidados, ter três opções para seleção do usuário, a
	 * primeira de visualizar, a segunda de remover apenas um e a última de limpas a
	 * lista.
	 * 
	 * @author Miguel Arcanjo
	 * 
	 */

	public void menuOpcoes() {
		System.out.println("\n------------- Tela Inicial -------------");
		System.out.println(
				"\n  1 - Cadastrar \n  2 - Visualizar \n  3 - Calcular Valor por Pessoa \n  4 - Como Usar o Sistema \n  0 - Sair");
	}

	public void selecao(BaseModel base) {
		// OBJETOS
		Scanner scanner = new Scanner(System.in);
		ChurrasComponent churrasComponent = new ChurrasComponent();

		// VARIAVEIS
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
		//		BigDecimal total = churrasComponent.valorCalculoPessoa(item);
		//		System.out.println("O valor parcial para cada pessoa vai ficar: " + total);
				break;

			}
			case 4: {
				System.out.println("\n------------- Como Funciona o Sistema -------------\n");
				introducao();
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
	public void introducao() {
		System.out.println("1 - Entra no Menu de Cadastrar Convidados e Produtos ira aparecer subcategorias de 1 a 4");
		System.out.println("= 1 - Para Cadastrar Convidados");
		System.out.println("	Para Cadastrar um Novo Convidado voce precisara Colocar o nome dele e aperta Enter");
		System.out.println("= 2 - Para Cadastrar Carnes");
		System.out.println("	Para Cadastrar uma carne voce precisara Colocar o nome da carne e quantidade de 1Kg");
		System.out.println("= 3 - Para Cadastrar Refrigerante");
		System.out.println(
				"	Para Cadastrar um Novo Refrigerante Voce pode colocar a quantidade de Refrigerante ex 1 equivale a 1.5 litros");
		System.out.println("= 4 - Para Cadastrar Cerveja");
		System.out.println(
				"	Para Cadastrar Cerveja e nessesario colocar o nome e a quantidade de 1 equivale a 5 latas de cerveja cada lata tem 330ml \n");
		System.out.println("2 - Entra no Menu de Visualizar Convidados e Produtos cadastrados para o churasco\n");
		System.out.println("3 -	Calcula o valor por pessoa ira mostra o valor que saira para cada pessoa o churrasco ");
	}

}
