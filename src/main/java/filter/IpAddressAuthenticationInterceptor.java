package filter;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by robert.szostakowski on 2015-01-23.
 */
public class IpAddressAuthenticationInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        System.out.println("Prehandle");
        if (!authorizeIp(request, response)) {
            System.out.println("Access is forbiden. Error page should be rendered if exists");
            response.sendError(HttpServletResponse.SC_FORBIDDEN);
            return false;

        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
    private boolean authorizeIp(HttpServletRequest request, HttpServletResponse response) {
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
        if(remoteAddr.equals("137.0.0.1"))         // just for testing change for 127.0.0.1 to obtain true
            return true;
        else
            return false;

    }
}
