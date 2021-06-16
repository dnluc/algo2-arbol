package ar.caece.algoritmos2.arbol;

import java.util.List;

public abstract class ArbolBajador  {

	List<ArbolBajador> nodos;
	
	TipoNodo tipoNodo;

	public List<ArbolBajador> getNodos() {
		return nodos;
	}

	public void setNodos(List<ArbolBajador> nodos) {
		this.nodos = nodos;
	}

	public TipoNodo getTipoNodo() {
		return tipoNodo;
	}
	
	
	
}
