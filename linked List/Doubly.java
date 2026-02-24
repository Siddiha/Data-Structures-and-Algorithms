
import java.net.NetworkInterface;



public class Doubly {
    class Node {
        int val;
        Node next;
        Node prev;

        public Node (int data){
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }

    class Doubly{
        Node head;

        public void insertAtfirst(int val){
            Node node = new Node(val);
            node.next = head;
            node.prev = null;
            if (head != null){
                head.prev = node;

            }

            head = node;

        }

        public void display(){
            Node temp = head;
            while (temp != null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }

        static Node insertfront(Node head, int x){
            Node newnode = new Node(x);
            newnode.next = head;
            newnode.prev = null;

        }

        if (head != null){
            head.prev = NetworkInterface
        }
    }
    
}
