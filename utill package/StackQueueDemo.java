/* 
Stack and Queue are part of the Java Collections Framework.
Stack → LIFO (Last In First Out)
Queue → FIFO (First In First Out)

Stack
LIFO
push(), pop(), peek()
Extends Vector

Queue
FIFO
add(), remove(), peek()
Implemented using LinkedList
 */

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class StackQueueDemo {

    public static void main(String[] args) {

        // ========================
        // STACK Example
        // ========================

        System.out.println("----- STACK -----");

        Stack<String> stack = new Stack<>();

        // push()
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println("Stack: " + stack);

        // peek()
        System.out.println("Top Element: " + stack.peek());

        // pop()
        System.out.println("Removed: " + stack.pop());

        System.out.println("After Pop: " + stack);

        // search()
        System.out.println("Position of Java: " + stack.search("Java"));

        // isEmpty()
        System.out.println("Is Empty? " + stack.isEmpty());


        // ========================
        // QUEUE Example
        // ========================

        System.out.println("\n----- QUEUE -----");

        Queue<String> queue = new LinkedList<>();

        // add()
        queue.add("Java");
        queue.add("Python");
        queue.add("C++");

        System.out.println("Queue: " + queue);

        // peek()
        System.out.println("Front Element: " + queue.peek());

        // remove()
        System.out.println("Removed: " + queue.remove());

        System.out.println("After Remove: " + queue);

        // offer()
        queue.offer("JavaScript");
        System.out.println("After Offer: " + queue);

        // poll()
        System.out.println("Poll: " + queue.poll());

        System.out.println("Final Queue: " + queue);

        // size()
        System.out.println("Queue Size: " + queue.size());

        // isEmpty()
        System.out.println("Is Queue Empty? " + queue.isEmpty());
    }
}
