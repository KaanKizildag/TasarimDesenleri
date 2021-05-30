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
public abstract class Iterator <T> {
    public abstract void next();
    public abstract void first();
    public abstract boolean isDone();
    public abstract T currentItem();
}
