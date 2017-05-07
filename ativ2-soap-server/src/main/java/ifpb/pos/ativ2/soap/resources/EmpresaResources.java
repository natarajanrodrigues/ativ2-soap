package ifpb.pos.ativ2.soap.resources;

import ifpb.pos.ativ2.soap.entities.Empresa;
import ifpb.pos.ativ2.soap.repositories.EmpresaRepository;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author natarajan
 */
@WebService
public class EmpresaResources {

    @EJB
    private EmpresaRepository empresaRepository;

    @WebMethod
    @WebResult(name = "todosHoteis")        
    public List<Empresa> listarHoteis() {
        return  empresaRepository.listar();
    }
    
    @WebMethod
    @WebResult        
    public Empresa addEmpresa(Empresa empresa){
        return empresaRepository.salvar(empresa);
    }
    
    @WebMethod
    @WebResult(name = "empresa")        
    public Empresa getEmpersa(Long id) {
        return empresaRepository.buscar(id);
    }
    
    @Oneway
    public void updateEmpresa(Long id, Empresa empresa) {
        empresa.setId(id);
        empresaRepository.atualizar(empresa);
    }

    @WebMethod
    @WebResult(name = "empresaDeletada")        
    public Empresa deleteEmpresa(Long id) {
        Empresa empresaRetornada = empresaRepository.buscar(id);
        if (empresaRetornada != null)
            return empresaRepository.remover(id);
        else 
            return null;
    }

}
