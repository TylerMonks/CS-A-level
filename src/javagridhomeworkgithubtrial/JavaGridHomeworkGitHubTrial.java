package javagridhomeworkgithubtrial;

import java.util.*;   // import everything

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaGridHomeworkGitHubTrial {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("please enter your name");

        String name = myInput.nextLine();
        System.out.println(" hello " + name);

        System.out.println("welcome to my program");

        try {
            TimeUnit.SECONDS.sleep(3);      // i used try catch in hangman homework to create time delay
        } catch (InterruptedException ex) {
            Logger.getLogger(JavaGridHomeworkGitHubTrial.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Here is your clue: In this game the x co-ordinates are integers and the y co-ordinates are lower case letters");

        for (int z = 0; z < 5; z++) {
            String[] coordinates = {"c,1", "c,2", "c,3", "c,4", "c,5", "c,6", "d,1", "d,2", "d,3", "d,4", "d,5", "d,6", "e,1", "e,2", "e,3", "e,4", "e,5", "e,6", "f,1", "f,2", "f,3", "f,4", "f,5", "f,6", "g,1", "g,2", "g,3", "g,4", "g,5", "g,6", "h,1", "h,2", "h,3", "h,4", "h,5", "h,6",};
           System.out.println("please enter you coordinate in the form a,n where n is a integer");
            String guess = myInput.nextLine();
            
            boolean found = false;
            for (int d = 0; d < coordinates.length; d++) {
                if (coordinates[d].equals(guess)) {
                    found = true;
                }
            }

            if (found) {
                System.out.println("_____________");
            } else {
                System.out.println("Incorrect");
            }
        }

    }

}
