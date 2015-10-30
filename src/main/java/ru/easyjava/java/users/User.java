package ru.easyjava.java.users;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;

import java.math.BigDecimal;

/**
 * Sample user entity
 */
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@ToString()
@EqualsAndHashCode(exclude = {"value"})
public class User {
    /**
     * Id.
     */
    @Getter
    Long id;

    /**
     * User name.
     */
    @Getter
    @NonNull
    String name;

    /**
     * Some entity, that you can't set.
     */
    @Getter
    @Setter
    @NonFinal
    BigDecimal value;
}
