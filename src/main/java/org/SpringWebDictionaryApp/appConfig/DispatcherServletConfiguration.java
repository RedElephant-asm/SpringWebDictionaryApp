package org.SpringWebDictionaryApp.appConfig;

import org.SpringWebDictionaryApp.handlers.RecordControllerHandler;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

//public class DispatcherServletConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {
//
//    @Override
//    protected Class<?>[] getRootConfigClasses() {
//        return new Class[0];
//    }
//
//    @Override
//    protected Class<?>[] getServletConfigClasses() {
//        return new Class[]{AppConfiguration.class};
//    }
//
//    @Override
//    protected String[] getServletMappings() {
//        return new String[]{"/Records/Records"};
//    }
//}

public class DispatcherServletConfiguration implements WebApplicationInitializer{

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(AppConfiguration.class);
        applicationContext.setServletContext(servletContext);
        ServletRegistration.Dynamic servlet = servletContext.addServlet("Dispatcher servlet", new DispatcherServlet(applicationContext));
        servlet.setLoadOnStartup(0);
        servlet.addMapping("/");
    }

    @Bean
    public RecordControllerHandler controllerHandler(){
        return new RecordControllerHandler();
    }

}