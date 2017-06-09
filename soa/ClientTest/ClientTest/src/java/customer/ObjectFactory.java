
package customer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the customer package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCompanynameResponse_QNAME = new QName("http://customer/", "getCompanynameResponse");
    private final static QName _GetCompanyname_QNAME = new QName("http://customer/", "getCompanyname");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: customer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCompanyname }
     * 
     */
    public GetCompanyname createGetCompanyname() {
        return new GetCompanyname();
    }

    /**
     * Create an instance of {@link GetCompanynameResponse }
     * 
     */
    public GetCompanynameResponse createGetCompanynameResponse() {
        return new GetCompanynameResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompanynameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer/", name = "getCompanynameResponse")
    public JAXBElement<GetCompanynameResponse> createGetCompanynameResponse(GetCompanynameResponse value) {
        return new JAXBElement<GetCompanynameResponse>(_GetCompanynameResponse_QNAME, GetCompanynameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompanyname }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer/", name = "getCompanyname")
    public JAXBElement<GetCompanyname> createGetCompanyname(GetCompanyname value) {
        return new JAXBElement<GetCompanyname>(_GetCompanyname_QNAME, GetCompanyname.class, null, value);
    }

}
