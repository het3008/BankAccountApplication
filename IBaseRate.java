package Bankaccountapp;

public interface IBaseRate {
    default  double getbaseRate()
    {

        return 2.5;
    }
}
