/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_method;

/**
 *
 * @author kaan
 */
public class Main {
    
    public static void arabaUret (ArabaFactory arabaFactory){
        Araba araba = arabaFactory.arabaUret();
        System.out.println(araba.getMarka() + " markalı araba üretildi");
    }
    
    public static void main(String[] args) {
        arabaUret(new MercedesFactory());
        arabaUret(new NissanFactory());
    }
}
/*
    Yaratımsal tasarım deseni

*/
