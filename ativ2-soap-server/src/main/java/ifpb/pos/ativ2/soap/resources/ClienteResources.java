package ifpb.pos.ativ2.soap.resources;

import ifpb.pos.ativ2.soap.entities.Cliente;
import ifpb.pos.ativ2.soap.repositories.ClienteRepository;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;



/**
 * @author natarajan
 */
@WebService
public class ClienteResources {

    @EJB
    private ClienteRepository clienteService;

    @WebMethod
    @WebResult
    public List<Cliente> listarClientes() {
        return clienteService.listar();
    }
    
    @WebMethod
    @WebResult(name = "newCliente")        
    public Cliente addClient(Cliente cliente){
        return clienteService.salvar(cliente);
    }
    
    @WebMethod
    @WebResult(name = "cliente")
    public Cliente getClient(Long id) {
        return clienteService.buscar(id);
    }
    
    @WebMethod
    @WebResult(name = "cliente.atualizado")
    public Cliente updateClient(Long id, Cliente cliente) {
        cliente.setId(id);
        Cliente clienteAtualizado = clienteService.atualizar(cliente);
        return clienteAtualizado;
    }

    @WebMethod
    @WebResult(name = "cliente.removido")
    public Cliente deleteClient(Long id) {

        Cliente cliente = clienteService.buscar(id);
        if (cliente != null) {
            clienteService.remover(id);
        }
        return cliente;
    }

}
