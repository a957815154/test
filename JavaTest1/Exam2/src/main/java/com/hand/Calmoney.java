package com.hand;

public class Calmoney {
    private Calmoney() {
    }

    private static Calmoney calmoney = new Calmoney();

    public static Calmoney getInstance() {
        return calmoney;
    }

    public float getMoney(float money) {
        float tax = 0;
        if (money <= 3500)
            tax = 0;
        else if (money <= 5000)
            tax = (money - 3500) * 0.03f;
        else if (money <= 8000)//假设工资7000块，计算时需要注意5000以下的部分按0.03计算，5001~8000部分按0.1计算，所以计算表达式如下
            tax = (money - 5000) * 0.1f + (5000 - 3500) * 0.03f;
        else if (money <= 12500)
            tax = (money - 8000) * 0.2f + (8000 - 5000) * 0.1f + (5000 - 3500) * 0.03f;
        else if (money <= 38500)
            tax = (money - 12500) * 0.25f + (12500 - 8000) * 0.2f + (8000 - 5000) * 0.1f + (5000 - 3500) * 0.03f;
        else if (money <= 58500)
            tax = (money - 38500) * 0.3f + (38500 - 12500) * 0.25f + (12500 - 8000) * 0.2f + (8000 - 5000) * 0.1f + (5000 - 3500) * 0.03f;
        else if (money <= 83500)
            tax = (money - 58500) * 0.35f + (58500 - 38500) * 0.3f + (38500 - 12500) * 0.25f + (12500 - 8000) * 0.2f + (8000 - 5000) * 0.1f + (5000 - 3500) * 0.03f;
        else
            tax = (money - 83500) * 0.45f + (83500 - 58500) * 0.35f + (58500 - 38500) * 0.3f + (38500 - 12500) * 0.25f + (12500 - 8000) * 0.2f + (8000 - 5000) * 0.1f + (5000 - 3500) * 0.03f;
        return tax;
    }
}
