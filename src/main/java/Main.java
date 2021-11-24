import entity.Celador;
import entity.Trabajador;
import entity.Turno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        try {
            Trabajador t = new Trabajador("67451283X", 884835, "Pablo",
                    "Calle Shit, 2", "655232323");
            Turno tr = new Turno();
            Celador c = new Celador(t);
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
            EntityManager em = emf.createEntityManager();
            c.addTurno(tr);
            em.getTransaction().begin();
            em.persist(tr);
            em.persist(t);
            em.persist(c);

            System.out.println(c);
            em.getTransaction().commit();
            em.close();
            System.out.println("Fuck");
            emf.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
