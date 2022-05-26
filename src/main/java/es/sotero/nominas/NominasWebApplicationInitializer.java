package es.sotero.nominas;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import es.sotero.nominas.business.NominasBusinessConfig;
import es.sotero.nominas.web.NominasWebConfig;


public class NominasWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { NominasBusinessConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { NominasWebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

}