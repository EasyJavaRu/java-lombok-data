package ru.easyjava.java.users;

import org.junit.Test;

import static org.junit.Assert.*;


public class GroupTest {

    @Test
    public void testEquals() {
        Group testedObject = new Group(1L, "TEST");
        Group oppositeObject = new Group(1L, "TEST");

        assertEquals(testedObject, oppositeObject);

        System.out.println(testedObject.toString());
        System.out.println(oppositeObject.toString());
    }

    @Test
    public void testNotEquals() {
        Group testedObject = new Group(1L, "TEST");
        Group oppositeObject = testedObject.withName("NEW");

        assertNotEquals(testedObject, oppositeObject);
        assertFalse(testedObject == oppositeObject);

        System.out.println(testedObject.toString());
        System.out.println(oppositeObject.toString());
    }
}