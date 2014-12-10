/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rjkokko.spring.course;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author riku
 */
public class WebShopImpl implements WebShop{

    @Autowired
    private BillingService billingService;
    
    private int[] customers;
    
    @Override
    public void sendBillsForCustomers() {
        for(int i = 0; i <customers.length; i++) {
          billingService.billCustomer(customers[i]);        
        }
    }

    /**
     * @return the customers
     */
    public int[] getCustomers() {
        return customers;
    }

    /**
     * @param customers the customers to set
     */
    public void setCustomers(int[] customers) {
        this.customers = customers;
    }
    
}
