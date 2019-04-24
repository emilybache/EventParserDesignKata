package codingdojo.option2;

import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class EventParserTest {

    private InputStream inputStream;

    @Before
    public void setUp() {
        String filename = "sample_store.xml";
        ClassLoader classLoader = EventParserTest.class.getClassLoader();
        inputStream = classLoader.getResourceAsStream(filename);

    }
/*
    @Test
    public void parseNextEvent() {
        StoreEvent event = new EventParser().parse(inputStream);
        assertEquals("boutique", event.getStoreType());
        assertEquals(2342534656L, event.getStoreProfile());
        assertEquals("Eyeshadow Masterclass", event.getName());
    }

    */
}
