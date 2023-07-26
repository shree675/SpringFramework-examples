package com.example.raw.env;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationEnvironment implements EnvironmentAware {

    public static Environment env;

    @Override
    public void setEnvironment(final Environment environment) {
        ApplicationEnvironment.env = environment;
    }

}
