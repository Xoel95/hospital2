package com.example.hospital;

public class Turno {

    private int idTurno;

    public Turno() {
    }

    public Turno(int idTurno) {
        this.idTurno = idTurno;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "idTurno=" + idTurno +
                '}';
    }
}
