package pl.wsb.fitnesstracker.event.api;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;


/**
 * The type Abstract dao.
 */
@Transactional
public abstract class AbstractDao {

    /**
     * The Entity manager.
     */
    @PersistenceContext
    protected EntityManager entityManager;

}