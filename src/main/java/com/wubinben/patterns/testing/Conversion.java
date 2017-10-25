package com.wubinben.patterns.testing;

import java.util.List;

public class Conversion {
    public void convert(List<Item> items, PersistenceFramework persistenceFramework) {
        for (Item item : items) {
            if (item.getName().equals("Ben")) {
                persistenceFramework.setName(item.getName());
                break;
            }
        }
    }
}
