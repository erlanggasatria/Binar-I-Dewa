import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount("1234567890", 100000, "John Doe", "john.doe@example.com", "123-456-7890");

        // Tampilkan data akun terlebih dahulu
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Customer Name: " + account.getCustomerName());
        System.out.println("Customer Email: " + account.getCustomerEmail());
        System.out.println("Customer Phone: " + account.getCustomerPhone());
        System.out.println("Customer Saldo: " + account.getBalance());

        // Test getter methods
        System.out.println("Saldo awal: $" + account.getBalance());

        // Deposit
        System.out.print("Masukkan jumlah deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        System.out.println("New Balance: $" + account.getBalance());

        // Withdraw
        System.out.print("Masukkan jumlah penarikan: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("New Balance: $" + account.getBalance());

        scanner.close();
    }
}