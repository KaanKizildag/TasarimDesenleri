/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_method;

/**
 *
 * @author kaan
 */
public class R34 extends Araba{

    public R34(){
        this.sonHiz = 330;
        this.anlikHiz = 0;
    }
    
    @Override
    public String getMarka() {
        return "Nissan R34";
    }
    
}
