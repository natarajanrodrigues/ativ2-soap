package ifpb.pos.ativ2.soap.repositories;

import ifpb.pos.ativ2.soap.entities.Cliente;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.persistence.PersistenceContext;

/**
 * @author natarajan
 */
@DataSourceDefinition(
        name = "java:app/jdbc/cliente",
        className = "org.postgresql.Driver",
//        url = "jdbc:postgresql://localhost:5432/agencia",
        url = "jdbc:postgresql://banco-agencia:5432/agencia",
        user = "postgres",
        password = "12345"
)
//@Local
@Stateless
public class ClienteRepository  {

    @PersistenceContext
    private EntityManager em;

    public Cliente salvar(Cliente cliente) {
        em.persist(cliente);
        return cliente;

    }

    public Cliente remover(Long key) {
        Cliente cliente = this.buscar(key);
        em.remove(cliente);
        return cliente;
    }

    public Cliente atualizar(Cliente cliente) {
        return em.merge(cliente);
    }

    public Cliente buscar(Long key) {
        return em.find(Cliente.class, key);
    }

    public List<Cliente> listar() {
        return em.createQuery("FROM Cliente p", Cliente.class)
                .getResultList();
    }
}
