package com.aiwolf.valueobject;

import com.aiwolf.enums.RoleType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper=true)
public final class Commoner extends Person{

    public Commoner(PersonId personId) {
        super(personId, RoleType.COMMONER);
    }
}
