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
public interface Component {
    void operation();
    void add(Component component);
    void remove(Component component);
    Component getChild(int i);
}
