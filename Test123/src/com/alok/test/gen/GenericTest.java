package com.alok.test.gen;

import java.util.LinkedHashMap;

public class GenericTest {

	public interface CustomMap<K, V>{
		
		public void put(K k,V v);
		
		public V get(K k);
		
	}
	
	class MyMap<K,V> implements CustomMap<K, V>{

		private K key;
		private V value;
		
		private LinkedHashMap<K, V> map;
		
		MyMap(K k,V v){
			
		}
		
		@Override
		public void put(K k, V v) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public V get(K k) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
}
