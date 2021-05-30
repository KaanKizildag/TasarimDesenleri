/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kaan
 */

// Composite
public class Composite implements Component{
    
    private String baslik;
    private List<Component> components;
    
    public Composite(String baslik){
        this.baslik = baslik;
        this.components = new ArrayList<Component>();
    }

    @Override
    public void operation() {
        System.out.printf("<br> %s </br>\n", this.baslik);
        for(Component component : components){
            component.operation();
        }
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return components.get(i);
    }

    
    
}
