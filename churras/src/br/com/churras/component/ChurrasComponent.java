package br.com.churras.component;

import java.math.BigDecimal;
import java.util.List;

import br.com.churras.model.BaseModel;
import br.com.churras.model.Item;
import br.com.churras.service.CalculadorService;
import br.com.churras.util.LeitorDeDados;
import br.com.churras.view.CadastroView;
import br.com.churras.view.DeleteView;

public class ChurrasComponent {
	
	private final int OPCAO_SAIR = 0;
	private final int CADASTRAR_CONVIDADO = 1;
	private final int CADASTRAR_CARNE = 2;
	private final int CADASTRAR_REFRIGERANTE = 3;
	private final int CADASTRAR_CERVEJA = 4;
	
	/**
	 * O usuário poderá escolher quatro opcoes de cadastro:<br>
	 * 
	 * 1 - cadastrar convidado<br>
	 * 2 - cadastrar carne<br>
	 * 3 - cadastrar refrigerante<br>
	 * 4 - cadastrar cerveja<br>
	 * 
	 * @param base
	 */
	public void cadastrar(BaseModel base) {
		CadastroComponent cadastro = new CadastroComponent();
		CadastroView view = new CadastroView();
		LeitorDeDados sc = new LeitorDeDados();

		int continuarCadastro = 0;
		do {
			view.inicioCadastroView();
			int escolhaUsuario = sc.pegarInteiroDigitado();

			switch (escolhaUsuario) {

			case CADASTRAR_CONVIDADO: {
				view.printaMensagemSemPularLinha("\n Digite o nome do convidado que deseja adicionar: ");
				String nome = sc.pegarTextoCompletoDigitado();

				cadastro.cadastrarConvidado(base.getConvidado(), nome);
				break;
			}
			case CADASTRAR_CARNE: {
				view.printaMensagem("\n Cadastro de carnes...\n");
				List<Item> carnes = base.getMapaItens().get("carne");

				view.printaMensagemSemPularLinha(" Nome: ");
				String nome = sc.pegarTextoCompletoDigitado();
				view.printaMensagemSemPularLinha(" Valor Carne: ");
				double valor = sc.pegarNumeroFracionadoDigitado();

				cadastro.cadastrarItem(carnes, nome, CalculadorService.calculaCarne(valor));
				break;
			}
			case CADASTRAR_REFRIGERANTE: {
				view.printaMensagem("\n Cadastro de refrigerante...\n");
				List<Item> refrigerante = base.getMapaItens().get("refrigerante");

				view.printaMensagemSemPularLinha(" Nome: ");
				String nome = sc.pegarTextoCompletoDigitado();
				view.printaMensagemSemPularLinha(" Valor 2 Litros: ");
				double valor = sc.pegarNumeroFracionadoDigitado();

				cadastro.cadastrarItem(refrigerante, nome, BigDecimal.valueOf(valor));
				break;
			}
			case CADASTRAR_CERVEJA: {
				view.printaMensagem("Cadastrar Cervejas...");
				List<Item> cerveja = base.getMapaItens().get("cerveja");

				view.printaMensagemSemPularLinha(" Nome: ");
				String nome = sc.pegarTextoCompletoDigitado();
				view.printaMensagemSemPularLinha(" Valor Lata: ");
				double valor = sc.pegarNumeroFracionadoDigitado();

				cadastro.cadastrarItem(cerveja, nome, CalculadorService.calculaCerveja(valor));
				break;
			}
			case OPCAO_SAIR: {
				view.printaMensagem("\n   Voltando para a tela inicial...");
				continuarCadastro = 1;
				break;
			}
			default:
				view.printaMensagemErro("   Escolha uma opcao valida");
			}
		} while (continuarCadastro == 0);
	}

	/**
	 * O usuário poderá escolher duas opcoes:
	 * 
	 * 1 - visualizar convidados
	 * 2 - visualizar itens (carnes, refrigerantes e cervejas)
	 * 
	 * @param base
	 */
	public void vizualizar(BaseModel base) {
		CadastroView cadastrado = new CadastroView();
		LeitorDeDados scanner = new LeitorDeDados();
		CadastroView view = new CadastroView();

		int continuarVisualizacao = 0;

		do {
			view.printaMensagem("\n------------- Tela de Visualização-------------\n");
			view.printaMensagem("              Você deseja visualizar: \n");
			view.printaMensagem("    1 - Convidados \n    2 - Itens  \n    0 - Voltar");

			view.printaMensagemSemPularLinha("\n Selecione: ");
			int escolhaUsuario = scanner.pegarInteiroDigitado();

			switch (escolhaUsuario) {
			case 1: {
				if (!base.getConvidado().getNome().isEmpty()) {
					view.printaMensagem("\n Visualizar Convidados... \n");
					cadastrado.convidadosCadastrados(base.getConvidado());
				} else {
					view.printaMensagemErro("\n\tNenhum convidado cadastrado");
				}
				break;
			}
			case 2: {
				if (!base.getMapaItens().isEmpty()) {
					view.printaMensagem("\n Visualizar Itens... \n");

					cadastrado.itensCadastrados(base.getMapaItens());
				} else {
					view.printaMensagem("\n\tNenhum item cadastrado");
				}
				break;
			}
			case 0: {
				view.printaMensagem("\n   Voltando para a tela inicial...");
				continuarVisualizacao = 1;
				break;
			}
			default:
				view.printaMensagemErro("\n   Escolha uma opcao valida");
			}
		} while (continuarVisualizacao == 0);
	}

	/**
	 * este método apresentará ao usuario duas opcoes:
	 * 
	 * 1 - remover tudo (convidados e itens) 2 - remover unitariamente (somente
	 * convidado, somente refrigerante...)
	 * 
	 * @author Miguel Arcanjo
	 */
	public void deletar(BaseModel base) {
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
				break;
			}
			case 0: {
				continuarDeletar = 1;
				break;
			}
			default:
				view.printaMensagem("   Escolha uma opcao valida");
			}
		} while (continuarDeletar == 0);
		scanner.fechar();
	}

	/*
	 * public BigDecimal valorCalculoPessoa(ItensChurrasService item) { System.out.
	 * println("\n------------- Calcular Valor por Pessoa -------------\n");
	 * 
	 * BigDecimal carneTotal = BigDecimal.ZERO; BigDecimal refriTotal =
	 * BigDecimal.ZERO; BigDecimal brejaTotal = BigDecimal.ZERO;
	 * 
	 * if (!item.getMapa().isEmpty()) { for (Item cada :
	 * item.getMapa().get("carne")) { carneTotal = carneTotal.add(cada.getValor());
	 * } System.out.println("Valor total da carne: " + carneTotal); for (Item cada :
	 * item.getMapa().get("refrigerante")) { refriTotal =
	 * refriTotal.add(cada.getValor()); }
	 * System.out.println("Valor total do refrigerante: " + refriTotal); for (Item
	 * cada : item.getMapa().get("cerveja")) { brejaTotal =
	 * brejaTotal.add(cada.getValor()); }
	 * System.out.println("Valor total das cervejas: " + brejaTotal); }
	 * 
	 * System.out.println(""); BigDecimal total =
	 * carneTotal.add(brejaTotal.add(refriTotal));
	 * 
	 * return total;
	 * 
	 * }
	 */
}
