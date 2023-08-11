package com.example.springbootbeansinconfigpropertiesclasses;

import com.example.springbootbeansinconfigpropertiesclasses.beans.Bean1;
import com.example.springbootbeansinconfigpropertiesclasses.beans.Bean2;
import com.example.springbootbeansinconfigpropertiesclasses.beans.Bean3;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 8/11/2023.</p>
 * <p>Project: springboot-beans-in-configproperties-classes</p>
 * *
 */
@Component
public class UseBeans {


    private final Bean1 beanFromConfigPropsComponent;
    private final Bean2 beanFromConfigPropsEnabled;
    private final Bean3 beanFromConfigPropsScanned;

    public UseBeans(Bean1 beanFromConfigPropsComponent
                    ,Bean2 beanFromConfigPropsEnabled
                    ,Bean3 beanFromConfigPropsScanned) {
        this.beanFromConfigPropsComponent = beanFromConfigPropsComponent;
        this.beanFromConfigPropsEnabled = beanFromConfigPropsEnabled;
        this.beanFromConfigPropsScanned = beanFromConfigPropsScanned;
    }

    public void displayAll() {
        System.out.println(beanFromConfigPropsComponent.toString());
        System.out.println(beanFromConfigPropsEnabled.toString());
        System.out.println(beanFromConfigPropsScanned.toString());
    }


}
