/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory;

import abstract_factory.factory.BuyuluOyunFactory;
import abstract_factory.factory.NormalOyunFactory;
import abstract_factory.factory.OyunFactory;
import abstract_factory.kapi.SoyutKapi;
import abstract_factory.oda.SoyutOda;
import abstract_factory.oyun.SoyutOyun;

/**
 *
 * @author kaan
 */
public class Main {
    public static void main(String[] args) {
        oyunOlustur(new BuyuluOyunFactory()).oyunuCalistir();
        
        oyunOlustur(new NormalOyunFactory()).oyunuCalistir();
    }
    
    public static SoyutOyun oyunOlustur(OyunFactory factory){
        
        SoyutOyun oyun = factory.oyunOlustur();
        
        SoyutOda oda = factory.odaOlustur();
        SoyutOda oda2 = factory.odaOlustur();
        
        SoyutKapi kapi = factory.kapiOlustur();
        SoyutKapi kapi2 = factory.kapiOlustur();
        
        oda.kapiEkle(kapi);
        oda2.kapiEkle(kapi2);
        
        oyun.odaEkle(oda);
        oyun.odaEkle(oda2);
        oyun.odaEkle(oda2);
        
        return oyun;
    }
}
