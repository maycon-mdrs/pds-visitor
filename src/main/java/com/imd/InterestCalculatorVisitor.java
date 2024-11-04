package com.imd;

import com.imd.models.Account;
import com.imd.models.CurrentAccount;
import com.imd.models.SavingsAccount;

import java.util.List;

public class InterestCalculatorVisitor implements Visitor {
    private final double interestRate;
    public void interestCalculator(List<Account> accounts) {
        for (Account account : accounts) {
            account.accept(this);
        }
    }
    public InterestCalculatorVisitor(double interestRate) {
        this.interestRate = interestRate;
    }
    @Override
    public void visit(CurrentAccount currentAccount) {
        double interest = currentAccount.getBalance() * (interestRate / 100);
        System.out.println("Juros para Conta Corrente: " + interest);
    }
    @Override
    public void visit(SavingsAccount savingsAccount) {
        double interest = savingsAccount.getBalance() * ((interestRate + 2) / 100);
        System.out.println("Juros para Conta Poupança: " + interest);
    }
}

