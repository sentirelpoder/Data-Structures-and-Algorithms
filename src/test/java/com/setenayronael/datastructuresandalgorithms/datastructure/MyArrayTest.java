package com.setenayronael.datastructuresandalgorithms.datastructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayTest {

    MyArray<String> myArray;

    @BeforeEach
    void initialize() {
        myArray = new MyArray<>();
    }


    //TODO write tests for Methods inherited from class java.lang.Object
    //TODO finalize, getClass, notify, notifyAll, wait, wait, wait, parallelStream, stream

    /*
     *
     * Methods inherited from class java.lang.Object
     * finalize, getClass, notify, notifyAll, wait, wait, wait
     * Methods inherited from interface java.util.Collection
     * parallelStream, stream
     */

    /**
     * Methods inherited from class java.util.AbstractList
     * Methods inherited from interface java.util.List
     */
    @Test
    void equals() {
        fail();
    }

    /**
     * Methods inherited from class java.util.AbstractList
     * Methods inherited from interface java.util.List
     */
    @Test
    void listHashCode() {
        fail();
    }

    /**
     * Methods inherited from class java.util.AbstractCollection
     * Methods inherited from interface java.util.List
     */
    @Test
    void containsAll() {
        fail();
    }

    /**
     * Methods inherited from class java.util.AbstractCollection
     */
    @Test
    void toSting() {
        fail();
    }

    /**
     * boolean	add(E e)
     * Appends the specified element to the end of this list.
     */
    @Test
    void add() {
        myArray.add("testAdd0");
        myArray.add("testAdd1");
        myArray.add("testAdd2");
        myArray.add("testAdd3");
        assertAll(() -> assertEquals(4, this.myArray.size()),
                () -> assertEquals("testAdd0", this.myArray.get(0)),
                () -> assertEquals("testAdd1", this.myArray.get(1)),
                () -> assertEquals("testAdd2", this.myArray.get(2)),
                () -> assertEquals("testAdd3", this.myArray.get(3)));
    }

    /**
     * void add(int index, E element)
     * Inserts the specified element at the specified position in this list.
     */
    @Test
    void addIndex() {
        myArray.add("testAdd1");
        myArray.add("testAdd3");
        myArray.add("testAdd4");
        myArray.add("testAdd5");
        myArray.add(4, "testAdd6");
        myArray.add(0, "testAdd0");
        myArray.add(2, "testAdd2");

        assertThrows(IllegalArgumentException.class,
                () -> this.myArray.add(-3, "testIllegal"));

        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> this.myArray.add(15, "testOutOfBound")
        );

        assertAll(() -> assertEquals(7, this.myArray.size()),
                () -> assertEquals("testAdd0", this.myArray.get(0)),
                () -> assertEquals("testAdd1", this.myArray.get(1)),
                () -> assertEquals("testAdd2", this.myArray.get(2)),
                () -> assertEquals("testAdd2", this.myArray.get(3)),
                () -> assertEquals("testAdd2", this.myArray.get(4)),
                () -> assertEquals("testAdd2", this.myArray.get(5)),
                () -> assertEquals("testAdd2", this.myArray.get(6))

        );
    }

    /**
     * boolean	addAll(int index, Collection<? extends E> c)
     * Inserts all of the elements in the specified collection
     * into this list, starting at the specified position.
     */
    @Test
    void addAll() {
        fail();
    }

    /**
     * void	clear()
     * Removes all of the elements from this list.
     */
    @Test
    void clear() {
        fail();
    }

    /**
     * Object	clone()
     * Returns a shallow copy of this ArrayList instance.
     */
    @Test
    void listClone() {
        fail();
    }

    /**
     * boolean	contains(Object o)
     * Returns true if this list contains the specified element.
     */
    @Test
    void contains() {
        fail();
    }

    /**
     * void	ensureCapacity(int minCapacity)
     * Increases the capacity of this ArrayList instance, if necessary,
     * to ensure that it can hold at least the number of elements s
     * specified by the minimum capacity argument.
     */
    @Test
    void ensureCapacity() {
        fail();
    }

    /**
     * void	forEach(Consumer<? super E> action)
     * Performs the given action for each element of the Iterable until all elements have been processed
     * or the action throws an exception.
     */
    @Test
    void forEach() {
        fail();
    }

    /**
     * E	get(int index)
     * Returns the element at the specified position in this list.
     */
    @Test
    void get() {
        assertThrows(IllegalArgumentException.class,
                () -> this.myArray.get(-3));

        assertThrows(IllegalArgumentException.class,
                () -> this.myArray.get(-1));

        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> this.myArray.get(0));

        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> this.myArray.get(4));

        this.myArray.add("testGet0");
        this.myArray.add("testGet1");
        this.myArray.add("testGet2");
        this.myArray.add("testGet3");

        assertAll("Get method didn't turn right element",
                () -> assertEquals("testGet0", this.myArray.get(0)),
                () -> assertEquals("testGet1", this.myArray.get(1)),
                () -> assertEquals("testGet2", this.myArray.get(2)),
                () -> assertEquals("testGet3", this.myArray.get(3)));
    }

    /**
     * int	indexOf(Object o)
     * Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
     */
    @Test
    void indexOf() {
        fail();
    }

    /**
     * boolean	isEmpty()
     * Returns true if this list contains no elements.
     */
    @Test
    void isEmpty() {
        fail();
    }

    /**
     * Iterator<E>	iterator()
     * Returns an iterator over the elements in this list in proper sequence.
     */
    @Test
    void iterator() {
        fail();
    }

    /**
     * int	lastIndexOf(Object o)
     * Returns the index of the last occurrence of the specified element in this list,
     * or -1 if this list does not contain the element.
     */
    @Test
    void lastIndexOf() {
        fail();
    }

    /**
     * ListIterator<E>	listIterator()
     * Returns a list iterator over the elements in this list (in proper sequence).
     */
    @Test
    void listIterator() {
        fail();
    }

    /**
     * ListIterator<E>	listIterator(int index)
     * Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list.
     */
    @Test
    void listIteratorIndex() {
        fail();
    }

    /**
     * E remove(int index)
     * Removes the element at the specified position in this list.
     */
    @Test
    void remove() {
        assertThrows(IllegalArgumentException.class,
                () -> this.myArray.remove(-3));

        assertThrows(IllegalArgumentException.class,
                () -> this.myArray.remove(-1));

        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> this.myArray.remove(0));

        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> this.myArray.remove(4));

        this.myArray.add("testRemove0");
        this.myArray.add("testRemoveRemoval1");
        this.myArray.add("testRemove1");
        this.myArray.add("testRemove2");

        assertEquals("testRemoveRemoval1", this.myArray.remove(1));

        this.myArray.add("testRemove3");
        this.myArray.add("testRemoveRemoval2");

        assertEquals("testRemoveRemoval2", this.myArray.remove(4));

        assertAll("Get method didn't turn right element",
                () -> assertEquals("testRemove0", this.myArray.get(0)),
                () -> assertEquals("testRemove1", this.myArray.get(1)),
                () -> assertEquals("testRemove2", this.myArray.get(2)),
                () -> assertEquals("testRemove3", this.myArray.get(3))
        );
    }

    /**
     * boolean	remove(Object o)
     * Removes the first occurrence of the specified element from this list, if it is present.
     */
    @Test
    void removeObject() {
        fail();
    }

    /**
     * boolean	removeAll(Collection<?> c)
     * Removes from this list all of its elements that are contained in the specified collection.
     */
    @Test
    void removeAll() {
        fail();
    }

    /**
     * boolean	removeIf(Predicate<? super E> filter)
     * Removes all of the elements of this collection that satisfy the given predicate.
     */
    @Test
    void removeIf() {
        fail();
    }

    /**
     * protected void	removeRange(int fromIndex, int toIndex)
     * Removes from this list all of the elements
     * whose index is between fromIndex, inclusive, and toIndex, exclusive.
     */
    @Test
    void removeRange() {
        fail();
    }

    /**
     * void	replaceAll(UnaryOperator<E> operator)
     * Replaces each element of this list with the result of applying the operator to that element.
     */
    @Test
    void replaceAll() {
        fail();
    }

    /**
     * boolean	retainAll(Collection<?> c)
     * Retains only the elements in this list that are contained in the specified collection.
     */
    @Test
    void retainAll() {
        fail();
    }

    /**
     * E set(int index, E element)
     * Replaces the element at the specified position in this list with the specified element.
     */
    @Test
    void set() {
        fail();
    }

    /**
     * int size()
     * Returns the number of elements in this list.
     */
    @Test
    void size() {
        assertEquals(0, myArray.size());
        myArray.add("testSize1");
        myArray.add("testSize2");
        myArray.add("testSize3");
        myArray.add("testSize4");
        assertEquals(4, myArray.size());
    }

    /**
     * void	sort(Comparator<? super E> c)
     * Sorts this list according to the order induced by the specified Comparator.
     */
    @Test
    void sort() {
        fail();
    }

    /**
     * Spliterator<E>	spliterator()
     * Creates a late-binding and fail-fast Spliterator over the elements in this list.
     */
    @Test
    void spliterator() {
        fail();
    }

    /**
     * List<E>	subList(int fromIndex, int toIndex)
     * Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
     */
    @Test
    void subList() {
        fail();
    }

    /**
     * Object[]	toArray()
     * Returns an array containing all of the elements in this list in proper sequence (from first to last element).
     */
    @Test
    void toArray() {
        fail();
    }

    /**
     * <T> T[]	toArray(T[] a)
     * Returns an array containing all of the elements in this list in proper sequence
     * (from first to last element); the runtime type of the returned array is that of the specified array.
     */
    @Test
    void toArrayContains() {
        fail();
    }

    /**
     * void	trimToSize()
     * Trims the capacity of this ArrayList instance to be the list's current size.
     */
    @Test
    void trimToSize() {
        fail();
    }
}
