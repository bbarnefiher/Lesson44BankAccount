package com.company;

import java.util.*;
public class BA_comparator {
    public int compare (Object firstObject, Object secondObject){
        BankAccount ba1 = (BankAccount) firstObject;
        BankAccount ba2 = (BankAccount) secondObject;
        int retValue;
        if (ba1.balance < ba2.balance){
            retValue = -1;
        }
        if (ba1.balance > ba2.balance){
            retValue = 1;
        }
        else{
            retValue=0;
        }
        return retValue;
    }
}
