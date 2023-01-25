package br.com.churras.component;

import java.math.BigDecimal;
import java.util.List;

import br.com.churras.model.Convidado;
import br.com.churras.model.Item;

public class CadastroComponent {

	public void cadastrarConvidado(Convidado convidado, String nome) {
		convidado.addConvidado(nome);
	}
	
	public void cadastrarItem(List<Item> item, String nome, Double valor) {
		item.add(new Item(nome, BigDecimal.valueOf(valor)));
	}
	
}
