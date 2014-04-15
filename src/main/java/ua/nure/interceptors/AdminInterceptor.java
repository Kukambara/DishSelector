package ua.nure.interceptors;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import ua.nure.service.AuthorizationService;
import ua.nure.util.Consts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (request.getSession().getAttribute(Consts.USER_ID) == null) {
            if (loginByCookies(request, response) && (Boolean) request.getSession().getAttribute(Consts.USER_ID)) {
                response.sendRedirect("/admin");
            } else {
                response.sendRedirect("/");
                return false;
            }
        }
        return true;
    }

    private boolean loginByCookies(HttpServletRequest request, HttpServletResponse response) {
        AuthorizationService authorizationService = new AuthorizationService();
        return authorizationService.loginByCookies(request, response);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
