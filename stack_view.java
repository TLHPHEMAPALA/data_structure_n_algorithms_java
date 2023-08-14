import java.util.Stack;

public class stack_view{
    //pushing data to the stack
    public static void main(String[] args) {
        //create a stack
        Stack<String> stackOfBooks =new Stack<>();
        
        //push data
        stackOfBooks.push("Madol Duwa");
        stackOfBooks.push("The Vollage By the Sea");
        stackOfBooks.push("Mango Friends");
        stackOfBooks.push("Ape Gama");
 
        //checking stack is empty
        System.out.println(stackOfBooks.empty());

        //view data in book
        System.out.println(stackOfBooks);
    }

}
