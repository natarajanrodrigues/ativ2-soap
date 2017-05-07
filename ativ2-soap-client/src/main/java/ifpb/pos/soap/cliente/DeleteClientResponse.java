
package ifpb.pos.soap.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de deleteClientResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="deleteClientResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cliente.removido" type="{http://resources.soap.ativ2.pos.ifpb/}cliente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteClientResponse", propOrder = {
    "clienteRemovido"
})
public class DeleteClientResponse {

    @XmlElement(name = "cliente.removido")
    protected Cliente clienteRemovido;

    /**
     * Obtém o valor da propriedade clienteRemovido.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getClienteRemovido() {
        return clienteRemovido;
    }

    /**
     * Define o valor da propriedade clienteRemovido.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setClienteRemovido(Cliente value) {
        this.clienteRemovido = value;
    }

}
