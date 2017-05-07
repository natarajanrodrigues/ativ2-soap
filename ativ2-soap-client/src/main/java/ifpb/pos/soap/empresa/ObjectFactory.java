
package ifpb.pos.soap.empresa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ifpb.pos.soap.empresa package. 
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

    private final static QName _ListarHoteis_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "listarHoteis");
    private final static QName _GetEmpersa_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "getEmpersa");
    private final static QName _GetEmpersaResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "getEmpersaResponse");
    private final static QName _Empresa_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "empresa");
    private final static QName _AddEmpresaResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "addEmpresaResponse");
    private final static QName _DeleteEmpresa_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "deleteEmpresa");
    private final static QName _ListarHoteisResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "listarHoteisResponse");
    private final static QName _DeleteEmpresaResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "deleteEmpresaResponse");
    private final static QName _Hotel_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "hotel");
    private final static QName _AddEmpresa_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "addEmpresa");
    private final static QName _UpdateEmpresa_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "updateEmpresa");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ifpb.pos.soap.empresa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmpersa }
     * 
     */
    public GetEmpersa createGetEmpersa() {
        return new GetEmpersa();
    }

    /**
     * Create an instance of {@link GetEmpersaResponse }
     * 
     */
    public GetEmpersaResponse createGetEmpersaResponse() {
        return new GetEmpersaResponse();
    }

    /**
     * Create an instance of {@link ListarHoteis }
     * 
     */
    public ListarHoteis createListarHoteis() {
        return new ListarHoteis();
    }

    /**
     * Create an instance of {@link DeleteEmpresaResponse }
     * 
     */
    public DeleteEmpresaResponse createDeleteEmpresaResponse() {
        return new DeleteEmpresaResponse();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link AddEmpresa }
     * 
     */
    public AddEmpresa createAddEmpresa() {
        return new AddEmpresa();
    }

    /**
     * Create an instance of {@link UpdateEmpresa }
     * 
     */
    public UpdateEmpresa createUpdateEmpresa() {
        return new UpdateEmpresa();
    }

    /**
     * Create an instance of {@link Empresa }
     * 
     */
    public Empresa createEmpresa() {
        return new Empresa();
    }

    /**
     * Create an instance of {@link AddEmpresaResponse }
     * 
     */
    public AddEmpresaResponse createAddEmpresaResponse() {
        return new AddEmpresaResponse();
    }

    /**
     * Create an instance of {@link DeleteEmpresa }
     * 
     */
    public DeleteEmpresa createDeleteEmpresa() {
        return new DeleteEmpresa();
    }

    /**
     * Create an instance of {@link ListarHoteisResponse }
     * 
     */
    public ListarHoteisResponse createListarHoteisResponse() {
        return new ListarHoteisResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarHoteis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "listarHoteis")
    public JAXBElement<ListarHoteis> createListarHoteis(ListarHoteis value) {
        return new JAXBElement<ListarHoteis>(_ListarHoteis_QNAME, ListarHoteis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmpersa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "getEmpersa")
    public JAXBElement<GetEmpersa> createGetEmpersa(GetEmpersa value) {
        return new JAXBElement<GetEmpersa>(_GetEmpersa_QNAME, GetEmpersa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmpersaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "getEmpersaResponse")
    public JAXBElement<GetEmpersaResponse> createGetEmpersaResponse(GetEmpersaResponse value) {
        return new JAXBElement<GetEmpersaResponse>(_GetEmpersaResponse_QNAME, GetEmpersaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Empresa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "empresa")
    public JAXBElement<Empresa> createEmpresa(Empresa value) {
        return new JAXBElement<Empresa>(_Empresa_QNAME, Empresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmpresaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "addEmpresaResponse")
    public JAXBElement<AddEmpresaResponse> createAddEmpresaResponse(AddEmpresaResponse value) {
        return new JAXBElement<AddEmpresaResponse>(_AddEmpresaResponse_QNAME, AddEmpresaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmpresa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "deleteEmpresa")
    public JAXBElement<DeleteEmpresa> createDeleteEmpresa(DeleteEmpresa value) {
        return new JAXBElement<DeleteEmpresa>(_DeleteEmpresa_QNAME, DeleteEmpresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarHoteisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "listarHoteisResponse")
    public JAXBElement<ListarHoteisResponse> createListarHoteisResponse(ListarHoteisResponse value) {
        return new JAXBElement<ListarHoteisResponse>(_ListarHoteisResponse_QNAME, ListarHoteisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmpresaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "deleteEmpresaResponse")
    public JAXBElement<DeleteEmpresaResponse> createDeleteEmpresaResponse(DeleteEmpresaResponse value) {
        return new JAXBElement<DeleteEmpresaResponse>(_DeleteEmpresaResponse_QNAME, DeleteEmpresaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "hotel")
    public JAXBElement<Hotel> createHotel(Hotel value) {
        return new JAXBElement<Hotel>(_Hotel_QNAME, Hotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmpresa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "addEmpresa")
    public JAXBElement<AddEmpresa> createAddEmpresa(AddEmpresa value) {
        return new JAXBElement<AddEmpresa>(_AddEmpresa_QNAME, AddEmpresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmpresa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "updateEmpresa")
    public JAXBElement<UpdateEmpresa> createUpdateEmpresa(UpdateEmpresa value) {
        return new JAXBElement<UpdateEmpresa>(_UpdateEmpresa_QNAME, UpdateEmpresa.class, null, value);
    }

}
