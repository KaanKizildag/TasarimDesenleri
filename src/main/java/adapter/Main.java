/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import adapter.music.Mp4Adapter;
import adapter.music.Mp4Muzik;
import adapter.music.Muzik;
import adapter.music.Player;

/**
 *
 * @author kaan
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.listeyeEkle(new Muzik("Tarkan - Sen başkasın"));
        player.listeyeEkle(new Muzik("Yalın - Ki sen"));
        player.listeyeEkle(new Muzik("Metin Işık - Ağla gözüm"));
        
        //player.listeyeEkle(new Mp4Muzik()); // bu durumda patlıyor
        player.listeyeEkle(new Mp4Adapter("Kayahan - Atın beni denizlere"));
        player.listeyeEkle(new Mp4Adapter("Kargo - Yıldızların altında"));
        
        player.cal();
        
    }
}
