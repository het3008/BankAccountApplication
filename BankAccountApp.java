package Bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) throws Exception {
        List<Account>accounts=new LinkedList<Account>();
        String file="C:\\Users\\Het\\Desktop\\Leet CODE\\newaccount2.CSV";
   /*     Checking c1=new Checking("Het","123456789",1000);
       Saving s1=new Saving("Raj","234567890",2000);
       //c1.showIfo();
       c1.showInfo();
        System.out.println("**********************");
        s1.compound();
       s1.showInfo();
       s1.deposit(1000);
       s1.withdraw(100);
       s1.transfer("college",200);
       s1.printbalanceinfo();*/
        List<String []>newAccountHolder=utilities.CSV.read(file);
     for(String[]accountholder:newAccountHolder)
     {
       //  System.out.println("New Account holders");
         String name=accountholder[0];
         String ssn=accountholder[1];
         String accountType=accountholder[2];
         double initDeposit=Double.parseDouble(accountholder[3]);
        // System.out.println(name +" "+ ssn +" "+ accountType+ " $"+initDeposit);
         if(accountType.equals("Savings"))
         {
             accounts.add(new Saving(name,ssn,initDeposit));
         }
         else if (accountType.equals("Checking"))
     {
             accounts.add(new Checking(name,ssn,initDeposit));
         }
         else
         {
             System.out.println("Error Reading Account Type");
         }
       }
    for(Account acc:accounts)
    {
        System.out.println("\n**************************");
        acc.showInfo();
    }
    }
}

