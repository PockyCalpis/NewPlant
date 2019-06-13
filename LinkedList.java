package newPlant;

/**
 * LinkedList
 * Generic LinkedList class which can contain some data.
 * Will be used to store plants and zombies
 * @version 1.6
 * @author Samyar Vahid
 */

class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    //Getters/Setters

    /**
     * gets head node
     * @return returns head node
     */

    public Node<T> getHead() {
        return head;
    }

    /**
     * sets head node
     * @param t t of type T, generic item to be set as head
     */

    public void setHead(T t){
        Node<T> current = new Node<T>(null, t);
        current.setNext(head);
        head = current;
    }

    /**
     * gets tail node
     * @return returns tail node
     */

    public Node<T> getTail() {
        return tail;
    }

    /**
     * sets tail node
     * @param t t of type T, generic item to be set as tail
     */

    public void setTail(T t){
        Node<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new Node<T>(current, t));
    }

    //Main Functions

    /**
     * adds item t to list
     * @param t generic replacement for any type object
     */

    public void add(T t){
        Node<T> current = head;

        if (head == null) {
            head = new Node<T>(null, t);
        } else {
            while (current.hasNext()) {
                current = current.getNext();
            }
            current.setNext(new Node<T>(current, t));
        }
    }

    /**
     * removes item t from list, iterates through list to find correct item
     * @param t item to be removed, generic
     */

    public void remove(T t) {
        Node<T> current = head;

        if (head.getItem() == t) {
            head = head.getNext();
        } else {
            while (current.getItem() != t ) {
                current = current.getNext();
            }
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());
        }
    }

    /**
     * inserts item t at index index
     * @param t     generic T item to be inserted
     * @param index int showing where item is to be inserted
     */

    public void insert(T t, int index) {
        Node<T> current = head;
        Node<T> newNode = null;

        if (index == 0) {
            newNode = new Node<T>(null, t);
            newNode.setNext(current);
            head = newNode;
            return;
        }
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        newNode = new Node<T>(current, t);
        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    /**
     * checks whether list contains item t
     * @param  t generic T item to be checked
     * @return   returns boolean true/false depending on result of check
     */

    public boolean contains(T t) {
        boolean contains = false;
        Node<T> current = head;

        if (current == null) {
            return contains;
        } else {
            while (current.getNext() != null) {
                if (current.getItem() == t) {
                    contains = true;
                }
                current = current.getNext();
            }
        }

        return contains;
    }

    /**
     * gets size of whole LinkedList
     * @return returns int of list length
     */

    public int getSize() {
        int counter = 0;
        Node<T> current = head;

        while (current != null){
            counter++;
            current = current.getNext();
        }
        return counter;
    }

    /**
     * gets item at index
     * @param  index int at which to get item
     * @return       generic T item
     */

    public T get(int index) {
        int counter = 0;
        Node<T> current = head;

        while (counter < index) {
            counter++;
            current = current.getNext();
        }
        return current.getItem();
    }

    /**
     * iterates through list to find same object
     * @param  t T object to be found
     * @return   returns T object corresponding to search
     */

    public T get(T t) {
        Node<T>  current = head;

        if (current == t) {
            return current.getItem();
        } else {
            while (current.getNext() != t) {
                current = current.getNext();
            }
        }
        return t;
    }
}