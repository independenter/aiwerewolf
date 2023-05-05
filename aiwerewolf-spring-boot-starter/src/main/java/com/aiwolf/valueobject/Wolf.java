package com.aiwolf.valueobject;

import com.aiwolf.enums.RoleType;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(callSuper=true)
public final class Wolf extends Person{

    public Wolf(PersonId personId) {
        super(personId, RoleType.WOLF);
    }
}
