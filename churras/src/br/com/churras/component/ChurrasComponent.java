package br.com.churras.component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Scanner;

import br.com.churras.model.Item;
import br.com.churras.service.ItensChurrasService;

public class ChurrasComponent {

	private Scanner scanner = new Scanner(System.in);
	
	public void cadastrar(int escolhaUsuario) {

		int continuarCadastro = 0;
		do {
			System.out.println("\n------------- Tela de Cadastros -------------\n");
			System.out.println("              Você deseja cadastrar: ");
			System.out.println("    1 - Convidados \n    2 - Carnes \n    3 - Refrigerante \n    4 - Cervejas \n    0 - Voltar");
			escolhaUsuario = scanner.nextInt();
			switch (escolhaUsuario) {
			case 1: {
				System.out.println("Cadastrar Convidados...");
				// TODO metodo para cadastrar convidados
				continuarCadastro = 0;
				break;
			}
			case 2: {
				System.out.println("Cadastrar Carnes...");
				// TODO metodo para cadastrar carnes
				continuarCadastro = 0;
				break;
			}
			case 3: {
				System.out.println("Cadastrar Refrigerantes...");
				// TODO metodo para cadastrar refrigerantes
				continuarCadastro = 0;
				break;
			}
			case 4: {
				System.out.println("Cadastrar Cervejas...");
				// TODO metodo para cadastrar cervejas
				continuarCadastro = 0;
				break;
			}
			case 0: {
				System.out.println("Voltando para a tela inicial...");
				continuarCadastro = 1;
				break;
			}
			default:
				System.out.println("Escolha uma opcao valida");
			}
		} while (continuarCadastro == 0);
	}
	
	public void vizualizar(int escolhaUsuario) {
		int continuarVisualizacao = 0;
		
		do {
			System.out.println("\n------------- Tela de Visualização-------------\n");
			System.out.println("              Você deseja visualizar: ");
			System.out.println("    1 - Convidados \n    2 - Carnes \n    3 - Refrigerante \n    4 - Cervejas \n    0 - Voltar");
			escolhaUsuario = scanner.nextInt();
			switch (escolhaUsuario) {
			case 1: {
				System.out.println("Visualizar Convidados...");
				// TODO metodo para visualizar convidados
				continuarVisualizacao = 0;
				break;
			}
			case 2: {
				System.out.println("Visualizar Carnes...");
				// TODO metodo para visualizar carnes
				continuarVisualizacao = 0;
				break;
			}
			case 3: {
				System.out.println("Visualizar Refrigerantes...");
				// TODO metodo para visualizar refrigerantes
				continuarVisualizacao = 0;
				break;
			}
			case 4: {
				System.out.println("Visualizar Cervejas...");
				// TODO metodo para visualizar cervejas
				continuarVisualizacao = 0;
				break;
			}
			case 0: {
				System.out.println("Voltando para a tela inicial...");
				continuarVisualizacao = 1;
				break;
			}
			default:
				System.out.println("Escolha uma opcao valida");
			}
		} while (continuarVisualizacao == 0);
	}
	
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
	
}
