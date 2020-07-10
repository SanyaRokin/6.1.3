package com.company;

class VegetableBox<K, T extends Vegetable> {
    private K key;
    private T obj;

    public VegetableBox(K key, T obj) {
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
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        VegetableBox other = (VegetableBox) obj;
        if( key != other.key) return false;
        if (obj != other.obj) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Box{" +
                "key=" + key +
                ", obj=" + obj +
                '}';
    }
}
