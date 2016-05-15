package util;

import dao.RoleDao;
import dao.UserDao;
import fabric.Fabric;
import org.hibernate.SessionFactory;
import tables.Role;
import tables.User;

import java.sql.SQLException;

/**
 * Created by FromxSoul on 15.05.2016.
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        HibernateUtil.getSessionFactory();

        Fabric fabric = Fabric.getInstance();
        RoleDao roleDao = fabric.getRoleDao();
        UserDao userDao = fabric.getUserDao();

//        Role role = roleDao.getRole(1L);
////        role.setTitle("worker");
//        //roleDao.addRole(role);
////        roleDao.getRole("manager");
//
//
//
//        User user = new User();
//        user.setAge(93);
//        user.setFirstName("George");
//        user.setLastName("Maccoy");
//        user.setRole(roleDao.getRole(1L));
//        userDao.addUser(user);

//        System.out.println(role.getId() + " " + role.getTitle());

//
        User user = new User();

        user.setFirstName("Victor");
        user.setLastName("Martinez");
        user.setAge(89);
        user.setRole(roleDao.getRole(2L));
        userDao.addUser(user);

//        user.setFirstName("John");
//        user.setLastName("Smith");
//        user.setAge(21);
//        user.setRole(roleDao.getRole(1L));
//        userDao.addUser(user);
//
//        user.setFirstName("Kevin");
//        user.setLastName("Corney");
//        user.setAge(54);
//        user.setRole(roleDao.getRole(3L));
//        userDao.addUser(user);

        user.setFirstName("Ashley");
        user.setLastName("Brew");
        user.setAge(27);
        user.setRole(roleDao.getRole(2L));
        userDao.addUser(user);

//        Role role = new Role();
//        role.setTitle("manager");
//        roleDao.addRole(role);
//
//        role.setTitle("engineer");
//        roleDao.addRole(role);
//
//        role.setTitle("scientist");
//        roleDao.addRole(role);

    }

}
