
package ifpb.pos.soap.pacote;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "PacoteResourcesService", targetNamespace = "http://resources.soap.ativ2.pos.ifpb/", wsdlLocation = "http://localhost:8080/ativ2-soap-server/PacoteResourcesService?wsdl")
public class PacoteResourcesService
    extends Service
{

    private final static URL PACOTERESOURCESSERVICE_WSDL_LOCATION;
    private final static WebServiceException PACOTERESOURCESSERVICE_EXCEPTION;
    private final static QName PACOTERESOURCESSERVICE_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "PacoteResourcesService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ativ2-soap-server/PacoteResourcesService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PACOTERESOURCESSERVICE_WSDL_LOCATION = url;
        PACOTERESOURCESSERVICE_EXCEPTION = e;
    }

    public PacoteResourcesService() {
        super(__getWsdlLocation(), PACOTERESOURCESSERVICE_QNAME);
    }

    public PacoteResourcesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns PacoteResources
     */
    @WebEndpoint(name = "PacoteResourcesPort")
    public PacoteResources getPacoteResourcesPort() {
        return super.getPort(new QName("http://resources.soap.ativ2.pos.ifpb/", "PacoteResourcesPort"), PacoteResources.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PacoteResources
     */
    @WebEndpoint(name = "PacoteResourcesPort")
    public PacoteResources getPacoteResourcesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://resources.soap.ativ2.pos.ifpb/", "PacoteResourcesPort"), PacoteResources.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PACOTERESOURCESSERVICE_EXCEPTION!= null) {
            throw PACOTERESOURCESSERVICE_EXCEPTION;
        }
        return PACOTERESOURCESSERVICE_WSDL_LOCATION;
    }

}