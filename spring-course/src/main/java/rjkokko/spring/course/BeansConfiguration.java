/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rjkokko.spring.course;

import java.io.IOException;
import java.util.Properties;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.config.PreferencesPlaceholderConfigurer;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.Resource;

/**
 *
 * @author riku
 */
@Configuration
@EnableAspectJAutoProxy
@PropertySource("classpath:config.properties")
public class BeansConfiguration {

    @Bean
    public WebShop createWebShop() {
        WebShopImpl ws = new WebShopImpl();
        int[] customers = {99, 100};
        ws.setCustomers(customers);
        return ws;
    }

    @Bean
    public BillingService createBillingService() throws IOException {
        BillingServiceImpl service = new BillingServiceImpl();
        return service;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public Logger getLogger() {
        return new Logger();
    }
}
