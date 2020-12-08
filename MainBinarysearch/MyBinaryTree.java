package com.hashtabletest;

public class MyBinaryTree<K extends Comparable<K>> {

	private MyBinaryNode<K> root;

	public void add(K key) {//Adds data to BST
		this.root = this.addRecursively(root, key);
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {//Adds Data Recursively
		if(current == null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if(compareResult == 0) return current;
		if(compareResult < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key); 
		}
		return current;
	}

	public int getSize() { //Returns Size
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(MyBinaryNode<K> current) {//Counts the BST recursively
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left)
									  +this.getSizeRecursive(current.right);
	}
}
