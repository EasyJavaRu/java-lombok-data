package ru.easyjava.java.users;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void testEquals() {
        User testedObject = new User(1L, "TEST", BigDecimal.ONE);
        User oppositeObject = new User(1L, "TEST", BigDecimal.TEN);

        assertEquals(oppositeObject, testedObject);
        System.out.println(testedObject.toString());
        System.out.println(oppositeObject.toString());
    }
}