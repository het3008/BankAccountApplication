package Bankaccountapp;

public abstract class Account implements IBaseRate {
    private String name;
    private String SSN;
    private double balance;
    protected String accountNumber;
   protected double rate;
    private static int  index=10000;
    //Construtor to set base properties and initialize the account
    public Account(String name, String SSN, double initdeposit) {
        this.name = name;
        this.SSN = SSN;
        balance = initdeposit;
        this.accountNumber=setAccountnumber();
        //set account number
        index++;
        setRate();
          }
    private String setAccountnumber()
    {
        //crete a account number of 11 digits with 1 num is for checking or saving then after 5 digit unique number,
        // then 3 digit random number and last two digits are last two digit of ssn number
        //last two digit of SSN number
        String lasttwoofssn=SSN.substring(SSN.length()-2,SSN.length());
     //unique 5 digit number
        int uniqueid=index;
        //random 3 digit number
        int randomnum=(int)(Math.random()*Math.pow(10,3));
        return lasttwoofssn+uniqueid+randomnum;
    }
    public abstract  void setRate();
    public void compound()
    {
        double accuredInterest=balance*(rate/100);
        System.out.println("Accured Interest "+accuredInterest);
        balance=balance+accuredInterest;

        printbalanceinfo();
    }
    public void deposit(double amount)
    {
balance=balance+amount;
        System.out.println("Depositing amount $"+amount);
    }
    public void withdraw(double amount)
    {
        balance=balance-amount;

        System.out.println("Withdrawing amount $"+amount);
    }
    public void transfer(String towhere,double amount)
    {
        balance=balance-amount;
        System.out.println("Transfering amout $"+amount+ " to "+towhere);
    }
    public void printbalanceinfo()
    {
        System.out.println("Your balance is now "+balance);
    }

    public void showInfo()
    {
        System.out.println("Name :"+name+"\n"
        + "Account Number :"+ accountNumber + "\n"+"Balance :"+balance +"\n"+ "Rate :"+rate +"%");
    }

}
