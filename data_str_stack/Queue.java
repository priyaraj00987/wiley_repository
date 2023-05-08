package data_str_stack;

public class Queue {
    int arr[];
    int front, rear;
    int capacity;

    public Queue(int size) {
        arr = new int[size];
        front = -1;
        rear = -1;
        capacity = size;
    }

    public void enQueue(int n) {
        if (front == 0 && rear == capacity - 1) {
            System.out.println("The Queue is full");
        } else {
            front = 0;
            arr[++rear] = n;
            System.out.println("Added Element: " + n);
        }
    }

    public int deQueue() {
        if (front == -1) {
            System.out.println("Queue is empty");
        }
        int remove = arr[front];
        for (int i = front; i <= rear; i++) {
            arr[i] = arr[i + 1]; //shifting elements in queue after front is removed
        }
        front = 0;
        rear--;
        System.out.print("Removing element: ");
        return remove;
    }

    public void printQueue() {
        System.out.println("Elements of queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);
        System.out.println(queue.deQueue());
        queue.printQueue();
        queue.enQueue(7);
        System.out.println();
        queue.printQueue();
        System.out.println(queue.deQueue());
        queue.printQueue();

    }
}