/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author kaan
 */
public class Main {
    public static void main(String[] args) {
        
        Menu menu = new Menu();
        
        LambaAcKapat komutLamba = new LambaAcKapat(new Lamba());
        Televizyon tv = new Televizyon();
        
        OncekiKanal komutOncekiKanal = new OncekiKanal(tv);
        SonrakiKanal komutSonrakiKanal = new SonrakiKanal(tv);
        
        menu.komutEkle(komutLamba);
        menu.komutEkle(komutOncekiKanal);
        menu.komutEkle(komutSonrakiKanal);
        
//        menu.komutEkle(() -> {
//            System.out.println("yeni bir komut");
//        });
        
        menu.menu();
        
        
    }
}

/*
    action, transaction olarak da adlandırırlır
    bir isteği ya da komutu nesne olarak saklama
    istek nesnesi

    NESNE DAVRANIŞSAL
    
*/
