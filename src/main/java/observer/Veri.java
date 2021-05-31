/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author kaan
 */
public class Veri implements Subject {

    private List<Observer> observers;
    private List<Integer> list;
    Random random = new Random();

    public Veri() {
        list = new ArrayList<Integer>();
        observers = new ArrayList<Observer>();

        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
    }

    public void yeniVeriEkle() {
        list.add(random.nextInt(100));
        myNotify();
    }

    public List<Integer> getList(){
        return list;
    } 
    
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void myNotify() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
