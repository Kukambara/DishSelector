package ua.nure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.nure.service.AuthorizationService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: Дмитрий
 * Date: 22.02.14
 * Time: 17:29
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class AuthorizeController {


    @RequestMapping(value = "/authorize/vk", method = RequestMethod.GET)
    public String authorizeFromVk(HttpServletRequest request) {
        AuthorizationService authorizationService = new AuthorizationService(request);
        authorizationService.signInFromVk();
        return "user/userPage";
    }
}
