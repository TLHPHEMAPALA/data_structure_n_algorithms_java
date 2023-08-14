import java.util.Stack;

public class stack_getnames{
    //pushing data to the stack
    public static void main(String[] args) {
        //create a stack
        Stack<String> stackOfBooks =new Stack<>();
        
        //push data
        stackOfBooks.push("Madol Duwa");
        stackOfBooks.push("The Vollage By the Sea");
        stackOfBooks.push("Mango Friends");
        stackOfBooks.push("Ape Gama"); 

        String bookAttheTop=stackOfBooks.peek();
        System.out.println("This book  is in the top "+bookAttheTop);

        
    }

}
