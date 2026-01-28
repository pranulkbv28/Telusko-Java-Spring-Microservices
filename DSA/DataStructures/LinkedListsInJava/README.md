# $Linked$ $Lists$ $in$ $Java$

## $What$ $is$ $a$ $Linked$ $List$?

- A **Linked List** is a linear data structure where each element (called a node) contains a data part and a reference (or link) to the next node in the sequence.
- Unlike **arrays**, linked lists do not store elements in contiguous memory locations, **allowing for dynamic memory allocation** and efficient insertions and deletions.
- Linked lists can be singly linked (each node points to the next node) or doubly linked (each node points to both the next and previous nodes).

## $How$ $to$ $Implement$ $a$ $Linked$ $List$ $in$ $Java$?

- To implement a linked list in Java, you typically define a `Node` class to represent each element and a `LinkedList` class to manage the nodes.
- Usually we have the `Head` node which points to the first node in the list. And all the subsequent nodes are linked via their `next` references.
- Rather than having the values in an array, we create nodes that contain the values and references **(their addresses)** to the next node.
- This is an example of an existing `Linked List` ![Example](../../../assets/Linked%20List%20Example.png)
- This is an example of an `existing Linked List` which has had new nodes added to the **front**, **back** and somewhere **in the middle** ![Example](../../../assets/Linked%20List%20Example%202.png)

## $Implementation$

- [See here](./IntroToLinkedList.java) for a basic creation and implementation of a `Singly Linked List` in Java with methods to add, remove, and display nodes.
