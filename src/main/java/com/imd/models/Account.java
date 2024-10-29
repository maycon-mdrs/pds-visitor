package com.imd.models;

import com.imd.Visitor;

public interface Account {
    void accept(Visitor visitor);
}
