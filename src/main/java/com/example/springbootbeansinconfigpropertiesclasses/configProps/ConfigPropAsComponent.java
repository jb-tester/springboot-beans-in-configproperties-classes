package com.example.springbootbeansinconfigpropertiesclasses.configProps;

import com.example.springbootbeansinconfigpropertiesclasses.beans.Bean1;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 8/11/2023.</p>
 * <p>Project: springboot-beans-in-configproperties-classes</p>
 * *
 */
@Component
@ConfigurationProperties("props.component")
public class ConfigPropAsComponent {
    String prop;

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    @Bean
    public Bean1 bean1() {
        return new Bean1();
    }
}
