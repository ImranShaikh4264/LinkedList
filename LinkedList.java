package com.bridgelab.linkedlist;

public class LinkedList<T> {
	Node<T> head;
	Node<T> tail;

	void add(T key) {
		Node<T> node = new Node<>(key);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	void append(T key) {
		Node<T> node = new Node<>(key);
		if (head == null) {
			head = node;
			tail = node;
		}
		tail.next = node;
		tail = node;

	}

	T pop() {
		T deletedElement = (T) head.key;
		head = head.next;
		return deletedElement;
	}

	T popLast() {
		T deletedElement = (T) tail.key;
		Node<T> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		temp = tail;
		return deletedElement;

	}

	public Node<T> search(T key) {
		Node<T> temp = head;
		while (temp != null) {
			if (temp.key.equals(key)) {
				return temp;
			}
			temp = temp.next;
		}
		return null;

	}

	public boolean insert(T searchData, T insertData) {
		Node<T> node = new Node<>(insertData);
		Node<T> searchNode = search(searchData);
		if (searchNode != null) {
			node.next = searchNode.next;
			searchNode.next = node;
			return true;
		}
		return false;

	}

	public void popElement(T key) {
		Node<T> searchNode = search(key);
		Node<T> temp = head;
		while (temp.next != searchNode) {
			temp = temp.next;
		}
		temp.next = searchNode.next;
	}

	public int size() {
		int count = 0;
		Node<T> temp = head;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}

	void display() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(" " + temp.key);
		temp = temp.next;
		}
	}
}
