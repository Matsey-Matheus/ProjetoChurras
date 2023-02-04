package br.com.churras;

import br.com.churras.model.BaseModel;
import br.com.churras.view.BaseView;

public class Application {

	public static void main(String[] args) {
		
		BaseModel base = new BaseModel();
		BaseView view = new BaseView();
		
		view.inicializacaoSistema(base);
	
	}
}
