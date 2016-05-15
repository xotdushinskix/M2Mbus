package dao;

import tables.Role;

import java.sql.SQLException;

/**
 * Created by FromxSoul on 15.05.2016.
 */
public interface RoleDao {

    void addRole(Role role) throws SQLException;
    Role getRole(Long role_id) throws SQLException;

}
