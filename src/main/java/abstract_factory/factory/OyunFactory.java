/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory.factory;

import abstract_factory.kapi.SoyutKapi;
import abstract_factory.oda.SoyutOda;
import abstract_factory.oyun.SoyutOyun;

/**
 *
 * @author kaan
 */
public abstract class OyunFactory {
    public abstract SoyutOyun oyunOlustur();
    public abstract SoyutKapi kapiOlustur();
    public abstract SoyutOda odaOlustur();
}
