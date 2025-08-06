package ru.netology.services;

public class FreelancerRestService {

    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int restMonths = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                money -= expenses;
                money /= 3;
                restMonths++;
            } else {
                money += income;
                money -= expenses;
            }
        }
        return restMonths;
    }
}