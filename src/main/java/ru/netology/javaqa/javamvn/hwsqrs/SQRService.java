package ru.netology.javaqa.javamvn.hwsqrs;


public class SQRService {
    public int calcSqrService(int a, int b) {
        int c = 0;
        for (int i = 10; i < 100; i++) {
            if (a <= i * i & b >= i * i) {
                c++;

            }

        }
        return c;
    }


}