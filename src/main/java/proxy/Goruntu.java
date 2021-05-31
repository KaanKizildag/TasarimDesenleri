/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kaan
 */
public class Goruntu extends Grafik {

    String data = null;

    public Goruntu(String dosyaYolu) {
        this.dosyaYolu = dosyaYolu;
    }

    @Override
    public void ciz() {
        if (data == null) {
            try {
                System.out.println("Çiziliyor ( " + this.dosyaYolu + " )");
                Thread.sleep(1000);
                System.out.println("Çizildi ( " + this.dosyaYolu + " )");
                data = "artık boş değil";
            } catch (InterruptedException ex) {
                Logger.getLogger(Goruntu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void grafikBilgisi() {
    }

}
