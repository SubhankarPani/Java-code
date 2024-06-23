package collection_framework;

public class UserDefinedException {
    // Java program to demonstrate user-defined exception

    // This program throws an exception whenever balance
    // amount is below Rs 1000
    static class MyException extends Exception {
        // Store account information
        private static int accno[] = {1001, 1002, 1003, 1004, 1005};

        private static String name[] = {"Nish", "Shubh", "Sush", "Abhi", "Akash"};

        private static double bal[] = {10000.00, 12000.00, 5600.0, 999.00, 1100.55};

        // Default constructor
        MyException() { }

        // Parameterized constructor
        MyException(String str) { super(str); }
    }

    // Main method should be static
    public static void main(String[] args) {
        try {
            // Display the heading for the table
            System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");

            // Display the actual account information
            for (int i = 0; i < 5; i++) {
                System.out.println(MyException.accno[i] + "\t" + MyException.name[i] + "\t" + MyException.bal[i]);

                // Display own exception if balance < 1000
                if (MyException.bal[i] < 1000) {
                    MyException me = new MyException("Balance is less than 1000");
                    throw me;
                }
            }
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
