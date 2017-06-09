package parser;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserExpenses {

   public static void main(String argv[]) {

    try {

	SAXParserFactory factory = SAXParserFactory.newInstance();
	SAXParser saxParser = factory.newSAXParser();

	DefaultHandler handler = new DefaultHandler() {

	boolean ExpenseID = false;
	boolean EmployeeID = false;
	boolean ExpenseType = false;
	boolean PurposeofExpense = false;
	boolean AmountSpent = false;
	boolean Description = false;
	boolean DatePurchased = false;
	boolean DateSubmitted = false;
	boolean AdvanceAmount = false;
	boolean PaymentMethod = false;
	
	
	public void startElement(String uri, String localName,String qName,
                Attributes attributes) throws SAXException {

		System.out.println("Start Element :" + qName);

		if (qName.equalsIgnoreCase("ExpenseID")) {
			ExpenseID = true;
		}

		if (qName.equalsIgnoreCase("EmployeeID")) {
			EmployeeID = true;
		}

		if (qName.equalsIgnoreCase("ExpenseType")) {
			ExpenseType = true;
		}

		if (qName.equalsIgnoreCase("PurposeofExpense")) {
			PurposeofExpense = true;
		}
		if (qName.equalsIgnoreCase("AmountSpent")) {
			AmountSpent = true;
		}
		if (qName.equalsIgnoreCase("Description")) {
			Description = true;
		}
		if (qName.equalsIgnoreCase("DatePurchased")) {
			DatePurchased = true;
		}
		if (qName.equalsIgnoreCase("DateSubmitted")) {
			DateSubmitted = true;
		}
		if (qName.equalsIgnoreCase("AdvanceAmount")) {
			AdvanceAmount = true;
		}
		if (qName.equalsIgnoreCase("PaymentMethod")) {
			PaymentMethod = true;
		}
		
	}

	public void endElement(String uri, String localName,
		String qName) throws SAXException {

		System.out.println("End Element :" + qName);

	}

	public void characters(char ch[], int start, int length) throws SAXException {

		if (ExpenseID) {
			System.out.println("ExpenseID  : " + new String(ch, start, length));
			ExpenseID = false;
		}

		if (EmployeeID) {
			System.out.println("EmployeeID  : " + new String(ch, start, length));
			EmployeeID = false;
		}

		if (ExpenseType) {
			System.out.println("ExpenseType : " + new String(ch, start, length));
			ExpenseType = false;
		}

		if (PurposeofExpense) {
			System.out.println("PurposeofExpense : " + new String(ch, start, length));
			PurposeofExpense = false;
		}
		if (AmountSpent) {
			System.out.println("AmountSpent : " + new String(ch, start, length));
			AmountSpent = false;
		}
		if (Description) {
			System.out.println("Description : " + new String(ch, start, length));
			Description = false;
		}
		if (DatePurchased) {
			System.out.println("DatePurchased : " + new String(ch, start, length));
			DatePurchased = false;
		}
		if (DateSubmitted) {
			System.out.println("DateSubmitted : " + new String(ch, start, length));
			DateSubmitted = false;
		}
		if (AdvanceAmount) {
			System.out.println("AdvanceAmount : " + new String(ch, start, length));
			AdvanceAmount = false;
		}
		if (PaymentMethod) {
			System.out.println("PaymentMethod : " + new String(ch, start, length));
			PaymentMethod = false;
		}



	}

     };

       saxParser.parse("E:\\Study\\Sem1\\510_JP\\Workspace\\WebService\\src\\parser\\Trucks.xml", handler);

     } catch (Exception e) {
       e.printStackTrace();
     }

   }

}