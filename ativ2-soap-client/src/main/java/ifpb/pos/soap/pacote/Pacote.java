
package ifpb.pos.soap.pacote;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pacote complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pacote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reservaHotel" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reservaPassagem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pacote", propOrder = {
    "id",
    "idCliente",
    "reservaHotel",
    "reservaPassagem"
})
public class Pacote {

    protected Long id;
    protected Long idCliente;
    protected Long reservaHotel;
    protected Long reservaPassagem;

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade idCliente.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdCliente() {
        return idCliente;
    }

    /**
     * Define o valor da propriedade idCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdCliente(Long value) {
        this.idCliente = value;
    }

    /**
     * Obtém o valor da propriedade reservaHotel.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReservaHotel() {
        return reservaHotel;
    }

    /**
     * Define o valor da propriedade reservaHotel.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReservaHotel(Long value) {
        this.reservaHotel = value;
    }

    /**
     * Obtém o valor da propriedade reservaPassagem.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReservaPassagem() {
        return reservaPassagem;
    }

    /**
     * Define o valor da propriedade reservaPassagem.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReservaPassagem(Long value) {
        this.reservaPassagem = value;
    }

}
