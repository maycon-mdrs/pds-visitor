package com.imd;

import com.imd.models.Account;
import com.imd.models.CurrentAccount;
import com.imd.models.SavingsAccount;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Account> accounts = List.of(
                new CurrentAccount(100),
                new SavingsAccount(200)
        );
        InterestCalculatorVisitor interestCalculatorVisitor = new InterestCalculatorVisitor(5);
        interestCalculatorVisitor.interestCalculator(accounts);
    }
}


