package Phase1_oops;

public class Account {
    private String acc_name;
    private int acc_ID;
    private int acc_balance;
    public void initialize(String nm, int id, int bal){
        acc_name = nm;
        acc_ID = id;
        if(bal >= 1000)
            {
                acc_balance = bal;
                System.out.println("Account Created");
                System.out.println(displayAccInfo());
            }

        else
            System.out.println("Balance is too low.");



    }
    public void withdraw(int amount)
    {

        if(acc_balance-amount < 1000)
            System.out.println("You cannot withdraw.");
        else
        {
            acc_balance = acc_balance - amount;
            System.out.println("Successful Withdrawal");
            System.out.println(displayAccInfo());
        }


    }
    public void deposit(int amount)
    {
        acc_balance += amount;
        System.out.println("Successful Deposit");
        System.out.println(displayAccInfo());
    }
    String displayAccInfo()
    {
        return "The "+acc_name + " account, ID "+acc_ID+" has a balance of "+acc_balance+".";
    }
    public String transfer(Account accountTo, int amount) {
        if (acc_balance - amount < 1000)
            return "Cannot be transferred.";
        else {
            acc_balance -= amount;
            System.out.println("Successful Transfer");
            accountTo.acc_balance += amount;
            System.out.println(displayAccInfo());
            return "The transfer has been executed.";
        }
    }

}

