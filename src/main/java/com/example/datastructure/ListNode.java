package com.example.datastructure;

// Singly-linked lists are already defined with this interface:
class ListNode<T> {
    ListNode(T x) {
        value = x;
    }

    T value;
    ListNode<T> next;
}

