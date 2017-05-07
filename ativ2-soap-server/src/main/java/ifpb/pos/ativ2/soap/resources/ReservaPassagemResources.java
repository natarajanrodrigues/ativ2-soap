package ifpb.pos.ativ2.soap.resources;

import ifpb.pos.ativ2.soap.entities.Cliente;
import ifpb.pos.ativ2.soap.entities.Empresa;
import ifpb.pos.ativ2.soap.entities.ReservaPassagem;
import ifpb.pos.ativ2.soap.repositories.ClienteRepository;
import ifpb.pos.ativ2.soap.repositories.EmpresaRepository;
import ifpb.pos.ativ2.soap.repositories.ReservaPassagemRepository;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;



/**
 * @author natarajan
 */
@WebService
public class ReservaPassagemResources {
    
    @EJB
    private ReservaPassagemRepository reservaRepository;
    
    @EJB
    private EmpresaRepository empresaRepository;
    
    @EJB
    private ClienteRepository clienteRepository;

    @WebMethod
    @WebResult
    public List<ReservaPassagem> listarReservasPassagem() {
        return reservaRepository.listar();
    }
    
    
    @WebMethod
    @WebResult
    public ReservaPassagem addReservaPassagem(ReservaPassagem reservaPassagem){
        if (validate(reservaPassagem)) {
            return reservaRepository.salvar(reservaPassagem);
        }
        return null;
    }
    
    protected boolean validate(ReservaPassagem reservaPassagem) {
        //confirm empresa and client exists
        Empresa empresaBuscada = empresaRepository.buscar(reservaPassagem.getIdEmpresa());
        Cliente clienteBuscado = clienteRepository.buscar(reservaPassagem.getIdCliente());
        if (empresaBuscada != null && clienteBuscado != null) {
            return true;
        }
        return false;
    }

    
    @WebMethod
    @WebResult
    public ReservaPassagem getReserva(Long id)  {
        return reservaRepository.buscar(id);
    }
    
    @WebMethod
    @WebResult
    public ReservaPassagem updateReserva(Long id, ReservaPassagem reservaAtualizada) {

        reservaAtualizada.setId(id);
        ReservaPassagem reservaRetornada = reservaRepository.buscar(id);
        if (reservaRetornada == null && validate(reservaAtualizada)) {
            return reservaRepository.atualizar(reservaAtualizada);
        }
        return null;
    }

    @WebMethod
    @WebResult
    public ReservaPassagem deleteReserva(Long id) {
        ReservaPassagem reserva = reservaRepository.buscar(id);
        if (reserva == null) {
            return reservaRepository.remover(id);
        }
        return null;
    }

}
