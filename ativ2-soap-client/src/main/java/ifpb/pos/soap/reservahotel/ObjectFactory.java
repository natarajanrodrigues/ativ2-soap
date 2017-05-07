
package ifpb.pos.soap.reservahotel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ifpb.pos.soap.reservahotel package. 
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
    private final static QName _ReservaHotel_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "reservaHotel");
    private final static QName _AddReserva_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "addReserva");
    private final static QName _ReservaPassagem_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "reservaPassagem");
    private final static QName _UpdateReserva_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "updateReserva");
    private final static QName _AddReservaResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "addReservaResponse");
    private final static QName _DeleteReserva_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "deleteReserva");
    private final static QName _GetReserva_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "getReserva");
    private final static QName _ListarReservasHotelResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "listarReservasHotelResponse");
    private final static QName _UpdateReservaResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "updateReservaResponse");
    private final static QName _GetReservaResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "getReservaResponse");
    private final static QName _ListarReservasHotel_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "listarReservasHotel");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ifpb.pos.soap.reservahotel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddReservaResponse }
     * 
     */
    public AddReservaResponse createAddReservaResponse() {
        return new AddReservaResponse();
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
     * Create an instance of {@link ReservaHotel }
     * 
     */
    public ReservaHotel createReservaHotel() {
        return new ReservaHotel();
    }

    /**
     * Create an instance of {@link AddReserva }
     * 
     */
    public AddReserva createAddReserva() {
        return new AddReserva();
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
     * Create an instance of {@link ListarReservasHotel }
     * 
     */
    public ListarReservasHotel createListarReservasHotel() {
        return new ListarReservasHotel();
    }

    /**
     * Create an instance of {@link ListarReservasHotelResponse }
     * 
     */
    public ListarReservasHotelResponse createListarReservasHotelResponse() {
        return new ListarReservasHotelResponse();
    }

    /**
     * Create an instance of {@link UpdateReservaResponse }
     * 
     */
    public UpdateReservaResponse createUpdateReservaResponse() {
        return new UpdateReservaResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservaHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "reservaHotel")
    public JAXBElement<ReservaHotel> createReservaHotel(ReservaHotel value) {
        return new JAXBElement<ReservaHotel>(_ReservaHotel_QNAME, ReservaHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "addReserva")
    public JAXBElement<AddReserva> createAddReserva(AddReserva value) {
        return new JAXBElement<AddReserva>(_AddReserva_QNAME, AddReserva.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "addReservaResponse")
    public JAXBElement<AddReservaResponse> createAddReservaResponse(AddReservaResponse value) {
        return new JAXBElement<AddReservaResponse>(_AddReservaResponse_QNAME, AddReservaResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarReservasHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "listarReservasHotelResponse")
    public JAXBElement<ListarReservasHotelResponse> createListarReservasHotelResponse(ListarReservasHotelResponse value) {
        return new JAXBElement<ListarReservasHotelResponse>(_ListarReservasHotelResponse_QNAME, ListarReservasHotelResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "getReservaResponse")
    public JAXBElement<GetReservaResponse> createGetReservaResponse(GetReservaResponse value) {
        return new JAXBElement<GetReservaResponse>(_GetReservaResponse_QNAME, GetReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarReservasHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "listarReservasHotel")
    public JAXBElement<ListarReservasHotel> createListarReservasHotel(ListarReservasHotel value) {
        return new JAXBElement<ListarReservasHotel>(_ListarReservasHotel_QNAME, ListarReservasHotel.class, null, value);
    }

}
