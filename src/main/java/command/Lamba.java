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
public class Lamba {
    private boolean acikMi = false;

    public void lambaAc(){
        System.out.println("Lamba açıldı");
        acikMi = true;
    }
    
    public void lambaKapat(){
        System.out.println("Lamba Kapatıldı");
        acikMi = false;
    }
    
    public boolean lambaAcikMi(){
        return acikMi;
    }
}
