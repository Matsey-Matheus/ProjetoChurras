package br.com.churras.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseModel {

	private ConvidadosEvento convidado = new ConvidadosEvento();
	private Map<String, List<Item>> mapaItens = new HashMap<>();
	
	public BaseModel() {
	}

	public ConvidadosEvento getConvidado() {
		return convidado;
	}

	public Map<String, List<Item>> getMapaItens() {
		return mapaItens;
	}	
	
}
