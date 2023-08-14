import java.util.Stack;

public class stack_pop{
    //pushing data to the stack
    public static void main(String[] args) {
        //create a stack
        Stack<String> stackOfBooks =new Stack<>();
        
        //push data
        stackOfBooks.push("Madol Duwa");
        stackOfBooks.push("The Vollage By the Sea");
        stackOfBooks.push("Mango Friends");
        stackOfBooks.push("Ape Gama"); 

        //print stack
        System.out.println(stackOfBooks);

        //pop data
        stackOfBooks.pop();
        stackOfBooks.pop();
        stackOfBooks.pop();


        System.out.println(stackOfBooks);

        
    }

}
