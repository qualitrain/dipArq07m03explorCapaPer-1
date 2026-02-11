package mx.com.qtx.dipArq07m03explorCapaPer.persistencia.jpa;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "cat_categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_id_categoria")
    private Integer id;

    @Column(name = "cat_nombre", nullable = false)
    private String nombre;

    @Column(name = "cat_descripcion")
    private String descripcion;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos = new ArrayList<>();
}
