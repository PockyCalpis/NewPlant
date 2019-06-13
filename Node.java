package newPlant;

/**
 * Node
 * Node to be used within LinkedList
 * @version 1.1
 * @author Samyar Vahid
 */

class Node<T> {

    private Node<T> next;
    private Node<T> prev;
    private T item;

    Node(Node<T> prev, T item) {
        this.prev = prev;
        this.next= null;
        this.item = item;
    }

    //Getters/Setters

    /**
     * gets next node
     * @return returns next node
     */

    Node<T> getNext(){
        return next;
    }

    /**
     * sets next node
     * @param node node that will be set
     */

    void setNext(Node<T> node){
        this.next = node;
    }

    /**
     * gets previous node
     * @return returns previous node
     */

    Node<T> getPrev(){
        return prev;
    }

    /**
     * sets previous node
     * @param node node that will be set
     */

    void setPrev(Node<T> node){
        this.prev = node;
    }

    /**
     * gets item, generic
     * @return returns item T
     */

    T getItem() {
        return item;
    }

    /**
     * checks whether current node has a node after it
     * @return returns boolean true or false
     */

    boolean hasNext() {
        if (next == null) {
            return false;
        } else {
            return true;
        }
    }
}