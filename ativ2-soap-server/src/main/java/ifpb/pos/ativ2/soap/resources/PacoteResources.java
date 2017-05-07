package ifpb.pos.ativ2.soap.resources;

import ifpb.pos.ativ2.soap.entities.Cliente;
import ifpb.pos.ativ2.soap.entities.Empresa;
import ifpb.pos.ativ2.soap.entities.Hotel;
import ifpb.pos.ativ2.soap.entities.Pacote;
import ifpb.pos.ativ2.soap.entities.ReservaHotel;
import ifpb.pos.ativ2.soap.entities.ReservaPassagem;
import ifpb.pos.ativ2.soap.repositories.ClienteRepository;
import ifpb.pos.ativ2.soap.repositories.EmpresaRepository;
import ifpb.pos.ativ2.soap.repositories.HotelRepository;
import ifpb.pos.ativ2.soap.repositories.PacoteRepository;
import ifpb.pos.ativ2.soap.repositories.ReservaHotelRepository;
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
public class PacoteResources {
    
    
    @EJB
    private ClienteRepository clienteRepository;

    @EJB
    private ReservaPassagemRepository reservaPassagemRepository;
    
    @EJB
    private EmpresaRepository empresaRepository;
    
    @EJB
    private ReservaHotelRepository reservaHotelRepository;
    
    @EJB
    private HotelRepository hotelRepository;
    
    
    @EJB
    private PacoteRepository pacoteRepository;
    
    
    @WebMethod
    @WebResult(name = "pacotes")        
    public List<Pacote> listarPacotes() {
        return pacoteRepository.listar();
    }
    
    
    @WebMethod
    @WebResult
    public Pacote criaPacote(Long clienteId){
        
        if (validaCliente(clienteId)) {
            Pacote pacote = new Pacote();
            pacote.setIdCliente(clienteId);
            Pacote pacoteSalvo = pacoteRepository.salvar(pacote);
            return pacoteSalvo;
        }
        
        return null;
    }
    
    private boolean validaCliente(Long clienteId) {
        Cliente clienteBuscado = clienteRepository.buscar(clienteId);
        
        if (clienteBuscado != null) {
            return true;
        }
        return false;
    }
    
    @WebMethod
    @WebResult(name = "novaReservaPassagemPacote")
    public Pacote addReservaPassagemParaPacote(Pacote pacote, Long idEmpresa){
        if (validaCliente(pacote.getIdCliente()) && validateEmpresa(idEmpresa)) {
            ReservaPassagem reserva = new ReservaPassagem();
            reserva.setIdCliente(pacote.getIdCliente());
            reserva.setIdEmpresa(idEmpresa);
            
            ReservaPassagem reservaSalva = reservaPassagemRepository.salvar(reserva);
            
            if (reservaSalva != null) {
                pacote.setReservaPassagem(reservaSalva.getId());
                Pacote pacoteAtualizado = pacoteRepository.atualizar(pacote);
                return pacoteAtualizado;
            }
        }
        return null;
    }
    
    private boolean validateEmpresa(Long idEmpresa) {
        //confirm hotel and client exists
        Empresa empresaBuscada = empresaRepository.buscar(idEmpresa);
        if (empresaBuscada != null) {
            return true;
        }
        return false;
    }
    
    @WebMethod
    @WebResult(name = "novaReservaHotelPacote")
    public Pacote addReservaHotelParaPacote(Pacote pacote, Long idHotel){
        if (validaCliente(pacote.getIdCliente()) && validateHotel(idHotel)) {
            ReservaHotel reserva = new ReservaHotel();
            reserva.setIdCliente(pacote.getIdCliente());
            reserva.setIdHotel(idHotel);
            
            ReservaHotel reservaSalva = reservaHotelRepository.salvar(reserva);
            
            if (reservaSalva != null) {
                pacote.setReservaHotel(reservaSalva.getId());
                Pacote pacoteAtualizado = pacoteRepository.atualizar(pacote);
                return pacoteAtualizado;
            }
        }
        return null;
    }
    
    private boolean validateHotel(Long idHotel) {
        //confirm hotel and client exists
        Hotel hotelBuscado = hotelRepository.buscar(idHotel);
        if (hotelBuscado != null) {
            return true;
        }
        return false;
    }

    
    @WebMethod
    @WebResult
    public Pacote getPacote(Long id)  {
        return pacoteRepository.buscar(id);
    }
    
    @WebMethod
    @WebResult
    public ReservaPassagem deleteReserva(Long id) {
        ReservaPassagem reserva = reservaPassagemRepository.buscar(id);
        if (reserva == null) {
            return reservaPassagemRepository.remover(id);
        }
        return null;
    }

}
