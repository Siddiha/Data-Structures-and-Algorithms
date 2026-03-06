
import java.util.LinkedList;
import java.util.Queue;



public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(8);
        q.add(3);

        if (q.isEmpty()){
            System.out.println("Queue is empty");
        }else{
            System.out.println("Queue is not empty");
        }

    }
    
}
