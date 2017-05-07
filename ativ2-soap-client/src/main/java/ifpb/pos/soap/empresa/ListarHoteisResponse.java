
package ifpb.pos.soap.empresa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de listarHoteisResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="listarHoteisResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="todosHoteis" type="{http://resources.soap.ativ2.pos.ifpb/}hotel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarHoteisResponse", propOrder = {
    "todosHoteis"
})
public class ListarHoteisResponse {

    protected List<Hotel> todosHoteis;

    /**
     * Gets the value of the todosHoteis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the todosHoteis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTodosHoteis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hotel }
     * 
     * 
     */
    public List<Hotel> getTodosHoteis() {
        if (todosHoteis == null) {
            todosHoteis = new ArrayList<Hotel>();
        }
        return this.todosHoteis;
    }

}
