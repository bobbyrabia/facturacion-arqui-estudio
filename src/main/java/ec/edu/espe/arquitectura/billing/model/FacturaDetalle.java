package ec.edu.espe.arquitectura.billing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "FACTURA_DETALLE")
public class FacturaDetalle {
   @Id
   private Integer facturaDetalleId;
   private Integer facturaId;
   private String productoId;
   private Integer cantidad;
   private String productoNombre;
   private BigDecimal precioUnitario;
   private BigDecimal subtotal;

}
