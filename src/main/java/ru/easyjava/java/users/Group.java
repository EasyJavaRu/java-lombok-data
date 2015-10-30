package ru.easyjava.java.users;


import lombok.Value;
import lombok.experimental.Wither;

/**
 * Sample immutable entity.
 */
@Value
public class Group {
    /**
     * Id.
     */
    Long id;

    /**
     * User name.
     */
    @Wither
    String name;
}
