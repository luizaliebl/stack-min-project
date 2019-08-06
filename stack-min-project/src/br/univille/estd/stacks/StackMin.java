package br.univille.estd.stacks;

import java.util.ArrayList;
import java.util.List;

import br.univille.estd.stacks.EmptyStackException;
import br.univille.estd.stacks.Stack;

public class StackMin<E> implements Stack<E> {

	
	protected int capacity;
	public static final int CAPACITY = 1000;
	protected int top = -1;
	protected E S[];
	protected List<E> min;
	

	public StackMin(int capacity) {
		this.capacity = capacity;
		S = (E[])new Object[this.capacity];
		min = new ArrayList<E>();
	}
	
	public StackMin() {
		this(CAPACITY);
		min = new ArrayList<E>();
	}

	@Override
	public int size() {
		return top + 1;
	}

	@Override
	public boolean isEmpty() {
		if (top < 0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public E top() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("Pilha vazia");
		}
		else {
			return S[top];
		}
	}

	@Override
	public void push(E element) {
		if (size() == capacity) {
			throw new EmptyStackException("Pilha cheia");
		}
		else {
			top = top + 1;
			S[top] = element;
		}
		min();
	}

	@Override
	public E pop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("Pilha vazia");
		}
		else {
			E e = S[top];
			S[top] = null;
			top = top - 1; 
			if (e == min.get(min.size()-1)) {
				min.remove(min.size()-1);
			}
			return e;
		}
	}
	

	@Override
	public E min() throws EmptyStackException {
		E minimo = S[top];
		if (isEmpty()) {
			throw new EmptyStackException("Pilha vazia");
		}
		else {
			if (top == 0) {
				min.add(minimo);
			} else if (Integer.parseInt(S[top].toString()) < Integer.parseInt((min.get(min.size()-1).toString()))) {
				min.add(minimo);
			}
		}
		return minimo;
	}
	
	public String minToString() {
	 	return "Mínimo: " + min.get(min.size()-1).toString();
	}
	
	@Override
	public String toString() {
		
		 String pilha = "[ ";
		 	for (int i = 0; i < size(); i++) {
		 		pilha += i == 0 ? S[i] : ", " + S[i];
		 	}
	 	pilha += " ]";
	 	return pilha;
	}

}
