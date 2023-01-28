package br.com.churras.component;

import java.util.List;

import br.com.churras.model.BaseModel;
import br.com.churras.model.Item;
import br.com.churras.util.LeitorDeDados;
import br.com.churras.view.CadastradoView;

public class ChurrasComponent {
	
	public void cadastrar(BaseModel base) {
		CadastroComponent cadastro = new CadastroComponent();
		
		LeitorDeDados sc = new LeitorDeDados();
		LeitorDeDados sc2 = new LeitorDeDados();
		
		int continuarCadastro = 0;
		do {
			System.out.println("\n------------- Tela de Cadastros -------------\n");
			System.out.println("              Você deseja cadastrar: \n");
			System.out.println("    1 - Convidados \n    2 - Carnes \n    3 - Refrigerante \n    4 - Cervejas \n    0 - Voltar");
			
			System.out.print("\n Selecione: ");
			int escolhaUsuario = sc.pegarInteiroDigitado();
			
			switch (escolhaUsuario) {
			
			case 1: {
				System.out.print("\n Digite o nome do convidado que deseja adicionar: ");
				String nome = sc2.pegarTextoCompletoDigitado();
				
				cadastro.cadastrarConvidado(base.getConvidado(), nome);
				break;
			}
			case 2: {
				System.out.println("\n Cadastro de carnes...\n");
				List<Item> carnes = base.getMapaItens().get("carne");
				
				System.out.print(" Nome: ");
				String nome = sc2.pegarTextoCompletoDigitado();
				System.out.print(" Valor: ");
				Double valor = sc.pegarNumeroFracionadoDigitado();
			
				cadastro.cadastrarItem(carnes, nome, valor);
				break;
			}
			case 3: {
				System.out.println("\n Cadastro de refrigerante...\n");
				List<Item> refrigerante = base.getMapaItens().get("refrigerante");
				
				System.out.print(" Nome: ");
				String nome = sc2.pegarTextoCompletoDigitado();
				System.out.print(" Valor: ");
				Double valor = sc.pegarNumeroFracionadoDigitado();
			
				cadastro.cadastrarItem(refrigerante, nome, valor);
				break;
			}
			case 4: {
				System.out.println("Cadastrar Cervejas...");
				// TODO metodo para cadastrar cervejas
				break;
			}
			case 0: {
				System.out.println("\n   Voltando para a tela inicial...");
				continuarCadastro = 1;
				break;
			}
			default:
				System.err.println("   Escolha uma opcao valida");
			}
		} while (continuarCadastro == 0);
	}
	
	@SuppressWarnings("resource")
	public void vizualizar(BaseModel base) {
		CadastradoView cadastrado = new CadastradoView();
		LeitorDeDados scanner = new LeitorDeDados();
		
		int continuarVisualizacao = 0;
		
		do {
			System.out.println("\n------------- Tela de Visualização-------------\n");
			System.out.println("              Você deseja visualizar: \n");
			System.out.println("    1 - Convidados \n    2 - Itens  \n    0 - Voltar");
			
			System.out.print("\n Selecione: ");
			int escolhaUsuario = scanner.pegarInteiroDigitado();
			
			switch (escolhaUsuario) {
			case 1: {
				if(!base.getConvidado().getNome().isEmpty()) {
					System.out.println("\n Visualizar Convidados... \n");
					cadastrado.convidadosCadastrados(base.getConvidado());
				} else {
					System.err.println("\n\tNenhum convidado cadastrado");
				}
				break;
			}
			case 2: {
				if(!base.getMapaItens().isEmpty()) {
					System.out.println("\n Visualizar Itens... \n");
					
					cadastrado.itensCadastrados(base.getMapaItens());
				} else {
					System.err.println("\n\tNenhum item cadastrado");
				}
				break;
			}
			case 0: {
				System.out.println("\n   Voltando para a tela inicial...");
				continuarVisualizacao = 1;
				break;
			}
			default:
				System.err.println("\n   Escolha uma opcao valida");
			}
		} while (continuarVisualizacao == 0);
	}
	
	public void deletar(BaseModel base) {
//		DeletarComponent deletarCompenent = new DeletarComponent();
		// TODO metodo deletar compenent
	}
	
	
	
	/*
	public BigDecimal valorCalculoPessoa(ItensChurrasService item) {
		System.out.println("\n------------- Calcular Valor por Pessoa -------------\n");
		
		BigDecimal carneTotal = BigDecimal.ZERO;
		BigDecimal refriTotal = BigDecimal.ZERO;
		BigDecimal brejaTotal = BigDecimal.ZERO;
		
		if (!item.getMapa().isEmpty()) {
			for (Item cada : item.getMapa().get("carne")) {
				 carneTotal = carneTotal.add(cada.getValor());
			}
			System.out.println("Valor total da carne: " + carneTotal);
			for (Item cada : item.getMapa().get("refrigerante")) {
				refriTotal = refriTotal.add(cada.getValor());
			}
			System.out.println("Valor total do refrigerante: " + refriTotal);
			for (Item cada : item.getMapa().get("cerveja")) {
				brejaTotal = brejaTotal.add(cada.getValor());
			}
			System.out.println("Valor total das cervejas: " + brejaTotal);
		}
		
		System.out.println("");
		BigDecimal total = carneTotal.add(brejaTotal.add(refriTotal));
		
		return total;
		
	}
	*/
}
