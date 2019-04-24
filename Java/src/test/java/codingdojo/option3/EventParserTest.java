package codingdojo.option3;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class EventParserTest {

    private Document document;

    @Before
    public void setUp() throws ParserConfigurationException, IOException, SAXException {
        String filename = "sample_store.xml";
        ClassLoader classLoader = EventParserTest.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(filename);

    }

    /*
    @Test
    public void parseStoreType() throws Exception {
        String storeClass = EventParser.getStoreType(inputStream);
        assertEquals("boutique", storeClass);
    }

    @Test
    public void parseProfile() throws Exception {
        long profile = EventParser.getProfile(inputStream);
        assertEquals(2342534656L, profile);
    }

    @Test
    public void parseEventName() throws Exception {
        String nextEvent = EventParser.getNextEvent(inputStream);
        assertEquals("Eyeshadow Masterclass", nextEvent);
    }

    @Test
    public void parseEvent() throws Exception {
        StoreEvent event = EventParser.parse(inputStream);
        assertEquals("boutique", event.getStoreType());
        assertEquals(2342534656L, event.getStoreProfile());
        assertEquals("Eyeshadow Masterclass", event.getName());
    }
    */
}
