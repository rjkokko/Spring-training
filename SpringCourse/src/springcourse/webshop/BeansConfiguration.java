/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springcourse.webshop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
    public BillingService createBillingService() {
        return new BillingServiceImpl();
    }
    
    
}
