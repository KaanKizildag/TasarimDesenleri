/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author kaan
 */
public class Program {
    State state;
    
    public Program(){
        state = new Tanimsiz(this);
    }
    
    public void calis(){
        state.handle();
    }
    
    public void kullaniciGirisiYap(){
        state = new Kullanici(this);
    }
    
    public void yoneticiGirisiYap(){
        state = new Yonetici(this);
    }
    public void cikis(){
        state = new Tanimsiz(this);
    }
}
