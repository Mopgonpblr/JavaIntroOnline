package classes.aggrComp.ex4;

public class Client {
    private Account[] accounts;
    private String name;
    private String surname;

    public Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.accounts = new Account[0];
        this.addAccount();
    }

    public void addAccount() {
        Account[] temp = accounts;
        accounts = new Account[temp.length + 1];
        System.arraycopy(temp, 0, accounts, 0, temp.length);
        accounts[temp.length] = new Account();
        for (int i = 0; i < accounts.length - 1; ) {
            if (accounts[i].getNumber().equals(accounts[temp.length].getNumber())) {
                accounts[temp.length].generateNumber();
                i = 0;
            } else
                i++;
        }
    }

    public Account[] getAccounts() {
        return this.accounts;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSum() {
        double sum = 0;
        for (Account account : accounts)
            sum += account.getSum();
        return sum;
    }

    public double getPositiveSum() {
        double sum = 0;
        for (Account account : accounts)
            if (account.getSum() > 0)
                sum += account.getSum();
        return sum;
    }

    public double getNegativeSum() {
        double sum = 0;
        for (Account account : accounts)
            if (account.getSum() < 0)
                sum += account.getSum();
        return sum;
    }

    public void sortByAccountNumber() {
        for (int i = 1; i < accounts.length; ) {
            if (accounts[i].getNumber().compareTo(accounts[i - 1].getNumber()) > 0) {
                Account temp = accounts[i];
                accounts[i] = accounts[i - 1];
                accounts[i - 1] = temp;
                i = 1;
            } else
                i++;
        }
    }

    public void sortBySum() {
        for (int i = 1; i < accounts.length; ) {
            if (accounts[i].getSum() < accounts[i - 1].getSum()) {
                Account temp = accounts[i];
                accounts[i] = accounts[i - 1];
                accounts[i - 1] = temp;
                i = 1;
            } else
                i++;
        }
    }

    public void sortByStatus() {
        for (int i = 1; i < accounts.length; ) {
            if (!accounts[i].isActive() && accounts[i - 1].isActive()) {
                Account temp = accounts[i];
                accounts[i] = accounts[i - 1];
                accounts[i - 1] = temp;
                i = 1;
            } else
                i++;
        }
    }

    public Account find(String number) {
        for (Account account: accounts)
            if (account.getNumber().equals(number))
                return account;
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName()).append(" ").append(this.getSurname()).append("\n");
        for (Account account : accounts)
            sb.append(account).append("\n");
        return sb.toString();
    }
}
