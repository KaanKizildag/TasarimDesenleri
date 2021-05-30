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
public class Televizyon {
    private int simdikiKanal = 0;
    
    public void sonrakiKanal(){
        System.out.println("Sonraki kanala geçildi");
        simdikiKanal++;
    }
    
    public void oncekiKanal(){
        System.out.println("Onceki kanala geçildi");
        simdikiKanal--;
    }
    
    public int hangiKanalda(){
        return simdikiKanal;
    }
}
