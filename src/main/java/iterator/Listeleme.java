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
public class Listeleme {

    public static void listele(Aggregate aggregate) {
        Iterator iterator = aggregate.createIterator();

        for (iterator.first(); !iterator.isDone(); iterator.next()) {
            System.out.println(iterator.currentItem());
        }
    }
}
