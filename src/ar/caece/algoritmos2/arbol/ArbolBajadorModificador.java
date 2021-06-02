package ar.caece.algoritmos2.arbol;

public class ArbolBajadorModificador extends ArbolBajador {

	int valor;

	public ArbolBajadorModificador() {
		this.tipoNodo = TipoNodo.MODIFICADOR;	
	}
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
