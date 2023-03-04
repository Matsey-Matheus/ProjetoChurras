package br.com.churras.component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.com.churras.model.Convidado;
import br.com.churras.model.ConvidadosEvento;
import br.com.churras.model.Item;

public class CadastroComponent {

	/**
	 * Cadastra o convidado
	 * 
	 * @param convidado
	 * @param nome
	 */
	public void cadastrarConvidado(ConvidadosEvento convidado, String nome) {
		convidado.addConvidado(new Convidado(nome, LocalDate.now()));
	}

	/**
	 * Cadastra o item
	 * 
	 * @param item
	 * @param nome
	 * @param valor
	 */
	public void cadastrarItem(List<Item> item, String nome, BigDecimal valor) {
		item.add(new Item(nome, valor));
	}
}
