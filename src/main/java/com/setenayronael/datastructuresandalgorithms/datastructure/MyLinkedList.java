package com.setenayronael.datastructuresandalgorithms.datastructure;


//TODO add interfaces and abstract classes
public class MyLinkedList<E> {

    private int size;
    private MyNode<E> first;
    private MyNode<E> last;


    public MyLinkedList(){
        //all fields starts null
    }

    private class MyNode<I>{
        I item;
        MyNode<I> next;

        public MyNode(I item){
            this.item = item;
        }
    }

    public int size() {
        return size;
    }

    public E getFirst() {
        return first != null ? first.item : null;
    }

    public E getLast() {
        return last != null ? last.item : null;
    }

    public boolean add(E e) {
        MyNode<E> newNode = new MyNode<>(e);
        if(!constructNodesIfEmpty(newNode)) {
            this.last.next = newNode;
            this.last = this.last.next;
        }
        size++;
        return true;
    }

    /**
     * Inserts the specified element at the beginning of this list.
     */
    public void addFirst(E e){
        MyNode<E> newNode = new MyNode<>(e);
        if(!constructNodesIfEmpty(newNode)){
            newNode.next = first;
            first = newNode;
        }
        size++;
    }
    /**
     * Inserts the specified element at the specified position in this list.
     */
    public void add(int index, E element) {
        if(index < 0 || index > size) throw new IllegalArgumentException();
        if(index == 0)  addFirst(element);
        if(index == size) add(element);
        else {
            MyNode<E> newNode = new MyNode<>(element);
            MyNode<E> lead = this.getNode(index-1);
            newNode.next = lead.next;
            lead.next =  newNode;
            size++;
        }
    }

    private boolean constructNodesIfEmpty(MyNode<E> newNode){
        if(this.first == null) {
            first = last = newNode;
            return true;
        }
        return false;
    }

    private MyNode<E> getNode(int index){
        if(index < 0 || index >= size) throw new IllegalArgumentException();
        if(index == 0) return this.first;
        if(index == size-1) return this.last;

        MyNode<E> currentNode = this.first;
        for(int i=0; i<index; i++)
            currentNode = currentNode.next;

        return currentNode;
    }

    /**
     * Returns the element at the specified position in this list.
     */
    public E get(int index) {
        return getNode(index).item;
    }

    /**
     * Retrieves and removes the head (first element) of this list.
     */
    public E remove(){
        MyNode<E> removed = this.first;
        this.first = this.first.next;
        size--;
        return removed.item;
    }

    /**
     * Removes the element at the specified position in this list.
     */
    public E remove(int index) {
        if(index < 0 || index >= size) throw new IllegalArgumentException();
        if(index == 0) remove();
        MyNode<E> lead = this.getNode(index-1);
        MyNode<E> removed = lead.next;
        lead.next = removed.next;
        size--;
        return removed.item;
    }



}
