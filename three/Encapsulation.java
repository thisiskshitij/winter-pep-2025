public class Encapsulation {
    public static void main(String[] args) {
        Customer timCook = new Customer();
        // timCook.sbi.interestRate = 0; //This is wrong, customer shouldn't be allowed to access interest rate of the bank

        double loanAmount = timCook.ApplyLoan(1000);
        System.out.println("Amount sanctioned : "+loanAmount);
    }
}

class Customer{
    double ApplyLoan(int Amount){
        Bank sbi = new Bank();
        double GrossAmount = Amount+Amount*sbi.interestRate;
        return GrossAmount;
    }
}


class Bank{
    private double interestRate = 9.8/100;
    
    //getters and setters.
    //used to provide limited actions by the same class methods and members

    public void setInterestRate(double newInterest){
        // below if block protects interest rate to drop below 9.8
        if(newInterest<9.8){
            return;
        }

        this.interestRate = newInterest;
    }

    public double getInterestRate(){
        return this.interestRate;
    }

}