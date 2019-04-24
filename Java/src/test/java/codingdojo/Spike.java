package codingdojo;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import java.io.InputStream;

public class Spike {
    public static void main(String[] args) {

        String filename = "sample_store.xml";
        ClassLoader classLoader = Spike.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(filename);

        try {
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(inputStream);

            XPathFactory xPathfactory = XPathFactory.newInstance();
            XPath xpath = xPathfactory.newXPath();

            String storeClass = xpath.compile("/store/@type").evaluate(document);
            String storeProfile = xpath.compile("/store/profile/text()").evaluate(document);
            String nextEventId = xpath.compile("/store/next_event/text()").evaluate(document);
            String nextEvent = xpath.compile("/store/product[@id='" + nextEventId + "']/text()[3]").evaluate(document);

            System.out.println("Store class: " + storeClass);
            System.out.println("Store profile: " + storeProfile);
            System.out.println("Store next event: " + nextEvent);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
