package java_web.ss11.config;

import org.springframework.context.annotation.Bean;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {AppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/" };
    }

    @Bean
    public Validator validator() {
        return new LocalValidatorFactoryBean();
    }
}
