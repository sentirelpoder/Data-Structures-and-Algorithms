package com.setenayronael.datastructuresandalgorithms.datastructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    MyLinkedList<Integer> myLinkedList;

    @BeforeEach
    void initialize() {
        this.myLinkedList = new MyLinkedList<>();
    }

    /**
     * boolean	add(E e)
     * Appends the specified element to the end of this list.
     */
    @Test
    void add() {
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);

        assertAll(() -> assertEquals(1, myLinkedList.getFirst()),
                () -> assertEquals(4, myLinkedList.getLast()),
                () -> assertEquals(4, myLinkedList.size()));
    }

    /**
     * void	add(int index, E element)
     * Inserts the specified element at the specified position in this list.
     */
    @Test
    void addToIndex() {

        this.myLinkedList.add(1);
        this.myLinkedList.add(2);
        this.myLinkedList.add(4);
        this.myLinkedList.add(5);

        assertAll(() -> assertThrows(IllegalArgumentException.class, () -> myLinkedList.add(-5, 3)),
                () -> assertThrows(IllegalArgumentException.class, () -> myLinkedList.add(30,3))
        );

        this.myLinkedList.add(2, 3);

        assertEquals(5, this.myLinkedList.size());

        assertAll(() -> assertEquals(1, myLinkedList.get(0)),
                () -> assertEquals(2, myLinkedList.get(1)),
                () -> assertEquals(3, myLinkedList.get(2)),
                () -> assertEquals(4, myLinkedList.get(3))
                //() -> assertEquals(5, myLinkedList.get(4))
        );
    }

    /**
     * boolean	addAll(Collection<? extends E> c)
     * Appends all of the elements in the specified collection to the end of this list,
     * in the order that they are returned by the specified collection's iterator.
     */
    @Test
    void addAll() {
        fail();
    }

    /**
     * boolean	addAll(int index, Collection<? extends E> c)
     * Inserts all of the elements in the specified collection into this list,
     * starting at the specified position.
     */
    @Test
    void addAllToIndex() {
        fail();
    }

    /**
     * void	addFirst(E e)
     * Inserts the specified element at the beginning of this list.
     */
    @Test
    void addFirst() {
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(1);

        assertAll(() -> assertEquals(1, myLinkedList.getFirst()),
                () -> assertEquals(4, myLinkedList.getLast()),
                () -> assertEquals(4, myLinkedList.size()));
    }

    /**
     * void	addLast(E e)
     * Appends the specified element to the end of this list.
     */
    @Test
    void addLast() {
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
     * Returns a shallow copy of this LinkedList.
     */
    @Test
    void cloneList() {
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
     * Iterator<E>	descendingIterator()
     * Returns an iterator over the elements in this deque in reverse sequential order.
     */
    @Test
    void descendingIterator() {
        fail();
    }

    /**
     * E	element()
     * Retrieves, but does not remove, the head (first element) of this list.
     */
    @Test
    void element() {
        fail();
    }

    /**
     * E	get(int index)
     * Returns the element at the specified position in this list.
     */
    @Test
    void get() {
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);

        assertAll(() -> assertThrows(IllegalArgumentException.class, () -> myLinkedList.get(-5)),
                () -> assertThrows(IllegalArgumentException.class, () -> myLinkedList.get(30))
        );

        assertAll(() -> assertEquals(1, myLinkedList.get(0)),
                () -> assertEquals(2, myLinkedList.get(1)),
                () -> assertEquals(3, myLinkedList.get(2))
        );
    }

    /**
     * E	getFirst()
     * Returns the first element in this list.
     */
    @Test
    void getFirst() {
        fail();
    }

    /**
     * E	getLast()
     * Returns the last element in this list.
     */
    @Test
    void getLast() {
        fail();
    }

    /**
     * int	indexOf(Object o)
     * Returns the index of the first occurrence of the specified element in this list,
     * or -1 if this list does not contain the element.
     */
    @Test
    void indexOf() {
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
     * ListIterator<E>	listIterator(int index)
     * Returns a list-iterator of the elements in this list (in proper sequence),
     * starting at the specified position in the list.
     */
    @Test
    void listIterator() {
        fail();
    }

    /**
     * boolean	offer(E e)
     * Adds the specified element as the tail (last element) of this list.
     */
    @Test
    void offer() {
        fail();
    }

    /**
     * boolean	offerFirst(E e)
     * Inserts the specified element at the front of this list.
     */
    @Test
    void offerFirst() {
        fail();
    }

    /**
     * boolean	offerLast(E e)
     * Inserts the specified element at the end of this list.
     */
    @Test
    void offerLast() {
        fail();
    }

    /**
     * E	peek()
     * Retrieves, but does not remove, the head (first element) of this list.
     */
    @Test
    void peek() {
        fail();
    }

    /**
     * E	peekFirst()
     * Retrieves, but does not remove, the first element of this list,
     * or returns null if this list is empty.
     */
    @Test
    void peekFirst() {
        fail();
    }


    /**
     * E	peekLast()
     * Retrieves, but does not remove, the last element of this list,
     * or returns null if this list is empty.
     */
    @Test
    void peekLast() {
        fail();
    }

    /**
     * E	poll()
     * Retrieves and removes the head (first element) of this list.
     */
    @Test
    void poll() {
        fail();
    }

    /**
     * E	pollFirst()
     * Retrieves and removes the first element of this list,
     * or returns null if this list is empty.
     */
    @Test
    void pollFirst() {
        fail();
    }

    /**
     * E	pollLast()
     * Retrieves and removes the last element of this list,
     * or returns null if this list is empty.
     */
    @Test
    void pollLast() {
        fail();
    }

    /**
     * E	pop()
     * Pops an element from the stack represented by this list.
     */
    @Test
    void pop() {
        fail();
    }

    /**
     * void	push(E e)
     * Pushes an element onto the stack represented by this list.
     */
    @Test
    void push() {
        fail();
    }

    /**
     * E	remove()
     * Retrieves and removes the head (first element) of this list.
     */
    @Test
    void remove() {
        myLinkedList.add(1);
        myLinkedList.add(2);

        Integer removed = myLinkedList.remove();

        assertEquals(1, myLinkedList.size());
        assertEquals(1, removed);

        assertAll(() -> assertEquals(2, myLinkedList.getFirst()),
                () -> assertEquals(2, myLinkedList.getLast()));
    }

    /**
     * E	remove(int index)
     * Removes the element at the specified position in this list.
     */
    @Test
    void removeIndex() {
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);

        Integer removed = myLinkedList.remove(1);

        assertEquals(3, myLinkedList.size());
        assertEquals(2, removed);

        assertAll(() -> assertEquals(1, myLinkedList.getFirst()),
                () -> assertEquals(3, myLinkedList.get(1)),
                () -> assertEquals(4, myLinkedList.getLast()));
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
     * E	removeFirst()
     * Removes and returns the first element from this list.
     */
    @Test
    void removeFirst() {
        fail();
    }

    /**
     * boolean	removeFirstOccurrence(Object o)
     * Removes the first occurrence of the specified element in this list
     * (when traversing the list from head to tail).
     */
    @Test
    void removeFirstOccurrence() {
        fail();
    }

    /**
     * E	removeLast()
     * Removes and returns the last element from this list.
     */
    @Test
    void removeLast() {
        fail();
    }

    /**
     * boolean	removeLastOccurrence(Object o)
     * Removes the last occurrence of the specified element in this list
     * (when traversing the list from head to tail).
     */
    @Test
    void removeLastOccurrence() {
        fail();
    }

    /**
     * E	set(int index, E element)
     * Replaces the element at the specified position in this list with the specified element.
     */
    @Test
    void set() {
        fail();
    }

    /**
     * int	size()
     * Returns the number of elements in this list.
     */
    @Test
    void size() {
        fail();
    }

    /**
     * Object[]	toArray()
     * Returns an array containing all of the elements in this list in proper sequence
     * (from first to last element).
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
    void toArrayElement() {
        fail();
    }

    /**
     * Methods inherited from class java.util.AbstractList
     * equals
     */
    @Test
    void equals() {
        fail();
    }

    /**
     * Methods inherited from class java.util.AbstractList
     * hashCode
     */
    @Test
    void listHashCode() {
        fail();
    }

    /**
     * Methods inherited from class java.util.AbstractList
     * removeRange
     */
    @Test
    void removeRange() {
        fail();
    }

    /**
     * Methods inherited from class java.util.AbstractList
     * subList
     */
    @Test
    void subList() {
        fail();
    }

    /*
    //TODO
     * Methods inherited from class java.lang.Object
     * finalize, getClass, notify, notifyAll, wait, wait, wait
     */

    /**
     * Methods inherited from interface java.util.List
     * containsAll
     */
    @Test
    void containsAll() {
        fail();
    }

    /**
     * Methods inherited from interface java.util.List
     * isEmpty
     */
    @Test
    void isEmpty() {
        fail();
    }

    /**
     * Methods inherited from interface java.util.List
     * iterator
     */
    @Test
    void iterator() {
        fail();
    }

    /**
     * Methods inherited from interface java.util.List
     * removeAll
     */
    @Test
    void removeAll() {
        fail();
    }

    /**
     * Methods inherited from interface java.util.List
     * retainAll
     */
    @Test
    void retainAll() {
        fail();
    }


}
