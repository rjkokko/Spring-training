/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springcourse.webshop;

import java.io.IOException;
import java.util.Properties;
import org.springframework.beans.factory.config.PreferencesPlaceholderConfigurer;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

/**
 *
 * @author riku
 */
@Configuration
public class BeansConfiguration {
    
    @Bean
    public WebShop createWebShop() {
        WebShopImpl ws = new WebShopImpl();
        int[] customers = {99, 100};
        ws.setCustomers(customers);
        return  ws;
    }
    
    @Bean
    public BillingService createBillingService() throws IOException {
        BillingServiceImpl service = new BillingServiceImpl();
        return service;
    }
   /**
   @Bean
   public PropertyPlaceholderConfigurer getPlaceholderConfigurer() {
       PropertyPlaceholderConfigurer configurer = new PreferencesPlaceholderConfigurer();
       Resource loc = new Re
       configurer.setLocation(loc);
   }**/
    
}
