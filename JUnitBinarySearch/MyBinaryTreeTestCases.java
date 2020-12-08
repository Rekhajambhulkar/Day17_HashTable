package com.hashtabletest;

import org.junit.Test;

import junit.framework.Assert;

public class MyBinaryTreeTestCases {
	@Test
	public void given3NumbersWhenAddedToBSTShouldReturnSize3() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);

		int size = myBinaryTree.getSize();
		Assert.assertEquals(3, size);
	}

	@Test
	public void given13NumbersWhenAddedToBSTShouldReturnSize13() {

		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(11);
		myBinaryTree.add(65);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(63);
		myBinaryTree.add(67);

		int size = myBinaryTree.getSize();
		System.out.println("Test Case 2 - Size : "+size);
		Assert.assertEquals(13, size);
	}

	@Test
	public void givenNumberAreAddedWhenSearchANumberShuldReturnTrueIfItExist() {
		
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(11);
		myBinaryTree.add(65);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
			
		int firstnumberToSearch = 51;
		boolean firstresult = myBinaryTree.search(firstnumberToSearch);
		String firstresultString = (firstresult)?"Found":"Not found";
		System.out.println("Test Case 3 - "+firstnumberToSearch+" "+firstresultString);
		Assert.assertFalse(firstresult);
		
		int secondnumberToSearch = 63;
		boolean secondresult = myBinaryTree.search(secondnumberToSearch);
		String secondresultString = (secondresult)?"Found":"Not found";
		System.out.println("Test Case 3 - "+secondnumberToSearch+" "+secondresultString);
		Assert.assertTrue(secondresult);
	}
}
