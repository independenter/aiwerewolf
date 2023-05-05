package com.aiwolf.valueobject;

import com.aiwolf.enums.RoleType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper=true)
public final class Witch extends Person{

    public Witch(PersonId personId) {
        super(personId, RoleType.WITCH);
    }
}
