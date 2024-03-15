package Assignment7;

class Node {
    Object data;
    Node next;

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListStack {
    private Node top;

    public LinkedListStack() {
        this.top = null;
    }

    public void push(Object item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        Object item = top.data;
        top = top.next;
        return item;
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("Peek: " + stack.peek()); // Should print 15
        System.out.println("Pop: " + stack.pop()); // Should print 15
        System.out.println("Peek after pop: " + stack.peek()); // Should print 10
        System.out.println("Is stack empty? " + stack.isEmpty()); // Should print false
        System.out.println("Pop: " + stack.pop()); // Should print 10
        System.out.println("Pop: " + stack.pop()); // Should print 5
        System.out.println("Pop when empty: " + stack.pop()); // Should print null and "Stack is Empty"
    }
}

