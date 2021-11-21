package entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@DiscriminatorValue(value="4")
public class Celador extends Trabajador {

    @OneToMany(mappedBy = "celador", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private ArrayList<Turno> turnos;

    public Celador() {
    }

    public Celador(Trabajador t) {
        super(t.getDni(), t.getNss(), t.getNombre(), t.getDireccion(), t.getTelefono());
    }

    public Celador(String dni, int nss, String nombre, String direccion, String telefono) {
        super(dni, nss, nombre, direccion, telefono);
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

    public void addTurno(Turno tr) {
        turnos.add(tr);
        tr.setCelador(this);
    }

    public void removeTurno(Turno tr) {
        turnos.remove(tr);
        tr.setCelador(null);
    }
}
