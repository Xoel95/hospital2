package entity;

import javax.persistence.*;

@Entity
@Table(name="turnos")
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idturno")
    private int idTurno;
    private TipoTurno tipo;

    @ManyToOne(fetch= FetchType.LAZY)
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
