
package ifpb.pos.soap.reservapassagem;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ifpb.pos.soap.reservapassagem package. 
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

    private final static QName _DeleteReservaResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "deleteReservaResponse");
    private final static QName _ListarReservasPassagemResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "listarReservasPassagemResponse");
    private final static QName _AddReservaPassagem_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "addReservaPassagem");
    private final static QName _ReservaPassagem_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "reservaPassagem");
    private final static QName _UpdateReserva_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "updateReserva");
    private final static QName _ListarReservasPassagem_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "listarReservasPassagem");
    private final static QName _DeleteReserva_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "deleteReserva");
    private final static QName _GetReserva_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "getReserva");
    private final static QName _UpdateReservaResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "updateReservaResponse");
    private final static QName _AddReservaPassagemResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "addReservaPassagemResponse");
    private final static QName _GetReservaResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "getReservaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ifpb.pos.soap.reservapassagem
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarReservasPassagem }
     * 
     */
    public ListarReservasPassagem createListarReservasPassagem() {
        return new ListarReservasPassagem();
    }

    /**
     * Create an instance of {@link DeleteReserva }
     * 
     */
    public DeleteReserva createDeleteReserva() {
        return new DeleteReserva();
    }

    /**
     * Create an instance of {@link GetReserva }
     * 
     */
    public GetReserva createGetReserva() {
        return new GetReserva();
    }

    /**
     * Create an instance of {@link DeleteReservaResponse }
     * 
     */
    public DeleteReservaResponse createDeleteReservaResponse() {
        return new DeleteReservaResponse();
    }

    /**
     * Create an instance of {@link ListarReservasPassagemResponse }
     * 
     */
    public ListarReservasPassagemResponse createListarReservasPassagemResponse() {
        return new ListarReservasPassagemResponse();
    }

    /**
     * Create an instance of {@link AddReservaPassagem }
     * 
     */
    public AddReservaPassagem createAddReservaPassagem() {
        return new AddReservaPassagem();
    }

    /**
     * Create an instance of {@link ReservaPassagem }
     * 
     */
    public ReservaPassagem createReservaPassagem() {
        return new ReservaPassagem();
    }

    /**
     * Create an instance of {@link UpdateReserva }
     * 
     */
    public UpdateReserva createUpdateReserva() {
        return new UpdateReserva();
    }

    /**
     * Create an instance of {@link GetReservaResponse }
     * 
     */
    public GetReservaResponse createGetReservaResponse() {
        return new GetReservaResponse();
    }

    /**
     * Create an instance of {@link UpdateReservaResponse }
     * 
     */
    public UpdateReservaResponse createUpdateReservaResponse() {
        return new UpdateReservaResponse();
    }

    /**
     * Create an instance of {@link AddReservaPassagemResponse }
     * 
     */
    public AddReservaPassagemResponse createAddReservaPassagemResponse() {
        return new AddReservaPassagemResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "deleteReservaResponse")
    public JAXBElement<DeleteReservaResponse> createDeleteReservaResponse(DeleteReservaResponse value) {
        return new JAXBElement<DeleteReservaResponse>(_DeleteReservaResponse_QNAME, DeleteReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarReservasPassagemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "listarReservasPassagemResponse")
    public JAXBElement<ListarReservasPassagemResponse> createListarReservasPassagemResponse(ListarReservasPassagemResponse value) {
        return new JAXBElement<ListarReservasPassagemResponse>(_ListarReservasPassagemResponse_QNAME, ListarReservasPassagemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservaPassagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "addReservaPassagem")
    public JAXBElement<AddReservaPassagem> createAddReservaPassagem(AddReservaPassagem value) {
        return new JAXBElement<AddReservaPassagem>(_AddReservaPassagem_QNAME, AddReservaPassagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservaPassagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "reservaPassagem")
    public JAXBElement<ReservaPassagem> createReservaPassagem(ReservaPassagem value) {
        return new JAXBElement<ReservaPassagem>(_ReservaPassagem_QNAME, ReservaPassagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "updateReserva")
    public JAXBElement<UpdateReserva> createUpdateReserva(UpdateReserva value) {
        return new JAXBElement<UpdateReserva>(_UpdateReserva_QNAME, UpdateReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarReservasPassagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "listarReservasPassagem")
    public JAXBElement<ListarReservasPassagem> createListarReservasPassagem(ListarReservasPassagem value) {
        return new JAXBElement<ListarReservasPassagem>(_ListarReservasPassagem_QNAME, ListarReservasPassagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "deleteReserva")
    public JAXBElement<DeleteReserva> createDeleteReserva(DeleteReserva value) {
        return new JAXBElement<DeleteReserva>(_DeleteReserva_QNAME, DeleteReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "getReserva")
    public JAXBElement<GetReserva> createGetReserva(GetReserva value) {
        return new JAXBElement<GetReserva>(_GetReserva_QNAME, GetReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "updateReservaResponse")
    public JAXBElement<UpdateReservaResponse> createUpdateReservaResponse(UpdateReservaResponse value) {
        return new JAXBElement<UpdateReservaResponse>(_UpdateReservaResponse_QNAME, UpdateReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservaPassagemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "addReservaPassagemResponse")
    public JAXBElement<AddReservaPassagemResponse> createAddReservaPassagemResponse(AddReservaPassagemResponse value) {
        return new JAXBElement<AddReservaPassagemResponse>(_AddReservaPassagemResponse_QNAME, AddReservaPassagemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "getReservaResponse")
    public JAXBElement<GetReservaResponse> createGetReservaResponse(GetReservaResponse value) {
        return new JAXBElement<GetReservaResponse>(_GetReservaResponse_QNAME, GetReservaResponse.class, null, value);
    }

}
