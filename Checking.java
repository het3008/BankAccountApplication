package Bankaccountapp;

public class Checking extends Account {
    private  int debitcardnumber;
    private int debitcardpin;

    public Checking(String name,String ssn,double initdeposit)
    {
        super(name,ssn,initdeposit);
        accountNumber="2"+accountNumber;
        debitCard();
    }
    @Override
    public  void  setRate()
    {
       rate=getbaseRate()*.15;
           }
    private  void debitCard()
    {
        debitcardnumber=(int)(Math.random()*Math.pow(10,12));
        debitcardpin=(int)(Math.random()*Math.pow(10,4));
    }
    public void showInfo()
    {
        System.out.println("New Account:Checking Account");
       super.showInfo();
        System.out.println("Checking Account Feature :"
        +"\n Debit card number: "+debitcardnumber +"\n Debit card pin "+debitcardpin);

    }
}
