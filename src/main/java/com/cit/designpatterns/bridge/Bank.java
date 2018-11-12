package com.cit.designpatterns.bridge;

public abstract class Bank
{
    protected Account account;

    public Bank(Account account)
    {
        this.account = account;
    }

    public abstract Account openAccount();
}