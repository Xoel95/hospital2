package com.example.hospital;

import java.util.ArrayList;

public class Planta {

    private int idPlanta;
    private ArrayList<Limpiador> limpiadores;

    public Planta() {
    }

    public Planta(ArrayList<Limpiador> limpiadores) {
        this.limpiadores = limpiadores;
    }

    public Planta(int idPlanta, ArrayList<Limpiador> limpiadores) {
        this.idPlanta = idPlanta;
        this.limpiadores = limpiadores;
    }

    public int getIdPlanta() {
        return idPlanta;
    }

    public void setIdPlanta(int idPlanta) {
        this.idPlanta = idPlanta;
    }

    public ArrayList<Limpiador> getLimpiadores() {
        return limpiadores;
    }

    public void setLimpiadores(ArrayList<Limpiador> limpiadores) {
        this.limpiadores = limpiadores;
    }

    @Override
    public String toString() {
        return "Planta{" +
                "idPlanta=" + idPlanta +
                ", limpiadores=" + limpiadores +
                '}';
    }
}
