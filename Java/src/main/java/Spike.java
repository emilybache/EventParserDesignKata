import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.InputStream;

public class Spike {
    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = Spike.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("sample_store.xml");

        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(inputStream);

        XPath xPath =  XPathFactory.newInstance().newXPath();

        NodeList productNodes = (NodeList) xPath.compile("/store/product/text()[2]").evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < productNodes.getLength(); i ++) {
            Node node = productNodes.item(i);
            System.out.println("Found product: " + node.getTextContent().trim());
        }

        productNodes = (NodeList) xPath.compile("/store/product").evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < productNodes.getLength(); i ++) {
            Node node = productNodes.item(i);
            System.out.println("Found product location: " + node.getAttributes().getNamedItem("location"));
        }

        NodeList priceNodes = (NodeList) xPath.compile("/store/product/price").evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < priceNodes.getLength(); i ++) {
            Node node = priceNodes.item(i);
            System.out.println("Found product price: " + node.getTextContent());
            System.out.println("Found product currency: " + node.getAttributes().getNamedItem("currency"));

        }

    }
}
