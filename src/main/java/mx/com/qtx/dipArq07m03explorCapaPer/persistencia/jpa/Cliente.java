package mx.com.qtx.dipArq07m03explorCapaPer.persistencia.jpa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "cli_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cli_id_cliente")
    private Long id;

    @Column(name = "cli_nombre", nullable = false)
    private String nombre;

    @Column(name = "cli_email")
    private String email;

    @Column(name = "cli_telefono")
    private String telefono;

    @Column(name = "cli_direccion_fiscal")
    private String direccionFiscal;

    @Column(name = "cli_direccion_entrega")
    private String direccionEntrega;

    @Column(name = "cli_saldo", nullable = false)
    private BigDecimal saldo;

    @Column(name = "cli_limite_credito")
    private BigDecimal limiteCredito;

    @OneToMany(mappedBy = "cliente")
    private List<Venta> ventas = new ArrayList<>();
}
