/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springcourse;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author riku
 */
public class GreetingBeanImpl implements GreetingBean{
    
    private String greeting;
    private boolean addTimestamp;
    private int loopCounter;
    private Person toBeGreeted;
    
    public GreetingBeanImpl(Person person) {
        toBeGreeted = person;
    }
    
    /**
     * @return the greeting
     */
    public String getGreeting() {
        return greeting;
    }

    /**
     * @param greeting the greeting to set
     */
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    
    public void greetMe() {
        for(int i = 0; i < loopCounter; i++) {
            if(addTimestamp) {
                System.out.println(new Date() + " " + greeting + ", " + toBeGreeted.getName());         
            } else {
                System.out.println(greeting+ ", " + toBeGreeted.getName());         
           }
        }
    }

    /**
     * @return the addTimestamp
     */
    public boolean isAddTimestamp() {
        return addTimestamp;
    }

    /**
     * @param addTimestamp the addTimestamp to set
     */
    public void setAddTimestamp(boolean addTimestamp) {
        this.addTimestamp = addTimestamp;
    }

    /**
     * @return the loopCounter
     */
    public int getLoopCounter() {
        return loopCounter;
    }

    /**
     * @param loopCounter the loopCounter to set
     */
    public void setLoopCounter(int loopCounter) {
        this.loopCounter = loopCounter;
    }
            
    
}
