package fabric;

import dao.RoleDao;
import dao.UserDao;
import dao_impl.RoleImpl;
import dao_impl.UserImpl;

/**
 * Created by FromxSoul on 15.05.2016.
 */
public class Fabric {

    private static RoleDao roleDao = null;
    private static UserDao userDao = null;
    private static Fabric instance = null;

    public static synchronized Fabric getInstance() {
        if (instance == null) {
            instance = new Fabric();
        }
        return instance;
    }

    public RoleDao getRoleDao() {
        if (roleDao == null) {
            roleDao = new RoleImpl();
        }
        return roleDao;
    }

    public UserDao getUserDao() {
        if (userDao == null) {
            userDao = new UserImpl();
        }
        return userDao;
    }

}
