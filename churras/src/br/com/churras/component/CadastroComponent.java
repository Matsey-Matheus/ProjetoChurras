package br.com.churras.component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.com.churras.model.Convidado;
import br.com.churras.model.ConvidadosEvento;
import br.com.churras.model.Item;

public class CadastroComponent {
	
	public void cadastrarConvidado(ConvidadosEvento convidado, String nome) {
		convidado.addConvidado(new Convidado(nome, LocalDate.now()));
	}
	
	public void cadastrarItem(List<Item> item, String nome, BigDecimal valor) {
		item.add(new Item(nome, valor));
	}	
}
