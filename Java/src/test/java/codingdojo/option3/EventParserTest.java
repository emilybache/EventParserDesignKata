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
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EventParserTest {

    private Document document;

    @Before
    public void setUp() throws ParserConfigurationException, IOException, SAXException {
        String filename = "sample_store.xml";
        ClassLoader classLoader = codingdojo.option1.EventParserTest.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(filename);

        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
        document = documentBuilder.parse(inputStream);

    }

//    @Test
//    public void parseEventNames() {
//        List<String> eventNames = EventParser.getEvents(document);
//        List<String> expected = Arrays.asList("Makeover", "Eyeshadow Masterclass");
//        assertEquals(expected, eventNames);
//    }
//
//    @Test
//    public void parseEventPrices() {
//        List<Price> eventPrices = EventParser.getPrices(document);
//        List<Price> expected = Arrays.asList(new Price(149.99, "EUR"),
//                new Price(119.99, "EUR"));
//        assertEquals(expected, eventPrices);
//    }
}
