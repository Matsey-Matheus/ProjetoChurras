package br.com.churras.model;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * 
 * @author Matheus Martins
 *
 */
public class Convidado {

	// TODO FINALIZAR MODELO DE CONVIDADO (atributo "Nome", construtor e Getter Setter)
	private List<String> nome = new LinkedList<>();

	public Convidado() {
	}

	public List<String> getNome() {
		return nome;
	}
	
	public void addConvidado(String nome) {
		this.nome.add(nome);
	}
	
}
