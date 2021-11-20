package com.example.hospital;

import java.util.ArrayList;

public class Celador extends Trabajador {

    private ArrayList<Turno> turnos;

    public Celador() {
    }

    public Celador(String dni, int nss, String nombre, String direccion, String telefono, ArrayList<Turno> turnos) {
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
        return "Celador{" +
                "turnos=" + turnos +
                '}';
    }
}
