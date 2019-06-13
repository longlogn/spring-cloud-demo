package com.cxlsky;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * className ZuulFilter
 * description ZuulFilter
 *
 * @author Toby
 * @date 2019-6-12
 */
@Component
public class MyZuulFilter extends ZuulFilter {

    @Autowired
    private HttpServletRequest request;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.addZuulRequestHeader("X-DOMAIN", request.getRemoteAddr());
        ctx.addZuulRequestHeader("USER-INFO", "{\"username\":\"cxl\"}");
        return null;
    }
}
