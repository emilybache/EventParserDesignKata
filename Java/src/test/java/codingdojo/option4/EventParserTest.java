package codingdojo.option4;

import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class EventParserTest {

    private InputStream inputStream;

    @Before
    public void setUp() {
        String filename = "sample_store.xml";
        ClassLoader classLoader = codingdojo.option1.EventParserTest.class.getClassLoader();
        inputStream = classLoader.getResourceAsStream(filename);

    }
//    @Test
//    public void createEventList() {
//        List<StoreEvent> events = new EventParser(inputStream).getEvents();
//        List<StoreEvent> expected = Arrays.asList(
//                new StoreEvent("Makeover", new Price(149.99, "EUR")),
//                new StoreEvent("Eyeshadow Masterclass", new Price(119.99, "EUR"))
//                );
//        assertEquals(expected, events);
//    }
}
