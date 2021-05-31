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
public class NissanFactory extends ArabaFactory{

    @Override
    public Araba arabaUret() {
        return new R34();
    }
    
}
