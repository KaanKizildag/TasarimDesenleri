/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.List;

/**
 *
 * @author kaan
 */
public class PastaGrafik implements Observer{

    List<Integer> veri;
    Veri kaynak;
    
    public PastaGrafik(Veri kaynak){
        this.kaynak = kaynak;
        veri = kaynak.getList();
    }
    
    
    @Override
    public void update() {
        veri = kaynak.getList();
        System.out.println("Pasta grafik güncellendi");
        System.out.println(veri);
    }
    
}
