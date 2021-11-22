package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name="idtrabajador")
@DiscriminatorValue(value="4")
public class Celador extends Trabajador {

    @OneToMany(mappedBy = "celador", fetch= FetchType.LAZY, cascade= CascadeType.ALL)
    private List<Turno> turnos;

    public Celador() {
    }

    public Celador(Trabajador t) {
        super(t.getDni(), t.getNss(), t.getNombre(), t.getDireccion(), t.getTelefono());
        this.turnos = new ArrayList<Turno>();
    }

    public Celador(String dni, int nss, String nombre, String direccion, String telefono) {
        super(dni, nss, nombre, direccion, telefono);
        this.turnos = new ArrayList<Turno>();
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
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
