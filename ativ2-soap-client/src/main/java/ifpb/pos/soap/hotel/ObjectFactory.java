
package ifpb.pos.soap.hotel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ifpb.pos.soap.hotel package. 
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

    private final static QName _DeleteHotel_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "deleteHotel");
    private final static QName _GetHotel_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "getHotel");
    private final static QName _ListarHoteis_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "listarHoteis");
    private final static QName _DeleteHotelResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "deleteHotelResponse");
    private final static QName _UpdateHotel_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "updateHotel");
    private final static QName _AddHotel_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "addHotel");
    private final static QName _GetHotelResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "getHotelResponse");
    private final static QName _AddHotelResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "addHotelResponse");
    private final static QName _ListarHoteisResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "listarHoteisResponse");
    private final static QName _Hotel_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "hotel");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ifpb.pos.soap.hotel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteHotelResponse }
     * 
     */
    public DeleteHotelResponse createDeleteHotelResponse() {
        return new DeleteHotelResponse();
    }

    /**
     * Create an instance of {@link UpdateHotel }
     * 
     */
    public UpdateHotel createUpdateHotel() {
        return new UpdateHotel();
    }

    /**
     * Create an instance of {@link AddHotel }
     * 
     */
    public AddHotel createAddHotel() {
        return new AddHotel();
    }

    /**
     * Create an instance of {@link GetHotelResponse }
     * 
     */
    public GetHotelResponse createGetHotelResponse() {
        return new GetHotelResponse();
    }

    /**
     * Create an instance of {@link DeleteHotel }
     * 
     */
    public DeleteHotel createDeleteHotel() {
        return new DeleteHotel();
    }

    /**
     * Create an instance of {@link GetHotel }
     * 
     */
    public GetHotel createGetHotel() {
        return new GetHotel();
    }

    /**
     * Create an instance of {@link ListarHoteis }
     * 
     */
    public ListarHoteis createListarHoteis() {
        return new ListarHoteis();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link AddHotelResponse }
     * 
     */
    public AddHotelResponse createAddHotelResponse() {
        return new AddHotelResponse();
    }

    /**
     * Create an instance of {@link ListarHoteisResponse }
     * 
     */
    public ListarHoteisResponse createListarHoteisResponse() {
        return new ListarHoteisResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "deleteHotel")
    public JAXBElement<DeleteHotel> createDeleteHotel(DeleteHotel value) {
        return new JAXBElement<DeleteHotel>(_DeleteHotel_QNAME, DeleteHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "getHotel")
    public JAXBElement<GetHotel> createGetHotel(GetHotel value) {
        return new JAXBElement<GetHotel>(_GetHotel_QNAME, GetHotel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "deleteHotelResponse")
    public JAXBElement<DeleteHotelResponse> createDeleteHotelResponse(DeleteHotelResponse value) {
        return new JAXBElement<DeleteHotelResponse>(_DeleteHotelResponse_QNAME, DeleteHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "updateHotel")
    public JAXBElement<UpdateHotel> createUpdateHotel(UpdateHotel value) {
        return new JAXBElement<UpdateHotel>(_UpdateHotel_QNAME, UpdateHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "addHotel")
    public JAXBElement<AddHotel> createAddHotel(AddHotel value) {
        return new JAXBElement<AddHotel>(_AddHotel_QNAME, AddHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "getHotelResponse")
    public JAXBElement<GetHotelResponse> createGetHotelResponse(GetHotelResponse value) {
        return new JAXBElement<GetHotelResponse>(_GetHotelResponse_QNAME, GetHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "addHotelResponse")
    public JAXBElement<AddHotelResponse> createAddHotelResponse(AddHotelResponse value) {
        return new JAXBElement<AddHotelResponse>(_AddHotelResponse_QNAME, AddHotelResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Hotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "hotel")
    public JAXBElement<Hotel> createHotel(Hotel value) {
        return new JAXBElement<Hotel>(_Hotel_QNAME, Hotel.class, null, value);
    }

}
