package com.example.sbmp.config;

/**
 * @author lengleng
 * @date 2017/11/28
 * <p>
 * Created by simon on 2017/6/12.
 * <p>
 * Created by simon on 2017/6/12.
 * <p>
 * Created by simon on 2017/6/12.
 * <p>
 * Created by simon on 2017/6/12.
 * <p>
 * Created by simon on 2017/6/12.
 */
/**
 * Created by simon on 2017/6/12.
 */

import javax.servlet.*;
import java.io.IOException;

public class ServerRequestAuthFilter implements Filter {
    @Override
    public void destroy() {
        // TODO Auto-generated method stub
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain filterChain) throws IOException, ServletException {
        //do somethings
        filterChain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub
    }
}