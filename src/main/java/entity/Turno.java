package entity;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Turno {

    private int idTurno;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="idtrabajador")
    private Celador celador;

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

    public Celador getCelador() {
        return celador;
    }

    public void setCelador(Celador celador) {
        this.celador = celador;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "idTurno=" + idTurno +
                '}';
    }
}
