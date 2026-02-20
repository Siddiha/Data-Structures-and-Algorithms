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
        Node temp = head;

        while (temp.next != null){
            temp =temp.next;
        }
        temp.next = new Node(x);
        return head;

    }

    static Node deleteNode(Node head){
        if (head == null){
            return null;
        }

        Node temp = head;
        head = head.next;
        return head;
    }

    static Node deletedtail(Node head){
        if (head == null){
            return null;
        }
        if (head.next == null){
            return null;
        }

        Node temp = head;
        while (temp.next.next == null){
            temp = temp.next;
        }

        temp.next = null;
        return head;

    }
    class Main{
        public static void main(String[] args) {
            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);
            head.next.next.next = new Node(40);

            // Dispaly the linked list
            Node temp = head;
            while (temp != null){
                System.out.println(temp.data + " ");
                temp = temp.next;

            }
        }
    }
    
    
}
