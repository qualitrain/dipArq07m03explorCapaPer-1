package mx.com.qtx.dipArq07m03explorCapaPer.persistencia.jpa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "ven_venta")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ven_num_venta")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ven_id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "ven_id_empleado_vendedor")
    private Empleado vendedor;

    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
    private List<DetalleVenta> detalles = new ArrayList<>();

    public BigDecimal calcularTotal() {
        return detalles.stream()
                .map(DetalleVenta::calcularImporte)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
