package codingdojo.option2;

import org.junit.Before;

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

//    @Test
//    public void parseStoreType() throws Exception {
//        EventParser eventParser = new codingdojo.option2.EventParser(inputStream);
//        String storeClass = eventParser.getStoreType();
//        assertEquals("boutique", storeClass);
//    }
//
//    @Test
//    public void parseProfile() throws Exception {
//        EventParser eventParser = new codingdojo.option2.EventParser(inputStream);
//        long profile = eventParser.getProfile();
//        assertEquals(2342534656L, profile);
//    }
//
//    @Test
//    public void parseEventName() throws Exception {
//        EventParser eventParser = new codingdojo.option2.EventParser(inputStream);
//        String nextEvent = eventParser.getEventName();
//        assertEquals("Eyeshadow Masterclass", nextEvent);
//    }
//
//
//    @Test
//    public void parseNextEvent() throws Exception {
//        EventParser eventParser = new codingdojo.option2.EventParser(inputStream);
//        StoreEvent event = eventParser.getNextEvent();
//        assertEquals("boutique", event.getStoreType());
//        assertEquals(2342534656L, event.getStoreProfile());
//        assertEquals("Eyeshadow Masterclass", event.getName());
//    }


}
