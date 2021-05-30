/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.Stack;

/**
 *
 * @author kaan
 */
public class AgacIterator extends Iterator {

    private Agac basla;
    private Agac guncel;
    Stack<Agac> yigin;
    
    public AgacIterator(Agac agac) {
        this.basla = agac;
        yigin = new Stack<Agac>();
    }

    /*
        12
        15
        13
        20
    */
    
    @Override
    public void next() {
        if(guncel.sag != null){
            yigin.push(guncel.sag);
        }
        if(guncel.sol != null){
            yigin.push(guncel.sol);
        }
    }

    @Override
    public void first() {
        guncel = basla;
        yigin = new Stack<>();
        yigin.push(guncel);
    }

    @Override
    public boolean isDone() {
        return yigin.isEmpty();
    }

    @Override
    public Object currentItem() {
        guncel = yigin.pop();
        return guncel;
        
    }
    
}
