/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory.oda;

import abstract_factory.kapi.SoyutKapi;

/**
 *
 * @author kaan
 */
public class NormalOda extends SoyutOda{

    private SoyutKapi kapi;
    
    @Override
    public void kapiEkle(SoyutKapi kapi){
        this.kapi = kapi;
    }
    
    @Override
    public boolean kapiyiAc() {
        return kapi.kapiyiAc();
    }
    
}
