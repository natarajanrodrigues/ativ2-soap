package ifpb.pos.ativ2.soap.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Natarajan
 */
@XmlRootElement
@Entity
//@SequenceGenerator(name = "reseva_passagem_seq",
//        allocationSize = 1,
//        initialValue = 1,
//        sequenceName = "reseva_passagem_sequencia")

public class ReservaPassagem implements Serializable {

    @Id
    @GeneratedValue(generator = "reseva_passagem_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "cliente_id")
    private Long idCliente;

    @Column(name = "empresa_id")
    private Long idEmpresa;

    public ReservaPassagem() {
    }

    public ReservaPassagem(Long idCliente, Long idEmpresa) {
        this.idCliente = idCliente;
        this.idEmpresa = idEmpresa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Override
    public String toString() {
        return "ReservaPassagem{" + "id=" + id + ", idCliente=" + idCliente + ", idEmpresa=" + idEmpresa + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.idCliente);
        hash = 97 * hash + Objects.hashCode(this.idEmpresa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ReservaPassagem other = (ReservaPassagem) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.idCliente, other.idCliente)) {
            return false;
        }
        if (!Objects.equals(this.idEmpresa, other.idEmpresa)) {
            return false;
        }
        return true;
    }

    
}
