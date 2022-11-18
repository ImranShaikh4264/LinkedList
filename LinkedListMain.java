package com.bridgelab.linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(70);
		list.add(30);
		list.add(56);
		list.display();
		
		System.out.println("");
		System.out.println(list.pop());
		list.display();
		
	}

}
