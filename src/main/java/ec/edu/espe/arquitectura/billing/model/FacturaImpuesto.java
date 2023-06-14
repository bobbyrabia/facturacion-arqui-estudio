package ec.edu.espe.arquitectura.billing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "")
public class FacturaImpuesto {
   private facturaImpuestoId;
   private facturaId;
   private impuestoId;
   private porcentaje;
   private valor;
}
