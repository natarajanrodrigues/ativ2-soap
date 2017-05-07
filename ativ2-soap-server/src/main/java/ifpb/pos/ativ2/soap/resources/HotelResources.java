package ifpb.pos.ativ2.soap.resources;

import ifpb.pos.ativ2.soap.entities.Hotel;
import ifpb.pos.ativ2.soap.repositories.HotelRepository;
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
public class HotelResources {

    @EJB
    private HotelRepository hotelService;

    @WebMethod
    @WebResult(name = "todosHoteis")        
    public List<Hotel> listarHoteis() {
        return  hotelService.listar();
    }
    
    @WebMethod
    @WebResult        
    public Hotel addHotel(Hotel hotel){
        return hotelService.salvar(hotel);
    }
    
    @WebMethod
    @WebResult(name = "hotel")        
    public Hotel getHotel(Long id) {
        return hotelService.buscar(id);
    }
    
    @Oneway
    public void updateHotel(Long id, Hotel hotel) {
        hotel.setId(id);
        hotelService.atualizar(hotel);
    }

    @WebMethod
    @WebResult(name = "hotelDeletado")        
    public Hotel deleteHotel(Long id) {
        Hotel hotelRetorno = hotelService.buscar(id);
        if (hotelRetorno != null)
            return hotelService.remover(id);
        else 
            return null;
    }
    
    

}
