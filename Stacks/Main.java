import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stacks: " + animals);

        animals.pop();
        System.out.println("Stack after pop: " + animals);
    }
    
}
