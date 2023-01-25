package br.com.churras.view;

import br.com.churras.model.BaseModel;

public class View {

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
