package br.com.churras.view;

public abstract class MensagemView {

	public void printaMensagemSemPularLinha(String mensagem) {
		System.out.print(mensagem);
	}
	
	public void printaMensagem(String mensagem) {
		System.out.println(mensagem);
	}

	public void printaMensagemErro(String mensagem) {
		System.err.println(mensagem);
	}

}
