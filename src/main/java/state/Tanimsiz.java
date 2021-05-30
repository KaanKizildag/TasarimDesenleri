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
public class Tanimsiz implements State{

    Program program;
    
    public Tanimsiz(Program program){
        this.program = program;
    }
    
    @Override
    public void handle() {
        System.out.println("Kaydol");
        System.out.println("Kullanıcı girişi");
        System.out.println("Yönetici girişi");
        System.out.println();
        program.kullaniciGirisiYap();
    }
    
}
