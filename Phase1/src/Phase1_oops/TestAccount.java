package Phase1_oops;

public class TestAccount {
   public static void main(String[] args) {
    Account a1 = new Account();

    a1.initialize("John Wayne", 331, 30000);

    a1.withdraw(1000);

    a1.deposit(15);


    Account a2 = new Account();

    a2.initialize("Peter",111,10000);

    a2.transfer(a1, 1500);

    a1.displayAccInfo();

   } 
}
