/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springcourse.webshop;

import org.springframework.stereotype.Component;

/**
 *
 * @author riku
 */
public class BillingServiceImpl implements BillingService {

    @Override
    public void billCustomer(int customerId) {
    System.out.println("billing customer " + customerId);
    }
    
}
