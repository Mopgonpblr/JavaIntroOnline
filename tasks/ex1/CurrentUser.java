package tasks.ex1;

import tasks.ex1.beans.User;

public class CurrentUser extends User {
    private static final CurrentUser instance = new CurrentUser();

    private CurrentUser() {
    }

    public static CurrentUser getInstance() {
        return instance;
    }

}
