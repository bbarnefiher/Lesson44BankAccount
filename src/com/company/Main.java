package com.company;

import java.util.*;
import java.text.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        NumberFormat fmt = NumberFormat.getNumberInstance();
        fmt.setMinimumFractionDigits(2);
        fmt.setMaximumFractionDigits(2);
        String name;
        ArrayList aryLst = new ArrayList();
        ArrayList <BankAccount> myArray = new ArrayList();
        ListIterator iter = aryLst.listIterator();
        do {
            Scanner kbReader = new Scanner(System.in);
            System.out
                    .print("Please enter the name to whom the account belongs. (\"Exit\" to abort) ");
            name = kbReader.nextLine();
            if (!name.equalsIgnoreCase("EXIT")) {
                System.out.print("Please enter the amount of the deposit. ");
                double amount = kbReader.nextDouble();
                System.out.println(" "); // gives an eye pleasing blank line
                // between accounts
                BankAccount theAccount = new BankAccount(name, amount);
                iter.add(theAccount);
                myArray.add(theAccount);
            }
        } while (!name.equalsIgnoreCase("EXIT"));

        // Search aryLst and print out the name and amount of the largest bank
        // account
        BankAccount ba = (BankAccount) iter.previous();
        double maxBalance = ba.balance; // set last account as the winner so far
        String maxName = ba.name;
        while (iter.hasPrevious()) {
            ba = (BankAccount) iter.previous();
            if (ba.balance > maxBalance) {
                // We have a new winner, chicken dinner
                maxBalance = ba.balance;
                maxName = ba.name;
            }
        }
        System.out.println(" ");
        System.out.println("The account with the largest balance belongs to "
                + maxName + ".");
        System.out.println("The amount is $" + fmt.format(maxBalance) + ".");



        //comparator

        BankAccount[] myList =  new BankAccount[myArray.size()];
        myList = myArray.toArray(myList);
        Comparator comp = new BA_comparator();
        Arrays.sort(myList, comp);
        for(BankAccount b : myList)
        {
            System.out.println("\n" + b.name + " >>> " + b.balance);
        }


        //comparable
        /*
        Collections.sort(myArray);
        for(BankAccount b : myArray)
        {
            System.out.println("\n" + b.name + " >>> " + b.balance);
        }
        */





    }
}