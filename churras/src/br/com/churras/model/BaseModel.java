package br.com.churras.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseModel {

	private Convidado convidado = new Convidado();
	private Map<String, List<Item>> mapaItens = new HashMap<>();
	
	public BaseModel() {
	}

	public Convidado getConvidado() {
		return convidado;
	}

	public Map<String, List<Item>> getMapaItens() {
		return mapaItens;
	}	
	
}
