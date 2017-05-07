
package ifpb.pos.soap.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de deleteHotelResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="deleteHotelResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hotelDeletado" type="{http://resources.soap.ativ2.pos.ifpb/}hotel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteHotelResponse", propOrder = {
    "hotelDeletado"
})
public class DeleteHotelResponse {

    protected Hotel hotelDeletado;

    /**
     * Obtém o valor da propriedade hotelDeletado.
     * 
     * @return
     *     possible object is
     *     {@link Hotel }
     *     
     */
    public Hotel getHotelDeletado() {
        return hotelDeletado;
    }

    /**
     * Define o valor da propriedade hotelDeletado.
     * 
     * @param value
     *     allowed object is
     *     {@link Hotel }
     *     
     */
    public void setHotelDeletado(Hotel value) {
        this.hotelDeletado = value;
    }

}
