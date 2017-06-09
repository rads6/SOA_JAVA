/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webServices;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import parser.SaxParserCustomers;

/**
 *
 * @author radhika
 */
@WebService(serviceName = "CustID")
public class CustID {
SaxParserCustomers cid= new SaxParserCustomers();
    /**
     * This is a sample web service operation
     * @param booleanCustomerID
     * @return 
     */
    @WebMethod(operationName = "GetCustID")
    public List<String> getCustID (boolean booleanCustomerID){
        return cid.getCustomerID(booleanCustomerID);
    }
}
