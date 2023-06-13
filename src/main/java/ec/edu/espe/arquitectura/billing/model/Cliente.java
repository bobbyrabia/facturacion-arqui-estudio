package ec.edu.espe.arquitectura.billing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "CLIENTE")
public class Cliente {

    private Integer id;
    private Integer clienteId;
    private String codigoEstablecimiento;
    private String puntoEmision;
    private Long secuencial;
    private String numeroAutorizacion;
    private Date fecha;
    private BigDecimal subtotal;
    private BigDecimal total;
}
