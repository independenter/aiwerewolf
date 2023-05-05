package com.aiwolf.valueobject;

import com.aiwolf.enums.RoleType;
import lombok.Data;

@Data
public sealed class Person permits God, Wolf {

    private final PersonId personId;
    private final RoleType role;
}
