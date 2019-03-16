package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void addTest(){
        // given
        SinglyLinkedList list = new SinglyLinkedList();
        int data = 5;
        // when
        list.add(list, data);
        // then
        Assert.assertTrue(list.contains(list, data));
    }

    @Test
    public void removeTest(){
        // given
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(list, 39);
        list.add(list, 5);
        list.add(list, -8);
        // when
        list.remove(list, 0);
        // then
        Assert.assertFalse(list.contains(list, 39));
    }

    @Test
    public void removeTest2(){
        // given
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(list, 39);
        list.add(list, 5);
        list.add(list, -8);
        // when
        list.remove(list, 2);
        // then
        Assert.assertFalse(list.contains(list, -8));
    }

    @Test
    public void containsTest(){
        // given
        SinglyLinkedList list = new SinglyLinkedList();
        // when
        list.add(list, -23);
        list.add(list, 82);
        list.add(list, 235);
        // then
        Assert.assertTrue(list.contains(list, 82));
    }
}
