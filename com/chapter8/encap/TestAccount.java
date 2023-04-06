package com.chapter8.encap;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("losy");
        account.setBalance(60);
        account.setPwd("123456");

        account.showInfo();
    }
}
