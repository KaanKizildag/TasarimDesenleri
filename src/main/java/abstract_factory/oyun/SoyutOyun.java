/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory.oyun;

import abstract_factory.oda.SoyutOda;

/**
 *
 * @author kaan
 */
public abstract class SoyutOyun {
    public abstract void odaEkle(SoyutOda oda);
    public abstract void oyunuCalistir();
}
