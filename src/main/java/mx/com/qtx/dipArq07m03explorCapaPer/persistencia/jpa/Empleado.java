package mx.com.qtx.dipArq07m03explorCapaPer.persistencia.jpa;

import jakarta.persistence.*;

@Entity
@Table(name = "emp_empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id_empleado")
    private Long id;

    @Column(name = "emp_nombre")
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(name = "emp_tipo_empleado")
    private TipoEmpleado tipoEmpleado;

    @ManyToOne
    @JoinColumn(name = "emp_id_rol")
    private Rol rol;
}
