package com.company;

/**
 * Created by dpennebacker on 2/13/17.
 */
public class BankAccount implements Comparable {

    public BankAccount(String nm, double amt) {
        name = nm;
        balance = amt;
    }

    public int compareTo(Object otherObject)
    {
        //balance
        BankAccount otherAccount = (BankAccount) otherObject;
        int retValue;
        if (balance < otherAccount.balance) {
            retValue = -1;
        } else {
            if (balance > otherAccount.balance) {
                retValue = 1;
            } else {
                retValue = 0;
            }
        }
        return retValue;


        /*
        BankAccount otherAccount = (BankAccount) otherObject;
        int retValue;
        if (name.charAt(0) < otherAccount.name.charAt(0)) {
            retValue = -1;
        } else {
            if (name.charAt(0) > otherAccount.name.charAt(0)) {
                retValue = 1;
            } else {
                retValue = 0;
            }
        }
        return retValue;
        */

        //alphabetical






    }

    public void deposit(double dp) {
        balance = balance + dp;
    }

    public void withdraw(double wd) {
        balance = balance - wd;
    }

    public String name;
    public double balance;

}