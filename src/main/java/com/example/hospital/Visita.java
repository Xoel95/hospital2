package com.example.hospital;

import java.util.Date;

public class Visita {

    private int idVisita;
    private String descripcion;
    private Date fecha;

    public Visita() {
    }

    public Visita(String descripcion, Date fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Visita(int idVisita, String descripcion, Date fecha) {
        this.idVisita = idVisita;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
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
        return "Visita{" +
                "idVisita=" + idVisita +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
