package com.imd.models;

import com.imd.Visitor;

public class CurrentAccount implements Account {
    private double balance;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
