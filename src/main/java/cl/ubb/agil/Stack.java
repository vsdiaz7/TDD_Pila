package cl.ubb.agil;

public class Stack {
	
	private int tamanio =0;
	
	public boolean estaVacia() {
		if(tamanio==0){
			return true;
		}
		return false;
	}

	public int agregarStack(int i) {
		return tamanio++;
	}
	
	public int tamanioStack(){
		return tamanio;
	}
	

}
