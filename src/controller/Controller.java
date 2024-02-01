/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Date;
import model.Expense;
import model.ExpenseList;
import util.InputUtils;

/**
 *
 * @author 84822
 */
public class Controller {
     public static void main(String[] args) {
        ExpenseList expenseList = new ExpenseList();
        int choice;
        while (true) {
            choice = Menu.chooseInputOption();
            switch (choice) {
                case 1 -> {
                    addExpense(expenseList);
                }
                case 2 -> {
                    displayExpense(expenseList);
                }
                case 3 -> {
                    removeExpense(expenseList);
                }
                case 4 ->
                    System.exit(0);
            }
        }
    }
    public static void addExpense(ExpenseList el){
        int listSize = el.getExpenseList().size();
        int id;
        if (listSize ==0){
            id = 1;
        }else{
            Expense lastct = el.getExpenseList().get(listSize-1);
            id = lastct.getId() + 1;
        }
        System.out.print("Enter date: ");
        Date date = InputUtils.inputDate();
        System.out.print("Enter amount: ");
        double amount = InputUtils.inputDouble();
        System.out.print("Enter content: ");
        String content = InputUtils.inputString();
        Expense ex = new Expense(id, amount, date, content);
        if (el.addList(ex)){
            System.out.println("Added successfully!");
        }else{
            System.out.println("Failed to add!");
        }
    }
    public static void removeExpense(ExpenseList el){
        System.out.print("Enter ID to remove: ");
        int idRemove = InputUtils.inputInt();
        if (el.removeList(idRemove)){
            System.out.println("Remove successfully!");
            el.displayList();
        }else{
            System.out.println("Failed to remove. ID is not exist!");
        }
    }
    public static void displayExpense(ExpenseList el){
        el.displayList();
    }
}
