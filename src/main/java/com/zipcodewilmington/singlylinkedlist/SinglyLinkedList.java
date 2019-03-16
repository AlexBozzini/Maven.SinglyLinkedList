package com.zipcodewilmington.singlylinkedlist;

import com.sun.jmx.snmp.SnmpInt;

import javax.xml.bind.Element;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList implements Cloneable{
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

    public int size(SinglyLinkedList list){
        int count = 0;
        Node currNode = list.head;
        while (currNode != null){
            count++;
            currNode = currNode.next;
        }
        return count;
    }

    public int get(SinglyLinkedList list, int index){
        Node currNode = list.head;
        int count = 0;
        while (currNode != null){
            if (count == index){
                return currNode.data;
            } else {
                currNode = currNode.next;
                count++;
            }
        }
        return -1;
    }

    public SinglyLinkedList copy(SinglyLinkedList list) {
        try
        {
            SinglyLinkedList list2 = (SinglyLinkedList) list.clone();
            return list2;
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }

    public void sort(SinglyLinkedList list){
        Node currNode = list.head;
        int counter = 0;
        while (currNode != null && currNode.next != null){
            if (currNode.data > (currNode.next).data){
                int temp1 = currNode.data;
                int temp2 = currNode.next.data;

                list.set(list, counter, temp2);
                list.set(list, counter + 1, temp1);
            }
            currNode = currNode.next;
            counter++;
        }
    }

    public void set(SinglyLinkedList list, int index, int data){
        int count = 0;
        Node currNode = list.head;
        while (count < index){
            currNode = currNode.next;
            count++;
        }
        currNode.data = data;
    }
}
