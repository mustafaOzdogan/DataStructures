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
        System.out.println("\n" + "Accounts (1st): ** WILL NOT ADD ACCOUNT THAT HAS SAME FIELD VALUES **");
        accounts.forEach( i -> System.out.println(i.toString()));
        System.out.println("\n");

        // change clone account and add
        System.out.println("** COPIED IBAN is CHANGED TO UNIQUE IBAN {.setIban(GR208)} **");
        account_4.setIban("GR208");
        accounts.add(account_4);

        // print accounts
        System.out.println("Accounts (2nd): ** IT WILL ADD ACCOUNT WITH UNIQUE IBAN **");
        accounts.forEach( i -> System.out.println(i.toString()));
        System.out.println("\n");

        // turn back to old clone form
        System.out.println("** TURN BACK TO COPIED IBAN VALUE {.setIban(GR200)} **");
        account_4.setIban("GR200");
        accounts.add(account_4);

        // print accounts
        System.out.println("Accounts (3rd): ** THERE WILL BE DUPLICATED ACCOUNT **");
        accounts.forEach( i -> System.out.println(i.toString()));
        System.out.println("\n");

        // turn back to old clone form
        System.out.println("** COPIED IBAN is AGAIN CHANGED TO UNIQUE IBAN {.setIban(GR210)} **");
        account_4.setIban("GR210");

        // print accounts
        System.out.println("Accounts (4rd): ");
        accounts.forEach( i -> System.out.println(i.toString()));

        accounts.add(account_4);

        // print accounts
        System.out.println("\n" + "Accounts (5rd): ** ");
        accounts.forEach( i -> System.out.println(i.toString()));

        accounts.add(account_4);

        // print accounts
        System.out.println("\n" + "Accounts (6rd): ** ");
        accounts.forEach( i -> System.out.println(i.toString()));

        accounts.add(account_4);

        // print accounts
        System.out.println("\n" + "Accounts (7d): ** ");
        accounts.forEach( i -> System.out.println(i.toString()));

    }
}
