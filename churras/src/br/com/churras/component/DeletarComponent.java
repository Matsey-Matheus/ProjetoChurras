package br.com.churras.component;

import java.util.List;
import java.util.Map;

import br.com.churras.model.Item;
import br.com.churras.view.BaseView;

/**
 * @author Miguel Arcanjo
 */
public class DeletarComponent {
	
	/**
	 * 
	 * Limpa apenas um item de uma lista.
	 * 
	 * @param tipo, nome
	 * 
	 */
	public void removerItemUnitario(Map<String, List<Item>> mapa, String tipo, String nome) {
		int linha = 0;
		for (Item item : mapa.get(tipo)) {
			if (item.getNome().equals(nome)) {
				break;
			}
			linha++;
		}

		if (linha < mapa.get(tipo).size()) {
			mapa.get(tipo).remove(linha);
		} else {
			BaseView.printaMensagemStatica("\n Nome do item não existente \n", 3);
		}
	}
	
	/**
	 * 
	 * 
	 * Limpa todos os itens de uma lista, ela deve ser especificada como parâmetro.
	 * A lista já vem pronta no Map, passar apenas ela como parâmetro.
	 * 
	 * @param (Lista de carne, refrigerante ou cerveja)
	 */
	public void removerTodosItens(List<Item> listaItem) {
		listaItem.clear();
	}
	
}
