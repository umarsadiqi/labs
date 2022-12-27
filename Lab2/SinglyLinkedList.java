package com.company;
/**
 * @author Rahul Kanwal 3144895
 */
public class SinglyLinkedList <E>{
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }

    }
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0 ;

    public SinglyLinkedList() {}

    public int size() {return size;}
    public boolean isEmpty() {return size==0;}
    public E first(){
        if(isEmpty()) return null;
        return head.getElement();
    }
    public E getlast(){
        if(isEmpty()) return null;
        return tail.getElement();
    }
    public void addFirst(E e){
        head = new Node<>(e,head);
        if(size==0)
            tail=head;
        size++;
    }
    public void addLast(E e) {
        Node <E> newest = new Node<>(e,null);
        if(isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }
    public E removeFirst() {
        if(isEmpty()) return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if(size==0)
            tail=null;
        return answer;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        Node <E> testNode = head;
        text.append("[");
        int i = 0 ;
        while (i < (this.size-1)) {  //till size -1 so that we can omit last element to match formatting
            text.append(testNode.getElement() + "\n");
            testNode = testNode.getNext();
            i++;    //iterating to the next element
        }
        text.append(this.getlast()+"]");//adding last element and matching formatting as given in the question.
        return text.toString();
    }
}
