package mx.com.qtx.dipArq07m03explorCapaPer.persistencia.jpa;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
@Table(name = "prd_producto")
public class Producto {

    @Id
    @Column(name = "prd_id_producto")
    private String id;

    private String nombre;
    private BigDecimal precio;

    @ManyToOne
    @JoinColumn(name = "prd_id_categoria")
    private Categoria categoria;

    @OneToOne(mappedBy = "producto", cascade = CascadeType.ALL)
    private InventarioProducto inventario;
}
