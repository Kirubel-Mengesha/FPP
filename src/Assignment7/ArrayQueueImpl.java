package Assignment7;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public void enqueue(int obj) {
        if (size() == arr.length) {
            resize();
        }
        arr[rear++] = obj;
        if (front == -1) {
            front = 0;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Nothing to dequeue Queue is Empty");
            return -1;
        }
        int dequeuedItem = arr[front];
        arr[front++] = 0; // Reset the value to 0 (optional)
        if (front == rear) {
            front = -1;
            rear = 0;
        }
        return dequeuedItem;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return rear - front;
    }

    private void resize() {
        int newSize = arr.length * 2;
        int[] newArr = new int[newSize];
        System.arraycopy(arr, front, newArr, 0, size());
        arr = newArr;
        rear = size();
        front = 0;
    }

    public static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl();
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        System.out.println("Peek: " + queue.peek()); // print 5
        System.out.println("Dequeue: " + queue.dequeue()); // print 5
        System.out.println("Peek after dequeue: " + queue.peek()); // print 10
        System.out.println("Queue size: " + queue.size()); // print 2
        System.out.println("Dequeue: " + queue.dequeue()); //  print 10
        System.out.println("Peek after dequeue dequeue: " + queue.peek()); // print 15
        System.out.println("Dequeue: " + queue.dequeue()); // Should print 15
        System.out.println("Dequeue when empty: " + queue.dequeue()); // print -1 and "Nothing to dequeue Queue is Empty"
    }
}
