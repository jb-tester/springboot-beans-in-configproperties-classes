package com.example.springbootbeansinconfigpropertiesclasses.configProps;

import com.example.springbootbeansinconfigpropertiesclasses.beans.Bean2;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * *
 * <p>Created by irina on 8/11/2023.</p>
 * <p>Project: springboot-beans-in-configproperties-classes</p>
 * *
 */
@ConfigurationProperties("props.enable-cp")
public class ConfigPropAddedByEnableConfigurationProperties {
    String prop;

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    @Bean
    public Bean2 bean2() {
        return new Bean2();
    }
}
