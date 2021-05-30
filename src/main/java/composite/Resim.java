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
public class Resim implements Component{

    String resimYolu;
    
    public Resim(String resimYolu){
        this.resimYolu = resimYolu;
    }
    
    @Override
    public void operation() {
        System.out.printf("<img src = %s />\n", resimYolu);
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
