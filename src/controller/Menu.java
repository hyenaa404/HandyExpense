
package controller;

import util.InputUtils;

/**
 *
 * @author nhs
 */
public class Menu {
    public static int chooseInputOption(){
        System.out.println("1. Add an expense");
        System.out.println("2. Display all expenses");
        System.out.println("3. Delete an expense");
        System.out.println("4. Exit.");
        int option = InputUtils.inputOption(1, 4);
        return option;
    }
}
