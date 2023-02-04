package br.com.churras.view;

public abstract class MensagemBaseView {

	public void printaMensagem(String mensagem) {
		System.out.println(mensagem);
	}

	public void printaMensagemErro(String mensagem) {
		System.err.println(mensagem);
	}

}
