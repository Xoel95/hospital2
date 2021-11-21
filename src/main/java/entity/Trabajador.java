package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="trabajadores")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo_trabajador",discriminatorType= DiscriminatorType.INTEGER)
@DiscriminatorValue(value="0")
public class Trabajador {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idtrabajador", nullable = false)
    private int idTrabajador;
    private String dni;
    private int nss;
    private String nombre;
    private String direccion;
    private String telefono;

//    @OneToMany(mappedBy = "employee", cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
//    private List<Task> ltasks;

    public Trabajador() {
    }

    public Trabajador(String dni, int nss, String nombre, String direccion, String telefono) {
        this.dni = dni;
        this.nss = nss;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Trabajador(int idTrabajador, String dni, int nss, String nombre, String direccion, String telefono) {
        this.idTrabajador = idTrabajador;
        this.dni = dni;
        this.nss = nss;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNss() {
        return nss;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "Trabajador{" +
                "idTrabajador=" + idTrabajador +
                ", dni='" + dni + '\'' +
                ", nss=" + nss +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
