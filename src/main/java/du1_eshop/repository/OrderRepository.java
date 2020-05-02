package du1_eshop.repository;

import du1_eshop.model.Order;
import du1_eshop.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional(Transactional.TxType.SUPPORTS)
public class OrderRepository {

    @PersistenceContext(unitName = "EshopPU")
    private EntityManager em;

    @Transactional(Transactional.TxType.REQUIRED)
    public Order find (Long id){
        return em.find(Order.class, id);
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public Order create (Order category) {
        em.persist(category);
        return category;
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public void delete (Long id) {
        em.remove(em.getReference(Order.class, id));
    }

    public Long countAll() {
        TypedQuery<Long> query = em.createQuery("Select count (o)  from Order o order by o.orderDate", Long.class);
        return query.getSingleResult();
    }
}
