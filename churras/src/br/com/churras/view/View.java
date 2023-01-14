package br.com.churras.view;

import java.math.BigDecimal;

import br.com.churras.service.Calculador;

public class View {

	public static void main(String[] args) {
		MenuOpcoes menuOpcoes = new MenuOpcoes();
 // teste
		int escolhaUsuario = 0;
		do {
			switch (escolhaUsuario) {
			case 1: { // cadastrar convidados
				
				break;
			}
			case 2: { // cadastrar carnes

				break;
			}
			case 3: { // cadastrar bebidas

				break;
			}
			case 4: { // exibir valor por pessoa

				break;
			}
			default:
				System.out.println("default");
			}
			menuOpcoes.menuOpcoes();

		} while (true);

	}
	
}
