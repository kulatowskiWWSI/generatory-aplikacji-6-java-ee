package program.model;

import java.io.Serializable;

public class BankAccount implements Serializable {

    private int id;

    private int customerId;

    private int pin;

    private int balance;

    private String currency;


    public BankAccount(int id, int customerId, int balance, String currency, Integer pin) {
        this.id = id;
        this.customerId = customerId;
        this.balance = balance;
        this.currency = currency;
        this.pin = pin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
