package Bankaccountapp;

import org.w3c.dom.ls.LSOutput;

public class Saving extends Account {
    private int safetydepositid;
    private  int safetydepositkey;

    public Saving(String name,String ssn,double initdeposit) {

        super(name,ssn,initdeposit);
        accountNumber="1"+accountNumber;
        setSafetydepositbox();
    }
    @Override
public void setRate()
{
    rate=getbaseRate() -.25;

}
    private  void setSafetydepositbox()
    {
        safetydepositid=(int)(Math.random()*Math.pow(10,3));
        safetydepositkey=(int)(Math.random()*Math.pow(10,4));

    }
    public void showInfo()
    {
        System.out.println("New Account:Saving Account");
        super.showInfo();
        System.out.println("Your Saving Account Features :"+
                "\n Safety Deposit Box ID :" +safetydepositid +"\n Safety Deposit Pin "+ safetydepositkey);
    }
}
