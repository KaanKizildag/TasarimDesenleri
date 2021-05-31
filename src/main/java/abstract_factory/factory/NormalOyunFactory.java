/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory.factory;

import abstract_factory.kapi.NormalKapi;
import abstract_factory.kapi.SoyutKapi;
import abstract_factory.oda.NormalOda;
import abstract_factory.oda.SoyutOda;
import abstract_factory.oyun.NormalOyun;
import abstract_factory.oyun.SoyutOyun;


/**
 *
 * @author kaan
 */
public class NormalOyunFactory extends OyunFactory{

    @Override
    public SoyutOyun oyunOlustur() {
        return new NormalOyun();
    }

    @Override
    public SoyutKapi kapiOlustur() {
        return new NormalKapi();
    }

    @Override
    public SoyutOda odaOlustur() {
        return new NormalOda(); 
    }
    
}
