
package ifpb.pos.soap.empresa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de deleteEmpresaResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="deleteEmpresaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="empresaDeletada" type="{http://resources.soap.ativ2.pos.ifpb/}empresa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteEmpresaResponse", propOrder = {
    "empresaDeletada"
})
public class DeleteEmpresaResponse {

    protected Empresa empresaDeletada;

    /**
     * Obtém o valor da propriedade empresaDeletada.
     * 
     * @return
     *     possible object is
     *     {@link Empresa }
     *     
     */
    public Empresa getEmpresaDeletada() {
        return empresaDeletada;
    }

    /**
     * Define o valor da propriedade empresaDeletada.
     * 
     * @param value
     *     allowed object is
     *     {@link Empresa }
     *     
     */
    public void setEmpresaDeletada(Empresa value) {
        this.empresaDeletada = value;
    }

}
