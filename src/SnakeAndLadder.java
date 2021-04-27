/**
 * Project made by KULDEEP SINGH.
 * project name- SNAKE AND LADDER.
 * date-27 April 2021.
 */

import javax.swing.*;
import java.util.Scanner;

public class SnakeAndLadder {
    int counter;

    public SnakeAndLadder() {
        this.counter = 0;
    }

    public void play() {
        JOptionPane.showConfirmDialog(null,"Game is Started.....");
        boolean temp = true;
        int chances=0;
        while (temp) {
            chances+=1;
            switch (playDice()) {
                case 1:
                    if (counter == 0) {
                        JOptionPane.showConfirmDialog(null,"your token is started");
                        counter = 1;
                        break;
                    } else
                        counter += 1;
                    break;
                case 2:
                    if (counter > 0 && counter <= 98)
                        counter += 2;
                    break;
                case 3:
                    if (counter > 0 && counter <= 97)
                        counter += 3;
                    break;
                case 4:
                    if (counter > 0 && counter <= 96)
                        counter += 4;
                    break;
                case 5:
                    if (counter > 0 && counter <= 95)
                        counter += 5;
                    break;
                case 6:
                    if (counter > 0 && counter <= 94)
                        counter += 6;
                    break;
            }
            switch (counter) {
                case 4:
                    counter += 10;
                    System.out.println("LADDER....");
                    System.out.println(counter);
                    break;
                case 9:
                    counter += 20;
                    System.out.println("LADDER....");
                    System.out.println(counter);
                    break;
                case 17:
                    counter -= 10;
                    System.out.println("SNAKE hiss..");
                    System.out.println(counter);
                    break;
                case 21:
                case 72:
                case 80:
                    counter += 19;
                    System.out.println("LADDER....");
                    System.out.println(counter);
                    break;
                case 28:
                    counter += 56;
                    System.out.println("LADDER....");
                    System.out.println(counter);
                    break;
                case 51:
                    counter += 16;
                    System.out.println("LADDER....");
                    System.out.println(counter);
                    break;
                case 54:
                case 93:
                case 95:
                    counter -= 20;
                    System.out.println("SNAKE hiss..");
                    System.out.println(counter);
                    break;
                case 62:
                    counter -= 43;
                    System.out.println("SNAKE hiss..");
                    System.out.println(counter);
                    break;
                case 64:
                    counter -= 4;
                    System.out.println("SNAKE hiss..");
                    System.out.println(counter);
                    break;
                case 87:
                    counter -= 36;
                    System.out.println("SNAKE hiss..");
                    System.out.println(counter);
                    break;
                case 98:
                    counter -= 19;
                    System.out.println("SNAKE hiss..");
                    System.out.println(counter);
                    break;
                case 100:
                    System.out.println(counter);
                    JOptionPane.showConfirmDialog(null,"CONGRATULATIONS YOU WON!!!" +
                            "\n You have taken "+"\""+chances+"\""+" steps to finish the game");
                    temp = false;
                    break;
                default:
                    System.out.println(counter);
            }

        }
    }

    public int playDice() {
        int diceNumber = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("press enter to Roll Dice");
        obj.nextLine();
        diceNumber = Math.abs((int) Math.round(Math.random() * 10) - 4);
        if (diceNumber == 0) {
            diceNumber = diceNumber + 1;
        }
        return diceNumber;
    }
}

