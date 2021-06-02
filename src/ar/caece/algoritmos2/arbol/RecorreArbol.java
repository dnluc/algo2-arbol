package ar.caece.algoritmos2.arbol;

import java.util.ArrayList;
import java.util.List;

public class RecorreArbol<T> {
	
	private List<T> recorrido = new ArrayList<>();
	
	@SuppressWarnings("unchecked")
	public List<T> recorrer(ArbolBajador arbol, int salto) {

		switch(arbol.tipoNodo) {
		case VALOR:
			recorrido.add(((ArbolBajadorValor<T>) arbol).getValor());	
			break;
		case SALTEADOR:
			salto = ((ArbolBajadorSalteador) arbol).getValor(); 			
			break;
		case MODIFICADOR:
			if (salto > 0) {
				salto = salto + ((ArbolBajadorModificador) arbol).getValor();
			}
			break;
		default:
			break;
			
		}
	
		if (arbol.getNodos() != null  && !arbol.getNodos().isEmpty()) {
			
			for (ArbolBajador nodo : arbol.getNodos() )
			{
				recorrer(nodo, salto);
			}
		}
		
		return recorrido;
		
	}
	
	
}
