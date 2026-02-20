public class Node {
    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    static Node insertAtfront(Node head, int x){
        Node newnode = new Node(x);
        newnode.next = head;
        return newnode;
    }

    static Node insertAtlast(Node head, int x){
        Node newNode = new Node(x);
        if (head == null) {
            return newNode;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    static Node insertAtSpecificPosition(Node head, int x, int position){
        if (position == 1){
            Node newnode = new Node(x);
            newnode.next = head;
            return newnode;
        }
        
        Node temp = head;
        for (int i = 1; i < position - 1; i++){
            if (temp == null) {
                System.out.println("Position out of range");
                return head;
            }
            temp = temp.next;
        }
        
        if (temp == null) {
            System.out.println("Position out of range");
            return head;
        }
        
        Node newnode = new Node(x);
        newnode.next = temp.next;
        temp.next = newnode;
        return head;
    }

    static Node deleteNode(Node head){
        if (head == null){
            return null;
        }
        return head.next;
    }

    static Node deletedtail(Node head){
        if (head == null || head.next == null){
            return null;
        }

        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}

class Main {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Display the linked list
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}