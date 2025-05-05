import java.util.*;
public class HelloTillStop {
    Scanner sc = new Scanner(System.in);

    //outputs hello while user wants
    void showHello(){
        String choice ; //guard varible

        System.out.println("For hello type h, anything else to stop");
        choice = sc.next(); //set guard variable
        while ("h".equals(choice)){
            System.out.println("Hello");
            choice = sc.next();
        }
    }
    
}
