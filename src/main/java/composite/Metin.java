/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author kaan
 */
// Leaf
public class Metin implements Component{

    private String metin;
    
    public Metin(String metin){
        this.metin = metin;
    }
    
    @Override
    public void operation() {
        System.out.println("metin: " + metin);
    }

    @Override
    public void add(Component component) {
        return;
    }

    @Override
    public void remove(Component component) {
        return;
    }

    @Override
    public Component getChild(int i) {
        return null;
    }
    
}
