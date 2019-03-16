package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    Node head;

    static class Node<T>{
        T data;
        Node next;
        Node(T d){
            data = d;
            next = null;
        }
    }

    public static SinglyLinkedList add(SinglyLinkedList list, T data){
        Node new_node = new Node(data);
        new_node.next = null;

        if (list.head == null){
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
}
