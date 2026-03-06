import java.util.EmptyStackException;

public class ListStack {
    class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data, ListNode n) {
            this.data = data;
            this.next = n;  // Fixed: using parameter 'n'
        }
    }

    private ListNode topNode;

    public ListStack() {
        topNode = null;
    }

    public int top() {
        if (topNode == null)  // Check empty FIRST
            throw new EmptyStackException();
        return topNode.data;   // Then return data
    }

    public void pop() {
        if (topNode == null)
            throw new EmptyStackException();
        topNode = topNode.next;  // Move top to next node
    }

    public void push(int data) {
        // Creates new node pointing to current top, then makes it new top
        topNode = new ListNode(data, topNode);
    }
    
    // Optional: helper method to check if empty
    public boolean isEmpty() {
        return topNode == null;
    }
}