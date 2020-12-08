package com.myhashmap;

public class MyLinkedList<K> {

	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) { // Use Case 2

		if (this.tail == null) {
			this.tail = newNode;

		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	public void append(INode<K> myNode) {
		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	public INode<K> search(K key) {

		INode<K> tempNode = head;
		while (tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(key)) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}

	public INode<K> remove(INode<K> node) {

		INode<K> removedNode = search(node.getKey());
		if (removedNode != null) {
			INode<K> tempNode = this.head;
			while (tempNode.getNext() != removedNode) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(removedNode.getNext());
			return removedNode;
		} else
			return null;
	}

	public int size() {
		int count = 0;
		INode<K> tempNode = this.head;
		while (tempNode != null) {
			count++;
			tempNode = tempNode.getNext();
		}
		return count;
	}

	public void printNodes() {
		System.out.println(head);
	}

	public String toString() {
		return "myLinkedListNodes { " + head + " }}";
	}
}
