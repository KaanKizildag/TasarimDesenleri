/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory.kapi;

import java.util.Scanner;

/**
 *
 * @author kaan
 */
public class BuyuluKapi extends SoyutKapi {

    private final String parola = "Açıl susam açıl";

    @Override
    public boolean kapiyiAc() {
        if (this.kapiAcikMi) {
            System.out.println("Kapı zaten açık");
            return true;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Parola giriniz: ");
        String parola = scanner.nextLine();
        if (parola.equalsIgnoreCase(this.parola)) {
            System.out.println("Geçerli parola");
            return true;
        }
        return false;
    }

}
