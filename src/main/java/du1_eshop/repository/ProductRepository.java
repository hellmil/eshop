package du1_eshop.repository;

import du1_eshop.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional(Transactional.TxType.SUPPORTS)
public class ProductRepository {

    @PersistenceContext(unitName = "EshopPU")
    private EntityManager em;

    @Transactional(Transactional.TxType.REQUIRED)
    public Product find (Long id){
        return em.find(Product.class, id);
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public Product create (Product product) {
        em.persist(product);
        return product;
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public void delete (Long id) {
        em.remove(em.getReference(Product.class, id));
    }

    public List<Product> findAll() {
        TypedQuery<Product> query = em.createQuery("Select p from Product p order by p.title", Product.class);
                return query.getResultList();
    }
}
