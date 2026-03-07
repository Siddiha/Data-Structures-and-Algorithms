public class Queue2 {
    public static final int CAPACITY = 10;
    private int[] entries;
    int front = 0, back = 0;

    public Queue2() {
        entries = new int[CAPACITY];
    }

    public void queue(int n) {
        if ((back + 1) % CAPACITY == front) {
            System.out.println("Queue is full! Cannot add " + n);
            return;
        }
        entries[back] = n;
        back = (back + 1) % CAPACITY;
        System.out.println("Added: " + n);
    }

    public int dequeue() {
        if (front == back) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int value = entries[front];
        front = (front + 1) % CAPACITY;
        return value;
    }

    public static void main(String[] args) {
        Queue2 q = new Queue2();
        
        // Add some numbers
        q.queue(10);
        q.queue(20);
        q.queue(30);
        
        // Remove and print
        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());
        
        // Add more
        q.queue(40);
        q.queue(50);
        
        // Remove until empty
        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue()); // This will show empty message
    }
}