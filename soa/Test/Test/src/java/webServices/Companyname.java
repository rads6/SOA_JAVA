/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webServices;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import parser.DomParserCustomers;
import parser.SaxParserCustomers;
import model.Company;
import dao.CompanyModelDAO;
import java.io.PrintStream;

/**
 *
 * @author Radhika
 */
@WebService(serviceName = "Companyname")
public class Companyname {

    /**
     * This is a sample web service operation
     *
     * @param txt
     * @return
     */
//    @WebMethod(operationName = "hello")
//    public String hello(@WebParam(name = "name") String txt) {
//        return "Hello " + txt + " !";
//    }
    DomParserCustomers sx_c = new DomParserCustomers();
    CompanyModelDAO dao = new CompanyModelDAO();

    /**
     *
     * @return
     */
    @WebMethod
    public ArrayList<String> getCompanyname() {

        List<Company> myList = new ArrayList<Company>();
        ArrayList<String> cname = new ArrayList<String>();
        try {
            myList = dao.getAllList();

            for (Company temp : myList) {
                System.out.println(temp.getCompany_Name());
                cname.add(temp.getCompany_Name());

            }
        } catch (Exception e) {

        }

//     return sx_c.getCompanyList();
        return cname;

    }
}
