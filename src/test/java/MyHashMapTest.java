package com.hashtabletest;

import org.junit.Test;

import com.myhashmap.MyHashMap;

import junit.framework.Assert;

import static org.junit.Assert.*;

public class HashMapTest {

	public void init() {
		System.out.println("Welcome in HashMap");
	}

	@Test
	public void givenSentenceWhenWordsAreAddedToListShouldReturnFrequency() {

		String sentance = "To be or not to be";
		MyHashMap<String, Integer> hashMap = new MyHashMap();
		String[] words = sentance.toLowerCase().split(" ");

		for (String word : words) {
			Integer value = hashMap.get(word);

			if (value == null)
				value = 1;
			else
				value = value + 1;
			hashMap.add(word, value);
		}

		int frequency = hashMap.get("to");
		System.out.println(hashMap);
		Assert.assertEquals(2, frequency);
	}
}

