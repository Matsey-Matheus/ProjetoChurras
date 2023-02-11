package br.com.churras.view;

import java.math.BigDecimal;

import br.com.churras.component.ChurrasComponent;
import br.com.churras.model.BaseModel;
import br.com.churras.service.CalculadorService;
import br.com.churras.service.ItensChurrasService;
import br.com.churras.util.LeitorDeDados;

/**
 * 
 * 
 * @author Matheus Martins
 * @author Miguel Arcanjo
 * @author Bruno Polido
 *
 */
public class BaseView extends MensagemView {

	private final int OPCAO_SAIR = 0;
	private final int OPCAO_CADASTRAR = 1;
	private final int OPCAO_VISUALIZAR = 2;
	private final int OPCAO_DELETAR = 3;
	private final int OPCAO_FAZER_CALCULO_POR_PESSOA = 4;
	private final int OPCAO_COMO_FUNCIONA_O_SISTEMA = 5;

	public void inicializacaoSistema(BaseModel base) {
		ItensChurrasService itemService = new ItensChurrasService();

		itemService.preCadastroItensBase(base.getMapaItens());
		selecao(base);
	}

	/**
	 *
	 * @author Bruno Polido
	 */
	public void informacao() {
		System.out.println("------------- APRESENTAÇÂO DO SISTEMA -------------");
		System.out.println("De acordo com a pesquisa feita cada pessoa em um churrasco consome 450g de carne");
		System.out.println("1.5l de refrigerante ou 5 latas de 330ml");
		System.out.println("Com base nesses dados fizemos um sistema para calcular o valor total do churrasco");
		System.out.println("e valor que cada pessoa vai precisar pagar");
		System.out.println("Tendo em Base que o valor dos itens para o churasco e de de");
		System.out.println("--------------- =============================== ---------------\n");
	}

	/**
	 * apresentará as opcoes iniciais do sistema para o usuario
	 * 
	 * @author Miguel Arcanjo
	 */
	public void menuOpcoes() {
		System.out.println("\n------------- Tela Inicial -------------");
		System.out.println("\n  1 - Cadastrar \n  2 - Visualizar \n  3 - Deletar  \n  4 - Calcular Valor por Pessoa \n  5 - Como Usar o Sistema \n  0 - Sair");
	}

	/**
	 * Onde será mostrado para o usuario todas as opcoes de nagegação do sistema
	 * 
	 * @author Miguel Arcanjo
	 * @param base
	 */
	public void selecao(BaseModel base) {
		LeitorDeDados scanner = new LeitorDeDados();
		ChurrasComponent churrasComponent = new ChurrasComponent();

		int continuarLoop = 1;

		do {
			menuOpcoes();

			System.out.print("\n Selecione: ");
			int escolhaUsuario = scanner.pegarInteiroDigitado();

			switch (escolhaUsuario) {
			case OPCAO_CADASTRAR: {
				churrasComponent.cadastrar(base);
				break;
			}
			case OPCAO_VISUALIZAR: {
				churrasComponent.vizualizar(base);
				break;
			}
			case OPCAO_DELETAR: {
				churrasComponent.deletar(base);
				break;
			}
			case OPCAO_FAZER_CALCULO_POR_PESSOA: {
				System.out.println("\nEm Desenvolvimento");
				break;
			}
			case OPCAO_COMO_FUNCIONA_O_SISTEMA: {
				System.out.println("\nEm Desenvolvimento");
				comoFuncionaSistema();
				break;
			}
			case OPCAO_SAIR: {
				System.out.println("\n\t Saindo do Programa...");
				continuarLoop = 0;
				break;
			}
			default:
				System.err.println("Escolha Uma Opção Válida");
				continuarLoop = 1;
			}
		} while (continuarLoop == 1);

		scanner.fechar();
	}

	/**
	 * @author Bruno Polido
	 */
	public void comoFuncionaSistema() {
		informacao();
		System.out.println("------------- Como Funciona o Sistema -------------\n");
		// TODO Atualizar informações
		// TODO informações sobre como remover
		System.out.println("	1 - No Menu de Cadastrar ira aparecer subcategorias de 1 a 4");
		System.out.println("		∟ 1 - Cadastrar Convidados");
		System.out.println("			∟ Para Cadastrar um Novo Convidado Você irá Precisar Colocar Somente o Nome Dele");
		System.out.println("		∟ 2 - Cadastrar Carnes");
		System.out.println("			∟ Para Cadastrar uma Carne Você irá Precisar Colocar o Nome da Carne e a Quantidade de 1Kg");
		System.out.println("		∟ 3 - Cadastrar Refrigerante");
		System.out.println("			∟ Para Cadastrar um Novo Refrigerante Você Irá Colocar a Quantidade de Refrigerante equivale a 1.5 litros");
		System.out.println("		∟ 4 - Cadastrar Cerveja");
		System.out.println("			∟ Para Cadastrar Cerveja é Necessário Colocar o Nome e a Quantidade Equivalente a 1 Lata de Cerveja\n");
		System.out.println("	2 - Visualizar");
		System.out.println("		∟ Nesta Opção é Possível Visualizar os Convidados, Carnes, Refrigerantes e Cervejas Cadastrados Até o Momento no Sistema\n");
		System.out.println("	3 - Deletar");
		System.out.println("		∟ Você Terá Duas Opções de Remoção:");
		System.out.println("			∟ 1 - Remover Tudo Oque Está Registrado no Sistema Até o Momento");
		System.out.println("			∟ 2 - Remover Unitariamente (Dentro Desta Opção Você Poderá Escolher oque Remover em Cada uma das Opções Abaixo)");
		System.out.println("				∟ 1 - Remover Convidados");
		System.out.println("				∟ 2 - Remover Refrigerantes");
		System.out.println("				∟ 3 - Remover Cervejas\n");
		System.out.println("	4 - Calcular Valor por Pessoa");
		System.out.println("		∟ O Sistema Irá Estipular um Valor por igual para o Churras de Acordo com a quantidade de Convidados registrados no sistema");
		System.out.println("			∟ A Regra é a Seguinte:");
		System.out.println("				∟ O Sistema irá pegar todas as carnes registradas e fazer um calculo para que cada carne tenha a mesma proporção em Kg");
		System.out.println("				∟ O Sistema irá pegar todos os refrigerantes registrados e fazer um calculo para que cada refrigerante tenha a mesma proporção");
		System.out.println("				∟ O Sistema irá pegar todas as cervejas registradas e fazer um calculo para que cada refrigerante tenha a mesma proporção em latas");
		System.out.println("				∟ E depois irá somar cada item (carne, refrigerante e cerveja) - assim será gerado o valor que cada um terá que pagar no Churras");
	}

}
