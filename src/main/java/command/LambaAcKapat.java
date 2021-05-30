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
public class LambaAcKapat implements Command {

    private Lamba lamba;

    public LambaAcKapat(Lamba lamba) {
        this.lamba = lamba;
    }

    @Override
    public void execute() {
        if (lamba.lambaAcikMi()) {
            lamba.lambaKapat();
        } else {
            lamba.lambaAc();
        }
    }

    @Override
    public String toString() {
       return (lamba.lambaAcikMi()) ? "Lambayı kapat" : "Lambayı aç";
    }

    
    
}
