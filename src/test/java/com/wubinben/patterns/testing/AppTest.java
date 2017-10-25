package com.wubinben.patterns.testing;

import org.junit.Test;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AppTest {
    @Test
    public void the_function_should_be_called_if_Ben_is_in_the_list() {
        App app = new App();
        List<Item> items = new ArrayList<>();
        Item item = new Item("Ben");
        items.add(item);
        Consumer<Item> mockConsumer = mock(Consumer.class);
        app.convert(items, mockConsumer);
        verify(mockConsumer).accept(any());
    }
}