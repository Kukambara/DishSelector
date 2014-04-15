package ua.nure.service;

import ua.nure.dao.UserDao;
import ua.nure.entity.User;
import ua.nure.entity.enums.Privilege;

/**
 * Created by Dmitry on 15.04.2014.
 */
public class UserService {

    public void setAdmin(User user) {
        user.setPrivilege(Privilege.ADMIN);
        UserDao userDao = new UserDao();
        userDao.update(user);
    }

    public void setModerator(User user) {
        user.setPrivilege(Privilege.MODERATOR);
        UserDao userDao = new UserDao();
        userDao.update(user);
    }

    public void setRegularUser(User user) {
        user.setPrivilege(Privilege.USER);
        UserDao userDao = new UserDao();
        userDao.update(user);
    }

    public User getUser(Integer id) {
        UserDao userDao = new UserDao();
        return userDao.find(id);
    }
}
