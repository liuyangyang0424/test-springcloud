package com.objcat.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

public class TokenFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否开启过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 编写过滤器拦截业务逻辑代码
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext currentcontext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentcontext.getRequest();
        String token = request.getParameter("token");
        if(token == null){
            currentcontext.setSendZuulResponse(false);
            currentcontext.setResponseBody("token is null");
            currentcontext.setResponseStatusCode(401);
        }
        return null;
    }
}
