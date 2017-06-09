/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;
import parser.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserCustomers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         try {

	SAXParserFactory factory = SAXParserFactory.newInstance();
	SAXParser saxParser = factory.newSAXParser();

	DefaultHandler handler;
             handler = new DefaultHandler() {
                 
                 boolean customerID = false;
                 boolean businessname = false;
                 boolean billingaddress = false;
                 boolean city = false;
                 boolean stateorprovince = false;
                 boolean postalcode = false;
                 boolean phonenumber = false;
                 boolean cellnumber = false;
                 boolean emailaddress = false;
                 boolean customertype = false;
                 boolean companyname = false;
                 boolean contactname = false;
                 boolean dateentered = false;
                 
                 
                 
                 public void startElement(String uri, String localName,String qName,
                         Attributes attributes) throws SAXException {
                     
                    System.out.println("Start Element :" + qName);
                     
                     if (qName.equalsIgnoreCase("CustomerID")) {
                         customerID = true;
                     }
                     
                     if (qName.equalsIgnoreCase("BusinessName")) {
                         businessname = true;
                     }
                     
                     if (qName.equalsIgnoreCase("BillingAddress")) {
                         billingaddress = true;
                     }
                     
                     if (qName.equalsIgnoreCase("City")) {
                         city = true;
                     }
                     if (qName.equalsIgnoreCase("StateOrProvince")) {
                         stateorprovince = true;
                     }
                     if (qName.equalsIgnoreCase("PostalCode")) {
                         postalcode = true;
                     }
                     if (qName.equalsIgnoreCase("PhoneNumber")) {
                         phonenumber = true;
                     }
                     if (qName.equalsIgnoreCase("CellNumber")) {
                         cellnumber = true;
                     }
                     if (qName.equalsIgnoreCase("EmailAddress")) {
                         emailaddress = true;
                     }
                     if (qName.equalsIgnoreCase("CustomerType")) {
                         customertype = true;
                     }
                     if (qName.equalsIgnoreCase("CompanyName")) {
                         companyname = true;
                     }
                     if (qName.equalsIgnoreCase("ContactName")) {
                         contactname = true;
                     }
                     if (qName.equalsIgnoreCase("DateEntered")) {
                         dateentered = true;
                     }
                     
                     
                 }
                
                 public void endElement(String uri, String localName,
                         String qName) throws SAXException {
                     
                     System.out.println("End Element :" + qName);
                     
                 }
                 
                 
                 public void characters(char ch[], int start, int length) throws SAXException {
                 
                 if (customerID) {
                 System.out.println("CustomerID : " + new String(ch, start, length));
                 customerID = false;
                 }
                 
                 if (businessname) {
                 System.out.println("BusinessName : " + new String(ch, start, length));
                 businessname = false;
                 }
                 
                 if (billingaddress) {
                 System.out.println("BillingAddress : " + new String(ch, start, length));
                 billingaddress = false;
                 }
                 
                 if (city) {
                 System.out.println("City : " + new String(ch, start, length));
                 city = false;
                 }
                 if (stateorprovince) {
                 System.out.println("StateOrProvince : " + new String(ch, start, length));
                 stateorprovince = false;
                 }
                 if (postalcode) {
                 System.out.println("PostalCode : " + new String(ch, start, length));
                 postalcode = false;
                 }
                 if (phonenumber) {
                 System.out.println("PhoneNumber : " + new String(ch, start, length));
                 phonenumber = false;
                 }
                 if (cellnumber) {
                 System.out.println("CellNumber : " + new String(ch, start, length));
                 cellnumber = false;
                 }
                 if (emailaddress) {
                 System.out.println("EmailAddress : " + new String(ch, start, length));
                 emailaddress = false;
                 }
                 if (customertype) {
                 System.out.println("CustomerType : " + new String(ch, start, length));
                 customertype = false;
                 }
                 if (companyname) {
                 System.out.println("CompanyName : " + new String(ch, start, length));
                 companyname = false;
                 }
                 if (contactname) {
                 System.out.println("ContactName : " + new String(ch, start, length));
                 contactname = false;
                 }
                 if (dateentered) {
                 System.out.println("DateEntered : " + new String(ch, start, length));
                 dateentered = false;
                 }
          
                 
                 
                 }
                 
                               
                 
             };
             
            

       saxParser.parse("S:\\SOA\\NetBeansProjects\\Test\\src\\java\\XML\\Customers.xml", handler);

     } catch (IOException | ParserConfigurationException | SAXException e) {
         
        
     }
         

   }


        // TODO code application logic here
    public List<String> getCustomerID(boolean customerID){
        char ch[] = null; 
        int start = 0;
        int length = 0;
        List <String> custID =new ArrayList<>();
       //custID.add(new String(ch, start, length));
        if (customerID) {
                 custID.add(new String(ch, start, length));
                 customerID = false;
                 }
//        comp_name.add("world!");


        return custID;
        
        
    }
    

}
