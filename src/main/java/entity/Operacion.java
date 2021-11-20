package entity;

import java.util.Date;

public class Operacion {

    private int idOperacion;
    private String descripcion;
    private Date fecha;

    public Operacion() {
    }

    public Operacion(String descripcion, Date fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Operacion(int idOperacion, String descripcion, Date fecha) {
        this.idOperacion = idOperacion;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public int getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(int idOperacion) {
        this.idOperacion = idOperacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Operacion{" +
                "idOperacion=" + idOperacion +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
