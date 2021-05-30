/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author kaan
 */
public class Menu {

    List<Command> commands;

    public Menu() {
        commands = new ArrayList<Command>();
    }

    public void komutEkle(Command command) {
        commands.add(command);
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        while (s != -1) {
            for (int i = 0; i < commands.size(); i++) {
                System.out.println(i + ". komut: " + commands.get(i).toString());
            }
            System.out.println("Çıkmak için -1");
            try {
                s = scanner.nextInt();
                commands.get(s).execute();
            } catch (Exception e) {

            }
        }
        scanner.close();
    }

}
