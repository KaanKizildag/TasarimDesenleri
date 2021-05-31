/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.music;

import java.util.ArrayList;

/**
 *
 * @author kaan
 */
public class Player {

    ArrayList<Muzik> muzikler = new ArrayList<Muzik>();

    public void listeyeEkle(Muzik muzik) {
        muzikler.add(muzik);
    }

    public void cal() {
        for (Muzik muzik : muzikler) {
            muzik.cal();
        }
    }

}
