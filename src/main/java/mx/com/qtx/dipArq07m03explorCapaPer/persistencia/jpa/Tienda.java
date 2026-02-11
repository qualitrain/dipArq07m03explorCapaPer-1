package mx.com.qtx.dipArq07m03explorCapaPer.persistencia.jpa;

import jakarta.persistence.*;

@Entity
@Table(name = "tie_tienda")
public class Tienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tie_id_tienda")
    private Integer id;

    @Column(name = "tie_razon_social", nullable = false)
    private String razonSocial;

    @Column(name = "tie_direccion", nullable = false)
    private String direccion;

    @Column(name = "tie_telefono")
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "tie_id_empleado_encargado", nullable = false)
    private Empleado encargado;
}
