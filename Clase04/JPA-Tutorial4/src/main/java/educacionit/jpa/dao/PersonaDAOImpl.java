package educacionit.jpa.dao;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Service
public class PersonaDAOImpl {

    @PersistenceContext
    private EntityManager em;

    public Long cuantasPersonasHay() {

        Query query = em.createQuery("SELECT COUNT(p) FROM Persona p");
        Long result = (Long) query.getSingleResult();
        System.out.println(result);
        em.close();
        return result;
    }


}
