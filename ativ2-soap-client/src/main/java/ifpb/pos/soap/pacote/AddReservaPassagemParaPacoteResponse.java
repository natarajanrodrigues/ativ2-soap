
package ifpb.pos.soap.pacote;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de addReservaPassagemParaPacoteResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="addReservaPassagemParaPacoteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="novaReservaPassagemPacote" type="{http://resources.soap.ativ2.pos.ifpb/}pacote" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addReservaPassagemParaPacoteResponse", propOrder = {
    "novaReservaPassagemPacote"
})
public class AddReservaPassagemParaPacoteResponse {

    protected Pacote novaReservaPassagemPacote;

    /**
     * Obtém o valor da propriedade novaReservaPassagemPacote.
     * 
     * @return
     *     possible object is
     *     {@link Pacote }
     *     
     */
    public Pacote getNovaReservaPassagemPacote() {
        return novaReservaPassagemPacote;
    }

    /**
     * Define o valor da propriedade novaReservaPassagemPacote.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacote }
     *     
     */
    public void setNovaReservaPassagemPacote(Pacote value) {
        this.novaReservaPassagemPacote = value;
    }

}
