/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author kaan
 */
public class DiziIterator extends Iterator {

    private Dizi dizi;
    private int index;
    
    DiziIterator(Dizi dizi) {
        this.dizi = dizi;
        this.index = 0;
    }

    @Override
    public void next() {
        index++;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public boolean isDone() {
        return (dizi.liste.size() == index);
    }

    @Override
    public Object currentItem() {
        return dizi.liste.get(index);
    }
    
}
