package du1_eshop.repository;

import du1_eshop.model.Product;
import du1_eshop.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional(Transactional.TxType.SUPPORTS)
public class UserRepository {

    @PersistenceContext(unitName = "EshopPU")
    private EntityManager em;

    public User find (Long id){
        return em.find(User.class, id);
    }
    @Transactional(Transactional.TxType.REQUIRED)
    public User create (User user) {
        em.persist(user);
        return user;
    }
    @Transactional(Transactional.TxType.REQUIRED)
    public void delete (Long id) {
        em.remove(em.getReference(User.class, id));
    }

    public List<User> findAll()
    {
        CriteriaQuery<User> criteria = em.getCriteriaBuilder()
                .createQuery(User.class);
        return em.createQuery(criteria.select(criteria.from(User.class))).getResultList();
    }


}
