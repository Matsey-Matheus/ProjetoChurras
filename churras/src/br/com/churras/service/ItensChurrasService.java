package br.com.churras.service;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import br.com.churras.model.Item;
import br.com.churras.view.BaseView;

/**
 * 
 * @author Matheus Martins Santos
 * 
 */
public class ItensChurrasService {
	
	/**
	 * 
	 * 
	 * Faz um pré cadastro dos itens de base, esse método é chamado no inicio da
	 * aplicação e pode ser chamado apenas uma vez.
	 * 
	 * @return Retorna o mapa com as informações cadastradas
	 */
	public void preCadastroItensBase(Map<String, List<Item>> mapa) {
		List<Item> carnes = new LinkedList<>();
		carnes.add(new Item("Picanha", BigDecimal.valueOf(26.98)));
		carnes.add(new Item("Linguica", BigDecimal.valueOf(17.46)));
		carnes.add(new Item("Asa/Coxa", BigDecimal.valueOf(6.00)));
		mapa.put("carne", carnes);

		List<Item> refrigerantes = new LinkedList<>();
		refrigerantes.add(new Item("Coca-Cola", BigDecimal.valueOf(8.17)));
		mapa.put("refrigerante", refrigerantes);

		List<Item> cervejas = new LinkedList<>();
		cervejas.add(new Item("Heineken 5 latas", BigDecimal.valueOf(32.95)));
		mapa.put("cerveja", cervejas);
	}

}
