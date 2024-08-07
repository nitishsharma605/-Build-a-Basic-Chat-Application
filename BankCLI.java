/**
 * Command-line interface for the banking system.
 */
public class BankCLI {
    private Bank bank;

    /**
     * Constructs a command-line interface for the banking system.
     */
    public BankCLI() {
        bank = new Bank();
    }

    /**
     * Runs the command-line interface.
     */
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Create account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    createAccount(scanner);
                    break;