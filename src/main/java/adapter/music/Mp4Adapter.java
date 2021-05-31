/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.music;

/**
 *
 * @author kaan
 */
public class Mp4Adapter extends Muzik {

    Mp4Muzik mp4Music;

    public Mp4Adapter(String isim) {
        super(isim);
        mp4Music = new Mp4Muzik(isim);
    }

    @Override
    public void cal() {
        mp4Music.cal();
    }

}
