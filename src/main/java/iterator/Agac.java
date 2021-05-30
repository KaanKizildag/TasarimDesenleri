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
public class Agac extends Aggregate{

    public Agac sag;
    public Agac sol;
    public int deger;
    
    public Agac(int deger){
        super();
        sag = null;
        sol = null;
        this.deger = deger;
    }
    
    public void sagaEkle(Agac agac){
        sag = agac;
    }
    
    public void solaEkle(Agac agac){
        sol = agac;
    }
    
    
    @Override
    public Iterator createIterator() {
        return new AgacIterator(this);
    }

    public int degerAl(){
        return deger;
    }

    @Override
    public String toString() {
        return deger + "";
    }
    
    
}
