import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //create a stack
        Stack<String> stackofBooks = new Stack<>();

        //pushing data to the stack
        stackofBooks.push("Madolduuwa");
        stackofBooks.push("the village by the sea");
        stackofBooks.push("viragaya");
        stackofBooks.push("newbook1");
        stackofBooks.push("newbook2");


        //checking if stack is empty
        // System.out.println(stackofBooks.empty());

        //to view the stack
        System.out.println(stackofBooks);

        stackofBooks.pop();
        stackofBooks.pop();
        stackofBooks.pop();
        stackofBooks.push("Ater popping");
        //to view the stack

        System.out.println(stackofBooks);

        String bookAttheTop = stackofBooks.peek();
        System.out.println("this is the book at the top = " + bookAttheTop);



    }
}