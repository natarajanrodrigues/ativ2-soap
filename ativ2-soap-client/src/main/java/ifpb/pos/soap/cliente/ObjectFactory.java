
package ifpb.pos.soap.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ifpb.pos.soap.cliente package. 
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

    private final static QName _AddClientResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "addClientResponse");
    private final static QName _UpdateClientResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "updateClientResponse");
    private final static QName _AddClient_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "addClient");
    private final static QName _DeleteClient_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "deleteClient");
    private final static QName _UpdateClient_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "updateClient");
    private final static QName _Cliente_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "cliente");
    private final static QName _ListarClientes_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "listarClientes");
    private final static QName _DeleteClientResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "deleteClientResponse");
    private final static QName _GetClientResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "getClientResponse");
    private final static QName _ListarClientesResponse_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "listarClientesResponse");
    private final static QName _GetClient_QNAME = new QName("http://resources.soap.ativ2.pos.ifpb/", "getClient");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ifpb.pos.soap.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link ListarClientes }
     * 
     */
    public ListarClientes createListarClientes() {
        return new ListarClientes();
    }

    /**
     * Create an instance of {@link DeleteClientResponse }
     * 
     */
    public DeleteClientResponse createDeleteClientResponse() {
        return new DeleteClientResponse();
    }

    /**
     * Create an instance of {@link AddClientResponse }
     * 
     */
    public AddClientResponse createAddClientResponse() {
        return new AddClientResponse();
    }

    /**
     * Create an instance of {@link UpdateClientResponse }
     * 
     */
    public UpdateClientResponse createUpdateClientResponse() {
        return new UpdateClientResponse();
    }

    /**
     * Create an instance of {@link AddClient }
     * 
     */
    public AddClient createAddClient() {
        return new AddClient();
    }

    /**
     * Create an instance of {@link DeleteClient }
     * 
     */
    public DeleteClient createDeleteClient() {
        return new DeleteClient();
    }

    /**
     * Create an instance of {@link UpdateClient }
     * 
     */
    public UpdateClient createUpdateClient() {
        return new UpdateClient();
    }

    /**
     * Create an instance of {@link ListarClientesResponse }
     * 
     */
    public ListarClientesResponse createListarClientesResponse() {
        return new ListarClientesResponse();
    }

    /**
     * Create an instance of {@link GetClient }
     * 
     */
    public GetClient createGetClient() {
        return new GetClient();
    }

    /**
     * Create an instance of {@link GetClientResponse }
     * 
     */
    public GetClientResponse createGetClientResponse() {
        return new GetClientResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "addClientResponse")
    public JAXBElement<AddClientResponse> createAddClientResponse(AddClientResponse value) {
        return new JAXBElement<AddClientResponse>(_AddClientResponse_QNAME, AddClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "updateClientResponse")
    public JAXBElement<UpdateClientResponse> createUpdateClientResponse(UpdateClientResponse value) {
        return new JAXBElement<UpdateClientResponse>(_UpdateClientResponse_QNAME, UpdateClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "addClient")
    public JAXBElement<AddClient> createAddClient(AddClient value) {
        return new JAXBElement<AddClient>(_AddClient_QNAME, AddClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "deleteClient")
    public JAXBElement<DeleteClient> createDeleteClient(DeleteClient value) {
        return new JAXBElement<DeleteClient>(_DeleteClient_QNAME, DeleteClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "updateClient")
    public JAXBElement<UpdateClient> createUpdateClient(UpdateClient value) {
        return new JAXBElement<UpdateClient>(_UpdateClient_QNAME, UpdateClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "cliente")
    public JAXBElement<Cliente> createCliente(Cliente value) {
        return new JAXBElement<Cliente>(_Cliente_QNAME, Cliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClientes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "listarClientes")
    public JAXBElement<ListarClientes> createListarClientes(ListarClientes value) {
        return new JAXBElement<ListarClientes>(_ListarClientes_QNAME, ListarClientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "deleteClientResponse")
    public JAXBElement<DeleteClientResponse> createDeleteClientResponse(DeleteClientResponse value) {
        return new JAXBElement<DeleteClientResponse>(_DeleteClientResponse_QNAME, DeleteClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "getClientResponse")
    public JAXBElement<GetClientResponse> createGetClientResponse(GetClientResponse value) {
        return new JAXBElement<GetClientResponse>(_GetClientResponse_QNAME, GetClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClientesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "listarClientesResponse")
    public JAXBElement<ListarClientesResponse> createListarClientesResponse(ListarClientesResponse value) {
        return new JAXBElement<ListarClientesResponse>(_ListarClientesResponse_QNAME, ListarClientesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.soap.ativ2.pos.ifpb/", name = "getClient")
    public JAXBElement<GetClient> createGetClient(GetClient value) {
        return new JAXBElement<GetClient>(_GetClient_QNAME, GetClient.class, null, value);
    }

}
