/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author kaan
 */
public class Main {
    
    public static void main(String[] args) {
        
        Composite kitap = new Composite("Tasarım desenleri");

        Composite b1 = new Composite("Giriş");
        b1.add(new Metin("Hello world"));
        b1.add(new Metin("Java ile programlama"));
        
        Composite b2 = new Composite("ileri seviye programlama");
        b2.add(new Resim("yelken_resmi.jpg"));
        b2.add(new Metin("Veri yapılarına giriş"));
        
        kitap.add(b1);
        kitap.add(b2);
        
        yazdir(kitap);
        System.out.println();
        yazdir(b1);

        // BU YAPININ CLIENT TARAFINDAN KULLANILABİLİR OLMASI BU 
        // TASARIMIN BİR AÇIĞIDIR
//        Metin metin = new Metin("Hata yapıcam");
//        metin.ad
        
        /*
            Bütüne veya bütünü oluştururan parçalara aynı
            şekilde erişim sağlamak
        
            Open Close 
        
            Nesne yapısal
        
            örnek :
        
            Gui da pencere çizilmesi istendiğinde pencere içindeki her 
            nesnenin ayrı ayrı çizilmesi yerine tüm pencerenin çizilmesi yeterli
            olmalıdır.
        
        leaf ve composite component interface ini implemente ediyor fakat
        leaf tüm metodları implemente etmemeliymiş (?) 
        (?) Sorunun çözümü
            1) farklı interface'e böl
            2) aynı interface de o metodları boş bırak 
        
        ikisi de bu sorunun çözümü değil ifle kontrol olacakmış =( 

        child'lar iterator deseniyle gezilebilir.
        */
    }
    
    
    public static void yazdir(Component component){
        component.operation();
    }
}
