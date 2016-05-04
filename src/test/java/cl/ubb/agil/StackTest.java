package cl.ubb.agil;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class StackTest {

	@Test
	public void StackVacio(){
		Stack stack= new Stack();
		boolean resultado= stack.estaVacia();
		assertThat(resultado, equalTo(true));
	}
	@Test
	public void AgregaNumero1StackNoVacio(){
		Stack stack= new Stack();
		stack.agregarStack(1);
		boolean resultado= stack.estaVacia();
		assertThat(resultado, equalTo(false));
	}
	@Test
	public void AgregaNumero1y2StackNoVacio(){
		Stack stack= new Stack();
		stack.agregarStack(1);
		stack.agregarStack(2);
		boolean resultado= stack.estaVacia();
		assertThat(resultado, equalTo(false));
	}
	@Test
	public void AgregaNumero1y2retorna2(){
		Stack stack= new Stack();
		stack.agregarStack(1);
		stack.agregarStack(2);
		int resultado= stack.tamanioStack();
		assertThat(2, is(resultado));
	}
	@Test
	public void AgregaNumero1retornaNumero1(){
		Stack stack= new Stack();
		stack.agregarStack(1);
		int resultado= stack.pop();
		assertThat(1, is(resultado));
	}
	@Test
	public void AgregaNumero1y2retornaNumero2(){
		Stack stack= new Stack();
		stack.agregarStack(1);
		stack.agregarStack(2);
		int resultado= stack.pop();
		assertThat(2, is(resultado));
	}
}
