# ProjetoChurras
teste
classe principal

public class Main {

	public static void main(String[] args) {
		MenuOpcoes menuOpcoes = new MenuOpcoes();

		String escolhaUsuario;
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

-----------------------------------------------------------------------------------------------------------------------------------------------------------

menu opcoes

public class MenuOpcoes {
	public void menuOpcoes() {
		System.out.println("informacoes sobre as comidas");
		System.out.println("1 - cadastro de convidados \n2 - Cadastro de comidas \n3 - Cadastro de bebidas \n4exibir valor por pessoa");

	}

}
