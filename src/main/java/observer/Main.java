/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author kaan
 */
public class Main {
    public static void main(String[] args) {
        Veri veri = new Veri();
        
        PastaGrafik pastaGrafik = new PastaGrafik(veri);
        CubukGrafik cubukGrafik = new CubukGrafik(veri);
        
        veri.attach(pastaGrafik);
        veri.attach(cubukGrafik);
        
//        System.out.println("veri ekleniyor");
        veri.yeniVeriEkle();
        
//        System.out.println("Çubuk grafik çıkarıldı");
        veri.detach(cubukGrafik);
        
        veri.yeniVeriEkle();
    }
}
