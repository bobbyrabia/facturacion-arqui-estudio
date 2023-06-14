package ec.edu.espe.arquitectura.billing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "PRODUCTO")
public class Producto {
   @Id
   private String productoId;
   private String productoNombre;
   private String productoDescripcion;
   private BigDecimal productoPrecio;
   private BigDecimal productoExistencia;
   private String productoEstado;
   private String productoIva;
   private String productoIce;
}
