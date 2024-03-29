
package ifpb.pos.soap.hotel;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebService(name = "HotelResources", targetNamespace = "http://resources.soap.ativ2.pos.ifpb/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HotelResources {


    /**
     * 
     * @param arg0
     * @return
     *     returns ifpb.pos.soap.hotel.Hotel
     */
    @WebMethod
    @WebResult(name = "hotel", targetNamespace = "")
    @RequestWrapper(localName = "getHotel", targetNamespace = "http://resources.soap.ativ2.pos.ifpb/", className = "ifpb.pos.soap.hotel.GetHotel")
    @ResponseWrapper(localName = "getHotelResponse", targetNamespace = "http://resources.soap.ativ2.pos.ifpb/", className = "ifpb.pos.soap.hotel.GetHotelResponse")
    public Hotel getHotel(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns ifpb.pos.soap.hotel.Hotel
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addHotel", targetNamespace = "http://resources.soap.ativ2.pos.ifpb/", className = "ifpb.pos.soap.hotel.AddHotel")
    @ResponseWrapper(localName = "addHotelResponse", targetNamespace = "http://resources.soap.ativ2.pos.ifpb/", className = "ifpb.pos.soap.hotel.AddHotelResponse")
    public Hotel addHotel(
        @WebParam(name = "arg0", targetNamespace = "")
        Hotel arg0);

    /**
     * 
     * @return
     *     returns java.util.List<ifpb.pos.soap.hotel.Hotel>
     */
    @WebMethod
    @WebResult(name = "todosHoteis", targetNamespace = "")
    @RequestWrapper(localName = "listarHoteis", targetNamespace = "http://resources.soap.ativ2.pos.ifpb/", className = "ifpb.pos.soap.hotel.ListarHoteis")
    @ResponseWrapper(localName = "listarHoteisResponse", targetNamespace = "http://resources.soap.ativ2.pos.ifpb/", className = "ifpb.pos.soap.hotel.ListarHoteisResponse")
    public List<Hotel> listarHoteis();

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "updateHotel", targetNamespace = "http://resources.soap.ativ2.pos.ifpb/", className = "ifpb.pos.soap.hotel.UpdateHotel")
    public void updateHotel(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Hotel arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns ifpb.pos.soap.hotel.Hotel
     */
    @WebMethod
    @WebResult(name = "hotelDeletado", targetNamespace = "")
    @RequestWrapper(localName = "deleteHotel", targetNamespace = "http://resources.soap.ativ2.pos.ifpb/", className = "ifpb.pos.soap.hotel.DeleteHotel")
    @ResponseWrapper(localName = "deleteHotelResponse", targetNamespace = "http://resources.soap.ativ2.pos.ifpb/", className = "ifpb.pos.soap.hotel.DeleteHotelResponse")
    public Hotel deleteHotel(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

}
