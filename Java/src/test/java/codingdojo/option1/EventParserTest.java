package codingdojo.option1;

import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EventParserTest {

    private InputStream inputStream;

    @Before
    public void setUp() {
        String filename = "sample_store.xml";
        ClassLoader classLoader = EventParserTest.class.getClassLoader();
        inputStream = classLoader.getResourceAsStream(filename);

    }

    @Test
    public void parseEventNames() {
        EventParser eventParser = new EventParser(inputStream);
        List<String> eventNames = eventParser.getEvents();
        List<String> expected = Arrays.asList("Makeover", "Eyeshadow Masterclass");
        assertEquals(expected, eventNames);
    }

    @Test
    public void parseEventPrices() {
        EventParser eventParser = new EventParser(inputStream);
        List<Price> eventPrices = eventParser.getPrices();
        List<Price> expected = Arrays.asList(new Price(149.99, "EUR"),
                new Price(119.99, "EUR"));
        assertEquals(expected, eventPrices);
    }
}
