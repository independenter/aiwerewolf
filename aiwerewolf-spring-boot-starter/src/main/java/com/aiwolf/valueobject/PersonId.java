package com.aiwolf.valueobject;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(staticName = "of")
public final class PersonId {

    private final int id;

    public Person getPerson() {
        return null;
    }
}
