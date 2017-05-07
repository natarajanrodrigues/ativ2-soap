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
//@SequenceGenerator(name = "reserva_hotel_seq",
//        allocationSize = 1,
//        initialValue = 1,
//        sequenceName = "reserva_hotel_sequencia")

public class ReservaHotel implements Serializable {

    @Id
    @GeneratedValue(generator = "reserva_hotel_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @Column(name = "cliente_id")
    private Long idCliente;
    
    @Column(name = "hotel_id")
    private Long idHotel;

    public ReservaHotel() {
    }

    public ReservaHotel(Long idCliente, Long idHotel) {
        this.idCliente = idCliente;
        this.idHotel = idHotel;
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

    public Long getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Long idHotel) {
        this.idHotel = idHotel;
    }

    @Override
    public String toString() {
        return "ReservaHotel{" + "id=" + id + ", idCliente=" + idCliente + ", idHotel=" + idHotel + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.id);
        hash = 47 * hash + Objects.hashCode(this.idCliente);
        hash = 47 * hash + Objects.hashCode(this.idHotel);
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
        final ReservaHotel other = (ReservaHotel) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.idCliente, other.idCliente)) {
            return false;
        }
        if (!Objects.equals(this.idHotel, other.idHotel)) {
            return false;
        }
        return true;
    }
    
    
            
    
    
}
