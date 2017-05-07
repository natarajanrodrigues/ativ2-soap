
package ifpb.pos.soap.reservahotel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de listarReservasHotelResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="listarReservasHotelResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reservas" type="{http://resources.soap.ativ2.pos.ifpb/}reservaHotel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarReservasHotelResponse", propOrder = {
    "reservas"
})
public class ListarReservasHotelResponse {

    protected List<ReservaHotel> reservas;

    /**
     * Gets the value of the reservas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservaHotel }
     * 
     * 
     */
    public List<ReservaHotel> getReservas() {
        if (reservas == null) {
            reservas = new ArrayList<ReservaHotel>();
        }
        return this.reservas;
    }

}
