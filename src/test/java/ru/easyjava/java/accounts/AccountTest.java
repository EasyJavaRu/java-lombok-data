package ru.easyjava.java.accounts;

import org.junit.Test;
import ru.easyjava.java.users.User;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AccountTest {
    @Test
    public void testEquals() {
        User user = new User(1L, "TEST", BigDecimal.ONE);

        Account testedObject = Account.create(1L, user);
        Account opposieObject = Account.create(1L, user);

        assertEquals(testedObject, opposieObject);

        System.out.println(testedObject.toString());
        System.out.println(opposieObject.toString());
    }

    @Test
    public void testNotEquals() {
        User user = new User(1L, "TEST", BigDecimal.ONE);

        Account testedObject = Account.create(1L, user);
        Account opposieObject = Account.create(1L, user);

        testedObject.setAmount(BigDecimal.ONE);
        opposieObject.setAmount(BigDecimal.TEN);

        assertNotEquals(testedObject, opposieObject);

        System.out.println(testedObject.toString());
        System.out.println(opposieObject.toString());
    }
}