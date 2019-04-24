package codingdojo.option1;

import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.assertEquals;

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
    public void parseStoreType() throws Exception {
        EventParser eventParser = new EventParser(inputStream);
        String storeClass = eventParser.getStoreType();
        assertEquals("boutique", storeClass);
    }

    @Test
    public void parseProfile() throws Exception {
        EventParser eventParser = new EventParser(inputStream);
        long profile = eventParser.getProfile();
        assertEquals(2342534656L, profile);
    }

    @Test
    public void parseEventName() throws Exception {
        EventParser eventParser = new EventParser(inputStream);
        String nextEvent = eventParser.getEventName();
        assertEquals("Eyeshadow Masterclass", nextEvent);
    }


    @Test
    public void parseNextEvent() throws Exception {
        EventParser eventParser = new EventParser(inputStream);
        StoreEvent nextEvent = eventParser.getNextEvent();
        assertEquals("boutique", event.getStoreType());
        assertEquals(2342534656L, event.getStoreProfile());
        assertEquals("Eyeshadow Masterclass", nextEvent.getName());
    }

    */
}
