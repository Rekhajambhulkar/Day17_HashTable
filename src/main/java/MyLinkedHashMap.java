package com.hashtabletest;

import java.util.ArrayList;

import org.checkerframework.checker.units.qual.K;

import com.myhashmap.MyLinkedList;
import com.myhashmap.MyMapNode;

public class MyLinkedHashMap<K, V> {
	private final int numBuckets;
	ArrayList<MyLinkedList> myBucketArray;

	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numBuckets;
		return index;
	}

	public MyLinkedHashMap() {
		this.numBuckets = 10;
		this.myBucketArray = new ArrayList<>(numBuckets);
		//Create empty LinedLists
		for(int i = 0; i < numBuckets; i++) 
			this.myBucketArray.add(null);
	}

	public V get(K key) {
		int index = this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
		if(myLinkedList == null) return null;
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
		if(myLinkedList == null) {
			myLinkedList = new MyLinkedList<>();
			this.myBucketArray.set(index, myLinkedList);
		}
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
		if(myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			myLinkedList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}

	public boolean remove(K key) {

		int index = this.getBucketIndex(key);

		MyLinkedList<K> linkedList = this.myBucketArray.get(index);
		if (linkedList == null) {
			return false;
		}
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) linkedList.search(key);

		if (myMapNode == null) {
			return false;
		} else {
			linkedList.remove(myMapNode);
			return (myMapNode.getKey().equals(key));
		}
	}

	@Override
	public String toString() {
		return "MyLinkedHashMap List { " +myBucketArray+ " }";
	}
}
