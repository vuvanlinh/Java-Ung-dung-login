package will.dao;

import will.model.Login;
import will.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(10);
        u1.setName("Ninh");
        u1.setAccount("ninh");
        u1.setEmail("ninh@gmail.com");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setAge(10);
        u2.setName("Thanh");
        u2.setAccount("thanh");
        u2.setEmail("thanh@gmail.com");
        u2.setPassword("123456");
        users.add(u2);

        User u3 = new User();
        u3.setAge(10);
        u3.setName("Mai");
        u3.setAccount("mai");
        u3.setEmail("mai@gmail.com");
        u3.setPassword("123456");
        users.add(u3);

    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())) {
                return u;
            }
        }

        return null;
    }
}
