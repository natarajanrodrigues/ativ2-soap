
package ifpb.pos.soap.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de updateClientResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="updateClientResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cliente.atualizado" type="{http://resources.soap.ativ2.pos.ifpb/}cliente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateClientResponse", propOrder = {
    "clienteAtualizado"
})
public class UpdateClientResponse {

    @XmlElement(name = "cliente.atualizado")
    protected Cliente clienteAtualizado;

    /**
     * Obtém o valor da propriedade clienteAtualizado.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getClienteAtualizado() {
        return clienteAtualizado;
    }

    /**
     * Define o valor da propriedade clienteAtualizado.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setClienteAtualizado(Cliente value) {
        this.clienteAtualizado = value;
    }

}
