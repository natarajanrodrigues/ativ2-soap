package ifpb.pos.ativ2.soap.repositories;

import ifpb.pos.ativ2.soap.entities.Empresa;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import java.util.List;
import javax.persistence.PersistenceContext;

/**
 * @author natarajan
 */
@DataSourceDefinition(
        name = "java:app/jdbc/passagem",
        className = "org.postgresql.Driver",
//        url = "jdbc:postgresql://localhost:5432/agencia",
        url = "jdbc:postgresql://banco-agencia:5432/agencia",
        user = "postgres",
        password = "12345"
)

@Stateless
public class EmpresaRepository {

    @PersistenceContext
    private EntityManager em;

    public Empresa salvar(Empresa empresa) {
        em.persist(empresa);
        return empresa;

    }

    public Empresa remover(Long key) {
        Empresa empresa = this.buscar(key);
        em.remove(empresa);
        return empresa;
    }

    public Empresa atualizar(Empresa empresa) {
        return em.merge(empresa);
    }

    public Empresa buscar(Long key) {
        return em.find(Empresa.class, key);
    }

    public List<Empresa> listar() {
        return em.createQuery("FROM Empresa h", Empresa.class)
                .getResultList();
    }
}
