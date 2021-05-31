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
public class E200 extends Araba{

    public E200 (){
        this.anlikHiz = 30;
        this.sonHiz = 240;
    }
    
    @Override
    public String getMarka() {
        return "Mercedes";
    }
    
}
