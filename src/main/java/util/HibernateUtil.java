package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by FromxSoul on 15.05.2016.
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;

    private HibernateUtil() {

    }

    static {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }


    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
