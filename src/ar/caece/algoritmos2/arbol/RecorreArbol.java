package ar.caece.algoritmos2.arbol;

import java.util.ArrayList;
import java.util.List;

public class RecorreArbol<T> {
	
	private List<T> recorrido = new ArrayList<>();
	
	@SuppressWarnings("unchecked")
	public List<T> recorrer(ArbolBajador arbol, int salto) {

//		switch(arbol.tipoNodo) {
//		case VALOR:
//			if (salto == 0) {
//				recorrido.add(((ArbolBajadorValor<T>) arbol).getValor());
//			}
//			break;
//		case SALTEADOR:
//			salto = ((ArbolBajadorSalteador) arbol).getValor(); 			
//			break;
//		case MODIFICADOR:
//			if (salto > 0) {
//				salto = salto + ((ArbolBajadorModificador) arbol).getValor();
//				if (salto < 0) {
//					salto = 0;
//				}
//			}
//			break;
//		default:
//			break;
//		}

		
		if (arbol instanceof ArbolBajadorValor) {
			if (salto == 0) {
				recorrido.add(((ArbolBajadorValor<T>) arbol).getValor());
			}
		} else if (arbol instanceof ArbolBajadorSalteador) {
			salto = ((ArbolBajadorSalteador) arbol).getValor();
			
		} else if (arbol instanceof ArbolBajadorModificador && salto > 0) {
				salto = salto + ((ArbolBajadorModificador) arbol).getValor();
				if (salto < 0) {
					salto = 0;
				}
		}
		
		
		
		
		if (salto > 0)
		{
			salto = salto - 1;
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
