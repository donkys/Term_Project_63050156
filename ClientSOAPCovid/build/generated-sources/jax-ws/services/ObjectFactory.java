
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _FindCovidByIdResponse_QNAME = new QName("http://services/", "findCovidByIdResponse");
    private final static QName _FindCovidById_QNAME = new QName("http://services/", "findCovidById");
    private final static QName _Covidall_QNAME = new QName("http://services/", "covidall");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindCovidById }
     * 
     */
    public FindCovidById createFindCovidById() {
        return new FindCovidById();
    }

    /**
     * Create an instance of {@link Covidall }
     * 
     */
    public Covidall createCovidall() {
        return new Covidall();
    }

    /**
     * Create an instance of {@link FindCovidByIdResponse }
     * 
     */
    public FindCovidByIdResponse createFindCovidByIdResponse() {
        return new FindCovidByIdResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCovidByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findCovidByIdResponse")
    public JAXBElement<FindCovidByIdResponse> createFindCovidByIdResponse(FindCovidByIdResponse value) {
        return new JAXBElement<FindCovidByIdResponse>(_FindCovidByIdResponse_QNAME, FindCovidByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCovidById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findCovidById")
    public JAXBElement<FindCovidById> createFindCovidById(FindCovidById value) {
        return new JAXBElement<FindCovidById>(_FindCovidById_QNAME, FindCovidById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Covidall }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "covidall")
    public JAXBElement<Covidall> createCovidall(Covidall value) {
        return new JAXBElement<Covidall>(_Covidall_QNAME, Covidall.class, null, value);
    }

}
