
package ifpb.pos.soap.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de updateClient complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="updateClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://resources.soap.ativ2.pos.ifpb/}cliente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateClient", propOrder = {
    "arg0",
    "arg1"
})
public class UpdateClient {

    protected Long arg0;
    protected Cliente arg1;

    /**
     * Obtém o valor da propriedade arg0.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getArg0() {
        return arg0;
    }

    /**
     * Define o valor da propriedade arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setArg0(Long value) {
        this.arg0 = value;
    }

    /**
     * Obtém o valor da propriedade arg1.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getArg1() {
        return arg1;
    }

    /**
     * Define o valor da propriedade arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setArg1(Cliente value) {
        this.arg1 = value;
    }

}
