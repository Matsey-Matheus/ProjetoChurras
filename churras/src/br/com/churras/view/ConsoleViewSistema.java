package br.com.churras.view;

import java.util.Scanner;

import br.com.churras.model.Item;
import br.com.churras.service.ItensChurrasService;

public class ConsoleViewSistema {

	public void inicializacaoSistema(ItensChurrasService item) {
		item.preCadastroItensBase();
		itensCadastrados(item);
		menuOpcoes();
	}

	public void informacao() {
		System.out.println("------------- APRESENTAÇÂO DO SISTEMA E COMO USAR -------------");
		System.out.println("De acordo com a pesquisa feita cada pessoa em um churrasco consome 450g de carne");
		System.out.println("1.5l de refrigerante ou 5 latas de 330ml");
		System.out.println("Com base nesses dados fizemos um sistema para calcular o valor total do churrasco");
		System.out.println("e valor que cada pessoa vai precisar pagar");
		System.out.println("Tendo em Base que o valor dos itens para o churasco e de de");
		System.out.println("------------- ============================= -------------");
		System.out.println("");

	}

	/**
	 * TODO REFATORAR OPÇÕES DO MENU 
	 * 
	 * A tela deverá iniciar com informações mais simples,
	 * por exemplo:
	 * 				( 
	 * 					1 - Cadastrar
	 * 					2 - Itens
	 * 					3 - Convidados
	 * 					4 - Calcular
	 * 					5 - Como usar o programa
	 * 				)
	 * Assim em sequencia, por exemplo, digitou 1 (Cadastrar), entrar na área de cadastro
	 * mostrando em 3 opções o que a pessoa quer cadastrar (carne, refri ou cerveja).
	 * 
	 * Nas opções Itens ou Convidados, ter três opções para seleção do usuário, a primeira de visualizar,
	 * a segunda de remover apenas um e a última de limpas a lista.
	 * 
	 */
	public void menuOpcoes() {
		System.out.println(
				"\n  1 - cadastro de convidados \n  2 - Cadastro de comidas \n  3 - Cadastro de bebidas \n  4 - exibir valor por pessoa \n");

	}

	public void itensCadastrados(ItensChurrasService item) {
		System.out.println("------------- Itens cadastrados -------------");
		if (!item.getMapa().isEmpty()) {
			System.out.println("Carnes: ");
			for (Item cada : item.getMapa().get("carne")) {
				System.out.println("	" + cada.getNome() + " R$" + cada.getValor());
			}
			System.out.println("Refrigerantes: ");
			for (Item cada : item.getMapa().get("refrigerante")) {
				System.out.println("	" + cada.getNome() + " R$" + cada.getValor());
			}
			System.out.println("Cervejas: ");
			for (Item cada : item.getMapa().get("cerveja")) {
				System.out.println("	" + cada.getNome() + " R$" + cada.getValor());
			}
		}
		System.out.println("------------- ============================= -------------");
	}

	public void selecao() {
		// OBJETOS
		Scanner scanner = new Scanner(System.in);

		// VARIAVEIS
		int escolhaUsuario = 0;
		int continuarLoop = 0;

		do {
			menuOpcoes();
			escolhaUsuario = scanner.nextInt();

			switch (escolhaUsuario) {
			case 1: {
				System.out.println("              Cadastrar Convidados");
				break;
			}
			case 2: {
				System.out.println("              Cadastrar Carnes");
				break;
			}
			case 3: {
				System.out.println("              Cadastrar Bebidas");
				break;
			}
			case 4: {
				System.out.println("              Exibir Valor Total Por Pessoa");
				break;
			}
			default:
				System.out.println("Escolha Uma Opção Válida");
				continuarLoop = 1;
			}
		} while (continuarLoop == 1);

		scanner.close();
	}
	
	//TODO CRIAR MENSAGEM DE INTRODUÇÃO (COMO USAR NOSSO PROGRAMA)
	public void introducao() {
		
	}

}
