package du1_eshop.repository;

import du1_eshop.model.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional(Transactional.TxType.SUPPORTS)
public class CategoryRepository {

    @PersistenceContext(unitName = "EshopPU")
    private EntityManager em;

    @Transactional(Transactional.TxType.REQUIRED)
    public Category find (Long id){
        return em.find(Category.class, id);
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public Category create (Category category) {
        em.persist(category);
        return category;
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public void delete (Long id) {
        em.remove(em.getReference(Category.class, id));
    }
}
