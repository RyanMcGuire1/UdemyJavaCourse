package BankAccountChallenge;

public class Main {
   public static void main(String[] args) {
      Account bobsAccount = new Account("12345", 0.00, "myemail@bob.com", "Bob Brown", "(087) 123-4567");
      System.out.println("Account number = " + bobsAccount.getNumber());
      System.out.println("Balance = " + bobsAccount.getBalance());

      bobsAccount.withdrawal(100.00);

      bobsAccount.deposit(50.00);
      bobsAccount.withdrawal(100.00);

      bobsAccount.deposit(51.00);
      bobsAccount.withdrawal(100.00);

      VipCustomer customer1 = new VipCustomer();
      System.out.println(customer1.getName());

      VipCustomer person2 = new VipCustomer("Ryan", 25000.00);
      System.out.println(person2.getName());

      VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@email.com");
      System.out.println(person3.getName());
      System.out.println(person3.getEmail());
   }
}
