package br.com.churras.view;

public abstract class MensagemView {

	private final static int MESMA_LINHA = 1;
	private final static int PULA_LINHA = 2;
	private final static int MENSAGEM_ERRO = 3;

	/**
	 * printa a mensagem que estiver dentro do parametro sem pular a linha (print)
	 * 
	 * @param mensagem
	 */
	public void printaMensagemSemPularLinha(String mensagem) {
		System.out.print(mensagem);
	}

	/**
	 * printa a mensagem que estiver dentro do parametro, depois pula a linha
	 * (println)
	 * 
	 * @param mensagem
	 */
	public void printaMensagem(String mensagem) {
		System.out.println(mensagem);
	}

	/**
	 * printa uma mensagem (println)<br>
	 * printa uma linha em branco
	 * 
	 * @param mensagem
	 */
	public void printaMensagemLn(String mensagem) {
		System.out.println(mensagem);
		System.out.println("");
	}

	/**
	 * printa uma linha em branco("")<br>
	 * embaixo desta linha exibe a mensagem (println)
	 * 
	 * @param mensagem
	 */
	public void lnPrintaMensagem(String mensagem) {
		System.out.println("");
		System.out.println(mensagem);
	}

	/**
	 * printa uma linha em branco("")<br>
	 * embaixo printa uma mensagem (println)<br>
	 * printa uma linha em branco("")
	 * 
	 * @param mensagem
	 */
	public void lnPrintaMensagemLn(String mensagem) {
		System.out.println("");
		System.out.println(mensagem);
		System.out.println("");
	}

	/**
	 * printa uma linha em branco<br>
	 * embaixo desta linha exibe a mensagem sem pular para a proxima linha (print)
	 * 
	 * @param mensagem
	 */
	public void lnPrintaMensagemSemPularLinha(String mensagem) {
		System.out.println("");
		System.out.print(mensagem);
	}

	/**
	 * printa a mensagem que estiver dentro do parametro como erro, (err, destaca a
	 * mensagem em vermelho)
	 * 
	 * @param mensagem
	 */
	public void printaMensagemErro(String mensagem) {
		System.err.println(mensagem);
	}

	/**
	 * printa uma linha em branco e embaixo desta linha exibe uma mensagem de erro
	 * 
	 * @param mensagem
	 */
	public void lnPrintaMensagemErro(String mensagem) {
		System.err.println("");
		System.err.println(mensagem);
	}

	/**
	 * printa uma linha em branco ("")<br>
	 * embaixo desta linha em branco exibe uma mensagem de erro<br>
	 * exibe outra linha em branco ("")
	 * 
	 * @param mensagem
	 */
	public void lnPrintaMensagemErroLn(String mensagem) {
		System.err.println("");
		System.err.println(mensagem);
		System.err.println("");
	}

	/**
	 * <h1>Equivalência do valorTipo: <blockquote>
	 * 
	 * <pre>
	 *  1: Sem pular linha
	 * </pre>
	 * 
	 * </blockquote> <blockquote>
	 * 
	 * <pre>
	 *  2: Pulando linha
	 * </pre>
	 * 
	 * </blockquote> <blockquote>
	 * 
	 * <pre>
	 *  3: Mensagem de erro
	 * </pre>
	 * 
	 * </blockquote>
	 *
	 * @param mensagem
	 * @param valorTipo
	 * 
	 * @author Matheus Martins
	 */
	public static void printaMensagemStatica(String mensagem, int valorTipo) {
		switch (valorTipo) {
		case MESMA_LINHA: {
			System.out.print(mensagem);
			break;
		}
		case PULA_LINHA: {
			System.out.println(mensagem);
			break;
		}
		case MENSAGEM_ERRO: {
			System.err.print(mensagem);
			break;
		}
		default:
			throw new IllegalArgumentException("Tipo invalido: " + valorTipo);
		}
	}

}
