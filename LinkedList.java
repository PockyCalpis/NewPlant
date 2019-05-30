package plant;

/**
 * LinkedList
 * @version 1.5
 * @author Samyar Vahid
 * @date May 9
 * Generic LinkedList class which can contain some data.
 * Will be used to store riders in a carpooling software
 */

class LinkedList<T> {
    public Node<T> head;
    public Node<T> tail;

    //Getters/Setters
    public Node<T> getHead() {
        return head;
    }
    public void setHead(T t){
        Node<T> current = new Node<T>(null, t);
        current.setNext(head);
        head = current;
    }

    public Node<T> getTail() {
        return tail;
    }
    public void setTail(T t){
        Node<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new Node<T>(current, t));
    }

    //Main Functions
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

    public void remove(T t) {
        Node<T> current = head;

        if (head.getItem() == t) {
            head = head.getNext();
            return;
        } else {
            while (current.getItem() != t ) {
                current = current.getNext();
            }
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());
        }
    }

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

    public int getSize() {
        int counter = 0;
        Node<T> current = head;

        while (current != null){
            counter++;
            current = current.getNext();
        }
    return counter;
    }

    public T get(int index) {
        int counter = 0;
        Node<T> current = head;

        while (counter < index) {
            counter++;
            current = current.getNext();
        }
        return current.getItem();
    }

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