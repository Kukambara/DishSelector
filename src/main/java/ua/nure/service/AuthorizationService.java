package ua.nure.service;


import ua.nure.util.Consts;
import ua.nure.util.Digest;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: Дмитрий
 * Date: 20.02.14
 * Time: 16:18
 * To change this template use File | Settings | File Templates.
 */
public class AuthorizationService {

    HttpServletRequest request;

    public AuthorizationService(HttpServletRequest request) {
        this.request = request;
    }

    public boolean signInFromVk() {
        Cookie[] cookies = request.getCookies();
        String expire = "";
        String mid = "";
        String secret = "";
        String sid = "";
        String sig = "";
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(Consts.VK_USER_EXPIRE)) {
                expire = cookie.getValue();
            } else if (cookie.getName().equals(Consts.VK_USER_ID)) {
                mid = cookie.getValue();
            } else if (cookie.getName().equals(Consts.VK_USER_SECRET)) {
                secret = cookie.getValue();
            } else if (cookie.getName().equals(Consts.VK_USER_SID)) {
                sid = cookie.getValue();
            } else if (cookie.getName().equals(Consts.VK_USER_SIG)) {
                sig = cookie.getValue();
            }
        }
        StringBuilder rawSig = new StringBuilder();
        rawSig.append(Consts.VK_USER_EXPIRE).append("=").append(expire)
                .append(Consts.VK_USER_ID).append("=").append(mid)
                .append(Consts.VK_USER_SECRET).append("=").append(secret)
                .append(Consts.VK_USER_SID).append("=").append(sid);
        return Digest.md5(rawSig.toString()).equals(sig) ? true : false;
    }

    public boolean signInFromFB() {
        return false;
    }

    public boolean signInFromTW() {
        return false;
    }

    public boolean signInFromGP(){
        return false;
    }

    public boolean signInCookie() {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(Consts.VK)) {
                return signInFromVk();
            } else if (cookie.getName().equals(Consts.FACEBOOK)) {
                return signInFromFB();
            } else if (cookie.getName().equals(Consts.TWITTER)) {
                return signInFromTW();
            } else if (cookie.getName().equals(Consts.GOOGLE_PLUS)) {
                return signInFromGP();
            }
        }
        return false;
    }
}
