package parser;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserComments {

   public static void main(String argv[]) {

    try {

	SAXParserFactory factory = SAXParserFactory.newInstance();
	SAXParser saxParser = factory.newSAXParser();

	DefaultHandler handler = new DefaultHandler() {

	boolean commentID = false;
	boolean commentTime = false;
	boolean comment = false;
	boolean ID = false;
	boolean Type = false;
	

	public void startElement(String uri, String localName,String qName,
                Attributes attributes) throws SAXException {

		System.out.println("Start Element :" + qName);

		if (qName.equalsIgnoreCase("commentID")) {
			commentID = true;
		}

		if (qName.equalsIgnoreCase("commentTime")) {
			commentTime = true;
		}

		if (qName.equalsIgnoreCase("comment")) {
			comment = true;
		}

		if (qName.equalsIgnoreCase("ID")) {
			ID = true;
		}
		if (qName.equalsIgnoreCase("Type")) {
			Type = true;
		}
		
	}

	public void endElement(String uri, String localName,
		String qName) throws SAXException {

		System.out.println("End Element :" + qName);

	}

	public void characters(char ch[], int start, int length) throws SAXException {

		if (commentID) {
			System.out.println("commentID : " + new String(ch, start, length));
			commentID = false;
		}

		if (commentTime) {
			System.out.println("commentType : " + new String(ch, start, length));
			commentTime = false;
		}

		if (comment) {
			System.out.println("comment : " + new String(ch, start, length));
			comment = false;
		}

		if (ID) {
			System.out.println("ID : " + new String(ch, start, length));
			ID = false;
		}
		if (Type) {
			System.out.println("Type : " + new String(ch, start, length));
			Type = false;
		}
		
	}

     };

       saxParser.parse("C:/Users/gupta/workspace/WebService/XML/comments.xml", handler);

     } catch (Exception e) {
       e.printStackTrace();
     }

   }

}