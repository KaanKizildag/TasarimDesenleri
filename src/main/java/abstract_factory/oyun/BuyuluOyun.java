/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory.oyun;

import abstract_factory.oda.SoyutOda;
import java.util.ArrayList;

/**
 *
 * @author kaan
 */
public class BuyuluOyun extends SoyutOyun {

    ArrayList<SoyutOda> odalar = new ArrayList<SoyutOda>();

    @Override
    public void odaEkle(SoyutOda oda) {
        odalar.add(oda);
    }

    @Override
    public void oyunuCalistir() {
        System.out.println("Büyülü oyun çalışıyor...");
        if (odalar.size() > 0) {
            if (odalar.get(0).kapiyiAc()) {
                System.out.println("Kapı açıldı");
            } else {
                System.out.println("Kapı açılmadı");
            }
        }
    }

}
