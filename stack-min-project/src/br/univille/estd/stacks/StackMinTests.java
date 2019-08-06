package br.univille.estd.stacks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import br.univille.estd.stacks.StackMin;

public class StackMinTests {
	
	@Test
	public void min() {
		Stack<Integer> stack = new StackMin<Integer>();
		stack.push(10);
		assertEquals("MÌnimo",10,(int)stack.min());
	}
	
	@Test
	public void min2() {
		Stack<Integer> stack = new StackMin<Integer>();
		stack.push(3);
		stack.push(1);
		stack.push(2);
		stack.pop();
		assertEquals("MÌnimo",1,(int)stack.min());
	}
	
	@Test
	public void min3() {
		Stack<Integer> stack = new StackMin<Integer>();
		stack.push(3);
		stack.push(2);
		stack.push(1);
		stack.push(4);
		stack.pop();
		stack.pop();
		assertEquals("MÌnimo",2,(int)stack.min());
	}
	
	@Test
	public void isEmpty() {
		Stack<Integer> stack = new StackMin<Integer>();
		assertEquals("A pilha deve estar vazia",true,stack.isEmpty());
	}
	
	@Test
	public void size() {
		Stack<Integer> stack = new StackMin<Integer>();
		assertEquals("O tamanho da pilha deve ser zero",0,stack.size());
	}
	
	@Test
	public void push() {
		Stack<Integer> stack = new StackMin<Integer>();
		stack.push(10);
		assertEquals("Pilha deve conter um elemento",1,stack.size());
	}
	
	@Test
	public void top() {
		Stack<Integer> stack = new StackMin<Integer>();
		stack.push(10);
		stack.push(15);
		assertEquals("Top deve retornar o elemento 15",15,(int)stack.top());
	}
	
	@Test
	public void pop() {
		Stack<Integer> stack = new StackMin<Integer>();
		stack.push(10);
		stack.push(15);
		assertEquals("Top deve retornar o elemento 15",15,(int)stack.pop());
		assertEquals("Pilha deve conter um elemento",1,stack.size());
	}
	
	@Test
	public void popThrowsException() {
		Stack<Integer> stack = new StackMin<Integer>();
		try {
			stack.pop();
			fail("Pilha deve gerar exce√ßao EmptyStackException");
		}catch(Exception ignored) {
		}
	}
	
	@Test
	public void topThrowsException() {
		Stack<Integer> stack = new StackMin<Integer>();
		try {
			stack.top();
			fail("Pilha deve gerar exce√ßao EmptyStackException");
		}catch(Exception ignored) {
		}
	}

}
