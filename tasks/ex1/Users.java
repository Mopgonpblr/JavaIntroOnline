package tasks.ex1;

import tasks.ex1.beans.Role;
import tasks.ex1.beans.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class Users {
    private final Collection<User> users;

    public Users(String path) {
        this.users = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(
                    new FileReader(path));
            String s;
            while ((s = in.readLine()) != null) {
                String[] req = s.split("\\|");
                User newUser = new User();
                newUser.setRole(Role.valueOf(req[0]));
                newUser.setLogin(req[1]);
                newUser.setPassword(req[2]);
                newUser.setEmail(req[3]);
                this.users.add(newUser);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("Can't read file");
        }
    }

    //Checks given login and password and then authorizes the user if they're correct
    public boolean authorize(String login, String password) {
        User u = CurrentUser.getInstance();
        for (User user : this.users) {
            if (user.getLogin().equals(login))
                if (user.getPassword().equals(this.encryptPassword(password))) {
                    u.setRole(user.getRole());
                    u.setLogin(user.getLogin());
                    u.setPassword(user.getPassword());
                    u.setEmail(user.getEmail());
                    return true;
                } else {
                    System.out.println("Wrong password");
                }
        }
        return false;
    }

    //Encrypts the open password
    public String encryptPassword(String password) {
        StringBuilder encryptedPassword = new StringBuilder();

        String key = "library";
        while (password.length() > key.length())
            key += key;
        for (int i = 0; i < password.length(); i++) {
            encryptedPassword.append(password.charAt(i) ^ key.charAt(i));
        }

        return encryptedPassword.toString();
    }

}
