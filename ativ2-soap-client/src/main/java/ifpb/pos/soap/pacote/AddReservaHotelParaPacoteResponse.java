
package ifpb.pos.soap.pacote;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de addReservaHotelParaPacoteResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="addReservaHotelParaPacoteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="novaReservaHotelPacote" type="{http://resources.soap.ativ2.pos.ifpb/}pacote" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addReservaHotelParaPacoteResponse", propOrder = {
    "novaReservaHotelPacote"
})
public class AddReservaHotelParaPacoteResponse {

    protected Pacote novaReservaHotelPacote;

    /**
     * Obtém o valor da propriedade novaReservaHotelPacote.
     * 
     * @return
     *     possible object is
     *     {@link Pacote }
     *     
     */
    public Pacote getNovaReservaHotelPacote() {
        return novaReservaHotelPacote;
    }

    /**
     * Define o valor da propriedade novaReservaHotelPacote.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacote }
     *     
     */
    public void setNovaReservaHotelPacote(Pacote value) {
        this.novaReservaHotelPacote = value;
    }

}
