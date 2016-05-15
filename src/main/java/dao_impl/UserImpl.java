package dao_impl;

import dao.UserDao;
import org.hibernate.Session;
import tables.User;
import util.HibernateUtil;

import java.sql.SQLException;

/**
 * Created by FromxSoul on 15.05.2016.
 */
public class UserImpl implements UserDao {
    public void addUser(User user) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }
        }
    }
}
