package ar.caece.algoritmos2.arbol;

import java.util.List;

public class ArbolBajadorValor<T> extends ArbolBajador {

	private T valor;
	
	public ArbolBajadorValor() {
		this.tipoNodo = TipoNodo.VALOR;
	}	

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}
	
	
}
