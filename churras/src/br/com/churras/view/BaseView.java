package br.com.churras.view;

import java.math.BigDecimal;
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

	public void menuOpcoes() {
		System.out.println("\n------------- Tela Inicial -------------");
		System.out.println("\n  1 - Cadastrar \n  2 - Visualizar \n  3 - Deletar  \n  4 - Calcular Valor por Pessoa \n  5 - Como Usar o Sistema \n  0 - Sair");
	}

	public void selecao(BaseModel base) {
		Scanner scanner = new Scanner(System.in);
		ChurrasComponent churrasComponent = new ChurrasComponent();

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
				churrasComponent.deletar(base);
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
		System.out.println("    1 - No Menu de Cadastrar ira aparecer subcategorias de 1 a 4");
		System.out.println("    	1 - Cadastrar Convidados");
		System.out.println("	        Para Cadastrar um Novo Convidado Você irá Precisar Colocar Somente o Nome Dele");
		System.out.println("        2 - Cadastrar Carnes");
		System.out.println("			Para Cadastrar uma Carne Você irá Precisar Colocar o Nome da Carne e a Quantidade de 1Kg");
		System.out.println("        3 - Cadastrar Refrigerante");
		System.out.println("			Para Cadastrar um Novo Refrigerante Você Irá Colocar a Quantidade de Refrigerante equivale a 1.5 litros");
		System.out.println("        4 - Cadastrar Cerveja");
		System.out.println("			Para Cadastrar Cerveja é Necessário Colocar o Nome e a Quantidade Equivalente a 1 Lata de Cerveja\n");
		System.out.println("    2 - Visualizar");
		System.out.println("		  Nesta Opção é Possível Visualizar os Convidados, Carnes, Refrigerantes e Cervejas Cadastrados Até o Momento no Sistema\n");
		System.out.println("    3 - Deletar");
		System.out.println("		  Você Terá Duas Opções de Remoção:");
		System.out.println("    	     1 - Remover Tudo Oque Está Registrado no Sistema Até o Momento");
		System.out.println("         	 2 - Remover Unitariamente (Dentro Desta Opção Você Poderá Escolher oque Remover em Cada uma das Opções Abaixo)");
		System.out.println("    		     1 - Remover Convidados");
		System.out.println(" 				 2 - Remover Refrigerantes");
		System.out.println("    		     3 - Remover Cervejas\n");
		System.out.println("    4 - Calcular Valor por Pessoa");
		System.out.println("		O Sistema Irá Estipular um Valor por igual para o Churras de Acordo com a quantidade de Convidados registrados no sistema");
		System.out.println("	      A Regra é a Seguinte:");
		System.out.println("		    O Sistema irá pegar todas as carnes registradas e fazer um calculo para que cada carne tenha a mesma proporção em Kg");
		System.out.println("    		O Sistema irá pegar todos os refrigerantes registrados e fazer um calculo para que cada refrigerante tenha a mesma proporção");
		System.out.println("    		O Sistema irá pegar todas as cervejas registradas e fazer um calculo para que cada refrigerante tenha a mesma proporção em latas");
		System.out.println("    		E depois irá somar cada item (carne, refrigerante e cerveja) - assim será gerado o valor que cada um terá que pagar no Churras");
	}

}
