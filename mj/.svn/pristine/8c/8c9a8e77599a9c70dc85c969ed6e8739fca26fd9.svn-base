package user.exception.test;
//사용자정의 Exception
// 클래스에서 try~catch를 해주면 코드의 가독성이 떨어지기때문에
// 클래스에서는 폭탄을 던지고 main에서 받아서 한번에 처리하는것이 더 좋은 방법이다.!!!
// 예외처리가 많아질때 가독성이 떨어질수있다.
class AmountInputException extends Exception {
   public AmountInputException() {
      this("1000원 이상 입금하셔야 합니다.");
   }

   public AmountInputException(String message) {
      super(message);
   }
}

class InvalidOutputException extends Exception {

   public InvalidOutputException() {
      this("잔액보다 많은 금액을 출금할 수 없습니다.");
   }
   
   public InvalidOutputException(String message) {
      super(message);
   }
}

class Account {
   int balance;

   Account(int balance) {
      this.balance = balance;
   }

   public void deposit(int amount) throws AmountInputException{
      if (amount < 1000)
         throw new AmountInputException("1000원 이상 입금하셔야 합니다.");
         
      balance += amount;
      System.out.println(amount + " 원 입금완료");
      
   }

   public void withdraw(int amount) throws InvalidOutputException{
      if (amount > balance)
         throw new InvalidOutputException("잔액보다 많은 금액을 출금할 수 없습니다.");
      
      balance -= amount;
      System.out.println(amount + " 원 출금완료");
   }

   public int getBalance() {
      return balance;
   }
}

public class BankAccountExceptionTest2 {
   public static void main(String[] args) {
      Account acc = new Account(10000);

      // 1. 입금시 1000원 이상 하지 않으면 예외 발생시킴....AmountInputException
      try{
         acc.deposit(2000);
      }catch(AmountInputException e){
         System.out.println(e.getMessage());
      }try{
         acc.deposit(800);
      }catch(AmountInputException e){
         System.out.println(e.getMessage());
      }try{
         acc.deposit(1300);
      }catch(AmountInputException e){
         System.out.println(e.getMessage());
      }finally{
      // 2. 잔액이 13300원이 나오는지를 확인.
         System.out.println("getBalance() :: " + acc.getBalance() + " 원 잔액!!");
      }
      // 3. 출금시 잔액보다 많은 금액을 출금하면 예외발생....InvalidOutputException
      try{
         acc.withdraw(3000);
      }catch(InvalidOutputException e){
         System.out.println(e.getMessage());
      }try{
         acc.withdraw(32000);
      }catch(InvalidOutputException e){
         System.out.println(e.getMessage());
      }finally{
      // 4. 잔액을 확인하면 10300원이 나와야한다.
         System.out.println("getBalance() :: " + acc.getBalance() + " 원 잔액!!");
      }
   }
}
/*
class Account {
   int balance;

   Account(int balance) {
      this.balance = balance;
   }

   public void deposit(int amount){
      if (amount < 1000){
         try{
            throw new AmountInputException("1000원 이상 입금하셔야 합니다.");
         }catch(AmountInputException e){
            System.out.println(e.getMessage());
         }
      }else{
         balance += amount;
         System.out.println(amount + " 원 입금완료");
      }
   }

   public void withdraw(int amount){
      if (amount > balance){
         try{
            throw new InvalidOutputException("잔액보다 많은 금액을 출금할 수 없습니다.");
         }catch(InvalidOutputException e){
            System.out.println(e.getMessage());
         }
      }else{
         balance -= amount;
         System.out.println(amount + " 원 출금완료");
      }
   }

   public int getBalance() {
      return balance;
   }
}

public class BankAccountExceptionTest2 {
   public static void main(String[] args) {
      Account acc = new Account(10000);

      // 1. 입금시 1000원 이상 하지 않으면 예외 발생시킴....AmountInputException
      try{
         acc.deposit(2000);
         acc.deposit(800);
         acc.deposit(1300);
      }finally{
      // 2. 잔액이 13300원이 나오는지를 확인.
         System.out.println("getBalance() :: " + acc.getBalance() + " 원 잔액!!");
      }
      // 3. 출금시 잔액보다 많은 금액을 출금하면 예외발생....InvalidOutputException
      try{
         acc.withdraw(3000);
         acc.withdraw(32000);
      }finally{
      // 4. 잔액을 확인하면 10300원이 나와야한다.
         System.out.println("getBalance() :: " + acc.getBalance() + " 원 잔액!!");
      }
   }
}
*/
