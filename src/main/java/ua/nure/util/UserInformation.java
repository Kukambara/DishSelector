package ua.nure.util;

import ua.nure.entity.User;
import ua.nure.service.UserService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Dmitry on 15.04.2014.
 */
public class UserInformation {

    private Integer userId;
    private User user;


    public UserInformation(HttpServletRequest request) {
        this.userId = (Integer) request.getSession().getAttribute(Consts.USER_ID);
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public User getUser() {
        if (user == null) {
            UserService userService = new UserService();
            user = userService.getUser(userId);
        }
        return user;
    }

    public void setUser(User user) {
        this.user = user;
        userId = user.getUserId();
    }
}
