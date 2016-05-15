package dao;

import tables.User;

import java.sql.SQLException;

/**
 * Created by FromxSoul on 15.05.2016.
 */
public interface UserDao {

    void addUser(User user) throws SQLException;

}
