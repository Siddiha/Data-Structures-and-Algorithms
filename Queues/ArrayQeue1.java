public class ArrayQeue1 {
    public static void main(String[] args) {
        // Test the queue
        ArraqQueue queue = new ArraqQueue();
        
        // Test enqueue
        queue.queue(10);
        queue.queue(20);
        queue.queue(30);
        
        // Test dequeue
        System.out.println(queue.dequeue()); // Should print 10
        System.out.println(queue.dequeue()); // Should print 20
        
        // Add more
        queue.queue(40);
        System.out.println(queue.dequeue()); // Should print 30
        System.out.println(queue.dequeue()); // Should print 40
    }
}

class ArraqQueue {  // Fixed class name
    public static final int capacity = 10;  // Fixed: removed 'void', added final
    private int[] entries;  // Fixed array declaration
    int front = 0, back = 0;
    
    // Constructor - now inside the class
    public ArraqQueue() {
        entries = new int[capacity];  // Fixed: now using correct variable name
    }
    
    public void queue(int n) {
        if (back == capacity)
            throw new RuntimeException("Queue is full");
        entries[back++] = n;
    }
    
    public int dequeue() {
        if (front == back)
            throw new RuntimeException("Queue is empty");
        return entries[front++];  // Fixed: 'entries' not 'entris'
    }
}