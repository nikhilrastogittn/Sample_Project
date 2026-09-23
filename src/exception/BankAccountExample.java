package exception;


// Example of Custom exception implementation
public class BankAccountExample {

    private final Double balance;

    public BankAccountExample(Double balance){
        this.balance=balance;
    }

    public void withdraw(double amount) throws InsufficientFundException {
        if(amount>balance){
            throw new InsufficientFundException(balance);
        }
    }

    public static void main(String[] args){

        BankAccountExample bankAccountExample=new BankAccountExample(10d);
        try {
            bankAccountExample.withdraw(11d);
        }catch (InsufficientFundException e){
            System.out.println("amount insufficient exception, amount is:"+e.getAmount());
        }

    }

}
class InsufficientFundException extends Exception{

    private Double amount;

    public InsufficientFundException(){
        super("You do not have enough money");
    }
    public InsufficientFundException(Double amount){
        this.amount=amount;
    }

    public Double getAmount(){
        return amount;
    }
}


