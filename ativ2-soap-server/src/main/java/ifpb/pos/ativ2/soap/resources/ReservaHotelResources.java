package ifpb.pos.ativ2.soap.resources;

import ifpb.pos.ativ2.soap.entities.Cliente;
import ifpb.pos.ativ2.soap.entities.Hotel;
import ifpb.pos.ativ2.soap.entities.ReservaHotel;
import ifpb.pos.ativ2.soap.repositories.ClienteRepository;
import ifpb.pos.ativ2.soap.repositories.HotelRepository;
import ifpb.pos.ativ2.soap.repositories.ReservaHotelRepository;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;



/**
 * @author natarajan
 */
@WebService
public class ReservaHotelResources {
    
    @EJB
    private ReservaHotelRepository reservaRepository;
    
    @EJB
    private HotelRepository hotelRepository;
    
    @EJB
    private ClienteRepository clienteRepository;

    @WebMethod
    @WebResult(name = "reservas")        
    public List<ReservaHotel> listarReservasHotel() {
        return reservaRepository.listar();
    }
    
    
    @WebMethod
    @WebResult
    public ReservaHotel addReserva(ReservaHotel reservaHotel){
        if (validate(reservaHotel)) {
            return reservaRepository.salvar(reservaHotel);
        }
        return null;
    }
    
    private boolean validate(ReservaHotel reservaHotel) {
        //confirm hotel and client exists
        Hotel hotelBuscado = hotelRepository.buscar(reservaHotel.getIdHotel());
        Cliente clienteBuscado = clienteRepository.buscar(reservaHotel.getIdCliente());
        if (hotelBuscado != null && clienteBuscado != null) {
            return true;
        }
        return false;
    }

    
    @WebMethod
    @WebResult
    public ReservaHotel getReserva(Long id)  {
        return reservaRepository.buscar(id);
    }
    
    @WebMethod
    @WebResult
    public ReservaHotel updateReserva(Long id, ReservaHotel reservaAtualizada) {

        reservaAtualizada.setId(id);
        ReservaHotel reservaRetornada = reservaRepository.buscar(id);
        if (reservaRetornada == null && validate(reservaAtualizada)) {
            return reservaRepository.atualizar(reservaAtualizada);
        }
        return null;
    }

    @WebMethod
    @WebResult
    public ReservaHotel deleteReserva(Long id) {
        ReservaHotel reserva = reservaRepository.buscar(id);
        if (reserva == null) {
            return reservaRepository.remover(id);
        }
        return null;
    }
    
    

}
