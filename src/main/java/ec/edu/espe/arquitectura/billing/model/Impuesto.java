package ec.edu.espe.arquitectura.billing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "IMPUESTO")
public class Impuesto {
   @Id
   private String impuestoId;
   private String impuestoNombre;
   private String impuestoSiglas;

}
