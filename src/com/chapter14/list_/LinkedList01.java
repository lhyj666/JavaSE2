package com.chapter14.list_;

public class LinkedList01 {
    public static void main(String[] args) {

        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node hsp = new Node("hsp");

        jack.next = tom;
        tom.next = hsp;

        hsp.pre = tom;
        tom.pre = jack;

        Node first = jack;
        Node last = hsp;

        System.out.println("=从头到尾");
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;

        }

        System.out.println("=从尾到头");
        while (true) {
            if (last == null) {
                break;
            }
            System.out.println(last);
            last = last.pre;

        }


        Node smit = new Node("smit");
        smit.next = hsp;
        smit.pre = tom;
        hsp.pre = smit;
        tom.next = smit;

        first = jack;
        System.out.println("=从头到尾");
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;

        }


    }
}

class Node {
    public Object item;
    public Node next;
    public Node pre;

    public Node(Object name) {
        this.item = name;

    }

    public String toString() {
        return "Node name=" + item;
    }
}