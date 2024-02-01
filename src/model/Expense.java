/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 84822
 */
public class Expense {
    private int id;
    private double amount;
    private Date date;
    private String content;

    public Expense() {
    }

    public Expense(int id, double amount, Date date, String content) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        String mon = "";
        int month = getMonthFromDate(date);
        switch (month){
            case 1 -> {
                mon = "Janary";
            }
            case 2 -> {
                mon = "February";
            }
            case 3 -> {
                mon = "March";
            }
            case 4 -> {
                mon = "April";
            }
            case 5 -> {
                mon = "May";
            }
            case 6 -> {
                mon = "June";
            }
            case 7 -> {
                mon = "July";
            }
            case 8 -> {
                mon = "August";
            }
            case 9 -> {
                mon = "Septemper";
            }
            case 10 -> {
                mon = "October";
            }
            case 11 -> {
                mon = "November";
            }
            case 12 -> {
                mon = "December";
            }
            
        }
        
        SimpleDateFormat sdfDay = new SimpleDateFormat("dd");
        String dayString = sdfDay.format(date);
        SimpleDateFormat sdfYear = new SimpleDateFormat("yyyy");
        String yearString = sdfYear.format(date);
        String dateFormat = dayString + "-" + mon + "-" + yearString;
        System.out.printf("%-10d|%-20s|%-20.1f|%-40s\n", id, dateFormat, amount, content);
        return "";
    }
    
    private static int getMonthFromDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM");
        String monthString = sdf.format(date);

        int month = Integer.parseInt(monthString);

        return month;
    }
    
}
