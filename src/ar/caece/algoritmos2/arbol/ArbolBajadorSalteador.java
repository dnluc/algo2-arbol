package ar.caece.algoritmos2.arbol;

public class ArbolBajadorSalteador extends ArbolBajador {

	int valor;

	public ArbolBajadorSalteador() {
		this.tipoNodo = TipoNodo.SALTEADOR;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
