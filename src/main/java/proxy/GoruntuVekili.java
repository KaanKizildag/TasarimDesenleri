/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author kaan
 */
public class GoruntuVekili extends Grafik {

    private Goruntu goruntu;

    public GoruntuVekili(String dosyaYolu) {
        goruntu = new Goruntu(dosyaYolu);
        this.dosyaYolu = dosyaYolu;
    }

    @Override
    public void ciz() {
        goruntu.ciz();
    }

    @Override
    public void grafikBilgisi() {
        System.out.println("Dosya yolu: " + dosyaYolu);
    }

}
