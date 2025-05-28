package com.btnc.reiviewmidterm.models;

import java.util.ArrayList;

public class ListAccount {
    private ArrayList<Account> accounts;
    public ListAccount() {
        accounts=new ArrayList<>();
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    public void gen_database(){
        Account a1=new Account();
        a1.setId(1);
        a1.setUsername("btnc");
        a1.setPassword("123456");
        accounts.add(a1);

        Account a2=new Account();
        a2.setId(2);
        a2.setUsername("john");
        a2.setPassword("123456");
        accounts.add(a2);

        Account a3=new Account();
        a3.setId(3);
        a3.setUsername("chau");
        a3.setPassword("123456");
        accounts.add(a3);

        Account a4=new Account();
        a4.setId(4);
        a4.setUsername("jack");
        a4.setPassword("123456");
        accounts.add(a4);

        Account a5=new Account();
        a5.setId(5);
        a5.setUsername("jjk");
        a5.setPassword("123456");
        accounts.add(a5);

        Account a6=new Account();
        a6.setId(6);
        a6.setUsername("kth");
        a6.setPassword("123456");
        accounts.add(a6);


        Account a7 = new Account();
        a7.setId(7);
        a7.setUsername("user7");
        a7.setPassword("pass7");
        accounts.add(a7);

        Account a8 = new Account();
        a8.setId(8);
        a8.setUsername("user8");
        a8.setPassword("pass8");
        accounts.add(a8);

        Account a9 = new Account();
        a9.setId(9);
        a9.setUsername("user9");
        a9.setPassword("pass9");
        accounts.add(a9);

        Account a10 = new Account();
        a10.setId(10);
        a10.setUsername("user10");
        a10.setPassword("pass10");
        accounts.add(a10);

    }
}
