/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author kaan
 */
public class Kullanici implements State {

    Program program;

    public Kullanici(Program program) {
        this.program = program;
    }

    @Override
    public void handle() {
        System.out.println("Hizmet 1");
        System.out.println("Hizmet 2");
        System.out.println("Hizmet 3");
        System.out.println();
        program.yoneticiGirisiYap();
    }

}
