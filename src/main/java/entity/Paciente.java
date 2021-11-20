package entity;

public class Paciente {

    private int idPaciente;

    public Paciente() {
    }

    public Paciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "idPaciente=" + idPaciente +
                '}';
    }
}
