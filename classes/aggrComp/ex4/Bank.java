package classes.aggrComp.ex4;

public class Bank {
    private Client[] clients;
    private String name;

    public Bank(String name) {
        this.clients = new Client[0];
        this.name = name;
    }

    public Client[] getClients() {
        return this.clients;
    }

    public void addClient(String name, String surname) {
        for (int i = 0; i < clients.length; ) {
            if (clients[i].getName().equals(name) && clients[i].getSurname().equals(surname)) {
                return;
            } else
                i++;
        }
        Client[] temp = clients;
        clients = new Client[temp.length + 1];
        System.arraycopy(temp, 0, clients, 0, temp.length);
        clients[temp.length] = new Client(name, surname);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Client client : clients)
            sb.append(client).append("\n");
        return sb.toString();
    }
}
