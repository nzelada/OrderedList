package NickZelada;

import java.util.*;

/**
 * This is the OrderedList class in which extends Comparable and ordlist.
 * It also has the inner class of Node
 * @author Nick Zelada
 * @version November 12, 2018
 */
public class OrderedList<ordlist extends Comparable<ordlist>> {
/**
 * This is the inner class of Node, that creates a Node.
 */
    class Node // inner class Node
    {

        ordlist data; // Object of ordlist named data
        Node next; // next pointer
/**
 * Node gets the value from data and points to the next Node.
 * @param value gets the value from the list
 * @param otherNext points to the other node
 */
        Node(ordlist value, Node otherNext) {
            data = value; // value of the data
            next = otherNext; // next pointer
        }

    }

    private Node head; // pointer for the first Node of the list
    private boolean ascOrder; // ascending order either true or false
/**
 * This is the constructor method for OrderedList, has the head that makes it
 * null. Then makes the boolean of ascOrder true.
 */
    public OrderedList() {
        head = null;
        ascOrder = true;

    }
/**
 * The toString method will print out the string to corresponding 
 * if statements.
 * @return the string provided
 */
    public String toString() {
        String out = " ";
        Node temp = head;
        if (isEmpty()) {
            return "empty, nothing in the list \n";
        } else {
            while (temp != null) {
                out += temp.data + " ";
                temp = temp.next;
            }
        }

        return out + "\n";
    }
/**
 * This method inserts the data, which is the digits in order of smallest to
 * largest. It would also organize them if based on their number value.
 * @param data the value from the list.
 */
    public void insert(ordlist data) {
        Node b = new Node(data, null);

        if (head == null) {
            head = b;
        } else {

            Node current = head;
            Node previous = null;

            while (current != null) {
                if (ascOrder && data.compareTo(current.data) < 0) {
                    break;
                } else if (!ascOrder && data.compareTo(current.data) > 0) {
                    break; // any number above zero would go in order
                }

                previous = current; 
                current = current.next;

            }

            b.next = current;

            if (current == head) {
                head = b;
            } else {
                previous.next = b;
            }

        }

    }
/**
 * This is the delete method in which it deletes the number asked to.
 * If the number isn't there, then it won't delete anything.
 * @param data the value from the list.
 * @return either true or false
 */
    public boolean delete(ordlist data) {
        Node current = head;
        Node previous = null;

        while (current != null) {
            if (current.data.equals(data)) {
                break;
            }
            previous = current;
            current = current.next;
        }
        if (current == null) {
            return false;
        }
        if (current == head) {
            head = head.next;
        } else {
            previous.next = current.next;
        }
        return true;
    }
/**
 * The isEmpty method checks to see if the list is empty.
 * @return the node head being null
 */
    public boolean isEmpty() {

        return head == null;
    }
/**
 * This method makes the list to be cleared up.
 */
    public void clear() {
        head = null;
    }
/**
 * This method would get the list and reverse the order of the numbers.
 */
    public void reverse() {
        if (head == null) {
            return;   // if empty list, we're done
        }

        Node prevHead = null; // previous head
        Node next = null; // next node

        while (head != null) {
            next = head.next;
            head.next = prevHead;
            prevHead = head;
            head = next;

        }

        head = prevHead;

    }
}
