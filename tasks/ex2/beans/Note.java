package tasks.ex2.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Note {
    private String theme;
    private Date date;
    private String email;
    private String message;

    public Note(String theme, Date date, String email, String message) {
        this.theme = theme;
        this.date = date;
        this.email = email;
        this.message = message;
    }

    public Note() {
        this.theme = "empty";
        this.date = new Date();
        this.email = "empty";
        this.message = "empty";
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.theme).append("|").append(new SimpleDateFormat("dd/MM/yyyy").format(this.date)).append("|").
                append(this.email).append("|").append(this.message);
        return sb.toString();
    }
}
