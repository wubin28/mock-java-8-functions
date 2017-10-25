package com.wubinben.patterns.testing;

import java.util.List;
import java.util.function.Consumer;

public class Conversion {
    public void convert(List<Item> items, Consumer<Item> consumer) {
        for (Item item : items) {
            if (item.getName().equals("Ben")) {
                consumer.accept(item);
                break;
            }
        }
    }
}
