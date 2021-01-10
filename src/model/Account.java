package model;

import java.util.Objects;

public class Account
{
    private long id;
    private double balance;
    private long customerId;
    private String iban;

    public Account(long id, double balance, long customerId, String iban)
    {
        this.id = id;
        this.balance = balance;
        this.customerId = customerId;
        this.iban = iban;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && Double.compare(account.balance, balance) == 0 && customerId == account.customerId && iban.equals(account.iban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, balance, customerId, iban);
    }

    @Override
    public String toString()
    {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", customerId=" + customerId +
                ", iban='" + iban + '\'' +
                '}';
    }
}
