/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;

/**
 *
 * @author kaan
 */
public class Dizi extends Aggregate{

    public ArrayList<String> liste = new ArrayList<String>();
    
    public Dizi(){
        liste.add("Hüseyin");
        liste.add("Kaan");
        liste.add("Kızıldağ");
        liste.add("Emre");
        liste.add("Beyda");
    }
    
    @Override
    public Iterator createIterator() {
        return new DiziIterator(this);
    }
    
}
