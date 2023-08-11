package com.example.springbootbeansinconfigpropertiesclasses.scannedConfigProps;

import com.example.springbootbeansinconfigpropertiesclasses.beans.Bean3;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * *
 * <p>Created by irina on 8/11/2023.</p>
 * <p>Project: springboot-beans-in-configproperties-classes</p>
 * *
 */
@ConfigurationProperties("props.scanned")
public class ConfigPropScanned {
    String prop;

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    @Bean
    public Bean3 bean3() {
        return new Bean3();
    }
}
