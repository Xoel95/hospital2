package entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
//@PrimaryKeyJoinColumn(name="idtrabajador")
@DiscriminatorValue(value="1")
public class Medico extends Trabajador {

    private ArrayList<Operacion> operaciones;
    private ArrayList<Visita> visitas;

    public Medico() {
    }

    public Medico(String dni, int nss, String nombre, String direccion, String telefono,
                  ArrayList<Operacion> operaciones, ArrayList<Visita> visitas) {
        super(dni, nss, nombre, direccion, telefono);
        this.operaciones = operaciones;
        this.visitas = visitas;
    }

    public ArrayList<Operacion> getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(ArrayList<Operacion> operaciones) {
        this.operaciones = operaciones;
    }

    public ArrayList<Visita> getVisitas() {
        return visitas;
    }

    public void setVisitas(ArrayList<Visita> visitas) {
        this.visitas = visitas;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "operaciones=" + operaciones +
                ", visitas=" + visitas +
                '}';
    }
}
