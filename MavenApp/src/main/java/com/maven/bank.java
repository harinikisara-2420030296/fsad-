class Bank {

    // Method to return interest rate
    double getInterestRate() {
        return 0;
    }
}

class SBI extends Bank {

    // Overriding method
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {

    // Overriding method
    @Override
    double getInterestRate() {
        return 7.0;
    }
}

public class main {
    public static void main(String[] args) {

        Bank bank;

        bank = new SBI();
        System.out.println("SBI Interest Rate: " + bank.getInterestRate() + "%");

        bank = new HDFC();
        System.out.println("HDFC Interest Rate: " + bank.getInterestRate() + "%");
    }
}
