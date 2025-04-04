package trabalho.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerUtil {

    public static EntityManagerFactory emf;
    public static EntityManager em;

    private EntityManagerUtil() {}

    public static EntityManagerFactory getEmf() {
        if (emf == null) {
            emf = Persistence.
                    createEntityManagerFactory("trabalho");
            System.out.println("Conexão Aberta!");
        }
        return emf;
    }

    public static EntityManager getEm() {
        if (emf == null) {
            getEmf();
        }
        if (em == null || !em.isOpen()) {
            em = emf.createEntityManager();
            System.out.println("Entity Manager Criado!");
        }
        return em;
    }
}
