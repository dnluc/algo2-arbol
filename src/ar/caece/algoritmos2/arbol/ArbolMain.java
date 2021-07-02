package ar.caece.algoritmos2.arbol;

import java.util.List;

public class ArbolMain {

	public static void main(String[] args) {
	
		
		ArbolBajador arbol = TestArbol.crearArbol1(); 
		
		RecorreArbol<String> recorreArbol = new RecorreArbol<>();
		
		List<String> recorrido = recorreArbol.recorrer(arbol, 0);
		
		System.out.println(recorrido);
		

		
	}

}
