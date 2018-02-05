package com.arief.thymeleaf.configs;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {



    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
            MySpringAppContext.class
        };
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
            MyWebAppContext.class
        };
    }

    protected String[] getServletMappings() {
        return new String[]{
                "/"
        };
    }
}
