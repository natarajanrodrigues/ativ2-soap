
package ifpb.pos.soap.empresa;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebService(name = "EmpresaResources", targetNamespace = "http://resources.soap.ativ2.pos.ifpb/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmpresaResources {


    /**
     * 
     * @return
     *     returns java.util.List<ifpb.pos.soap.empresa.Hotel>
     */
    @WebMethod
    @WebResult(name = "todosHoteis", targetNamespace = "")
    @RequestWrapper(localName = "listarHoteis", targetNamespace = "http://resources.soap.ativ2.pos.ifpb/", className = "ifpb.pos.soap.empresa.ListarHoteis")
    @ResponseWrapper(localName = "listarHoteisResponse", targetNamespace = "http://resources.soap.ativ2.pos.ifpb/", className = "ifpb.pos.soap.empresa.ListarHoteisResponse")
    public List<Hotel> listarHoteis();

    /**
     * 
     * @param arg0
     * @return
     *     returns ifpb.pos.soap.empresa.Empresa
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addEmpresa", targetNamespace = "http://resources.soap.ativ2.pos.ifpb/", className = "ifpb.pos.soap.empresa.AddEmpresa")
    @ResponseWrapper(localName = "addEmpresaResponse", targetNamespace = "http://resources.soap.ativ2.pos.ifpb/", className = "ifpb.pos.soap.empresa.AddEmpresaResponse")
    public Empresa addEmpresa(
        @WebParam(name = "arg0", targetNamespace = "")
        Empresa arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns ifpb.pos.soap.empresa.Empresa
     */
    @WebMethod
    @WebResult(name = "empresa", targetNamespace = "")
    @RequestWrapper(localName = "getEmpersa", targetNamespace = "http://resources.soap.ativ2.pos.ifpb/", className = "ifpb.pos.soap.empresa.GetEmpersa")
    @ResponseWrapper(localName = "getEmpersaResponse", targetNamespace = "http://resources.soap.ativ2.pos.ifpb/", className = "ifpb.pos.soap.empresa.GetEmpersaResponse")
    public Empresa getEmpersa(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "updateEmpresa", targetNamespace = "http://resources.soap.ativ2.pos.ifpb/", className = "ifpb.pos.soap.empresa.UpdateEmpresa")
    public void updateEmpresa(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Empresa arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns ifpb.pos.soap.empresa.Empresa
     */
    @WebMethod
    @WebResult(name = "empresaDeletada", targetNamespace = "")
    @RequestWrapper(localName = "deleteEmpresa", targetNamespace = "http://resources.soap.ativ2.pos.ifpb/", className = "ifpb.pos.soap.empresa.DeleteEmpresa")
    @ResponseWrapper(localName = "deleteEmpresaResponse", targetNamespace = "http://resources.soap.ativ2.pos.ifpb/", className = "ifpb.pos.soap.empresa.DeleteEmpresaResponse")
    public Empresa deleteEmpresa(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

}
