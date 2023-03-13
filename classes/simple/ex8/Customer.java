package classes.simple.ex8;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String fname;
    private String address;
    private long cardNumber;
    private long bankNumber;


    public Customer(int id, String surname, String name, String fname, String address, long cardNumber, long bankNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.fname = fname;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankNumber = bankNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(long bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String toString() {
        return this.id + " | " + this.surname + " | " + this.name + " | " + this.fname
                + " | " + this.address + " | " + this.cardNumber + " | " + this.bankNumber;
    }
}