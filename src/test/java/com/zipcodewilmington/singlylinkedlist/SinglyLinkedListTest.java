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

    @Test
    public void sizeTest(){
        // given
        SinglyLinkedList list = new SinglyLinkedList();
        // when
        list.add(list, 1309);
        list.add(list, 1381);
        list.add(list, -31);
        // then
        Assert.assertEquals(3, list.size(list));
    }

    @Test
    public void sizeTest2(){
        // given
        SinglyLinkedList list = new SinglyLinkedList();
        // when
        list.add(list, 1309);
        list.add(list, 1381);
        list.add(list, -31);
        list.add(list, -2343);
        // then
        Assert.assertEquals(4, list.size(list));
    }

    @Test
    public void getTest(){
        // given
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(list, 235);
        list.add(list, 13523);
        list.add(list, 134);
        list.add(list, 1385235);
        // when
        // then
        Assert.assertEquals(134, list.get(list, 2));
    }

    @Test
    public void getTest2(){
        // given
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(list, 235);
        list.add(list, 13523);
        list.add(list, 134);
        list.add(list, 1385235);
        // when
        // then
        Assert.assertEquals(235, list.get(list, 0));
    }

    @Test
    public void copyTest() {
        // given
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(list, 4);
        list.add(list, -8);
        list.add(list, 16);
        // when
        SinglyLinkedList list2 = list.copy(list);
        // then
        Assert.assertTrue(list2.contains(list, 4));
        Assert.assertTrue(list2.contains(list, -8));
        Assert.assertTrue(list2.contains(list, 16));
    }

    @Test
    public void sortTest(){
        // given
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(list, 8);
        list.add(list, 5);
        list.add(list, 7);
        // when
        list.sort(list);
        // then
        Assert.assertEquals(5, list.get(list, 0));
    }


    @Test
    public void setTest(){
        // given
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(list, 1);
        list.add(list, 2);
        list.add(list, 3);
        list.add(list, 4);
        // when
        list.set(list, 2, 9);
        // then
        Assert.assertEquals(9, list.get(list, 2));
    }
}
