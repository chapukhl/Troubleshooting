package com.epam.mp.starvation.entity;

public class BankAccount {

    private double balance;
    private int id;

    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public synchronized double getBalance() {
        // Wait to simulate io like database access ...
        try {Thread.sleep(100l);} catch (InterruptedException e) {}
        return balance;
    }

    public synchronized void withdraw(double amount) {
        balance -= amount;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    synchronized void transfer(BankAccount to, double amount) {
        withdraw(amount);
        to.deposit(amount);
    }
}
