import java.util.Stack;
import java.util.TreeSet;

public class TreeSetAndStackDemo {
    public static void main(String[] args) {
        // Create a TreeSet object
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Mango");

        // Display the TreeSet
        System.out.println("TreeSet elements: " + treeSet);

        // Create a Stack object
        Stack<Integer> stack = new Stack<>();

        // Push elements to the Stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Display the Stack
        System.out.println("Stack elements: " + stack);

        // Perform operations on the Stack
        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element of the Stack: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Updated Stack: " + stack);
        System.out.println("Is the Stack empty? " + stack.isEmpty());
    }
}
