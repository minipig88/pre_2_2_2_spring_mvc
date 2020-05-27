package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CarDAOImp implements CarDAO {

    @PersistenceContext(unitName = "entityManagerFactory")
    private EntityManager entityManager;

    @Override
    public List<Car> getAllCars() {
       return entityManager.createQuery("FROM Car", Car.class).getResultList();
    }
}
