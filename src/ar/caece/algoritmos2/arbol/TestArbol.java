package ar.caece.algoritmos2.arbol;

import java.util.ArrayList;


public class TestArbol {

	
	public static ArbolBajador crearArbol1() {
		

		//Creo nodo raiz
		ArbolBajadorValor<String> nodoRaiz = new ArbolBajadorValor<>(); 
		nodoRaiz.setNodos(new ArrayList<>());
		nodoRaiz.setValor("A");

		//Creo nodo 1
		ArbolBajadorValor<String> nodo1 = new ArbolBajadorValor<>(); 
		nodo1.setNodos(new ArrayList<>());
		nodo1.setValor("B");
		
		//Creo nodo 2
		ArbolBajadorValor<String> nodo2 = new ArbolBajadorValor<>(); 
		nodo2.setNodos(new ArrayList<>());
		nodo2.setValor("C");
		
		//Creo nodo 3
		ArbolBajadorValor<String> nodo3 = new ArbolBajadorValor<>(); 
		nodo3.setNodos(new ArrayList<>());
		nodo3.setValor("D");
		
		//Agrego nodos al nodo Raiz
		nodoRaiz.getNodos().add(nodo1);
		nodoRaiz.getNodos().add(nodo2);
		nodoRaiz.getNodos().add(nodo3);
		
		//Creo nodo 4
		ArbolBajadorValor<String> nodo4 = new ArbolBajadorValor<>(); 
		nodo4.setNodos(new ArrayList<>());
		nodo4.setValor("E");
		
		//Creo nodo 5
		ArbolBajadorValor<String> nodo5 = new ArbolBajadorValor<>(); 
		nodo5.setNodos(new ArrayList<>());
		nodo5.setValor("F");
		
		//Agrego nodos al nodo 1
		nodo1.getNodos().add(nodo4);
		nodo1.getNodos().add(nodo5);
		
		//creo nodo 6
		ArbolBajadorSalteador nodo6 = new ArbolBajadorSalteador(); 
		nodo6.setNodos(new ArrayList<>());
		nodo6.setValor(2);
		
		//creo nodo 7
		ArbolBajadorValor<String> nodo7 = new ArbolBajadorValor<>(); 
		nodo7.setNodos(new ArrayList<>());
		nodo7.setValor("G");
		
		//Agrego nodos al nodo 4
		nodo4.getNodos().add(nodo6);
		nodo4.getNodos().add(nodo7);
		
		//creo nodo 8
		ArbolBajadorModificador nodo8 = new ArbolBajadorModificador(); 
		nodo8.setNodos(new ArrayList<>());
		nodo8.setValor(2);
		
		//creo nodo 9
		ArbolBajadorValor<String> nodo9 = new ArbolBajadorValor<>(); 
		nodo9.setNodos(new ArrayList<>());
		nodo9.setValor("H");
		
		//Agrego Nodos a nodo 6
		nodo6.getNodos().add(nodo8);
		nodo6.getNodos().add(nodo9);
	
		//Creo nodo 10
		ArbolBajadorValor<String> nodo10 = new ArbolBajadorValor<>(); 
		nodo10.setNodos(new ArrayList<>());
		nodo10.setValor("I");
		
		//Creo nodo 11
		ArbolBajadorValor<String> nodo11 = new ArbolBajadorValor<>(); 
		nodo11.setNodos(new ArrayList<>());
		nodo11.setValor("J");
		
		//Agrego nodos al nodo 8
		nodo8.getNodos().add(nodo10);
		nodo8.getNodos().add(nodo11);
		
		
		//Creo nodo 12
		ArbolBajadorValor<String> nodo12 = new ArbolBajadorValor<>(); 
		nodo12.setNodos(new ArrayList<>());
		nodo12.setValor("K");
		
		//Creo nodo 13
		ArbolBajadorValor<String> nodo13 = new ArbolBajadorValor<>(); 
		nodo13.setNodos(new ArrayList<>());
		nodo13.setValor("L");
		
		//Agrego nodos al nodo 10
		nodo10.getNodos().add(nodo12);
		nodo10.getNodos().add(nodo13);
		
		return nodoRaiz;
		
		
	}
	
	
}
