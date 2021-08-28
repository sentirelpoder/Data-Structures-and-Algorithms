package com.setenayronael.datastructuresandalgorithms.datastructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MyHashMapTest {

    MyHashMap<String, String> myHashMap;

    @BeforeEach
    void initialize() {
        this.myHashMap = new MyHashMap<>();
    }


    //TODO write tests for Methods inherited from class java.lang.Object
    //TODO finalize, getClass, notify, notifyAll, wait, wait, wait

    /**
     * void	clear()
     * Removes all of the mappings from this map.
     */
    @Test
    void testClear() {
        fail();
    }

    /**
     * Object	clone()
     * Returns a shallow copy of this HashMap instance: the keys and values themselves are not cloned.
     */
    @Test
    void testClone() {
        fail();
    }

    /**
     * V	compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
     * Attempts to compute a mapping for the specified key and its current mapped value
     * (or null if there is no current mapping).
     */
    @Test
    void testCompute() {
        fail();
    }

    /**
     * V	computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)
     * If the specified key is not already associated with a value (or is mapped to null),
     * attempts to compute its value using the given mapping function and enters it into this map unless null.
     */
    @Test
    void testComputeIfAbsent() {
        fail();
    }

    /**
     * V	computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
     * If the value for the specified key is present and non-null,
     * attempts to compute a new mapping given the key and its current mapped value.
     */
    @Test
    void testComputeIfPresent() {
        fail();
    }

    /**
     * boolean	containsKey(Object key)
     * Returns true if this map contains a mapping for the specified key.
     */
    @Test
    void testContainsKey() {
        assertFalse(this.myHashMap.containsKey("testContainsKey1"));
        for (int i = 0; i < 20; i++) {
            this.myHashMap.put("testContainsKey" + i, "testContainsValue" + i);
        }
        Random random = new Random();
        int randInt;
        for (int i = 0; i < 15; i++) {
            randInt = random.nextInt(20);
            assertTrue(this.myHashMap.containsKey("testContainsKey" + randInt));
        }
    }

    /**
     * boolean	containsValue(Object value)
     * Returns true if this map maps one or more keys to the specified value.
     */
    @Test
    void testContainsValue() {
        fail();
    }

    /**
     * Set<Map.Entry<K,V>>	entrySet()
     * Returns a Set view of the mappings contained in this map.
     */
    @Test
    void testEntrySet() {
        fail();
    }

    /**
     * void	forEach(BiConsumer<? super K,? super V> action)
     * Performs the given action for each entry in this map
     * until all entries have been processed or the action throws an exception.
     */
    @Test
    void testForEach() {
        fail();
    }

    /**
     * V	get(Object key)
     * Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
     */
    @Test
    void testGet() {
        assertNull(this.myHashMap.get("testGetKey1"));
        for (int i = 0; i < 20; i++) {
            this.myHashMap.put("testGetKey" + i, "testGetValue" + i);
        }
        Random random = new Random();
        int randInt;
        for (int i = 0; i < 15; i++) {
            randInt = random.nextInt(20);
            assertEquals("testGetValue" + randInt, this.myHashMap.get("testGetKey" + randInt));
        }
    }

    /**
     * V	getOrDefault(Object key, V defaultValue)
     * Returns the value to which the specified key is mapped,
     * or defaultValue if this map contains no mapping for the key.
     */
    @Test
    void testGetOrDefault() {
        fail();
    }

    /**
     * boolean	isEmpty()
     * Returns true if this map contains no key-value mappings.
     */
    @Test
    void testIsEmpty() {
        fail();
    }

    /**
     * Set<K>	keySet()
     * Returns a Set view of the keys contained in this map.
     */
    @Test
    void testKeySet() {
        Set<String> solutionKeySet = new HashSet<>();
        for (int i = 0; i < 30; i++) {
            this.myHashMap.put("testSetKey" + i, "testSetValue" + i);
            this.myHashMap.put("testSetKey" + (i+2), "testSetValue" + (i+2));
            solutionKeySet.add("testSetKey" + i);
            solutionKeySet.add("testSetKey" + (i+2));
        }
        Set<String> keySet = this.myHashMap.keySet();
        assertAll(() -> assertEquals(solutionKeySet.size(), keySet.size()),
                () -> assertTrue(solutionKeySet.containsAll(keySet)));

    }

    /**
     * V	merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
     * If the specified key is not already associated with a value or is associated with null,
     * associates it with the given non-null value.
     */
    @Test
    void testMerge() {
        fail();
    }

    //TODO not allow duplicated keys
    /**
     * V put(K key, V value)
     * Associates the specified value with the specified key in this map.
     */
    @Test
    void testPut() {
        this.myHashMap.put("testPutKey", "testPutValue");
        assertAll(() -> assertEquals(1, this.myHashMap.size()),
                () -> assertTrue(this.myHashMap.containsKey("testPutKey")),
                () -> assertEquals("testPutValue", this.myHashMap.get("testPutKey")));
    }

    /**
     * void	putAll(Map<? extends K,? extends V> m)
     * Copies all of the mappings from the specified map to this map.
     */
    @Test
    void testPutAll() {
        fail();
    }

    /**
     * V	putIfAbsent(K key, V value)
     * If the specified key is not already associated with a value
     * (or is mapped to null) associates it with the given value and returns null, else returns the current value.
     */
    @Test
    void testPutIfAbsent() {
        fail();
    }

    /**
     * V	remove(Object key)
     * Removes the mapping for the specified key from this map if present.
     */
    @Test
    void testRemove() {
        fail();
    }

    /**
     * boolean	remove(Object key, Object value)
     * Removes the entry for the specified key only if it is currently mapped to the specified value.
     */
    @Test
    void testRemoveKeyWithValue() {
        fail();
    }

    /**
     * V	replace(K key, V value)
     * Replaces the entry for the specified key only if it is currently mapped to some value.
     */
    @Test
    void testReplace() {
        fail();
    }

    /**
     * boolean	replace(K key, V oldValue, V newValue)
     * Replaces the entry for the specified key only if currently mapped to the specified value.
     */
    @Test
    void testReplaceWithNewValue() {
        fail();
    }

    /**
     * void	replaceAll(BiFunction<? super K,? super V,? extends V> function)
     * Replaces each entry's value with the result of invoking the given function on that entry
     * until all entries have been processed or the function throws an exception.
     */
    @Test
    void testReplaceAll() {
        fail();
    }

    /**
     * int	size()
     * Returns the number of key-value mappings in this map.
     */
    @Test
    void testSize() {
       this.myHashMap.put("testSizeKey1", "testSizeValue1");
       this.myHashMap.put("testSizeKey1", "testSizeValue2");
       this.myHashMap.put("testSizeKey3", "testSizeValue3");
       //TODO duplicated keys problem, if not allowed size must be 2
       assertEquals(3, myHashMap.size());
       //TODO remove and checkSize
    }

    /**
     * Collection<V>	values()
     * Returns a Collection view of the values contained in this map.
     */
    @Test
    void testValues() {
        fail();
    }

    /**
     * Methods inherited from class java.util.AbstractMap
     * equals
     */
    @Test
    void testAbstractMap() {
        fail();
    }

    /**
     * Methods inherited from class java.util.AbstractMap
     * Methods inherited from interface java.util.Map
     * hashCode
     */
    @Test
    void testHashCode() {
        fail();
    }

    /**
     * Methods inherited from class java.util.AbstractMap
     * toString
     */
    @Test
    void testToString() {
        fail();
    }

    /**
     * Methods inherited from interface java.util.Map
     * equals
     */
    @Test
    void testEquals() {
        fail();
    }

}
