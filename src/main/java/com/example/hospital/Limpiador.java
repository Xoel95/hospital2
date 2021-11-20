package com.example.hospital;

import java.util.ArrayList;

public class Limpiador extends Trabajador {

    private ArrayList<Turno> turnos;
    private ArrayList<Planta> plantas;

    public Limpiador() {
    }

    public Limpiador(String dni, int nss, String nombre, String direccion, String telefono, ArrayList<Turno> turnos,
                     ArrayList<Planta> plantas) {
        super(dni, nss, nombre, direccion, telefono);
        this.turnos = turnos;
        this.plantas = plantas;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }

    public ArrayList<Planta> getPlantas() {
        return plantas;
    }

    public void setPlantas(ArrayList<Planta> plantas) {
        this.plantas = plantas;
    }

    @Override
    public String toString() {
        return "Limpiador{" +
                "turnos=" + turnos +
                ", plantas=" + plantas +
                '}';
    }
}
