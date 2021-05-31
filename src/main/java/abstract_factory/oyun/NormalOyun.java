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
public class NormalOyun extends SoyutOyun{

    ArrayList<SoyutOda> odalar = new ArrayList<SoyutOda>();
    
    @Override
    public void odaEkle(SoyutOda oda) {
        odalar.add(oda);
    }

    @Override
    public void oyunuCalistir() {
        System.out.println("Normal oyun çalışıyor");
        System.out.printf("Oyunda %d tane oda var.\n", odalar.size());
    }
    
}
