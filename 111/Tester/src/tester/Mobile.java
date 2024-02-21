/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

/**
 *
 * @author tahshin
 */
public class Mobile {

    public String name;
    public String date;
    public int price;
    public static int numberOfMobiles;
    public static String phoneName;
    public static int phonePrice = 1000000000;

    public Mobile() {
    }

    public Mobile(String name, int price) {
        this.name = name;
        this.price = price;
        this.date = "01.01.2019";
        numberOfMobiles += 1;
        if (price < phonePrice) {
            phonePrice = price;
            phoneName = name;
        }
    }

    public Mobile(String name, String date, int price) {
        this.name = name;
        this.date = date;
        this.price = price;
        numberOfMobiles += 1;
        if (price < phonePrice) {
            phonePrice = price;
            phoneName = name;
        }
    }

    public void printDetails() {
        System.out.println("Model: " + name + "\nRelease Date:" + date + "\nPrice: " + price);
    }

    public boolean cheaperThan(Mobile x) {
        return x.price > this.price;
    }

    public boolean releasedEarlierThan(Mobile x) {
        if (x.date.compareTo(this.date) > 0) return true;
        else return false;
    }
}
