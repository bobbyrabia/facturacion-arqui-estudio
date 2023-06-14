package ec.edu.espe.arquitectura.billing.model;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name = "CLIENTE")
public class Cliente {
    @Id
    @Column(name = "COD_CLIENTE", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer clienteId;
    @Column(name = "TIPO_IDENTIFICACION", nullable = false, length = 3)
    private String tipoIdentificacion;
    @Column(name = "IDENTIFICACION", nullable = false, length = 20)
    private String identificacion;
    @Column(name = "APELLIDO", nullable = false, length = 50)
    private String apellido;
    @Column(name = "NOMBRE", nullable = false, length = 50)
    private String nombre;
    @Column(name = "RAZON_SOCIAL", nullable = false, length = 100)
    private String razonSocial;
    @Column(name = "DIRECCION", nullable = false, length = 100)
    private String direccion;
    @Column(name = "TELEFONO", length = 15)
    private String telefono;
    @Column(name = "CORREO_ELECTRONICO", nullable = false, length = 100)
    private String correoElectronico;

    public Cliente() {
    }

    public Cliente(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(clienteId, cliente.clienteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clienteId);
    }
}
