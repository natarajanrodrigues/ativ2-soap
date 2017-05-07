
package ifpb.pos.soap.empresa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getEmpersaResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getEmpersaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="empresa" type="{http://resources.soap.ativ2.pos.ifpb/}empresa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEmpersaResponse", propOrder = {
    "empresa"
})
public class GetEmpersaResponse {

    protected Empresa empresa;

    /**
     * Obtém o valor da propriedade empresa.
     * 
     * @return
     *     possible object is
     *     {@link Empresa }
     *     
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * Define o valor da propriedade empresa.
     * 
     * @param value
     *     allowed object is
     *     {@link Empresa }
     *     
     */
    public void setEmpresa(Empresa value) {
        this.empresa = value;
    }

}
