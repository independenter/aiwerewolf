package com.aiwolf.context;

import java.util.concurrent.atomic.AtomicInteger;

public class PersonIdGenerator {

    private static final AtomicInteger counter = new AtomicInteger(1);

    // generate no repeated identifiers
    public static int generateID() {
        return counter.getAndIncrement();
    }
}
