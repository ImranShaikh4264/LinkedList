package com.bridgelab.linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(70);
		list.add(30);
		list.add(56);
		list.display();
		System.out.println();
		list.append(56);
		list.append(30);
		list.append(70);
		list.display();
		System.out.println("");
		list.insert(30);
		list.display();
		System.out.println();
		System.out.println(list.pop());
		list.display();
		System.out.println("");
		System.out.println(list.popLast());
		list.display();
		System.out.println("");
		if (list.search(30) != null) {
			System.out.println("data found");
		} else {
			System.out.println("data not found");
		}
		System.out.println(list.insertAfter(30, 40));
		list.display();
		System.out.println();

		list.popElement(40);
		list.display();
		System.out.println();
		System.out.println(list.size());

	}

}
