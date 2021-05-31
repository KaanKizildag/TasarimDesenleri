/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author kaan
 */
public class Main {
    public static void main(String[] args) {
        SingletonClass tekilNesne = SingletonClass.getInstance();
        tekilNesne.setDeger("Kaan");
        System.out.println(tekilNesne.getDeger());
        
        SingletonClass tekilNesne2 = SingletonClass.getInstance();
        tekilNesne2.setDeger("Hüseyin");
        
        // tekil nesnenin değerini yazıyorum
        System.out.println(tekilNesne.getDeger());
        
    }
}
/*
    nesne yaratımsal
    bir nesne oluşturup bu nesyeye global erişim sağlanması
    gerektiğinde

*/