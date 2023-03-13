/**
 * 4. Счета. Клиент может иметь несколько
 * счетов в банке. Учитывать возможность
 * блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов.
 * Вычисление общей суммы по счетам.
 * Вычисление суммы по всем счетам,
 * имеющим положительный и отрицательный
 * балансы отдельно.
 */
package classes.aggrComp.ex4;

public class Ex4 {
    public static void main(String[] args) {
        Bank bank = new Bank("Bank of America");
        bank.addClient("Thomas", "Anderson");
        bank.getClients()[0].addAccount();
        bank.getClients()[0].getAccounts()[1].setSum(59.99);
        bank.getClients()[0].addAccount();
        bank.getClients()[0].getAccounts()[2].setSum(-10.99);
        bank.getClients()[0].addAccount();
        bank.getClients()[0].getAccounts()[3].setSum(159.99);
        bank.getClients()[0].addAccount();
        bank.getClients()[0].getAccounts()[4].setSum(-9.99);
        bank.getClients()[0].getAccounts()[4].setActive(false);

        bank.getClients()[0].sortByAccountNumber();
        System.out.println(bank);
        bank.getClients()[0].sortBySum();
        System.out.println(bank);
        bank.getClients()[0].sortByStatus();
        System.out.println(bank);

        System.out.println("Sum: " + bank.getClients()[0].getSum());
        System.out.println("Positive sum: " + bank.getClients()[0].getPositiveSum());
        System.out.println("Negative sum: " + bank.getClients()[0].getNegativeSum());

        String number = bank.getClients()[0].getAccounts()[3].getNumber();

        if (bank.getClients()[0].find(number)!=null)
            System.out.println(bank.getClients()[0].find(number));

    }
}






