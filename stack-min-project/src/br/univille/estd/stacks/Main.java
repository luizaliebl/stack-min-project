package br.univille.estd.stacks;

public class Main {

	public static void main(String[] args) {
		
		StackMin pilha = new StackMin(15);
		
		pilha.push(7);
		pilha.push(5);
		pilha.push(3);
		pilha.push(4);
		pilha.push(5);
		pilha.push(6);
		pilha.push(7);
		pilha.push(8);
		pilha.push(9);
		pilha.push(1);
	
		
		System.out.println(pilha.toString());
		System.out.println(pilha.minToString());
		
		pilha.pop();
		
		System.out.println(pilha.toString());
		System.out.println(pilha.minToString());


	}

}
