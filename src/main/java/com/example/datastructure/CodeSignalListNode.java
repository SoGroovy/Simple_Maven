package com.example.datastructure;

import java.util.ArrayList;
import java.util.List;

public class CodeSignalListNode {
    public <T> void print(ListNode<T> list) {
        while (list != null) {
            System.out.println(list.value);
            list = list.next;
        }
    }

    public <T> void reversePrint(ListNode<T> list) {
        List<T> l1 = new ArrayList<T>();
        while (list != null) {
            l1.set(0, list.value);
        }
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
    }

    public <T> ListNode<T> reverse(ListNode<T> list) {
        ListNode<T> head = null;
        ListNode<T> p = list;
        while (list != null) {
            list = list.next;
            p.next = head;
            head = p;
            p = list;
        }
        return head;
    }

    public ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
        ListNode<Integer> head = new ListNode<Integer>(0);
        ListNode<Integer> current = head;
        while (l != null) {
            if (l.value != k) {
                current.next = l;
                current = current.next;
            } else if (l.value == k && l.next == null) {
                current.next = l.next;
            }
            l = l.next;
        }

        return head.next;
    }


}
