package parser;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserInvoice {

   public static void main(String argv[]) {

    try {

	SAXParserFactory factory = SAXParserFactory.newInstance();
	SAXParser saxParser = factory.newSAXParser();

	DefaultHandler handler = new DefaultHandler() {

	boolean priceID = false;
	boolean locationIDFrom = false;
	boolean locationIDTO = false;
	boolean locationNameFrom = false;
	boolean locationNameTo = false;
	boolean price = false;
	boolean PO = false;
	boolean OrderDate = false;
	boolean OrderID = false;
	boolean customerID = false;
	boolean BillingAddress = false;
	boolean ContactName = false;
	boolean CellNumber = false;
	boolean transactionID = false;
	boolean locationID = false;
	boolean locationCode = false;
	
	public void startElement(String uri, String localName,String qName,
                Attributes attributes) throws SAXException {

		System.out.println("Start Element :" + qName);

		if (qName.equalsIgnoreCase("priceID")) {
			priceID = true;
		}

		if (qName.equalsIgnoreCase("locationIDFrom")) {
			locationIDFrom = true;
		}

		if (qName.equalsIgnoreCase("locationIDTO")) {
			locationIDTO = true;
		}

		if (qName.equalsIgnoreCase("locationNameFrom")) {
			locationNameFrom = true;
		}
		if (qName.equalsIgnoreCase("locationNameTo")) {
			locationNameTo = true;
		}
		if (qName.equalsIgnoreCase("price")) {
			price = true;
		}
		if (qName.equalsIgnoreCase("PO")) {
			PO = true;
		}
		if (qName.equalsIgnoreCase("OrderDate")) {
			OrderDate = true;
		}
		if (qName.equalsIgnoreCase("OrderID")) {
			OrderID = true;
		}
		if (qName.equalsIgnoreCase("customerID")) {
			customerID = true;
		}
		if (qName.equalsIgnoreCase("BillingAddress")) {
			BillingAddress = true;
		}
		if (qName.equalsIgnoreCase("ContactName")) {
			ContactName = true;
		}
		if (qName.equalsIgnoreCase("CellNumber")) {
			CellNumber = true;
		}
		if (qName.equalsIgnoreCase("transactionID")) {
			transactionID = true;
		}
		if (qName.equalsIgnoreCase("locationID")) {
			locationID = true;
		}
		if (qName.equalsIgnoreCase("locationCode")) {
			locationCode = true;
		}
	}

	public void endElement(String uri, String localName,
		String qName) throws SAXException {

		System.out.println("End Element :" + qName);

	}

	public void characters(char ch[], int start, int length) throws SAXException {

		if (priceID) {
			System.out.println("priceID  : " + new String(ch, start, length));
			priceID = false;
		}

		if (locationIDFrom) {
			System.out.println("locationIDFrom  : " + new String(ch, start, length));
			locationIDFrom = false;
		}

		if (locationIDTO) {
			System.out.println("locationIDTO : " + new String(ch, start, length));
			locationIDTO = false;
		}

		if (locationNameFrom) {
			System.out.println("locationNameFrom : " + new String(ch, start, length));
			locationNameFrom = false;
		}
		if (locationNameTo) {
			System.out.println("locationNameTo : " + new String(ch, start, length));
			locationNameTo = false;
		}
		if (price) {
			System.out.println("price : " + new String(ch, start, length));
			price = false;
		}
		if (PO) {
			System.out.println("PO : " + new String(ch, start, length));
			PO = false;
		}
		if (OrderDate) {
			System.out.println("OrderDate : " + new String(ch, start, length));
			OrderDate = false;
		}
		if (OrderID) {
			System.out.println("OrderID : " + new String(ch, start, length));
			OrderID = false;
		}
		if (customerID) {
			System.out.println("customerID : " + new String(ch, start, length));
			customerID = false;
		}
		if (BillingAddress) {
			System.out.println("BillingAddress : " + new String(ch, start, length));
			BillingAddress = false;
		}
		if (ContactName) {
			System.out.println("ContactName : " + new String(ch, start, length));
			ContactName = false;
		}
		if (CellNumber) {
			System.out.println("CellNumber : " + new String(ch, start, length));
			CellNumber = false;
		}
		if (transactionID) {
			System.out.println("transactionID : " + new String(ch, start, length));
			transactionID = false;
		}
		if (locationID) {
			System.out.println("locationID : " + new String(ch, start, length));
			locationID = false;
		}
		if (locationCode) {
			System.out.println("locationCode : " + new String(ch, start, length));
			locationCode = false;
		}

	}

     };

       saxParser.parse("E:\\Study\\Sem1\\510_JP\\Workspace\\WebService\\src\\parser\\Invoice.xml", handler);

     } catch (Exception e) {
       e.printStackTrace();
     }

   }

}