package dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pojo.Airplane;
import sun.jvm.hotspot.debugger.AddressException;

public class AirplaneDAO extends DAO {

    public Airplane create(String airlineName, String owner) throws AddressException {
        try {
            begin();
            Airplane airplane = new Airplane(airlineName, owner);
            getSession().save(airplane);
            commit();
            return airplane;
        } catch (HibernateException e){
            rollback();
            throw new AddressException("Could not create the airplane", e);
        } finally {
            close();
        }

    }

    public void updateAirplane(Airplane airplane) throws AddressException {
        try{
            begin();
            getSession().update(airplane);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new AddressException("Could not update the airplane", e);
        } finally {
            close();
        }
    }

    public Airplane searchAirplaneById(long airplane_id) throws 

}
