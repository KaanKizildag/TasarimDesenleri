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
public class CubukGrafik implements Observer{

    private Veri kaynak;
    private List<Integer> veri;
    
    public CubukGrafik(Veri kaynak){
        this.kaynak = kaynak;
        veri = kaynak.getList();
    }
    
    @Override
    public void update() {
        veri = kaynak.getList();
        System.out.println("Çubuk grafik güncellendi");
        System.out.println(veri);
    }
    
}
