package ec.edu.espe.arquitectura.billing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "IMPUESTO_PORCENTAJE")
public class ImpuestoPorcentaje {
   @Id
   private String impuestoId;

   private BigDecimal porcentajeId;
   private String estado;
   private Date fechaInicio;
   private Date fechaFin;

}
