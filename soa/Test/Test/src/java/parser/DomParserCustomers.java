/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

//import Trucking_Java_Object.Customers;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;


public class DomParserCustomers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Customers cust =new Customers();
        try {

            File fXmlFile = new File("S:\\SOA\\NetBeansProjects\\Test\\src\\java\\XML\\Customers.xml");
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
                    System.out.println("CustomerID : " + eElement.getElementsByTagName("CustomerID").item(0).getTextContent());
                    System.out.println("BusinessName : " + eElement.getElementsByTagName("BusinessName").item(0).getTextContent());
                    System.out.println("BillingAddress : " + eElement.getElementsByTagName("BillingAddress").item(0).getTextContent());
                    System.out.println("City : " + eElement.getElementsByTagName("City").item(0).getTextContent());
                    System.out.println("StateOrProvince : " + eElement.getElementsByTagName("StateOrProvince").item(0).getTextContent());
                    System.out.println("PostalCode : " + eElement.getElementsByTagName("PostalCode").item(0).getTextContent());
                    System.out.println("PhoneNumber : " + eElement.getElementsByTagName("PhoneNumber").item(0).getTextContent());
                    System.out.println("CellNumber : " + eElement.getElementsByTagName("CellNumber").item(0).getTextContent());
                    System.out.println("EmailAddress : " + eElement.getElementsByTagName("EmailAddress").item(0).getTextContent());
                    System.out.println("CustomerType : " + eElement.getElementsByTagName("CompanyName").item(0).getTextContent());
                    System.out.println("CompanyName : " + eElement.getElementsByTagName("CompanyName").item(0).getTextContent());
                    System.out.println("ContactName : " + eElement.getElementsByTagName("ContactName").item(0).getTextContent());
                    System.out.println("DateEntered : " + eElement.getElementsByTagName("DateEntered").item(0).getTextContent());

                }
            }
        } catch (IOException | NumberFormatException | ParserConfigurationException | DOMException | SAXException e) {
        }

    }

    public ArrayList<String> getCompanyList() {

        ArrayList<String> myList = new ArrayList<String>();
        try {

            File fXmlFile = new File("S:\\SOA\\NetBeansProjects\\Test\\src\\java\\XML\\Customers.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();

//	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("record");

            //System.out.println("----------------------------");
            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                //System.out.println("\nCurrent Element :" + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

//                      
                    myList.add(eElement.getElementsByTagName("CompanyName").item(0).getTextContent());

                }
            }
        } catch (IOException | NumberFormatException | ParserConfigurationException | DOMException | SAXException e) {
        }

        return myList;
    }

    public static List<String> getCompanyname() {
        char ch[] = null;
        int start = 0;
        int length = 0;
        List<String> comp_name = new ArrayList<>();
        // comp_name.add("CompanyName : " + new String(ch, start, length));
        comp_name.add("world!");
        return comp_name;

    }

}
