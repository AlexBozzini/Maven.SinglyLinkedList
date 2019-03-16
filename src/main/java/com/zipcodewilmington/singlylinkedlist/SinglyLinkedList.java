package com.zipcodewilmington.singlylinkedlist;

import javax.xml.bind.Element;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    Node head;

    public static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public SinglyLinkedList add(SinglyLinkedList list, int data){
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

    public SinglyLinkedList remove(SinglyLinkedList list, int index){
        Node currNode = list.head, prev = null;
        if (index == 0 && currNode != null){
            list.head = currNode.next;
            System.out.println(index + " position element deleted");
            return list;
        }
        int counter = 0;
        while (currNode != null){
            if (counter == index){
                prev.next = currNode.next;
                System.out.println(index + " position element deleted");
                break;
            } else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
        if (currNode == null){
            System.out.println(index + " position element not found");
        }
        return list;
    }

    public boolean contains(SinglyLinkedList list, int data){
        Node currNode = list.head;
        while (currNode != null){
            if (currNode.data == data){
                return true;
            } else {
                currNode = currNode.next;
            }
        }
        return false;
    }

    public static void printList(SinglyLinkedList list){
        Node currNode = list.head;

        System.out.println("\nLinkedList: ");

        while (currNode != null){
            System.out.println(currNode.data + " ");

            currNode = currNode.next;
        }
    }
}
