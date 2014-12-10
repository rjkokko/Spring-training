/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rjkokko.spring.course;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author riku
 */
public class BillingServiceImpl implements BillingService {
    
    @Value("${currency}")
    private String currency;

    @Override
    public void billCustomer(int customerId) {
    System.out.println("billing customer " + customerId  + " (currency is " + currency + ")");
    }

    
    
}
