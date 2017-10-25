package com.wubinben.patterns.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {
    public void convert(List<Item> items, Consumer<Item> itemConsumer) {
        Conversion conversion = new Conversion();
        conversion.convert(items, itemConsumer);
    }

    public void perform() {
        PersistenceFramework persistenceFramework = new PersistenceFramework();
        List<Item> items = new ArrayList<>();
        convert(items, item -> persistenceFramework.setName(item.getName()));
    }
}
