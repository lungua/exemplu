
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.awt.*;
import java.awt.event.*; 
import java.util.Vector;
import javax.swing.*; 

public  class MyOwnFocusTraversalPolicy
        extends FocusTraversalPolicy     
{  
    Vector<Component> order;
    public MyOwnFocusTraversalPolicy(Vector<Component> order)
    {          
        this.order = new Vector<Component>(order.size()); 
        this.order.addAll(order);    
    }       
    public Component getComponentAfter(Container focusCycleRoot,
            Component aComponent)
    {    
        int idx = (order.indexOf(aComponent) + 1) % order.size(); 
        return order.get(idx); 
    }       
    public Component getComponentBefore(Container focusCycleRoot,
            Component aComponent)
    {    
        int idx = order.indexOf(aComponent) - 1;  
        if (idx < 0)
        {    
            idx = order.size() - 1;  
        }       
        return order.get(idx);  
    }      
    public Component getDefaultComponent(Container focusCycleRoot)
    {       
        return order.get(0); 
    }         
    public Component getLastComponent(Container focusCycleRoot) 
    {       
        return order.lastElement();  
    }         
    public Component getFirstComponent(Container focusCycleRoot)
    {         
        return order.get(0); 
    }    
} 
