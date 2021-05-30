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

// SINGLETON TASARIM DESENİNDEN SONRA YENİDEN DÖNÜŞ YAP
public class Main {
    public static void main(String[] args) {
        Program program = new Program();
        
        program.calis();
        program.calis();
        program.calis();
        
    }
}

/*
    NESNE DAVRANIŞSAL 
    
    sonlu durum makinesi --> Çeşitli geçiş durumları sağlandığında 
    yetkilendirme örneği verilebilir.


*/
