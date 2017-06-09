package parser;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class DomParserEmployees {

  public static void main(String argv[]) {

    try {
        
        

	File fXmlFile = new File("E:\\Study\\Sem1\\510_JP\\Workspace\\WebService\\src\\parser\\Employees.xml");
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
			

			System.out.println("EmployeeID : " + eElement.getElementsByTagName("EmployeeID").item(0).getTextContent());
			System.out.println("FirstName : " + eElement.getElementsByTagName("FirstName").item(0).getTextContent());
			System.out.println("LastName : " + eElement.getElementsByTagName("LastName").item(0).getTextContent());
			System.out.println("Email : " + eElement.getElementsByTagName("Email").item(0).getTextContent());
			System.out.println("Extension : " + eElement.getElementsByTagName("Extension").item(0).getTextContent());
			System.out.println("HomePhone : " + eElement.getElementsByTagName("HomePhone").item(0).getTextContent());
			System.out.println("CellPhone : " + eElement.getElementsByTagName("CellPhone").item(0).getTextContent());
			System.out.println("jobTitle : " + eElement.getElementsByTagName("jobTitle").item(0).getTextContent());
			System.out.println("SocialSecurityNumber : " + eElement.getElementsByTagName("SocialSecurityNumber").item(0).getTextContent());
			System.out.println("DriverLicenseNumber : " + eElement.getElementsByTagName("DriverLicenseNumber").item(0).getTextContent());
			System.out.println("City : " + eElement.getElementsByTagName("City").item(0).getTextContent());
			System.out.println("State : " + eElement.getElementsByTagName("State").item(0).getTextContent());
			System.out.println("PostalCode : " + eElement.getElementsByTagName("PostalCode").item(0).getTextContent());


		}
	}
    } catch (Exception e) {
	e.printStackTrace();
    }
  }

}