package com.company;

class Box<K, T extends Fruit> { // Ошибка была в наследовании класса.
	private K key;
	private T obj;

	public Box(K key, T obj) {
		this.key = key;
		this.obj = obj;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Box{" + "key=" + key + ", obj=" + obj + '}';
	}
}
