package br.com.churras.view;

import br.com.churras.component.ChurrasComponent;
import br.com.churras.model.BaseModel;
import br.com.churras.service.CalculadorService;
import br.com.churras.service.ItensChurrasService;
import br.com.churras.util.ConstanteBase;
import br.com.churras.util.LeitorDeDados;

/**
 * 
 * Classe responsavel por renderizar/capturar os dados na tela
 * 
 * @author Matheus Martins
 * @author Miguel Arcanjo
 * @author Bruno Polido
 *
 */
public class BaseView extends MensagemView {

	
	public static final int OPCAO_INVALIDA = -1;
	public static final int OPCAO_CADASTRAR = 1;
	public static final int OPCAO_VISUALIZAR = 2;
	public static final int OPCAO_DELETAR = 3;
	public static final int OPCAO_FAZER_CALCULO_POR_PESSOA = 4;
	private final int OPCAO_COMO_FUNCIONA_O_SISTEMA = 5;
	

	/**
	 * Metodo para iniciar os cadastros basicos do sistema
	 * 
	 * @author Bruno Polido
	 */
	public void inicializacaoSistema() {
		BaseModel base = new BaseModel();
		ItensChurrasService itemService = new ItensChurrasService();

		itemService.preCadastroItensBase(base.getMapaItens());
		selecao(base);
	}

	/**
	 *
	 * @author Bruno Polido
	 */
	public void informacao() {
		printaMensagem("------------- APRESENTAÇÂO DO SISTEMA -------------");
		printaMensagem("De acordo com a pesquisa feita cada pessoa em um churrasco consome 450g de carne");
		printaMensagem("1.5l de refrigerante ou 5 latas de 330ml");
		printaMensagem("Com base nesses dados fizemos um sistema para calcular o valor total do churrasco");
		printaMensagem("e valor que cada pessoa vai precisar pagar");
		printaMensagem("Tendo em Base que o valor dos itens para o churasco e de de");
		printaMensagem("--------------- =============================== ---------------\n");
	}

	/**
	 * apresentará as opcoes iniciais do sistema para o usuario
	 * 
	 * @author Miguel Arcanjo
	 */
	public void menuOpcoes() {
		printaMensagem("\n------------- Tela Inicial -------------");
		printaMensagem(
				"\n  1 - Cadastrar \n  2 - Visualizar \n  3 - Deletar  \n  4 - Calcular Total \n  5 - Como Usar o Sistema \n  0 - Sair");
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
		int escolhaUsuario;
		do {
			menuOpcoes();

			printaMensagem("");
			printaMensagemSemPularLinha("Selecione: ");
			
			try {
				escolhaUsuario = scanner.pegarInteiroDigitado();				
			} catch (Exception e) {
				escolhaUsuario = OPCAO_INVALIDA;
			}

			switch (escolhaUsuario) {
			case OPCAO_CADASTRAR: {
				churrasComponent.cadastrar(base);
				break;
			}
			case OPCAO_VISUALIZAR: {
				churrasComponent.visualizar(base);
				break;
			}
			case OPCAO_DELETAR: {
				churrasComponent.deletar(base);
				break;
			}
			case OPCAO_FAZER_CALCULO_POR_PESSOA: {
				CalculadorService.somarTotal(base);
				break;
			}
			case OPCAO_COMO_FUNCIONA_O_SISTEMA: {
				printaMensagem("\nEm Desenvolvimento");
				comoFuncionaSistema();
				break;
			}
			case ConstanteBase.OPCAO_SAIR: {
				printaMensagem("\n\t Saindo do Programa...");
				break;
			}
			default:
				printaMensagemErro("Escolha Uma Opção Válida");
			}
		} while (escolhaUsuario != ConstanteBase.OPCAO_SAIR);

		scanner.fechar();
	}

	/**
	 * @author Bruno Polido
	 */
	public void comoFuncionaSistema() {
		informacao();
		printaMensagem("------------- Como Funciona o Sistema -------------\n");
		// TODO Atualizar informações
		// TODO informações sobre como remover
		printaMensagem("	1 - No Menu de Cadastrar ira aparecer subcategorias de 1 a 4");
		printaMensagem("		∟ 1 - Cadastrar Convidados");
		printaMensagem("			∟ Para Cadastrar um Novo Convidado Você irá Precisar Colocar Somente o Nome Dele");
		printaMensagem("		∟ 2 - Cadastrar Carnes");
		printaMensagem(
				"			∟ Para Cadastrar uma Carne Você irá Precisar Colocar o Nome da Carne e a Quantidade de 1Kg");
		printaMensagem("		∟ 3 - Cadastrar Refrigerante");
		printaMensagem(
				"			∟ Para Cadastrar um Novo Refrigerante Você Irá Colocar a Quantidade de Refrigerante equivale a 1.5 litros");
		printaMensagem("		∟ 4 - Cadastrar Cerveja");
		printaMensagem(
				"			∟ Para Cadastrar Cerveja é Necessário Colocar o Nome e a Quantidade Equivalente a 1 Lata de Cerveja\n");
		printaMensagem("	2 - Visualizar");
		printaMensagem(
				"		∟ Nesta Opção é Possível Visualizar os Convidados, Carnes, Refrigerantes e Cervejas Cadastrados Até o Momento no Sistema\n");
		printaMensagem("	3 - Deletar");
		printaMensagem("		∟ Você Terá Duas Opções de Remoção:");
		printaMensagem("			∟ 1 - Remover Tudo Oque Está Registrado no Sistema Até o Momento");
		printaMensagem(
				"			∟ 2 - Remover Unitariamente (Dentro Desta Opção Você Poderá Escolher oque Remover em Cada uma das Opções Abaixo)");
		printaMensagem("				∟ 1 - Remover Convidados");
		printaMensagem("				∟ 2 - Remover Refrigerantes");
		printaMensagem("				∟ 3 - Remover Cervejas\n");
		printaMensagem("	4 - Calcular Valor por Pessoa");
		printaMensagem(
				"		∟ O Sistema Irá Estipular um Valor por igual para o Churras de Acordo com a quantidade de Convidados registrados no sistema");
		printaMensagem("			∟ A Regra é a Seguinte:");
		printaMensagem(
				"				∟ O Sistema irá pegar todas as carnes registradas e fazer um calculo para que cada carne tenha a mesma proporção em Kg");
		printaMensagem(
				"				∟ O Sistema irá pegar todos os refrigerantes registrados e fazer um calculo para que cada refrigerante tenha a mesma proporção");
		printaMensagem(
				"				∟ O Sistema irá pegar todas as cervejas registradas e fazer um calculo para que cada refrigerante tenha a mesma proporção em latas");
		printaMensagem(
				"				∟ E depois irá somar cada item (carne, refrigerante e cerveja) - assim será gerado o valor que cada um terá que pagar no Churras");
	}

}
