package codingdojo.option1;

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
//    public void parseNextEvent() throws Exception {
//        StoreEvent event = new codingdojo.option1.EventParser().parse(inputStream);
//        assertEquals("boutique", event.getStoreType());
//        assertEquals(2342534656L, event.getStoreProfile());
//        assertEquals("Eyeshadow Masterclass", event.getName());
//    }


}
