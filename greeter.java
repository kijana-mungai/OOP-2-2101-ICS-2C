//puts message on the screen
public class greeter{
    void greet(){
        System.out.println("HI there");
    }
    public static void main(String[] args) {
        (new greeter()).greet();
    }
}