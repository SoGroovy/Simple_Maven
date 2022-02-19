package com.example.datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class CodeSignalListNodeTest {
    public class Liquid {
        String liquidType;

        public Liquid(String x) {
            liquidType = x;
        }
    }

    public class Beer extends Liquid {
        public Beer() {
            super("beer");
        }
    }

    @Test
    void reverse() {
        final ListNode<Integer> l1 = new ListNode<Integer>(0);
        ListNode<Integer> current = l1;
        CodeSignalListNode cln1 = new CodeSignalListNode();
//        ListNode<String> l2 = new ListNode<String>("Hello");
//        ListNode<Liquid> l3 = new ListNode<Liquid>(new Liquid("water"));
//        l3.next = new ListNode<>(new Beer());
        int count = 1;
        while (count < 10) {
            current.next = new ListNode<Integer>(count);
            count++;
            current = current.next;
        }
        current = l1;
        StringBuilder l1word = new StringBuilder();
        while (current != null) {
            l1word.append(current.value);
            current = current.next;
        }
        final ListNode<Integer> reverseList = cln1.reverse(l1);

        StringBuilder l2word = new StringBuilder();
        current = reverseList;
        while (current != null) {
            l2word.append(current.value);
            current = current.next;
        }
        var l3word = l2word.reverse();
        //uncomment to see what each ListNode prints out
//        System.out.println(l1word);
//        System.out.println(l3word);

        assertEquals(l1word.toString(), l3word.toString());
    }

    @Test
    void testRemoveKFromList() {
        ListNode<Integer> l1 = new ListNode<Integer>(123);
        ListNode<Integer> current = l1;
        CodeSignalListNode cln1 = new CodeSignalListNode();

        current.next = new ListNode<Integer>(456);
        current = current.next;
        current.next  = new ListNode<Integer>(789);
        current = current.next;
        current.next = new ListNode<Integer>(0);

        l1 = cln1.removeKFromList(l1, 0);
        StringBuilder s1 = new StringBuilder();
        current = l1;
        while (current != null) {
            s1.append(current.value);
            current = current.next;
        }

        StringBuilder s2 = new StringBuilder("123456789");

        assertEquals(s2.toString(), s1.toString());
    }
}