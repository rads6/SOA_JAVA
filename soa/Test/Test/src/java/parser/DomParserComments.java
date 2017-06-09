package parser;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

//import Trucking_Java_Object.comments;

import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class DomParserComments {

  public static void main(String argv[]) {
	  
	//comments comments = new comments();
    try {

	File fXmlFile = new File("C:/Users/gupta/workspace/WebService/XML/comments.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);

	
	doc.getDocumentElement().normalize();

	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

	NodeList nList = doc.getElementsByTagName("record");

	System.out.println("----------------------------");

	for (int temp = 0; temp < nList.getLength(); temp++) {

		Node nNode = nList.item(temp);

		System.out.println("\nCurrent Element :" + nNode.getNodeName());

		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

			Element eElement = (Element) nNode;
			

			System.out.println("commentID : " + eElement.getElementsByTagName("commentID").item(0).getTextContent());
			System.out.println("commentTime : " + eElement.getElementsByTagName("commentTime").item(0).getTextContent());
			System.out.println("comment : " + eElement.getElementsByTagName("comment").item(0).getTextContent());
			System.out.println("ID : " + eElement.getElementsByTagName("ID").item(0).getTextContent());
			System.out.println("Type : " + eElement.getElementsByTagName("Type").item(0).getTextContent());
			
		}
	}
    } catch (Exception e) {
	e.printStackTrace();
    }
  }

}