
package ifpb.pos.soap.pacote;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de listarPacotesResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="listarPacotesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pacotes" type="{http://resources.soap.ativ2.pos.ifpb/}pacote" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarPacotesResponse", propOrder = {
    "pacotes"
})
public class ListarPacotesResponse {

    protected List<Pacote> pacotes;

    /**
     * Gets the value of the pacotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pacotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPacotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pacote }
     * 
     * 
     */
    public List<Pacote> getPacotes() {
        if (pacotes == null) {
            pacotes = new ArrayList<Pacote>();
        }
        return this.pacotes;
    }

}
