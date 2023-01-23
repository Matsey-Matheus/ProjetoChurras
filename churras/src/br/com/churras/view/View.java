package br.com.churras.view;

import br.com.churras.service.ItensChurrasService;

public class View {

	public static void main(String[] args) {

		ItensChurrasService item = new ItensChurrasService();
		ConsoleViewSistema view = new ConsoleViewSistema();
		
		view.inicializacaoSistema(item);
		
		
		
    
		
//		item.limpaApenasItemSelecionado("carne", "Linguica");
		
		/*
		Map<String, List<Item>> itens = item.getMapa();

		List<Item> carnes = itens.get("carne");

		Scanner sc = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Valor: ");
		Double valor = sc.nextDouble();

		carnes.add(new Item(nome, BigDecimal.valueOf(valor)));
		itens.put("carne", carnes);
		
		view.itensCadastrados(item);
		*/
	}
}
