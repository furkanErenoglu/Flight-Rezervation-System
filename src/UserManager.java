import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserManager {

    private Set<User> users = new HashSet<>();

    public Set<User> getUsers() {
        return users;
    }

    public void addUser(User user){
        users.add(user);
        System.out.println("User added : "+ user.getFullName());
    }

    public void getUserById(String id){
        for(User user:users){
            if (user.getId().equals(id)){
                System.out.println("User: " + user.getFullName());
            }
        }

}








}
