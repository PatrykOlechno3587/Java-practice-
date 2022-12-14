package com.ProjectwithInterface;

import java.math.BigDecimal;
import java.util.function.Consumer;

public class MyConsumer {
    public void comsumeConsumer(Consumer<String> c ) {
        c.accept("Myconsumer");

    }
}
