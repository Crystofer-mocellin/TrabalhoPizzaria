package trabalho.daos;

import jakarta.persistence.EntityManager;
import trabalho.models.Cliente;
import trabalho.utils.EntityManagerUtil;

public class ClienteDAO {

    EntityManager em = EntityManagerUtil.getEm();

    public void salvar(Cliente cliente) {
        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }



}
