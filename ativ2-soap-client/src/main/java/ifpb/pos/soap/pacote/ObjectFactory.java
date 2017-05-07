
package ifpb.pos.soap.pacote;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ifpb.pos.soap.pacote package. 
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

    private final static QName _CriaPacoteResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "criaPacoteResponse");
    private final static QName _AddReservaHotelParaPacoteResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "addReservaHotelParaPacoteResponse");
    private final static QName _AddReservaPassagemParaPacoteResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "addReservaPassagemParaPacoteResponse");
    private final static QName _AddReservaHotelParaPacote_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "addReservaHotelParaPacote");
    private final static QName _DeleteReserva_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "deleteReserva");
    private final static QName _ListarPacotesResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "listarPacotesResponse");
    private final static QName _ListarPacotes_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "listarPacotes");
    private final static QName _Pacote_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "pacote");
    private final static QName _CriaPacote_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "criaPacote");
    private final static QName _DeleteReservaResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "deleteReservaResponse");
    private final static QName _ReservaPassagem_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "reservaPassagem");
    private final static QName _AddReservaPassagemParaPacote_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "addReservaPassagemParaPacote");
    private final static QName _GetPacote_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "getPacote");
    private final static QName _GetPacoteResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "getPacoteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ifpb.pos.soap.pacote
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddReservaPassagemParaPacoteResponse }
     * 
     */
    public AddReservaPassagemParaPacoteResponse createAddReservaPassagemParaPacoteResponse() {
        return new AddReservaPassagemParaPacoteResponse();
    }

    /**
     * Create an instance of {@link AddReservaHotelParaPacote }
     * 
     */
    public AddReservaHotelParaPacote createAddReservaHotelParaPacote() {
        return new AddReservaHotelParaPacote();
    }

    /**
     * Create an instance of {@link DeleteReserva }
     * 
     */
    public DeleteReserva createDeleteReserva() {
        return new DeleteReserva();
    }

    /**
     * Create an instance of {@link ListarPacotesResponse }
     * 
     */
    public ListarPacotesResponse createListarPacotesResponse() {
        return new ListarPacotesResponse();
    }

    /**
     * Create an instance of {@link CriaPacoteResponse }
     * 
     */
    public CriaPacoteResponse createCriaPacoteResponse() {
        return new CriaPacoteResponse();
    }

    /**
     * Create an instance of {@link AddReservaHotelParaPacoteResponse }
     * 
     */
    public AddReservaHotelParaPacoteResponse createAddReservaHotelParaPacoteResponse() {
        return new AddReservaHotelParaPacoteResponse();
    }

    /**
     * Create an instance of {@link Pacote }
     * 
     */
    public Pacote createPacote() {
        return new Pacote();
    }

    /**
     * Create an instance of {@link ListarPacotes }
     * 
     */
    public ListarPacotes createListarPacotes() {
        return new ListarPacotes();
    }

    /**
     * Create an instance of {@link CriaPacote }
     * 
     */
    public CriaPacote createCriaPacote() {
        return new CriaPacote();
    }

    /**
     * Create an instance of {@link DeleteReservaResponse }
     * 
     */
    public DeleteReservaResponse createDeleteReservaResponse() {
        return new DeleteReservaResponse();
    }

    /**
     * Create an instance of {@link ReservaPassagem }
     * 
     */
    public ReservaPassagem createReservaPassagem() {
        return new ReservaPassagem();
    }

    /**
     * Create an instance of {@link AddReservaPassagemParaPacote }
     * 
     */
    public AddReservaPassagemParaPacote createAddReservaPassagemParaPacote() {
        return new AddReservaPassagemParaPacote();
    }

    /**
     * Create an instance of {@link GetPacote }
     * 
     */
    public GetPacote createGetPacote() {
        return new GetPacote();
    }

    /**
     * Create an instance of {@link GetPacoteResponse }
     * 
     */
    public GetPacoteResponse createGetPacoteResponse() {
        return new GetPacoteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriaPacoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "criaPacoteResponse")
    public JAXBElement<CriaPacoteResponse> createCriaPacoteResponse(CriaPacoteResponse value) {
        return new JAXBElement<CriaPacoteResponse>(_CriaPacoteResponse_QNAME, CriaPacoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservaHotelParaPacoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "addReservaHotelParaPacoteResponse")
    public JAXBElement<AddReservaHotelParaPacoteResponse> createAddReservaHotelParaPacoteResponse(AddReservaHotelParaPacoteResponse value) {
        return new JAXBElement<AddReservaHotelParaPacoteResponse>(_AddReservaHotelParaPacoteResponse_QNAME, AddReservaHotelParaPacoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservaPassagemParaPacoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "addReservaPassagemParaPacoteResponse")
    public JAXBElement<AddReservaPassagemParaPacoteResponse> createAddReservaPassagemParaPacoteResponse(AddReservaPassagemParaPacoteResponse value) {
        return new JAXBElement<AddReservaPassagemParaPacoteResponse>(_AddReservaPassagemParaPacoteResponse_QNAME, AddReservaPassagemParaPacoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservaHotelParaPacote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "addReservaHotelParaPacote")
    public JAXBElement<AddReservaHotelParaPacote> createAddReservaHotelParaPacote(AddReservaHotelParaPacote value) {
        return new JAXBElement<AddReservaHotelParaPacote>(_AddReservaHotelParaPacote_QNAME, AddReservaHotelParaPacote.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPacotesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "listarPacotesResponse")
    public JAXBElement<ListarPacotesResponse> createListarPacotesResponse(ListarPacotesResponse value) {
        return new JAXBElement<ListarPacotesResponse>(_ListarPacotesResponse_QNAME, ListarPacotesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPacotes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "listarPacotes")
    public JAXBElement<ListarPacotes> createListarPacotes(ListarPacotes value) {
        return new JAXBElement<ListarPacotes>(_ListarPacotes_QNAME, ListarPacotes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pacote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "pacote")
    public JAXBElement<Pacote> createPacote(Pacote value) {
        return new JAXBElement<Pacote>(_Pacote_QNAME, Pacote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriaPacote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "criaPacote")
    public JAXBElement<CriaPacote> createCriaPacote(CriaPacote value) {
        return new JAXBElement<CriaPacote>(_CriaPacote_QNAME, CriaPacote.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservaPassagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "reservaPassagem")
    public JAXBElement<ReservaPassagem> createReservaPassagem(ReservaPassagem value) {
        return new JAXBElement<ReservaPassagem>(_ReservaPassagem_QNAME, ReservaPassagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservaPassagemParaPacote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "addReservaPassagemParaPacote")
    public JAXBElement<AddReservaPassagemParaPacote> createAddReservaPassagemParaPacote(AddReservaPassagemParaPacote value) {
        return new JAXBElement<AddReservaPassagemParaPacote>(_AddReservaPassagemParaPacote_QNAME, AddReservaPassagemParaPacote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPacote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "getPacote")
    public JAXBElement<GetPacote> createGetPacote(GetPacote value) {
        return new JAXBElement<GetPacote>(_GetPacote_QNAME, GetPacote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPacoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "getPacoteResponse")
    public JAXBElement<GetPacoteResponse> createGetPacoteResponse(GetPacoteResponse value) {
        return new JAXBElement<GetPacoteResponse>(_GetPacoteResponse_QNAME, GetPacoteResponse.class, null, value);
    }

}
