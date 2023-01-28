package br.com.churras;

import br.com.churras.model.BaseModel;
import br.com.churras.view.BaseView;

public class Application {

	public static void main(String[] args) {
		
		BaseModel base = new BaseModel();
		BaseView view = new BaseView();
		
		view.inicializacaoSistema(base);
		
//		item.limpaApenasItemSelecionado("carne", "Linguica");
		
		/*
		Map<String, List<Item>> itens = item.getMapa();

		List<Item> carnes = itens.get("carne");

		Scanner sc = new Scanner(System.in);

		

		carnes.add(new Item(nome, BigDecimal.valueOf(valor)));
		itens.put("carne", carnes);
		
		view.itensCadastrados(item);
		*/
	}
}
