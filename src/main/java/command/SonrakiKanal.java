/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author kaan
 */
public class SonrakiKanal implements Command{

    Televizyon tv;
    
    public SonrakiKanal(Televizyon tv){
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        tv.sonrakiKanal();
    }

    @Override
    public String toString() {
        return "Sonraki kanala geç";
    }
    
    
}
