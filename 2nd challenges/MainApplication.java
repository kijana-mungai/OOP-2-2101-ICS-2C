
import javax.sql.DataSource;

public class MainApplication {
    public static void main(String[] args) {
        Admin curAdmin = new Admin(1234,"Stephan","xa1@LW42%3");
        User curUser = new User(445,"John");

        curAdmin.performOperation((DataSource) new Update());
        curUser.performOperation((DataSource)new Update()); 
    }
}
