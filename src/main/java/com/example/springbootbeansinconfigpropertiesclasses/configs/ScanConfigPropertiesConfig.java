package com.example.springbootbeansinconfigpropertiesclasses.configs;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by irina on 8/11/2023.</p>
 * <p>Project: springboot-beans-in-configproperties-classes</p>
 * *
 */
@Configuration
@ConfigurationPropertiesScan("com.example.springbootbeansinconfigpropertiesclasses.scannedConfigProps")
public class ScanConfigPropertiesConfig {
}
