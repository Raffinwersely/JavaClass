//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.LinkedList;
import java.util.Queue;

public class queue1 {
    public queue1() {
    }

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList();
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");
        System.out.println("Queue: " + String.valueOf(queue));
        String front = (String)queue.remove();
        System.out.println("Removed element: " + front);
        System.out.println("Queue after removal: " + String.valueOf(queue));
        queue.add("date");
        String peeked = (String)queue.peek();
        System.out.println("Peeked element: " + peeked);
        System.out.println("Queue after peek: " + String.valueOf(queue));
    }
}
