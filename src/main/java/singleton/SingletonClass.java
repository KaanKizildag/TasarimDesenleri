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
public class SingletonClass {

    private static SingletonClass INSTANCE;

    private String deger;
    
    private SingletonClass() {

    }

    public String getDeger() {
        return deger;
    }

    public void setDeger(String deger) {
        this.deger = deger;
    }

    public static SingletonClass getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonClass();
        }
        return INSTANCE;
    }

}
