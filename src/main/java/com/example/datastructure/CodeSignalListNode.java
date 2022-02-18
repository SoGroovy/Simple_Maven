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
        List<T> l1 = new ArrayList<T>();
        ListNode<T> reverseNode = new ListNode<T>(list.value);
        while (list != null) {
            l1.set(0, list.value);
        }
        for (int i = 0; i < l1.size(); i++) {
            reverseNode.next = (ListNode<T>) l1.get(i);
        }
        return reverseNode.next;
    }
}
