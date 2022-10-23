package ru.netology.sqr;

public class SQRService {
    //вводим границы диапазона lowLimit и highLimit
    public int calculate(int up, int down) {
        //заводим переменную-счетчик
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int ii = i * i;
            //проеверяем, что число входит в диапазон
            //и что он больше или равен нижней границе лимита
            if (ii >= up) {
                //проверяем что входит в диапазон
                // меньше или равен верхней границы лимита
                if (ii <= down) {
                    counter++;
                }
            }

        }
        return counter;
    }

}
