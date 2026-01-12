package DSA.DataStructures.LinkedListsInJava;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

class LinkedList<T> {
    Node<T> head;

    public void insert(T data) {
        Node<T> node = new Node<>(data);
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node<T> n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(T data) {
        Node<T> node = new Node<>(data);
        node.next = null;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, T data) {
        Node<T> node = new Node<>(data);
        node.next = null;

        if (index == 0) {
            insertAtStart(data);
        } else {
            Node<T> n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node<T> n = head;
            Node<T> n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
    }

    public void show() {
        Node<T> node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}

public class IntroToLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(18);
        list.insert(45);
        list.insert(12);

        list.insertAtStart(25);

        list.insertAt(0, 55);

        list.deleteAt(2);

        list.show();
    }
}
