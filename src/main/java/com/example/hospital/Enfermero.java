package com.example.hospital;

import java.util.ArrayList;

public class Enfermero extends Trabajador {

    private ArrayList<Turno> turnos;

    public Enfermero() {
    }

    public Enfermero(String dni, int nss, String nombre, String direccion, String telefono, ArrayList<Turno> turnos) {
        super(dni, nss, nombre, direccion, telefono);
        this.turnos = turnos;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }

    @Override
    public String toString() {
        return "Enfermero{" +
                "turnos=" + turnos +
                '}';
    }
}
