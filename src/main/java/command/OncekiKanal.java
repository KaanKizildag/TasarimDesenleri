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
public class OncekiKanal implements Command{

    Televizyon tv;
    
    public OncekiKanal(Televizyon tv){
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        tv.oncekiKanal();
    }

    @Override
    public String toString() {
        return "Önceki kanala geç";
    }
    
    
    
}
