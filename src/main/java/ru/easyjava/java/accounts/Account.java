package ru.easyjava.java.accounts;

import lombok.Data;
import lombok.NonNull;
import ru.easyjava.java.users.User;

import java.math.BigDecimal;

/**
 * Sample account entity.
 */
@Data(staticConstructor = "create")
public class Account {
    /**
     * Id.
     */
    @NonNull
    Long id;

    /**
     * Account owner.
     */
    @NonNull
    User owner;

    /**
     * Account's value.
     */
    BigDecimal amount;
}
