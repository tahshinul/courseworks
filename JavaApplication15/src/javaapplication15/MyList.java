/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author tahshin
 */
public class MyList {

    Node head = null;
    Node tail = null;
    Node Chead = null;
    Node Ctail = null;

    public MyList() {
        head = null;
    }

    public MyList(int[] a) {
        for (int i = 0; i < a.length; i++) {
            Node x = new Node(a[i], null);
            if (head == null) {
                this.head = x;
                this.tail = x;
            } else {
                this.tail.next = x;
                this.tail = x;
            }
        }
    }

    public MyList(Node head) {
        Chead = null;
        Ctail = null;
        for (Node n = head; n != null; n = n.next) {
            Node x = new Node(n.element, null);
            if (Chead == null) {
                this.Chead = x;
                this.Ctail = x;
            } else {
                this.Ctail.next = x;
                this.Ctail = x;
            }
        }
    }

    public void showList() {
        if (head != null) {
            for (Node n = head; n != null; n = n.next) {
                System.out.print(n.element + " ");
            }
        } else {
            System.err.println("EMPTY LIST");
        }
    }

    public boolean isEmpty() {
        boolean x = false;
        for (Node n = head; n != null; n = n.next) {
            if (head == null) {
                x = true;
            }
        }
        return x;
    }

    public void clear() {
        for (Node n = head; n != null; n = n.next) {
            head = null;
        }
    }

    public Node nodeAt(int x) {
        Node n = head;
        Node k = null;
        if (x < 0) {
            System.out.println("Invalid index");
        }
        for (int i = 0; n != null; n = n.next) {
            if (i == x) {
                k = n;
            } else {
                i++;
            }
        }
        return k;
    }

    public void insert(Node head, int size, int elem, int index) {
        boolean k = false;
        for (Node n = head; n != null; n = n.next) {
            if (n.element == elem) {
                k = true;
            }
        }
        if (k == true) {
            System.out.println("Value already exists");
        } else {
            if (index < 0 || index > size) {
                System.err.println("Wrong index");
            } else {
                Node x = new Node(elem, null);
                if (index == 0) {
                    x.next = head;
                    head = x;
                } else {
                    Node pred = nodeAt(index - 1);
                    x.next = pred.next;
                    pred.next = x;
                }
            }
        }
    }

    public void evenfinder() {
        for (Node n = head; n != null; n = n.next) {
            if (n.element % 2 == 0) {
                System.out.print(n.element + " ");
            }
        }
    }

    public void search(int x) {
        boolean k = false;
        for (Node n = head; n != null; n = n.next) {
            if (n.element == x) {
                k = true;
            }
        }
        System.out.println(k);
    }

    public void sum() {
        int sum = 0;
        for (Node n = head; n != null; n = n.next) {
            sum = sum + n.element;
        }
        System.out.println(sum);
    }

    public void reverse() {
        Node n = head;
        while (n != null) {
            Node next = n.next;
            n.next = head;
            head = n;
            n = next;
        }
    }
}
