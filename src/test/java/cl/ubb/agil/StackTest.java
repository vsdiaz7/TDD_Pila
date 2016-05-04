package cl.ubb.agil;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.Test;

public class StackTest {

	@Test
	public void StackVacio(){
		Stack stack= new Stack();
		boolean resultado= stack.estaVacia();
		assertThat(resultado, equalTo(true));
	}
}
