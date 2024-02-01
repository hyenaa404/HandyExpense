/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 84822
 */
public class ExpenseList {
    private List<Expense> expenseList = new ArrayList<>();

    public List<Expense> getExpenseList() {
        return expenseList;
    }

    public void setExpenseList(List<Expense> expenseList) {
        this.expenseList = expenseList;
    }
    public boolean addList(Expense expense){
        for (Expense ex: expenseList){
            if(ex.getId()== expense.getId()){
                return false;
            }
        }
        expenseList.add(expense);
        return true;
    }
    
    public boolean removeList(int id){
        for (Expense ex: expenseList){
            if(ex.getId()== id){
                expenseList.remove(ex);
                return true;
            }
        }
        return false;
    }
    
    public void displayList(){
        System.out.printf("%-10s|%-20s|%-20s|%-40s\n", "ID", "Date", "Amount", "Content");
        for(Expense ex : expenseList){
            ex.toString();
        }
    }
}
