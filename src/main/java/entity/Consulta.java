package entity;

public class Consulta {

    private int idConsulta;

    public Consulta() {
    }

    public Consulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "idConsulta=" + idConsulta +
                '}';
    }
}
