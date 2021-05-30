/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author kaan
 */
public class Main {
    public static void main(String[] args) {
        
        // Listeleme.listele(new Dizi());
        
        // Önemli değil ekleme yapmak için yapıyorum.
        Agac root = new Agac(12);
        Agac sag = new Agac(13);
        root.sagaEkle(sag);
        sag.sagaEkle(new Agac(20));
        root.solaEkle(new Agac(15));
        
        Listeleme.listele(root);
        
        /*
        NELER OLDU:
            Aggregate iterator oluşturan bir abstract metod,
            Dizi aslında aggregate in somut nesnesi,
            
        FAYDASI
            bir daha listeleme metodu yazılmayacak aggregate sınıfını extends
            eden her collection'la beraber çalışabilecek durumda.
        
        ( ! ) for each döngüsündeki iterator de böyle mi çalışıyor ? 
        
        */
        
    }
}
