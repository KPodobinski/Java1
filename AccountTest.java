package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void checkIfDepositIsWorkingOK(){
        Account acc = new Account("John", 1234, 1000000);
        assertTrue(acc.deposit(10000));
        assertFalse(acc.deposit(-100));
    }

    @Test
    public void checkIfWithdrawIsWorkingOK(){
        Account acc = new Account("John", 1234, 1000000);
        assertTrue(acc.withdraw(10000, 100));
        assertFalse(acc.withdraw(10000000, 1000000000));
    }

    @Test
    public void checkIfAddInterestIsWorkingOk() {
        Account acc = new Account("John", 1234, (float)123.45);
        float tmp = (float)123.45 + 100*0.045f;
        acc.addInterest();
        assertEquals(tmp, acc.getBalance(), 0);
    }

    @Test
    public void checkIfGetBallanceIsWorkingOk() {
        Account acc = new Account("John", 1234, 100);
        assertEquals(100, acc.getBalance(), 0);
    }

    @Test
    public void checkIfAccountNumberIsWorkingOk() {
        Account acc = new Account("John", 1234, 100);
        assertEquals(1234, acc.getAccountNumber());
    }
}