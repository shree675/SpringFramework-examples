package com.example.raw;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.raw.env.ApplicationEnvironment;

@Component
/*
 * a prototype scope is required
 * to enable constructor injection
 * into this bean
 */
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Person {

    @Value("${person.name}")
    private String name;

    /*
     * defaults to false
     */
    @Value("${person.enabled:false}")
    private boolean enabled;

    @Value("${person.values}")
    private List<String> values;

    @Value("${person.num:4}")
    private int num;

    private String prop;

    public Person(String name) {
        this.name = name;
        /*
         * another way of loading values
         * from a properties file
         */
        prop = ApplicationEnvironment.env.getProperty("person.properties");
    }

    public String getName() {
        return name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public List<String> getValues() {
        return values;
    }

    public int getNum() {
        return num;
    }

    public String getProp() {
        return prop;
    }

}
