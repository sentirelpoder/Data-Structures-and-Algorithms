package com.setenayronael.datastructuresandalgorithms.datastructure;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//TODO solve Sonar issues and problems
//TODO add implements and extends and @Override annotation according to them
public class MyHashMap<K,V>  {

    private static final int INITIAL_CAPACITY = 16;

    private int size = 0;

    static class MyNode<K,V> {

        K key;
        V value;
        MyNode<K,V> next;

        MyNode(K key, V value){
            this.key = key;
            this.value = value;
        }

        /**
         * Copied from HashMap.java
         * @return hashCode
         */
        public final int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

    }

    private MyNode<K,V>[] data;


    /**
     * Constructs an empty HashMap with the default initial capacity (16) and the default load factor (0.75).
     */
    public MyHashMap(){
        this.data = new MyNode[INITIAL_CAPACITY];
    }

    /**
     * Copied from HashMap.java
     * @param key of map
     * @return hash value
     */
    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
    /*
     *
     Constructors
     Constructor and Description

     HashMap(int initialCapacity)
     Constructs an empty HashMap with the specified initial capacity and the default load factor (0.75).
     HashMap(int initialCapacity, float loadFactor)
     Constructs an empty HashMap with the specified initial capacity and load factor.
     HashMap(Map<? extends K,? extends V> m)
     Constructs a new HashMap with the same mappings as the specified Map.
     */

    private int indexOf(Object key){
        return hash(key)&(data.length-1);
    }

    //TODO write tests for Methods inherited from class java.lang.Object
    //TODO finalize, getClass, notify, notifyAll, wait, wait, wait

    /*
     * void	clear()
     * Removes all of the mappings from this map.
     */


    /*
     * Object	clone()
     * Returns a shallow copy of this HashMap instance: the keys and values themselves are not cloned.
     */


    /*
     * V	compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
     * Attempts to compute a mapping for the specified key and its current mapped value
     * (or null if there is no current mapping).
     */


    /*
     * V	computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)
     * If the specified key is not already associated with a value (or is mapped to null),
     * attempts to compute its value using the given mapping function and enters it into this map unless null.
     */


    /*
     * V	computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
     * If the value for the specified key is present and non-null,
     * attempts to compute a new mapping given the key and its current mapped value.
     */


    /*
     * Returns true if this map contains a mapping for the specified key.
     */
    public boolean containsKey(Object key){
        MyNode<K,V> node = this.data[indexOf(key)];
        while(node != null)
        {
            if(node.key.equals(key)) return true;
            node = node.next;
        }
        return false;
    }


    /*
     * boolean	containsValue(Object value)
     * Returns true if this map maps one or more keys to the specified value.
     */


    /*
     * Set<Map.Entry<K,V>>	entrySet()
     * Returns a Set view of the mappings contained in this map.
     */


    /*
     * void	forEach(BiConsumer<? super K,? super V> action)
     * Performs the given action for each entry in this map
     * until all entries have been processed or the action throws an exception.
     */


    /**
     * Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
     */
    public V get(Object key) {
        MyNode<K,V> node = this.data[indexOf(key)];
        while(node != null){
            if(key.equals(node.key)) return node.value;
            node = node.next;
        }
        return null;
    }

    /*
     * V	getOrDefault(Object key, V defaultValue)
     * Returns the value to which the specified key is mapped,
     * or defaultValue if this map contains no mapping for the key.
     */


    /*
     * boolean	isEmpty()
     * Returns true if this map contains no key-value mappings.
     */

    /*
     *
     * Returns a Set view of the keys contained in this map.
     */
    public Set<K> keySet(){
        Set<K> keySet = new HashSet<>();
        MyNode<K,V> currentNode;
        for(int i=0; i<this.data.length; i++){
            currentNode = this.data[i];
            while(currentNode != null){
               keySet.add(currentNode.key);
               currentNode = currentNode.next;
            }
        }
        return keySet;
    }


    /*
     * V	merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
     * If the specified key is not already associated with a value or is associated with null,
     * associates it with the given non-null value.
     */


    //TODO not allow duplicated keys
    /**
     * Associates the specified value with the specified key in this map.
     */
    public V put(K key, V value) {
        if(this.data[indexOf(key)]==null)  data[indexOf(key)] = new MyNode<>(key, value);
        else {
            MyNode<K,V> node = this.data[indexOf(key)];
            while(node.next != null)
            {
                node = node.next;
            }
            node.next = new MyNode<>(key, value);
        }
        size++;
        return value;
    }


    /*
     * void	putAll(Map<? extends K,? extends V> m)
     * Copies all of the mappings from the specified map to this map.
     */


    /*
     * V	putIfAbsent(K key, V value)
     * If the specified key is not already associated with a value
     * (or is mapped to null) associates it with the given value and returns null, else returns the current value.
     */


    /*
     * V	remove(Object key)
     * Removes the mapping for the specified key from this map if present.
     */


    /*
     * boolean	remove(Object key, Object value)
     * Removes the entry for the specified key only if it is currently mapped to the specified value.
     */


    /*
     * V	replace(K key, V value)
     * Replaces the entry for the specified key only if it is currently mapped to some value.
     */


    /*
     * boolean	replace(K key, V oldValue, V newValue)
     * Replaces the entry for the specified key only if currently mapped to the specified value.
     */


    /*
     * void	replaceAll(BiFunction<? super K,? super V,? extends V> function)
     * Replaces each entry's value with the result of invoking the given function on that entry
     * until all entries have been processed or the function throws an exception.
     */


    /*
     *
     * Returns the number of key-value mappings in this map.
     */
    public int size() {
        return this.size;
    }


    /*
     * Collection<V>	values()
     * Returns a Collection view of the values contained in this map.
     */


    /*
     * Methods inherited from class java.util.AbstractMap
     * equals
     */


    /*
     * Methods inherited from class java.util.AbstractMap
     * Methods inherited from interface java.util.Map
     * hashCode
     */


    /*
     * Methods inherited from class java.util.AbstractMap
     * toString
     */


    /*
     * Methods inherited from interface java.util.Map
     * equals
     */

}
