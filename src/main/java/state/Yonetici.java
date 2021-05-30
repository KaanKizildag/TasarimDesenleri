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
public class Yonetici implements State {

    Program program;
    
    public Yonetici(Program program) {
        this.program = program;
    }

    @Override
    public void handle() {
        System.out.println("Kullanıcı ekle");
        System.out.println("Kullanıcı sil");
        System.out.println("Kullanıcı düzenle");
        System.out.println("Çıkış yap");
        System.out.println();
    }
    
}
