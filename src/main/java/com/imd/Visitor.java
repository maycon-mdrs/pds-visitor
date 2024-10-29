package com.imd;

import com.imd.models.CurrentAccount;
import com.imd.models.SavingsAccount;

public interface Visitor {
    void visit(CurrentAccount currentAccount);
    void visit(SavingsAccount savingsAccount);
}
