package ec.edu.espe.arquitectura.billing.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "FACTURA")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COD_FACTURA", nullable = false)
    private Integer id;
    @Column(name = "COD_CLIENTE", nullable = false)
    private Integer clienteId;
    @Column(name = "COD_ESTABLECIMIENTO", nullable = false, length = 3)
    private String codigoEstablecimiento;
    @Column(name = "PUNTO_EMISION", nullable = false, length = 3)
    private String puntoEmision;
    @Column(name = "SECUENCIAL", nullable = false, length = 9)
    private Long secuencial;
    @Column(name = "NUMERO_AUTORIZACION", nullable = false, length = 40)
    private String numeroAutorizacion;
    @Column(name = "FECHA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "SUBTOTAL", nullable = false, length = 12)
    private BigDecimal subtotal;
    @Column(name = "TOTAL", nullable = false, length = 12)
    private BigDecimal total;

    public Factura() {
    }

    public Factura(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getCodigoEstablecimiento() {
        return codigoEstablecimiento;
    }

    public void setCodigoEstablecimiento(String codigoEstablecimiento) {
        this.codigoEstablecimiento = codigoEstablecimiento;
    }

    public String getPuntoEmision() {
        return puntoEmision;
    }

    public void setPuntoEmision(String puntoEmision) {
        this.puntoEmision = puntoEmision;
    }

    public Long getSecuencial() {
        return secuencial;
    }

    public void setSecuencial(Long secuencial) {
        this.secuencial = secuencial;
    }

    public String getNumeroAutorizacion() {
        return numeroAutorizacion;
    }

    public void setNumeroAutorizacion(String numeroAutorizacion) {
        this.numeroAutorizacion = numeroAutorizacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", clienteId=" + clienteId +
                ", codigoEstablecimiento='" + codigoEstablecimiento + '\'' +
                ", puntoEmision='" + puntoEmision + '\'' +
                ", secuencial=" + secuencial +
                ", numeroAutorizacion='" + numeroAutorizacion + '\'' +
                ", fecha=" + fecha +
                ", subtotal=" + subtotal +
                ", total=" + total +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return Objects.equals(id, factura.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
