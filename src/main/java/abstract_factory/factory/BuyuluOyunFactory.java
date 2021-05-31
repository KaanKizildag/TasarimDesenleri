/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory.factory;

import abstract_factory.kapi.BuyuluKapi;
import abstract_factory.kapi.SoyutKapi;
import abstract_factory.oda.BuyuluOda;
import abstract_factory.oda.SoyutOda;
import abstract_factory.oyun.BuyuluOyun;
import abstract_factory.oyun.SoyutOyun;

/**
 *
 * @author kaan
 */
public class BuyuluOyunFactory extends OyunFactory{

    @Override
    public SoyutOyun oyunOlustur() {
        return new BuyuluOyun();
    }

    @Override
    public SoyutKapi kapiOlustur() {
        return new BuyuluKapi();
    }

    @Override
    public SoyutOda odaOlustur() {
        return new BuyuluOda();
    }
    
}
