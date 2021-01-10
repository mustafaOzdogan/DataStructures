package test;

import model.Account;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet
{
    public static void main(String[] args)
    {
        // create instances
        Account account_1 = new Account(1,100.0,330,"GR200");
        Account account_2 = new Account(2,200,331,"GR201");
        Account account_3 = new Account(3,250.0,332,"GR202");

        // same fields with account_1 instance
        Account account_4 = new Account(1,100.0,330,"GR200");

        // create hashSet
        Set<Account> accounts = new HashSet<>();

        // add accounts into hashSet
        accounts.add(account_1);
        accounts.add(account_2);
        accounts.add(account_3);
        accounts.add(account_4);

        // print accounts
        System.out.println("Accounts:");
        accounts.forEach( i -> System.out.println(i.toString()));

        // change clone account and add
        account_4.setIban("GR201");
        accounts.add(account_4);

        // print accounts
        System.out.println("\n" + "New Accounts:");
        accounts.forEach( i -> System.out.println(i.toString()));
    }
}
