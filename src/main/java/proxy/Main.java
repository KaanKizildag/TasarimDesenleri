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
public class Main {
    
    public static void ekranaCiz(Grafik g){
        g.ciz();
    }
    
    public static void bilgiler(Grafik g){
        g.grafikBilgisi();
    }
    
    public static void main(String[] args) {
        GoruntuVekili vekil = new GoruntuVekili("resim.png");
        Goruntu goruntu = new Goruntu("gorsel.png");
        
        bilgiler(vekil);
        ekranaCiz(vekil);
        
        bilgiler(goruntu);
        ekranaCiz(goruntu);
        // bir defa yüklendiği için yeniden yükleme için bekleme olmadı
        ekranaCiz(goruntu);
        ekranaCiz(goruntu);
        
    }
   
}
