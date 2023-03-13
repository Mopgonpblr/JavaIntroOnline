package tasks.ex1.beans;

public class User {
    private Role role;
    private String login;
    private String password;
    private String email;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int hashCode(){
        return 7*this.login.hashCode()*this.email.hashCode()*this.role.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.role.name()).append(" | ").append(this.login).append(" | ").
                append(this.password).append(" | ").append(this.email);
        return sb.toString();
    }
}
