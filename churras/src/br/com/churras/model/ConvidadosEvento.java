package br.com.churras.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * 
 * @author Matheus Martins
 *
 */
public class ConvidadosEvento {

	// TODO FINALIZAR MODELO DE CONVIDADO (atributo "Nome", construtor e Getter Setter)
	private List<Convidado> convidados;

	public ConvidadosEvento() {
		convidados = new LinkedList<>();
	}

	public List<Convidado> getConvidados() {
		return Collections.unmodifiableList(convidados);
	}
	
	public void addConvidado(Convidado convidado) {
		this.convidados.add(convidado);
	}
	
}
