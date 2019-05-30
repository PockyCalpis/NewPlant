package plant;

/**
 * Node
 * @version 1.0
 * @author Samyar Vahid
 * @date May 8
 * Node to be used within LinkedList
 */

class Node<T> {

    Node<T> next;
    Node<T> prev; 
    T item;

    Node(Node<T> prev, T item) {
        this.prev = prev;
        this.next= null;
        this.item = item;
    }

    //Getters/Setters
    public Node<T> getNext(){
        return next;
    }
    public void setNext(Node<T> node){
        this.next = node;
    }

    public Node<T> getPrev(){
        return prev;
    }
    public void setPrev(Node<T> node){
    this.prev = node;
    }

    public T getItem() {
        return item;
    }

    public boolean hasNext() {
        if (next == null) {
            return false;
        } else {
            return true;
        }
    }
}