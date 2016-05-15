package dao_impl;

import dao.RoleDao;
import org.hibernate.Session;
import tables.Role;
import util.HibernateUtil;

import java.sql.SQLException;

/**
 * Created by FromxSoul on 15.05.2016.
 */
public class RoleImpl implements RoleDao {
    public void addRole(Role role) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(role);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }
        }
    }

    public Role getRole(Long role_id) throws SQLException {
        Role result = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            result = session.get(Role.class, role_id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }
        }
        return result;
    }
}
