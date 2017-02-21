package com.epam.mp.starvation.entity;

public class BalanceMonitor implements Runnable {
    private BankAccount account;

    public BalanceMonitor(BankAccount account) {
        this.account = account;
    }

    public boolean alreadyNotified = false;

    @Override
    public void run() {
        System.out.format("%s started execution%n", Thread.currentThread().getName());
        while (true) {
            if (account.getBalance() <= 0) {
                // send email, or sms, clouds of smoke ...
                break;
            }
        }
        System.out.format("%s : account has gone too low, email sent, exiting.", Thread.currentThread().getName());
    }
}
