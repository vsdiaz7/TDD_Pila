package cl.ubb.agil;

public class Stack {
	
	private int tamanio =0;
	
	public boolean estaVacia() {
		if(tamanio==0){
			return true;
		}
		return false;
	}

	public void agregarStack(int i) {
		tamanio++;
		
	}

}
