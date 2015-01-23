package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by robert.szostakowski on 2015-01-23.
 */
public class IpAddressAuthenticationFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        if (!authorizeIp(request, response)) {

            response.sendError(HttpServletResponse.SC_NOT_FOUND, request.getRequestURI());
            return;

        }

        filterChain.doFilter(servletRequest, servletResponse);
    }

    private boolean authorizeIp(HttpServletRequest request, HttpServletResponse response) {
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
        if(remoteAddr.equals("127.0.0.1"))
            return true;
        else
            return false;

    }

    @Override
    public void destroy() {

    }
}
