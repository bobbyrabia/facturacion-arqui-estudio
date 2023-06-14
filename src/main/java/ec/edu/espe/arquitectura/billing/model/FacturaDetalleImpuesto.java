package ec.edu.espe.arquitectura.billing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "")
public class FacturaDetalleImpuesto {
   private facturaDetalleImpuestoId;
   private impuestoId;
   private porcentaje;
   private facturaDetalleId;
   private valor;


}
