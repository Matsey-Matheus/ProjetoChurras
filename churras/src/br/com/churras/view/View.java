package br.com.churras.view;

import java.util.Scanner;

//import java.math.BigDecimal; // nao sei se vai precisar usar
//import br.com.churras.service.Calculador; // nao sei se vai precisar usar

public class View {

	public static void main(String[] args) {
		// objetos
		Scanner scanner = new Scanner(System.in);
		MenuOpcoes menuOpcoes = new MenuOpcoes();
		ApresentacaoSistema apresentacao = new ApresentacaoSistema();
		// variaveis
		int escolhaUsuario = 0;
		int continuarLoop = 0;
		
		do {
			apresentacao.apresentacao();
			menuOpcoes.menuOpcoes();
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
	
}
