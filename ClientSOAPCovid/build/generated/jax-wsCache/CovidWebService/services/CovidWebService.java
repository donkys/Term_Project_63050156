
package services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CovidWebService", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CovidWebService {


    /**
     * 
     * @param id
     * @return
     *     returns services.Covidall
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findCovidById", targetNamespace = "http://services/", className = "services.FindCovidById")
    @ResponseWrapper(localName = "findCovidByIdResponse", targetNamespace = "http://services/", className = "services.FindCovidByIdResponse")
    @Action(input = "http://services/CovidWebService/findCovidByIdRequest", output = "http://services/CovidWebService/findCovidByIdResponse")
    public Covidall findCovidById(
        @WebParam(name = "id", targetNamespace = "")
        int id);

}
