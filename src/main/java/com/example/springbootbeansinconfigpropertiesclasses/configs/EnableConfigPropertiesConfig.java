package com.example.springbootbeansinconfigpropertiesclasses.configs;

import com.example.springbootbeansinconfigpropertiesclasses.configProps.ConfigPropAddedByEnableConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by irina on 8/11/2023.</p>
 * <p>Project: springboot-beans-in-configproperties-classes</p>
 * *
 */
@Configuration
@EnableConfigurationProperties({ConfigPropAddedByEnableConfigurationProperties.class})
public class EnableConfigPropertiesConfig {
}
