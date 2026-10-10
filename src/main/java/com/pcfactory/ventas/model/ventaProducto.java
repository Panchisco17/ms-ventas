package com.pcfactory.ventas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ventas_productos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ventaProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // el identity crea la tabla autonumerica
    private Long idVentaProducto; // JPA lo cambia automaticamente a id_venta_producto

    @Column(nullable = false, length = 255, unique = false)
    private String nombreCliente;

    @Column(nullable = false, unique = false)
    private Long idCliente;

    @Column(nullable = false, unique = false)
    private Long idProducto;

    @Column(nullable = false, unique = false)
    private String nombreProducto;

    @Column(nullable = false, unique = false)
    private Long precio;

    @Column(nullable = false, unique = false)
    private Long cantidad;;

}
