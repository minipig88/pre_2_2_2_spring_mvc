package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.models.Car;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CarDAOImp implements CarDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Car> getAllCars() {
        TypedQuery<Car> query = sessionFactory.getCurrentSession().createQuery("FROM Car");
        return query.getResultList();
    }
}
